package com.evy.sso.controller.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/11上午10:52
 */
@Data
public class UserIN implements Serializable{
    private String avatar;

    private String telephone;

    private String username;

    private String nickname;

    private String province;

    private String city;

    private String source;

    private String openId;
}
