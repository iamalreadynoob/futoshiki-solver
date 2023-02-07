package filler;

public class ColumnFiller implements IFiller
{

    private int numbers[][];

    public ColumnFiller(int numbers[][])
    {
        this.numbers = numbers;
    }

    @Override
    public int[][] fill()
    {
        int[][] filled = numbers;

        for (int i = 0; i < 4; i++)
        {

            boolean isOneExist = false;
            boolean isTwoExist = false;
            boolean isThreeExist = false;
            boolean isFourExist = false;
            int amount = 0;
            int zeroLocation = 5;

            for (int j = 0; j < 4; j++)
            {

                if (filled[j][i] != 0)
                {

                    switch (filled[j][i])
                    {
                        case 1: isOneExist = true; break;
                        case 2: isTwoExist = true; break;
                        case 3: isThreeExist = true; break;
                        case 4: isFourExist = true; break;
                    }

                    amount++;
                }
                else zeroLocation = j;

            }

            if (amount == 3)
            {
                if (!isOneExist) filled[zeroLocation][i] = 1;
                else if (!isTwoExist) filled[zeroLocation][i] = 2;
                else if (!isThreeExist) filled[zeroLocation][i] = 3;
                else if (!isFourExist) filled[zeroLocation][i] = 4;
            }

        }

        return filled;
    }
}
