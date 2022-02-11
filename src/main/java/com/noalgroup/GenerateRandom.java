package com.noalgroup;

import java.util.Random;

public class GenerateRandom {
    public static int integer() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
