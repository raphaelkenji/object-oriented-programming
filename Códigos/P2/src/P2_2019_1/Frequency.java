package P2_2019_1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Frequency {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma frase com palavras repetidas:");
        String frase = scanner.nextLine();
        System.out.println("Qual palavra você deseja verificar a frequência?");
        String palavra = scanner.nextLine();
        String[] array = frase.split(" ");
        List lista = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            lista.add(array[i]);
        }
        int x = Collections.frequency(lista, palavra);
        System.out.println("A palavra " + palavra + " foi encontrada " + x + " vezes.");
    }
}
