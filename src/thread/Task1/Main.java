package thread.Task1;

public class Main {
    public static void main(String[] args) {
        String n1 = "Матч №1";
        String n2 = "Матч №2";
        String n3 = "Матч №3";
        String n4 = "Матч №4";

        MyThread t1 = new MyThread(n1);
        MyThread t2 = new MyThread(n2);
        MyThread t3 = new MyThread(n3);
        MyThread t4 = new MyThread(n4);

        System.out.println("Стан потоку виконання " + n1 + ": " + t1.thread.isAlive());
        System.out.println("Стан потоку виконання " + n2 + ": " + t2.thread.isAlive());
        System.out.println("Стан потоку виконання " + n3 + ": " + t3.thread.isAlive());
        System.out.println("Стан потоку виконання " + n4 + ": " + t4.thread.isAlive());


        System.out.println();

        try {
            System.out.println("Головий потік чекає.....");
            t1.thread.join();
            t2.thread.join();
            t3.thread.join();
            t4.thread.join();

        } catch (InterruptedException e){
            System.out.println("Головний потік перервано!");
        }

        System.out.println("Стан потоку виконання " + n1 + ": " + t1.thread.isAlive());
        System.out.println("Стан потоку виконання " + n2 + ": " + t2.thread.isAlive());
        System.out.println("Стан потоку виконання " + n3 + ": " + t3.thread.isAlive());
        System.out.println("Стан потоку виконання " + n4 + ": " + t4.thread.isAlive());

    }
}
