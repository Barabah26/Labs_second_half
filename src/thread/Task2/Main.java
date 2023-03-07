package thread.Task2;

public class Main {
    public static void main(String[] args) {
        String s = "Матч";

        MyThreadMatch myThreadMatch = new MyThreadMatch();
        MyThreadOne myThreadOne1 = new MyThreadOne(s, myThreadMatch);
        MyThreadOne myThreadOne2 = new MyThreadOne(s, myThreadMatch);
        MyThreadOne myThreadOne3 = new MyThreadOne(s, myThreadMatch);

        try {
            System.out.println("Головний потік очікує.....");
            myThreadOne1.t.join();
            myThreadOne2.t.join();
            myThreadOne3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Головний потік завершено");


    }
}
