package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int age;
        boolean flag;
        String answer;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = input.nextInt();

        flag=age>=16 ? true : false;
        if(flag==true)
        {
            answer="You are old enough to legally drive.";
        }
        else
        {
            answer="You are not old enough to legally drive.";
        }

        System.out.print(answer);


    }

}