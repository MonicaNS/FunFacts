package com.example.simpleproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class factBook {

    public String getFact() {

       List<String> randomFacts = new ArrayList<>();
       randomFacts.add("Ostriches can run faster than horses.");
       randomFacts.add("Olympic gold medals are mostly made from silver");
       randomFacts.add("Mammoths still walked the earth when the Great Pyramid was being built.");
       randomFacts.add("You are born with 300 bones; by the time you are an adult you will have 206.");
       randomFacts.add("It takes about 8 minutes for light from the Sun to reach Earth.");
       randomFacts.add("Some bamboo plants can grow almost a meter in just one day.");
       randomFacts.add("The state of Florida is bigger than England.");
       randomFacts.add("Some penguins can leap 2-3 meters out of the water.");
       randomFacts.add("On average, it takes 66 days to form a new habit.");
       randomFacts.add("Mammoths still walked the earth when the Great Pyramid was being built.");

       Random randomGenerator = new Random();
       int randomNumber = randomGenerator.nextInt(randomFacts.size());  //Given the bound (an int) is optional. But preferred.
       String newFact = randomFacts.get(randomNumber) + " ";
       // String newFact = "Ostriches can run faster than horses."; //This was the hardcoded version at first
        return(newFact);
    }

}

//<!-- SOLID- principle of object-oriented programming
//      S: Single Responsibility Principle
//      O: Open/Closed Principle
//      L: Liskov Substitution Principle
//      I: Interface Segregation Principle
//      D: Dependency Inversion Principle
