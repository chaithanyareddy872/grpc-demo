package org.example.service;

import java.util.HashMap;
import java.util.Map;

public class VerificationDetails {
    static Map<String, Integer> verify = new HashMap<>();

    public VerificationDetails() {
    }

    public static Map<String, Integer> getVerify() {
        return verify;
    }

    public static void setVerify(Map<String, Integer> verify) {
        VerificationDetails.verify = verify;
    }
}
