package com.evy.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/19上午9:49
 */
public class MD5Utils {
    /**
     * 生成32位md5码
     * @param password
     * @return
     */
    public static String md5Password(String password, String ramdomSalt){

            // 得到一个信息摘要器
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] result = digest.digest((password+ramdomSalt).getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();

    }
}
