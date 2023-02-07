package filler;

public class RowFiller implements IFiller
{

    private int[][] numbers;

    public RowFiller(int[][] numbers)
    {
        this.numbers = numbers;
    }

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

                if (filled[i][j] != 0)
                {
                    switch (filled[i][j])
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
                if (!isOneExist) filled[i][zeroLocation] = 1;
                else if (!isTwoExist) filled[i][zeroLocation] = 2;
                else if (!isThreeExist) filled[i][zeroLocation] = 3;
                else if (!isFourExist) filled[i][zeroLocation] = 4;
            }

        }

        return filled;
    }

}
