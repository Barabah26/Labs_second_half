package try_catch.Task2;

public class Coach {
    private int matches;

    public Coach(int matches) {
        this.matches = matches;
    }

    public void played(int m){
        System.out.println("Тренер провів " + matches + " матчів із " + m + " можливих");
    }

    public void allInfo(int m) throws FalseWins {
        if ((m - matches) < 3){
            System.out.println("Скіли тренера в нормі");
        } else {
            int need = m - matches;
            throw new FalseWins(need);
        }

    }

    public int getMatches() {
        return matches;
    }
}
