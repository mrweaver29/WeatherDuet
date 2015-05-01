package com.mrweaver29.weatherduet.ui;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Benjamin on 4/25/2015.
 */
public class ColorWheel {

    int lastRandomNumber1;
    int lastRandomNumber2;

    public String [] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#e15258", // red
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#f092b0", // pink
    };

    Random randomGenerator = new Random();

    int generateRandom1() {
        int randomNumber1 = randomGenerator.nextInt(mColors.length);
        while (randomNumber1 == lastRandomNumber1) {
            randomNumber1 = randomGenerator.nextInt(mColors.length);
        }
        lastRandomNumber1 = randomNumber1;
        return randomNumber1 | lastRandomNumber1;

    }

    int generateRandom2() {
        int randomNumber2 = randomGenerator.nextInt(mColors.length);
        while (randomNumber2 == lastRandomNumber2) {
            randomNumber2 = randomGenerator.nextInt(mColors.length);
        }
        lastRandomNumber2 = randomNumber2;
        return randomNumber2 | lastRandomNumber2;

    }

    public int getColor1() {

        String color1;

        color1 = mColors[generateRandom1()];
        int colorAsInt1 = Color.parseColor(color1);

        return colorAsInt1;
    }

    public int getColor2() {

        String color2;

        color2 = mColors[generateRandom2()];
        int colorAsInt2 = Color.parseColor(color2);

        return colorAsInt2;
    }
}
