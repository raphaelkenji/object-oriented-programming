package P2_2022_1.CorposCelestes;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;

public class LerArquivo {
    public static Set<String> retornaStrings(){
        Set<String> retorno = new HashSet<String>();
        try {
            File myObj = new File("F:\\University\\Programação Orientada a Objetos\\Listas de Exercícios\\Prova_2\\src\\P2_2022_2\\CorposCelestes\\CorposCelestes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                retorno.add(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        return retorno;
    }
}
