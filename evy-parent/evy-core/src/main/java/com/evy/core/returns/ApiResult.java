package com.evy.core.returns;

import com.evy.core.exception.EvyException;
import com.evy.core.utils.JsonUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author Jonny
 * @Description: 定义类数据的返回格式
 *  code:响应码
 *  msg:响应信息
 *  result:返回结果
 * @date 2018/4/5下午2:38
 */
public class ApiResult<T>{
    private int code;
    private String message;
    private T result;

    /**
     * 使用@JsonFormat
     * 此处有一坑：使用JsonFormat记得带上时区，否则因为时区问题相差几个小时 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date time;

    public ApiResult() {
        this(ReturnCode.C525.getCode(),"其他未知异常",null);
    }

    public ApiResult(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
        this.time = new Date();
    }

    public ApiResult(int code, String message) {
        this(code,message,null);
    }

    public ApiResult(EvyException ex) {
        this(ex.getCode(),ex.getMessage(),null);
    }

    public ApiResult(ReturnCode returnCode, T result){
        this(returnCode.getCode(),returnCode.getMessage(),result);
    }

    public ApiResult(ReturnCode returnCode){
        this(returnCode,null);
    }

    public static ApiResult success() {
        return new ApiResult(ReturnCode.C200, null);
    }
    private ApiResult success(String msg) {
        return new ApiResult(ReturnCode.C200.getCode(), msg,null);
    }

    public static ApiResult successWithObject(Object object, String message) {
        return new ApiResult(ReturnCode.C200.getCode(), message, object);
    }

    public static ApiResult successWithObject(Object object) {
        return new ApiResult(ReturnCode.C200.getCode(), ReturnCode.C200.getMessage(), object);
    }

    public static ApiResult failWithMessage(String message) {
        return new ApiResult(ReturnCode.C525.getCode(), message, null);
    }

    public static ApiResult fail(){
        return new ApiResult(ReturnCode.C525.getCode(), ReturnCode.C525.getMessage(), null);
    }

    public static ApiResult failWithMessageAndObject(String message, Object object) {
        return new ApiResult(ReturnCode.C525.getCode(), message, object);}

    public static ApiResult fail(ReturnCode returnCode){
        return new ApiResult(returnCode,null);
    }

    public static ApiResult failWithException(EvyException ex) {
        return new ApiResult(ex);
    }

   /* public String json() {
        return JSON.toJSONString(this);
    }*/

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static void response(HttpServletResponse response,int code, String msg) {
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
            response.getWriter().write(JsonUtil.object2Json(
                    new ApiResult(code,msg)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void response(HttpServletResponse response,ReturnCode returnCode) {
        response(response,returnCode.getCode(), returnCode.getMessage());
    }
}
