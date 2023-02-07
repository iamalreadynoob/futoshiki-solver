package mainPackage;

public class Checker
{

    private int[][] numbers;

    protected Checker(int[][] numbers)
    {
        this.numbers = numbers;
    }

    protected boolean isFilled()
    {
        boolean isFinished = true;

        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 4; j++)
            {

                if (numbers[i][j] == 0)
                {
                    isFinished = false;
                    break;
                }

            }

            if (!isFinished) break;

        }

        return isFinished;
    }

}
