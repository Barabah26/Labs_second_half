package thread.Task3;

public class MyThreadTeam implements Runnable{
    Team team;

    MyThreadTeam(Team team){
        this.team = team;
        new Thread(this, "Information about team").start();

    }

    @Override
    public void run() {
        while (true){
            team.sum();
        }
    }
}
