package com.evy.core.utils;

import com.evy.core.bcrypt.BCrypt;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/11上午11:06
 */
public class EncryptUtil {


    /**
     * 获取密码
     * @param orginPwd
     * @param randoomSalt
     * @return
     */
    public static String encodePwd(String orginPwd, String randoomSalt){
        return BCrypt.hashpw(orginPwd, randoomSalt);
    }

    /**
     * md5加密，不可逆
     */
    public static String encodeMd5Pwd(String orginPwd, String randomSalt){
        return MD5Utils.md5Password(orginPwd,randomSalt);
    }


    /**
     * 随机盐
     * @return
     */
    public static String getRandomSalt(){
        return BCrypt.gensalt(10);
    }

    /**
     * 密码匹配
     * @param textPwd
     * @param encodePwd
     * @return
     */
    public static boolean checkPwd(String textPwd,String encodePwd){
        return BCrypt.checkpw(textPwd,encodePwd);
    }

    /**
     * MD5加密
     * @param password
     * @param dbpassword
     * @param credentialsSalt
     * @return
     */
    public static boolean checkMD5Pwd(String password, String dbpassword, String credentialsSalt) {
        return dbpassword.equals(encodeMd5Pwd(password,credentialsSalt));
    }

   public static void main(String[] args){
        String randomSalt = "$2a$10$c/xmUamZwhW2hY.WaRzOzu";
        String pwd = "123456";
        System.out.println(randomSalt);
        System.out.println(encodePwd(pwd,randomSalt));
       System.out.println(encodeMd5Pwd(pwd,randomSalt));

        System.out.println(checkPwd("123456",encodePwd(pwd,randomSalt)));
       System.out.println(checkMD5Pwd("123456",encodeMd5Pwd(pwd,randomSalt),randomSalt));
    }
}
