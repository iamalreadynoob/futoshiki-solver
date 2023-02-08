package logic;

public class VerticalLogic implements ILogic
{

    private int[][] numbers;
    private char[][] verticalConnections;

    public VerticalLogic(int[][] numbers, char[][] verticalConnections)
    {
        this.numbers = numbers;
        this.verticalConnections = verticalConnections;
    }

    @Override
    public int[][] operate()
    {

        for (int i = 0; i < 4; i ++)
        {
            int[] column = new int[4];
            char[] logicLine = new char[3];

            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            int amount = 0;

            for (int j = 0; j < 4; j++)
            {
                column[j] = numbers[j][i];

                switch (column[j])
                {
                    case 1: one = true; break;
                    case 2: two = true; break;
                    case 3: three = true; break;
                    case 4: four = true; break;
                }

                if (column[j] != 0) amount++;
            }

            for (int j = 0; j < 3; j++) logicLine[j] = verticalConnections[j][i];

            if (amount == 2)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (logicLine[j] == '^')
                    {
                        if (column[j] == 0 && column[j + 1] == 0)
                        {
                            if (one == true && two == true) { column[j] = 3; column[j+1] = 4; }
                            else if (one == true && three == true) { column[j] = 2; column[j+1] = 4; }
                            else if (one == true && four == true) { column[j] = 2; column[j+1] = 3; }
                            else if (two == true && three == true) { column[j] = 1; column[j+1] = 4; }
                            else if (two == true && four == true) { column[j] = 1; column[j+1] = 3; }
                            else if (three == true && four == true) { column[j] = 1; column[j] = 2; }
                        }

                        else if (column[j] == 3 && column[j+1] == 0)
                        {
                            column[j+1] = 4;
                            four = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (column[k] == 0)
                                {
                                    if (!one) column[k] = 1;
                                    else if (!two) column[k] = 2;
                                    break;
                                }
                            }
                        }

                        else if (column[j] == 0 && column[j+1] == 2)
                        {
                            column[j] = 1;
                            one = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (column[k] == 0)
                                {
                                    if (!three) column[k] = 3;
                                    else if (!four) column[k] = 4;
                                    break;
                                }
                            }
                        }
                    }

                    else if (logicLine[j] == 'v')
                    {
                        if (column[j] == 0 && column[j + 1] == 0)
                        {
                            if (one == true && two == true) { column[j] = 4; column[j+1] = 3; }
                            else if (one == true && three == true) { column[j] = 4; column[j+1] = 2; }
                            else if (one == true && four == true) { column[j] = 3; column[j+1] = 2; }
                            else if (two == true && three == true) { column[j] = 4; column[j+1] = 1; }
                            else if (two == true && four == true) { column[j] = 3; column[j+1] = 1; }
                            else if (three == true && four == true) { column[j] = 2; column[j] = 1; }
                        }

                        else if (column[j] == 2 && column[j+1] == 0)
                        {
                            column[j+1] = 1;
                            one = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (column[k] == 0)
                                {
                                    if (!three) column[k] = 3;
                                    else if (!four) column[k] = 4;
                                    break;
                                }
                            }
                        }

                        else if (column[j] == 0 && column[j+1] == 3)
                        {
                            column[j] = 4;
                            four = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (column[k] == 0)
                                {
                                    if (!one) column[k] = 1;
                                    else if (!two) column[k] = 2;
                                }
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < 4; j++)
            {
                numbers[j][i] = column[j];
            }

        }

        return numbers;
    }
}
