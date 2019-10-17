package com.practicepascaltriangle.app;

import java.util.Scanner;

/**
 *
 *
 *  @autor: york
*/
public class Main
{
    public static void main(String[] args)
    {
        //Variable declaration
        int numberRows = 0;
        int numberColumns = 1;
        int number = 0;
        int spacesNumber = 0;
        char response = 'y';

        //Object construction
        Scanner in = new Scanner(System.in);

        //Input number from user
        do
            {
            System.out.print("Write number of lines: ");
            numberRows = in.nextInt();

            //validate input
            if(numberRows < 1)
            {
                System.out.println("You must enter a number greater than 0!!");
            }

            spacesNumber = numberRows;

            //Pascal Triangle algorithm
            for (int row = 0; row < numberRows; row++)
            {
                number = 1;

                //Create spaces
                for(int h = 1; h <= spacesNumber; h++){
                    System.out.print(" ");
                }
                for (int colum = 0; colum <= row; colum++)
                {
                   System.out.print(number + " ");
                   number = number * (row - colum) / (colum + 1);
                }

                System.out.println();
                spacesNumber--;
            }

            //Ask the user
            System.out.println("do you want to enter a new number (y/n)?");
            response = in.next().charAt(0);

        }while(response == 'y');

        //Close input
        in.close();
    }
}
