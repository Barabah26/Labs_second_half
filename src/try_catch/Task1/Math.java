package try_catch.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Math {
    void firstMethod(){
        try {
           int array[] = new int[11];
           array[11] = 9/2;
        } catch (ArithmeticException e) {
            System.out.println("Назва ерору1: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Назва ерору2: " + e);
        } catch (Exception e){
            System.out.println("Назва ерору3: " + e);
        }
    }
    void secondMethod(){
        int array[] = {0,2,3,4};
        int a,b;
        System.out.println();
        for (int i = 1; i < 4; i++){
            try{
                b = 9/array[0];
                System.out.println(b);
                try {
                    array[5] = 3;
                    System.out.println(array[5]);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("За межами масиву!!!!");
                }
            }catch (ArithmeticException e){
                    System.out.println("Ділення на 0!!!!!");
            }

        }

    }
    void thirdMethod() throws FileNotFoundException {
        try {
            System.out.println();
            File file = new File("");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Помилки в читанні файлу!!!");
        } finally {
            File file = new File("test");
            Scanner scanner = new Scanner(file);
            System.out.println("Файл знайдено!");
        }

    }

}
