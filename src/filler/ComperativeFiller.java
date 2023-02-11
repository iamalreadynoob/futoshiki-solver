package filler;

public class ComperativeFiller implements IFiller
{

    private int[][] numbers;

    public ComperativeFiller(int[][] numbers)
    {
        this.numbers = numbers;
    }

    @Override
    public int[][] fill()
    {
        int[][] filled = numbers;

        for (int i = 0; i < 4; i++)
        {

            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            int amount = 0;

            for (int j = 0; j < 4; j++)
            {

                if (filled[i][j] != 0)
                {
                    switch (filled[i][j])
                    {
                        case 1: one = true; break;
                        case 2: two = true; break;
                        case 3: three = true; break;
                        case 4: four = true; break;
                    }

                    amount++;
                }

            }

            if (amount < 3)
            {

                int amountOne = 0;
                int amountTwo = 0;
                int amountThree = 0;
                int amountFour = 0;

                if (i != 3)
                {
                    for (int j = i + 1; j < 4; j++)
                    {
                        for (int k = 0; k < 4; k++)
                        {
                            if (filled[j][k] != 0)
                            {
                                switch (filled[j][k])
                                {
                                    case 1: amountOne++; break;
                                    case 2: amountTwo++; break;
                                    case 3: amountThree++; break;
                                    case 4: amountFour++; break;
                                }
                            }
                        }
                    }
                }

                if (i != 0)
                {
                    for (int j = i - 1; j >= 0; j--)
                    {
                        for (int k = 0; k < 4; k++)
                        {
                            if (filled[j][k] != 0)
                            {
                                switch (filled[j][k])
                                {
                                    case 1: amountOne++; break;
                                    case 2: amountTwo++; break;
                                    case 3: amountThree++; break;
                                    case 4: amountFour++; break;
                                }
                            }
                        }
                    }
                }

                if (amountOne == 3 && one == false)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        int correctness = 0;

                        if (i != 3)
                        {
                            for (int k = i + 1; k < 4; k++)
                            {
                                if (filled[k][j] == 1) break;
                                else correctness++;
                            }
                        }

                        if (i != 0)
                        {
                            for (int k = i - 1; k >= 0; k--)
                            {
                                if (filled[k][j] == 1) break;
                                else correctness++;
                            }
                        }

                        if (correctness == 3)
                        {
                            filled[i][j] = 1;
                            break;
                        }
                    }
                }

                else if (amountTwo == 3 && two == false)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        int correctness = 0;

                        if (i != 3)
                        {
                            for (int k = i + 1; k < 4; k++)
                            {
                                if (filled[k][j] == 2) break;
                                else correctness++;
                            }
                        }

                        if (i != 0)
                        {
                            for (int k = i - 1; k >= 0; k--)
                            {
                                if (filled[k][j] == 2) break;
                                else correctness++;
                            }
                        }

                        if (correctness == 3)
                        {
                            filled[i][j] = 2;
                            break;
                        }
                    }
                }

                else if (amountThree == 3 && three == false)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        int correctness = 0;

                        if (i != 3)
                        {
                            for (int k = i + 1; k < 4; k++)
                            {
                                if (filled[k][j] == 3) break;
                                else correctness++;
                            }
                        }

                        if (i != 0)
                        {
                            for (int k = i - 1; k >= 0; k--)
                            {
                                if (filled[k][j] == 3) break;
                                else correctness++;
                            }
                        }

                        if (correctness == 3)
                        {
                            filled[i][j] = 3;
                            break;
                        }
                    }
                }

                else if (amountFour == 3 && four == false)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        int correctness = 0;

                        if (i != 3)
                        {
                            for (int k = i + 1; k < 4; k++)
                            {
                                if (filled[k][j] == 4) break;
                                else correctness++;
                            }
                        }

                        if (i != 0)
                        {
                            for (int k = i - 1; k >= 0; k--)
                            {
                                if (filled[k][j] == 4) break;
                                else correctness++;
                            }
                        }

                        if (correctness == 4)
                        {
                            filled[i][j] = 1;
                            break;
                        }
                    }
                }

                one = false;
                two = false;
                three = false;
                four = false;
                amount = 0;

                for (int j = 0; j < 4; j++)
                {
                    if (filled[j][i] != 0)
                    {
                        switch (filled[j][i])
                        {
                            case 1: one = true; break;
                            case 2: two = true; break;
                            case 3: three = true; break;
                            case 4: four = true; break;
                        }

                        amount++;
                    }
                }

                if (amount < 3)
                {
                    amountOne = 0;
                    amountTwo = 0;
                    amountThree = 0;
                    amountFour = 0;

                    if (i != 3)
                    {
                        for (int j = i + 1; j < 4; j++)
                        {
                            for (int k = 0; k < 4; k++)
                            {
                                if (filled[k][j] != 0)
                                {
                                    switch (filled[k][j])
                                    {
                                        case 1: amountOne++; break;
                                        case 2: amountTwo++; break;
                                        case 3: amountThree++; break;
                                        case 4: amountFour++; break;
                                    }
                                }
                            }
                        }
                    }

                    if (i != 0)
                    {
                        for (int j = i - 1; j >= 0; j--)
                        {
                            for (int k = 0; k < 4; k++)
                            {
                                if (filled[k][j] != 0)
                                {
                                    switch (filled[k][j])
                                    {
                                        case 1: amountOne++; break;
                                        case 2: amountTwo++; break;
                                        case 3: amountThree++; break;
                                        case 4: amountFour++; break;
                                    }
                                }
                            }
                        }
                    }

                    if (amountOne == 3 && one == false)
                    {
                        for (int j = 0; j < 4; j++)
                        {
                            int correctness = 0;

                            if (i != 3)
                            {
                                for (int k = i + 1; k < 4; k++)
                                {
                                    if (filled[j][k] == 1) break;
                                    else correctness++;
                                }
                            }

                            if (i != 0)
                            {
                                for (int k = i - 1; k >= 0; k--)
                                {
                                    if (filled[j][k] == 1) break;
                                    else correctness++;
                                }
                            }

                            if (correctness == 3)
                            {
                                filled[j][i] = 1;
                                break;
                            }
                        }
                    }

                    else if (amountTwo == 3 && two == false)
                    {
                        for (int j = 0; j < 4; j++)
                        {
                            int correctness = 0;

                            if (i != 3)
                            {
                                for (int k = i + 1; k < 4; k++)
                                {
                                    if (filled[j][k] == 2) break;
                                    else correctness++;
                                }
                            }

                            if (i != 0)
                            {
                                for (int k = i - 1; k >= 0; k--)
                                {
                                    if (filled[j][k] == 2) break;
                                    else correctness++;
                                }
                            }

                            if (correctness == 3)
                            {
                                filled[j][i] = 2;
                                break;
                            }
                        }
                    }

                    else if (amountThree == 3 && three == false)
                    {
                        for (int j = 0; j < 4; j++)
                        {
                            int correctness = 0;

                            if (i != 3)
                            {
                                for (int k = i + 1; k < 4; k++)
                                {
                                    if (filled[j][k] == 3) break;
                                    else correctness++;
                                }
                            }

                            if (i != 0)
                            {
                                for (int k = i - 1; k >= 0; k--)
                                {
                                    if (filled[j][k] == 3) break;
                                    else correctness++;
                                }
                            }

                            if (correctness == 3)
                            {
                                filled[j][i] = 3;
                                break;
                            }
                        }
                    }

                    else if (amountFour == 3 && four == false)
                    {
                        for (int j = 0; j < 4; j++)
                        {
                            int correctness = 0;

                            if (i != 3)
                            {
                                for (int k = i + 1; k < 4; k++)
                                {
                                    if (filled[j][k] == 4) break;
                                    else correctness++;
                                }
                            }

                            if (i != 0)
                            {
                                for (int k = i - 1; k >= 0; k--)
                                {
                                    if (filled[j][k] == 4) break;
                                    else correctness++;
                                }
                            }

                            if (correctness == 4)
                            {
                                filled[j][i] = 1;
                                break;
                            }
                        }
                    }
                }

            }

        }

        return filled;
    }

}
