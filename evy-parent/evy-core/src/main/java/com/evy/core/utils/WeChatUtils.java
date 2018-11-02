package com.evy.core.utils;

import com.evy.core.exception.EvyException;
import com.evy.core.service.bto.WeChatError;
import com.evy.core.service.bto.WeChatResponse;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author Jonny
 * @Description:
 * @date 2018/9/16上午10:14
 */
@Slf4j
public class WeChatUtils {

    private final static String AppID = "wxca64b12e2a8e1eed";
    private final static String AppSecret = "5c710e7d041a59ceffc2add178551cf1";



    public static WeChatResponse login(String code) {
        String loginUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=${APPID}&secret=${SECRET}&js_code=${JSCODE}&grant_type=authorization_code";

        loginUrl = loginUrl.replace("${APPID}", AppID);
        loginUrl = loginUrl.replace("${SECRET}", AppSecret);
        loginUrl = loginUrl.replace("${JSCODE}", code);

        OkHttpUtil okHttpUtil = OkHttpUtil.getInstance();

        WeChatResponse weChatResponse = null;
        try {
            Response response = okHttpUtil.getSync(loginUrl);

            if(response.isSuccessful()) {
                String resStr = response.body().string();
                log.info("receive body:" + resStr);

                WeChatError weChatError = JsonUtil.json2Object(resStr, WeChatError.class);
                if(weChatError != null && !NumberUtils.isNullOrZero(weChatError.getErrcode())) {
                    //throw new BusinessException(weChatError.getErrcode(), weChatError.getErrmsg());
                    throw new EvyException("微信远程服务器认证失败");
                }

                return JsonUtil.json2Object(resStr, WeChatResponse.class);
            }

        } catch (IOException e) {
            log.error("微信远程服务器认证失败");
            throw new EvyException("微信远程服务器认证失败", e);
        }
        return weChatResponse;
    }
}

