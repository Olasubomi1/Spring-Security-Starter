package com.olasubomi.springbootsecurity.Utils;

import lombok.Data;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Data
public class hashWithSHA512 {
    private String hashPassword(String passwordInput){
        StringBuilder result = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte [] digested = md.digest(passwordInput.getBytes());
            for (int i = 0; i < digested.length; i++) {
                result.append(Integer.toHexString(0xFF & digested[i]));
            }
        }catch (NoSuchAlgorithmException ex){
            throw new RuntimeException("bad algorithm.");
        }
        return result.toString();
    }
}
