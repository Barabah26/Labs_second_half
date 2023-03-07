package thread.Task3;

public class Team {
    int score = 79;
    boolean addScore = true;

    synchronized void startS(int s){
        while (!addScore){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Знайдено помилку!!!");
            }
        }
        System.out.println("Очки команди після 5 матчів: " + s);
        addScore = false;
        notify();
    }

    synchronized void sum(){
        while (addScore) {
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Знайдено помилку!!!!");
            }
        }
        addScore = true;
        System.out.println("Команда набрала за сезон: " + score + " залікових балів у турнірній таблиці.");
        notify();
    }


}
