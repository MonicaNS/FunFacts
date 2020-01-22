package com.example.simpleproject;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class colorBook {

    public int getColor(){

        List<String> colorHexNumber = new ArrayList<>();
        colorHexNumber.add("#39add1");
        colorHexNumber.add ("#3079ab");
        colorHexNumber.add ("#f9845b");
        colorHexNumber.add ("#e15258");
        colorHexNumber.add ("#c25975");
        colorHexNumber.add ("#7d669e");
        colorHexNumber.add ("#b7c0c7");
        colorHexNumber.add ("#637a91");
        colorHexNumber.add ("#51b46d");


        Random rand = new Random();
        int randColorNumber = rand.nextInt(colorHexNumber.size());
        int hexStringtoIntColor = Color.parseColor(colorHexNumber.get(randColorNumber));

        return hexStringtoIntColor;
    }
}


/****
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
 "#637a91", // dark gray
 "#f092b0", // pink
 "#b7c0c7"  // light gray
 ***/