package com.evy.sso.controller;

import com.evy.core.base.UserService;
import com.evy.core.bean.Account;
import com.evy.core.bean.User;
import com.evy.core.config.Audience;
import com.evy.core.exception.BusinessException;
import com.evy.core.exception.ValidationException;
import com.evy.core.returns.ApiResult;
import com.evy.core.service.AccountService;
import com.evy.core.service.bto.WeChatResponse;
import com.evy.core.utils.JWTUtil;
import com.evy.core.utils.NumberUtils;
import com.evy.core.utils.WeChatUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/10下午5:11
 */
@RestController
@RequestMapping("/")
@Slf4j
public class LoginController {

    @Resource private UserService userService;
    @Resource private AccountService accountService;
    @Resource private Audience audience;

    @GetMapping("/signin")
    public ApiResult signin(@RequestParam(value = "code", required = false) String code
            , @RequestParam(value = "tenant", required = false) Long tenant) {
        if(StringUtils.isEmpty(code) && NumberUtils.isNullOrZero(tenant)){
            throw new ValidationException("参数异常");
        }
        Account account = accountService.get(tenant);
        if(account == null) {
            throw new ValidationException("不存在该商家");
        }

        WeChatResponse weChatResponse = WeChatUtils.login(code);

        if(StringUtils.isEmpty(weChatResponse.getOpenid())) {
            throw new BusinessException("微信授权失败");
        }

        User user = userService.findByAccountIdAndOpenId(weChatResponse.getOpenid(), account.getId());
        if(user != null) {
            userService.createUser(weChatResponse.getOpenid(), account.getId());
        }

        String jwtToken = JWTUtil.createJWT(account.getId(),
                user.getId()+"",
                audience.getClientId(),
                audience.getName(),
                audience.getExpiresSecond()*1000,
                audience.getBase64Secret());

        return ApiResult.successWithObject("bearer;" + jwtToken,"登录成功");
    }
}