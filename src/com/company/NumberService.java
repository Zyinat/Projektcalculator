package com.company;

import java.util.ArrayList;

public class NumberService {
    public NumberService(int number1, int number2, String simbol) {
    }

    static boolean chapter(String nam) throws  Exception{
        ArrayList<String> roman=new ArrayList<>();
        roman.add("0");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
        for (String rom:roman){
            if (nam.equals(rom)){
              return true;
            }
        }
        return false;
    }

    public static String convertNumToRoman(int numArabian) {
        String[] roman = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "XX", "XI", "XII",
                "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
                "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"

        };
        final String s= roman[numArabian];
        return  s;


    }
    static int romanToNumber(String roman){
    if (roman.equals("I"))
    return  1;
    else  if (roman.equals("II")){
        return 2;
    }else  if (roman.equals("III")){
        return 3;
    }else if (roman.equals("IV")){
        return 4;
    }else if (roman.equals("V")){
        return 5;
    }else if (roman.equals("VI")){
        return 6;
    }else if (roman.equals("VII")){
        return 7;
    }else  if (roman.equals("VIII")){
        return 8;
    }else if (roman.equals("IX")){
        return 9;
    }else if (roman.equals("XX")){
        return 10;
    }
    throw  new RuntimeException("try again:");

    }
    public static int calculated(int a, int b, String c) throws  Exception{
        int result=0;
        if (a > -1 && b <= 10 && b> -1 && a <=10 && c.equals("+")){
            result =a+b;
        }else  if (a > -1 && b <= -10 && b > -1 && a <=10 && c.equals("*")){
            result =a * b;
        }else  if (a > -1 && b <= 10 && b > -1 && a <= 10 && c.equals("-")){
            result =a - b;
        }else  if (a > -1 && b <=10 &&  b > -1 && a <= 10 && c.equals("/")){
            result = a/ b;
        }else {
            throw  new RuntimeException("Неверный формат данных");
        }
        return  result;
    }
    static  void arabicCalc(String numbr1, String number2, String simbols)throws  Exception{
        int number3, number4, result;
        number3= Integer.parseInt(numbr1);
        number4= Integer.parseInt(number2);
        result = NumberService.calculated(number3,number4, simbols);
        System.out.println("Result in Arabic num ");
        System.out.println(number3+"  "+simbols+"  "+number4 +" ="+ result);
    }
    static String romanCalc(String num, String nub1, String simbol) throws  Exception{
        int number1;
        int number2;
        NumberService result1;
        number1 = NumberService.romanToNumber(num);
        number2 =NumberService.romanToNumber(nub1);
        System.out.println("Result in Roman num");
        result1= new NumberService(number1,number2, simbol);
        String result =NumberService.romanCalc(result1);
        String num1= NumberService.convertNumToRoman(number1);
        String num2= NumberService.convertNumToRoman(number2);
        System.out.println(nub1+ " "+ simbol +" "+ num2 +" = " + result);

        return result;
    }

    private static String romanCalc(NumberService result1) {
        return null;
    }

}


