package logic;

public class HorizontalLogic implements ILogic
{

    private int[][] numbers;
    private char[][] horizontalConnections;

    public HorizontalLogic(int[][] numbers, char[][] horizontalConnections)
    {
        this.numbers = numbers;
        this.horizontalConnections = horizontalConnections;
    }

    public int[][] operate()
    {
        for (int i = 0; i < 4; i++)
        {

            int row[] = new int[4];
            char logicLine[] = new char[3];

            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            int amount = 0;

            for (int j = 0; j < 4; j++)
            {
                row[j] = numbers[i][j];

                switch (row[j])
                {
                    case 1: one = true; break;
                    case 2: two = true; break;
                    case 3: three = true; break;
                    case 4: four = true; break;
                }

                if (row[j] != 0) amount++;

            }

            for (int j = 0; j < 3; j++) logicLine[j] = horizontalConnections[i][j];

            if (amount == 2)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (logicLine[j] == '<')
                    {
                        if (row[j] == 0 && row[j + 1] == 0)
                        {
                            if (one == true && two == true) { row[j] = 3; row[j+1] = 4; }
                            else if (one == true && three == true) { row[j] = 2; row[j+1] = 4; }
                            else if (one == true && four == true) { row[j] = 2; row[j+1] = 3; }
                            else if (two == true && three == true) { row[j] = 1; row[j+1] = 4; }
                            else if (two == true && four == true) { row[j] = 1; row[j+1] = 3; }
                            else if (three == true && four == true) { row[j] = 1; row[j] = 2; }
                        }

                        else if (row[j] == 3 && row[j+1] == 0)
                        {
                            row[j+1] = 4;
                            four = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (row[k] == 0)
                                {
                                    if (!one) row[k] = 1;
                                    else if (!two) row[k] = 2;
                                    break;
                                }
                            }
                        }

                        else if (row[j] == 0 && row[j+1] == 2)
                        {
                            row[j] = 1;
                            one = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (row[k] == 0)
                                {
                                    if (!three) row[k] = 3;
                                    else if (!four) row[k] = 4;
                                    break;
                                }
                            }
                        }
                    }

                    else if (logicLine[j] == '>')
                    {
                        if (row[j] == 0 && row[j + 1] == 0)
                        {
                            if (one == true && two == true) { row[j] = 4; row[j+1] = 3; }
                            else if (one == true && three == true) { row[j] = 4; row[j+1] = 2; }
                            else if (one == true && four == true) { row[j] = 3; row[j+1] = 2; }
                            else if (two == true && three == true) { row[j] = 4; row[j+1] = 1; }
                            else if (two == true && four == true) { row[j] = 3; row[j+1] = 1; }
                            else if (three == true && four == true) { row[j] = 2; row[j] = 1; }
                        }

                        else if (row[j] == 2 && row[j+1] == 0)
                        {
                            row[j+1] = 1;
                            one = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (row[k] == 0)
                                {
                                    if (!three) row[k] = 3;
                                    else if (!four) row[k] = 4;
                                    break;
                                }
                            }
                        }

                        else if (row[j] == 0 && row[j+1] == 3)
                        {
                            row[j] = 4;
                            four = true;

                            for (int k = 0; k < 4; k++)
                            {
                                if (row[k] == 0)
                                {
                                    if (!one) row[k] = 1;
                                    else if (!two) row[k] = 2;
                                }
                            }
                        }
                    }
                }
            }

            for (int j = 0; j < 4; j++)
            {
                numbers[i][j] = row[j];
            }

        }

        return numbers;
    }



}
