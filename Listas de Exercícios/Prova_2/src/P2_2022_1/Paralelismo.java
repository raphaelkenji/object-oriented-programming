package P2_2022_1;

import java.util.Scanner;

public class Paralelismo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str_processa = processa(str);
        String str_inverte = inverte(str_processa);
        System.out.println("Original: " + str);
        System.out.println("Processada: " + str_processa);
        System.out.println("Invertida: " + str_inverte);
    }

    public static String processa (String str) {
        str = str.toUpperCase();
        str = str.replace("A", "4").replace("E", "3").replace("I", "1").replace("O", "0");
        return str;
    }

    public static String inverte (String str) {
        String str_return = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str_return += str.charAt(i);
        }
        return str_return;
    }
}
