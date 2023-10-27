import java.util.Scanner;

public class SubstituiReplace {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(processa(str));
        scanner.close();
    }
    public static String processa (String str) {
        String processada = "";
        str = str.toUpperCase();
        str = str.replace("A", "4")
                .replace("E", "3")
                .replace("I", "1")
                .replace("O", "0");
        for (int i = str.length() - 1; i >= 0; i--) {
            processada += str.charAt(i);
        }
        return processada;
    }
}
