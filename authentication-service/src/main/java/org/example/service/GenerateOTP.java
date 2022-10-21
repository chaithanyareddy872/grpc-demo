package org.example.service;

import java.util.Random;

public class GenerateOTP {
    public static int generateOTP() {
        Random random = new Random();
        int min = 100000;
        int max = 999999;

        return random.nextInt(max + 1 - min) + min;

    }
}
