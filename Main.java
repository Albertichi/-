package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean bol = false;
        boolean firstend = false;
        int finish = 0;
        boolean multiplication = false;
        boolean addition = false;
        boolean subtraction = false;
        boolean division = false;
        int first = 0;
        int second;


        StringBuilder temp2 = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");      // просим ввести строку
        String str = in.next();       // считываем строку
        char[] strToArray = str.toCharArray();
    for (int i = 0; i<=strToArray.length - 1; i++){         // цикл который будет парсить полученную строку
        if( strToArray[i] == 0 ) {
            bol = true;
        }
        if( strToArray[i] == 1 ) {
            bol = true;
        }
        if( strToArray[i] == 2 ) {
            bol = true;
        }
        if( strToArray[i] == 3 ) {
            bol = true;
        }
        if( strToArray[i] == 4 ) {
            bol = true;
        }
        if( strToArray[i] == 5 ) {
            bol = true;
        }
        if( strToArray[i] == 6 ) {
            bol = true;
        }
        if( strToArray[i] == 7 ) {
            bol = true;
        }
        if( strToArray[i] == 8 ) {
            bol = true;
        }
        if( strToArray[i] == 9 ) {
            bol = true;
        }
        if( strToArray[i] == '+' ) {

            first = Integer.parseInt ( String.valueOf ( temp ) );
             firstend = true;
             addition = true;
            ++i;
            bol = true;


        }
        if( strToArray[i] == '*' ) {
            // мы нашли знак, значит первое чисо закончилось, сотавим его и запомним знак.

             first = Integer.parseInt(String.valueOf(temp));
             firstend = true;
             multiplication = true;
            ++i;
            bol = true;
        }
        if( strToArray[i] == '-' ) {

             first = Integer.parseInt(String.valueOf(temp));
             firstend = true;
             subtraction = true;
            ++i;
            bol = true;
        }
        if( strToArray[i] == '/' ) {

             first = Integer.parseInt(String.valueOf(temp));
             firstend = true;
             division = true;
             ++i;
            bol = true;
        }

        if(bol) {

            if (!firstend) temp.append(strToArray[i]);
            else temp2.append(strToArray[i]);

            bol = false;
        }



        }
        second = Integer.parseInt(temp2.toString()); // получены два числа, а так же определено действие, которое необходимо выполнить
        if (multiplication) finish = first * second;
        if (addition) finish = first + second;
        if (subtraction) finish = first - second;
        if (division) finish = Math.round (first / second);

        System.out.println(finish);
        in.close();
    }

}
