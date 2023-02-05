package mainPackage;

import java.util.Scanner;

public class Inputer
{

    private int numbers[][] = new int[4][4];
    private char verticalConnections[][] = new char[3][4];
    private char horizontalConnections[][] = new char[4][3];

    protected Inputer()
    {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 4; j++)
            {

                boolean isOkay = false;

                while (!isOkay)
                {
                    System.out.print((i + 1) + " - " + (j + 1) + ": ");
                    int temp = scan.nextInt();

                    if (temp >= 0 && temp <= 4)
                    {
                        numbers[i][j] = temp;
                        isOkay = true;
                    }

                    else System.out.println("It is undefined...");

                }

            }

        }

        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 3; j++)
            {

                boolean isOkay = false;

                while (!isOkay)
                {

                    System.out.print((i + 1) + " - " + (j + 1) + ": ");
                    char temp = scan.next().charAt(0);

                    if (temp == '<' || temp == '>' || temp == '-')
                    {
                        horizontalConnections[i][j] = temp;
                        isOkay = true;
                    }

                    else System.out.println("It is undefined...");

                }

            }

        }

        for (int i = 0; i < 3; i++)
        {

            for (int j = 0; j < 4; j++)
            {

                boolean isOkay = false;

                while (!isOkay)
                {
                    System.out.print((i + 1) + " - " + (j + 1) + ": ");
                    char temp = scan.next().charAt(0);

                    if (temp == '^' || temp == 'v' || temp == '-')
                    {
                        verticalConnections[i][j] = temp;
                        isOkay = true;
                    }

                    else System.out.println("It is undefined...");
                }

            }

        }
    }

    protected int[][] getNumbers() {return numbers;}
    protected char[][] getVerticalConnections() {return verticalConnections;}
    protected char[][] getHorizontalConnections() {return horizontalConnections;}


}
