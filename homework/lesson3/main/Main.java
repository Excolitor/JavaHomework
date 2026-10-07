package homework.lesson3.main;
import homework.lesson3.rainbow.Rainbow;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Rainbow rainbow = new Rainbow();
    public static void main (String[] args){
        System.out.print("Введите номер первого цвета: ");
        int number = scanner.nextInt();
        rainbow.incorrectNumber(number);
        System.out.println(rainbow.getColorName(number));
        number = number + 100;
        System.out.println(rainbow.getMixedColor(number));
    }

}
