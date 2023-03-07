package thread.Task2;

public class MyThreadOne extends Thread{
    Thread t;
    String name;
    MyThreadMatch match;

    MyThreadOne(String n, MyThreadMatch m){
        match = m;
        name = n;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try {
            synchronized (match) {
                System.out.println("Матч скоро розпочнеться....");
                match.match();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Щось пішло не так");
        }
    }
}
