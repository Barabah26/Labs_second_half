package thread.Task3;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        MyThread thread = new MyThread(team);
        MyThreadTeam thread2 = new MyThreadTeam(team);




    }
}
