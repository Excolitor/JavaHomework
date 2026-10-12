package homework.lesson5.random;
import java.util.Random;
public class Random_litter {

    private static final String LETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final boolean COMPARE = true;

    public static String nameGenerator () {
        Random rndLength = new Random();
        int targetLength = rndLength.nextInt(7, 8);
        Random rndChar = new Random();
        StringBuilder sb = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i++) {
            if (i == 0 ) {
                int rndLitter = rndChar.nextInt(26);
                sb.append((LETTER.charAt(rndLitter)));
            }
            else {
                int rndLitter = rndChar.nextInt(26) + 26;
                sb.append((LETTER.charAt(rndLitter)));
            }
        }
        return sb.toString();
    }

    public static Double doubleGenerator() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        int firstNumber = rand.nextInt(10);
        sb.append(firstNumber);
        sb.append('.');
        for (int i = 0; i < 5; i++) {
            int dotNumber = rand.nextInt(10);
            sb.append(dotNumber);
        }
        return Double.parseDouble(String.valueOf(sb));
    }

    public static void main(String[] args) {
        String name = nameGenerator();
        System.out.println(name);
        double dble = doubleGenerator();
        System.out.println(dble);
    }


}
