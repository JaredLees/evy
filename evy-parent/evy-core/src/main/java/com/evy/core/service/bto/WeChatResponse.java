package com.evy.core.service.bto;

import lombok.Data;

/**
 * @author Jonny
 * @Description:
 * @date 2018/9/24下午3:41
 */
@Data
public class WeChatResponse {
    private String openid;
    private String session_key;
    private String unionid;
}
