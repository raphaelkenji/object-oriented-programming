package P2_2022_1.CorposCelestes;

public class FormatoIncorretoException extends Exception {
    public FormatoIncorretoException (String str) {
        super("O formato da String [" + str + "] está incorreto.");
    }
}
