package try_catch.Task2;

public class FalseWins extends Exception{
    private int wins;

    public FalseWins(int wins){
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }
}
