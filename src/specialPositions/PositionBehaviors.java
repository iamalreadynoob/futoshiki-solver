package specialPositions;

public class PositionBehaviors
{

    private int[][] numbers;
    private char[][] horizontalConnections;
    private char[][] verticalConnections;

    private Positions pos;

    public PositionBehaviors(int[][] numbers, char[][] horizontalConnections, char[][] verticalConnections)
    {
        this.numbers = numbers;
        this.horizontalConnections = horizontalConnections;
        this.verticalConnections = verticalConnections;

        pos = new PositionChecking(numbers, horizontalConnections, verticalConnections).getPosition();

        for (int i = 0; i < 4; i++)
        {

            for (int j = 0; j < 4; j++)
            {

            }

        }

    }

}
