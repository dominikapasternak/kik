import PlayerInterface.PlayerInterface;

public class Player implements PlayerInterface {
    private String name;
    private int points;
    private String mark;

    public Player(String name1, String mark1)
    {
        name = name1;
        mark = mark1;
        points = 0;
    }

    @Override
    public String GetName()
    {
        return name;
    }

    @Override
    public int GetPoints()
    {
        return points;
    }

    @Override
    public String GetMark()
    {
        return mark;
    }

    public void AddPoints()
    {
        points += 1;
    }

    public void ResetPoints()
    {
        points = 0;
    }
}
