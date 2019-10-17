package com.practicepascaltriangle.app;

import java.util.Scanner;

/*
    @autor: york
*/
public class Main
{
    public static void main(String[] args)
    {
        //Variable declaration
        int numberRows = 0;
        int numberColumns = 1;
        int number = 0;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input number from user
        do
            {
            System.out.print("Write number of lines: ");
                numberRows = in.nextInt();

            //Pascal Triangle algorithm
            for (int row = 0; row < numberRows; row++)
            {
                number = 1;
                for (int colum = 0; colum <= row; colum++)
                {
                   System.out.print(number + " ");
                   number = number * (row - colum) / (colum + 1);
                }
                System.out.println();
            }

        }while(numberRows >0);

    }
}
