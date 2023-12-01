package P2_2023_1.Pais;

public class FormatoIncorretoException extends Exception {
    public FormatoIncorretoException (int x, String str) {
        super("A string possui menos de 3 elementos \"#\": " + x + " | " + str);
    }
}
