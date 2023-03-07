package thread.Task2;

public class MyThreadMatch {
    void match(){
        try {
            startM();
            Thread.sleep(1000);

            breakM();
            Thread.sleep(1000);

            endM();
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Програму перервано!");
        }
    }
    void startM(){
        System.out.println("Матч розпочався");
    }
    void breakM(){
        System.out.println("Пройшло 45хв матчу");
    }
    void endM(){
        System.out.println("Матч завершено");
    }
}
