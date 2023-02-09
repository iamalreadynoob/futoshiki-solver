package specialPositions;

public class PositionChecking
{

    private int[][] numbers;
    private char[][] horizontalConnections;
    private char[][] verticalConnections;
    private Positions pos = null;

    protected PositionChecking(int[][] numbers, char[][] horizontalConnections, char[][] verticalConnections)
    {

        this.numbers = numbers;
        this.horizontalConnections = horizontalConnections;
        this.verticalConnections = verticalConnections;

    }

    protected Positions getPosition()
    {
        return pos;
    }


}
