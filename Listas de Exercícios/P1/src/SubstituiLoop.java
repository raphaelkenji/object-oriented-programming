import java.util.Scanner;

public class SubstituiLoop {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(processa(str));
        scanner.close();
    }
    public static String processa (String str) {
        String processada = "";
        str = str.toUpperCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'A') {
                processada += '4';
            } else if (str.charAt(i) == 'E') {
                processada += '3';
            } else if (str.charAt(i) == 'I') {
                processada += '1';
            } else if (str.charAt(i) == 'O') {
                processada += '0';
            } else {
                processada += str.charAt(i);
            }
        }
        return processada;
    }
}
