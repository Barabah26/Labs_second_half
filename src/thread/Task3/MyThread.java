package thread.Task3;

public class MyThread implements Runnable{
    Team team;

    MyThread(Team team){
        this.team = team;
        new Thread(this, "Information about team").start();

    }

    @Override
    public void run() {
        while (true){
            team.startS(4);
        }
    }
}
