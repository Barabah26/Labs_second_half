package try_catch.Task2;

public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach(54);
        coach.played(56);

        try {
            System.out.println("Скіли тренера залежить від кількість перемог.");
            coach.allInfo(58);
        } catch (FalseWins e) {
            System.out.println("Тренеру бракнуло " + e.getWins() + " перемоги!!!!");
        }

    }
}
