package lesson4;

public class Main {

    public static void main(String[] args) {

        int[] pot = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < pot.length; i ++) {
            if (i == 5) {
                System.out.println("Вот ваш счастливый пельмень");
                System.out.println("Он под номером " + i);
                break;
            }
        }

    }
}


