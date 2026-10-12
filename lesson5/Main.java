package lesson5;

public class Main {

    public static void main(String[] args) {

        String exampleText = "alla";
        StringBuilder sb = new StringBuilder(exampleText);
        if (sb.equals(exampleText)) {
            sb.reverse();;
        }
        System.out.println(sb);
        sb.append("s");
        sb.reverse();
        System.out.println(sb);
    }

}
