package com.example.test.beans;

import java.nio.charset.StandardCharsets;

public class CRLF {
    public static String toUTF8(String str){
        if(str == null)
            str = "";
        str = new String(str.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        return str;
    }
}
