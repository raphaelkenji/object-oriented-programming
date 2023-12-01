import java.util.Scanner;

public class Inverte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println(inverter(str));
        scanner.close();
    }
    public static String inverter(String str) {
        String inverso = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inverso += str.charAt(i);
        }
        return inverso;
    }
}
