package com.example.alm02corneliapmalcolmr;

import java.util.Random;

public class RandomFactor {

//    TODO:method för förnamn
//    TODO:method för efternamn
//    TODO:method för hårfärg
//    TODO:method för skostorlek
//    TODO:method för stjärntecken
//    TODO:method för antal nuvarande partners

    public String randomStringFromLastName(String lastName) {
        if (lastName.length() >= 10) {
            return "your worst enemy ";
        } else if (lastName.length() >= 8) {
            return "your secret lover ";
        } else if (lastName.length() >= 6) {
            return "your neighbors cat ";
        } else if (lastName.length() >= 4) {
            return "your prison cellmate ";
        } else if (lastName.length() > 0) {
            return "your pole dancing teacher ";
        } else
            return "you ";
    }

    public String randomStringFromCurrentPartners(int currentPartners) {
        Random random = new Random();
        int number = random.nextInt(110) + 1;
        System.out.println(currentPartners + number);
        if (currentPartners + number >= 100)
            return "will tickle the crap out of ";
        else if (currentPartners + number >= 90)
            return "will use a pile of legos to murder ";
        else if (currentPartners + number >= 80)
            return "will adopt ";
        else if (currentPartners + number >= 70)
            return "will hide in the bushes and watch ";
        else if (currentPartners + number >= 60)
            return "will go on a BDSM cruise and suddenly bump into ";
        else if (currentPartners + number >= 50)
            return "will buy a brand new Corvette and accidentally run over ";
        else if (currentPartners + number >= 40)
            return "will have a twin clown nightmare about themselves and ";
        else if (currentPartners + number >= 30)
            return "will shart and in a panic steal the pants currently worn by ";
        else if (currentPartners + number >= 20)
            return "will cosplay for a day as ";
        else if (currentPartners + number >= 10)
            return "will grow a pimple on their cheek and name it after ";
        else
            return "will give an oddly weird yet oddly satisfying smooch to ";

    }

    public String randomStringFromZodiacSign(String zodiacSign){
        //if (zodiacSign.charAt())
        return null;
    }


}
