package PF_2021_2.Palavroes;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        try {
            Utils.verifica(texto);
            String filtro = Utils.moderar(texto);
            System.out.println(filtro);
        } catch (TextoCurtoException e) {
            System.out.println(e.getMessage());
        }
    }
}
