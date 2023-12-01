package PF_2023_1.Numero;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException (int valor) {
        super("O número " + valor + " é negativo, insira apenas números positivos.");
    }
}
