package mainPackage;

import filler.ColumnFiller;
import filler.RowFiller;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Inputer input = new Inputer();

        int numbers[][] = input.getNumbers();
        char horizontalConnections[][] = input.getHorizontalConnections();
        char verticalConnections[][] = input.getVerticalConnections();

        while (!new Checker(numbers).isFilled())
        {
            numbers = new RowFiller(numbers).fill();
            numbers = new ColumnFiller(numbers).fill();
        }

        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 4; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println("");

        }

    }

}
