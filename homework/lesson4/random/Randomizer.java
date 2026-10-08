package homework.lesson4.random;
import java.util.Random;
public class Randomizer {

    private static final String CAPITALLETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETTER = "abcdefghijklmnopqrstuvwxyz";

    public static int rndAge (int age){
        Random rnd = new Random();
        int rndAge = rnd.nextInt(1,20);
        return rndAge;
    }

    public static String generateLetterCharacter (int length) {
        Random rndLength = new Random();
        int targetLength = rndLength.nextInt(3,5);
        Random rndChar = new Random();
        StringBuilder sb = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i++) {
            int randomIndex = rndChar.nextInt(LETTER.length());
            sb.append(LETTER.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static String generateCapitalCharacter (int length) {
        Random rndChar = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = rndChar.nextInt(CAPITALLETTER.length());
            sb.append(CAPITALLETTER.charAt(randomIndex));
        }

        return sb.toString();
    }

}
