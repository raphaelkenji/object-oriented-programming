import java.util.HashMap;
import java.util.Map;

public class Utils {
    public int contaPalavras (String str) {
        String[] palavras = str.split(" ");
        int qtd = 0;
        for (String palavra : palavras) {
            qtd += palavra.length();
        }
        return qtd;
    }

    public boolean verificaQuando (String str) {
        str = str.toLowerCase();
        String quando = "quando".toLowerCase();
        return str.indexOf(quando) != -1;
    }

    // public boolean verificaQuando (String str) {
    //    return str.toLowerCase().contains("quando".toLowerCase());
    // }

    public boolean verificaSite (String str) {
        if (str.startsWith("http")) {
            return true;
        }
        return false;
    }

    public boolean verificaExtensao (String str) {
        if (str.endsWith("jpg")) {
            return true;
        }
        return false;
    }

    public int comparacao (String str1, String str2) {
        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();
        int qtd = 0;
        if (char1.length != char2.length) {
            System.out.println("As string possuem tamanhos distintos!");
            return 0;
        }
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == char2[i]) {
                qtd++;
            }
        }
        return qtd;
    }

    public static Map<String, String> retornaConversoesPalavras () {
        Map<String, String> reduzidas = new HashMap<>();
        reduzidas.put("vc", "você");
        reduzidas.put("tb", "também");
        reduzidas.put("vlw", "valeu");
        return reduzidas;
    }

    public String convertePalavras (String str) {
        Map<String, String> reduzidas = retornaConversoesPalavras();
        String[] palavras = str.split(" ");
        String novaStr = "";
        for (String palavra : palavras) {
            if (reduzidas.containsKey(palavra)) {
                novaStr += reduzidas.get(palavra) + " ";
            } else {
                novaStr += palavra + " ";
            }
        }
        return novaStr;
    }
}
