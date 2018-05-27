package gb.homework;
/**
 * @author Andrey Knyazev
 * @version dated by 23.05.2018
 */

import java.util.Random;
import java.util.Scanner;

public class L3Practice {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        tryToGuess();
        scanner.close();
    }

    /*
    1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    static void tryToGuess() {
        int life = 3;
        int number = random.nextInt(10);

        while (true) {
            life--;
            System.out.print("Угадай число от 0 до 9: ");
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("Загаданное число меньше!");
            } else if (guess < number) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
            if (life == 0 && guess != number) {
                System.out.println("Ну ладно достаточно...");
                break;
            }
        }
        System.out.print("Повторить игру еще раз? 1 – да / 0 – нет: ");
        int again = scanner.nextInt();
        if (again == 1) {
            tryToGuess();
        }
    }
}






