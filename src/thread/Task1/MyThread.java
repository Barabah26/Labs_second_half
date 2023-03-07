package thread.Task1;

public class MyThread implements Runnable{
    Thread thread;
    String name;

    MyThread(String n) {
        name = n;
        thread = new Thread(this, name);
        thread.start();
    }


    @Override
    public void run() {
        try {
            switch (name) {
                case "Матч №1":
                    System.out.println("Перший матч розпочався!");
                    firstMatch();
                    break;
                case "Матч №2":
                    System.out.println("Другий матч розпочався!");
                    secondMatch();
                    break;
                case "Матч №3":
                    System.out.println("Третій матч розпочався!");
                    thirdMatch();
                    break;
                case "Матч №4":
                    System.out.println("Четвертий матч розпочався!");
                    fourthMatch();
                    break;
                default:
                    System.out.println("Матчу не знайдено!!!!");
                    break;
            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Програму перервано!!!");
        }
        System.out.println(name + " завершено!");
    }
    void firstMatch(){
        System.out.println("Перший матч триває");
    }
    void secondMatch(){
        System.out.println("Другий матч триває");
    }
    void thirdMatch(){
        System.out.println("Третій матч триває");
    }
    void fourthMatch(){
        System.out.println("Четвертий матч триває");
    }
}
