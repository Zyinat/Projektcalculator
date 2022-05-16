package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите операцию");
        Scanner scanner= new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] massiv= numbers.split(" ");
        String number1 = massiv[0];
        String simbol= massiv[1];
        String number2= massiv[2];

        try {
            if (NumberService.chapter(number1)&& NumberService.chapter(number2)){
                NumberService.romanCalc(number1,numbers,simbol);
            }
            else {
                NumberService.arabicCalc(number1,number2,simbol);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
