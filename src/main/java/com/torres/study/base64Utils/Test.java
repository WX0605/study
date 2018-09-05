package com.torres.study.base64Utils;

/**
 * @author torres
 * @Description: TODO
 * @date 2018/8/24
 */
public class Test {
    public static void main(String[] args) {
        String byteStr1 ="UAOgAQDyASlQAKABAPAB0KgMwAK0oJYCkAMA4AMAsASE2Z8SgAXGoOA10AXX9qbbBfIBKVAAoAEA8AHQqAzAArSglgKQAwDgAwCwBITZnxKABcag4DXQBdf2ptsF8gEpUACgAQDwAdCoDMAC7K3cApADAOADALAEvOD5NYAFvOD5NdAFyrP72wU=";
        Base64.decode(byteStr1);
        System.out.println(Base64.decode(byteStr1));
    }
}
