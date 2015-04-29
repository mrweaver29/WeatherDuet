package com.mrweaver29.weatherduet.ui;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Benjamin on 4/25/2015.
 */
public class ColorWheel {

    int lastRandomNumber;

    // Member variables (properties about the object)
    public String [] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#f092b0", // pink
    };

    Random randomGenerator = new Random();

    int generateRandom() {
        int randomNumber = randomGenerator.nextInt(mColors.length);
        while (randomNumber == lastRandomNumber) {
            randomNumber = randomGenerator.nextInt(mColors.length);
        }
        lastRandomNumber = randomNumber;
        return randomNumber | lastRandomNumber;

    }

    // Method (abilities: things the object can do)
    public int getColor() {

        String color;

        // Randomly select a fact
        //Random randomGenerator = new Random();
        //int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[generateRandom()];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
