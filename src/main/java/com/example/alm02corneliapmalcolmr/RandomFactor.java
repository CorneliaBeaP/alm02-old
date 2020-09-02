package com.example.alm02corneliapmalcolmr;

import java.util.Random;

public class RandomFactor {

    public String firstNameRandomizer(String input) {
        String result = "";

        if (input.length() <= 3) {
            result = "your dad";
        } else if (input.length() < 5) {
            result = "your mom";

        } else if (input.length() < 6) {
            result = "your high school crush";

        } else if (input.length() < 7) {
            result = "your therapist";

        } else if (input.length() < 8) {
            result = "your best friend";

        } else if (input.length() < 10) {
            result = "your favourite childhood teacher";

        } else if (input.length() < 15) {
            result = "your boss";

        } else {
            result = "your parents";

        }
        return result;
    }

    public String haircolorRandomizer(String input) {
        String result = "";

        if (input.toLowerCase().contains("blue")) {
            result = "noon";
        } else if (input.toLowerCase().contains("brown")) {
            result = "midnight";
        } else if (input.toLowerCase().contains("blond") || input.toLowerCase().contains("white") || input.toLowerCase().contains("yellow")) {
            result = "five o'clock";
        } else if (input.toLowerCase().contains("black")) {
            result = "half past six";
        } else if (input.toLowerCase().contains("pink")) {
            result = "dusk";
        } else if (input.toLowerCase().contains("grey")) {
            result = "dawn";
        } else {
            result = "the darkest hour";
        }

        return result;
    }

    public int shoesizeRandomizer(int input) {
        Random random = new Random();
        int luckyNumber = 0;

        if (input < 36) {
            luckyNumber = random.nextInt(10) + 1;
        } else if (input < 38) {
            luckyNumber = random.nextInt(50) + 11;
        } else if (input < 40) {
            luckyNumber = random.nextInt(5) + 20;
        } else if (input < 42) {
            luckyNumber = random.nextInt(100) * 2;
        } else if (input < 45) {
            luckyNumber = random.nextInt(50) + 2;
        } else {
            luckyNumber = random.nextInt(100);
        }

        return luckyNumber;
    }


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

    public String randomStringFromZodiacSign(String zodiacSign) {
        char c;
        int vowels = 0;
        Random random = new Random();

        for (int i = 0; i < zodiacSign.length(); i++) {
            c = zodiacSign.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u' || c == 'y' || c == 'å' || c == 'ä' || c == 'ö')
                vowels++;

        }

        if (vowels >= 3) {
            if (random.nextInt(3) + 1 == 3)
                return "Monday";
            else if (random.nextInt(3) + 1 == 2)
                return "Tuesday";
            else if (random.nextInt(3) + 1 == 1)
                return "Wednesday";
        }

        else  {
            if (random.nextInt(3) + 1 == 3)
                return "Thursday";
            else if (random.nextInt(3) + 1 == 2)
                return "Friday";
            else if (random.nextInt(3) + 1 == 1)
                return "Saturday";
            else if (random.nextInt(3) + 1 == 1)
                return "Sunday";
        }
        return "Today";
    }


}
