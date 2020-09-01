package com.example.alm02corneliapmalcolmr;

public class RandomFactor {

//    TODO:method för förnamn
//    TODO:method för efternamn
//    TODO:method för hårfärg
//    TODO:method för skostorlek
//    TODO:method för stjärntecken
//    TODO:method för antal nuvarande partners

    public String randomStringFromLastName(String lastName){
        if (lastName.length() >= 10){
            return "your worst enemy";
        }
        else if (lastName.length() >= 8){
            return "your secret lover";
        }
        else if (lastName.length() >= 6 ){
            return "your neighbors cat";
        }
        else if (lastName.length() >= 4 ){
            return "your prison cellmate";
        }
        else if (lastName.length() > 0 ){
            return "your pole dancing teacher";
        }
        else
            return "you";
    }


}
