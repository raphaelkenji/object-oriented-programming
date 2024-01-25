// Gerado utilizando GPT-4

public class Main {
    public static void main(String args[]) {
        Utils utils = new Utils();
        String str = "hello world";
        System.out.println("Number of words: " + utils.contaPalavras(str));

        str = "Quando e a festa?";
        System.out.println("Contains 'quando'? " + utils.verificaQuando(str));

        str = "https://www.google.com";
        System.out.println("Starts with 'http'? " + utils.verificaSite(str));

        str = "image.jpg";
        System.out.println("Ends with 'jpg'? " + utils.verificaExtensao(str));

        str = "Hello";
        String strCompare = "hello";
        System.out.println("Number of matching characters: " + utils.comparacao(str, strCompare));

        str = "vc vai na casa dela tb ?";
        System.out.println("Converting words: " + utils.convertePalavras(str));
    }
}
