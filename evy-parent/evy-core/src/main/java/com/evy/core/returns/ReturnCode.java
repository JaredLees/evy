package com.evy.core.returns;


/**
 * @author Jonny
 * @Description:
 * @date 2018/4/5下午2:38
 */
public enum ReturnCode {
    C110(110, "缺少必要的参数"),
    C120(120, "非法请求,角色权限不足，禁止请求此接口"),

    //api专用ReturnCode
    C152(152, "illegal redirect_uri"),
    C153(153, "illegal client_id"),
    C154(154, "illegal client_secret"),
    C155(155, "access_token is expire"),
    C156(156, "invalid AuthorizationCode "),
    C157(157, "invalid username or password "),
    C158(158, "refresh token is not supported in this implementation"),
    C159(159, "username or password is not supported in this implementation"),
    C161(161, "illegal refresh_token"),
    C162(162, "AuthorizationCode is expire"),
    C163(163, "illegal refresh_token time"),
    C164(164, "access_token expire"),
    C165(165, "illegal access_token "),
    C166(166, "access_token can not null"),
    C167(167, "lastDbid not found in access_token"),
    C168(168, "invalid username or password"),
    C169(169, "invalid login ,init session error"),
    C170(170, "invalid responseType"),
    C171(171, "invalid grantType ,clientId not supported client_credentials"),
    C172(172, "invalid refresh_token ,clientId not supported refresh_token"),
    C173(173, "dbid not found in request"),
    C174(174, "oauth scope not match"),
    C175(175, "不能使用代理账号登录"),
    C176(176, "不能使用账号登录"),

    C200(200, "操作成功"),
    C250(250, "对象已经存在"),
    C300(300, "暂无查询结果"),
    C500(500, "系统出了点意外，请稍候再试"),
    C301(301, "登录超时，请重新登录"),
    C302(302, "登录超时，请重新登录"),
    C400(400, "错误请求"),
    C401(401, "请求没有经过鉴权"),
    C403(403, "对不起，您没有相关操作权限！如须操作，请联系管理员"),
    C404(404, "对不起，对象找不到或已删除"),
    C455(455, "TenantID 异常，请重试"),
    C505(505, "对不起，您的服务已经过期！如须操作，请进行续费"),

    C525(525, "操作失败"); // 自定义提示

    private final int code;
    private final String message;

    private ReturnCode(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

}