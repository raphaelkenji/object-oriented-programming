package PF_2021_2.Palavroes;

public class Utils {
    public static void verifica (String texto) throws TextoCurtoException {
        if (texto.length() < 10) {
            throw new TextoCurtoException("O texto dado é menor que 10 caractéres. (" + texto.length() + ")");
        }
    }

    public static String moderar (String texto) {
        String[] palavras = texto.split(" ");
        String filtro = "";
        for (int i = 0; i < palavras.length; i++) {
            String palavra = (palavras[i]).toLowerCase();
            if (Utilidades.getPalavroes().contains(palavra)) {
                for (int j = 0; j < palavra.length(); j++) {
                    filtro += "#";
                }
            } else {
                filtro += palavras[i];
            }
            filtro += " ";
        }
        return filtro;
    }
}
