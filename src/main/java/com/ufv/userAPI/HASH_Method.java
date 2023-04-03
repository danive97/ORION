package com.ufv.userAPI;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HASH_Method {
    //Funcion de: https://www.techiedelight.com/es/generate-sha-256-hashcode-java/
    public String hashPassword(String pass) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(pass.getBytes(StandardCharsets.UTF_8));
        String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(sha256);
        return sha256;
    }
}
