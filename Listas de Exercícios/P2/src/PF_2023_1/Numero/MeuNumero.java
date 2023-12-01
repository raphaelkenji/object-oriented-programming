package PF_2023_1.Numero;

public class MeuNumero  {
    public static void media (String x) {
        String[] numeros = x.split("#");
        double soma = 0;
        try {
            for (int i = 0; i < numeros.length; i++) {
                int valor = Integer.parseInt(numeros[i]);
                if (valor < 0) {
                    throw new NumeroNegativoException(valor);
                } else {
                    soma += valor;
                }
            }
            System.out.println("A média é: [" + (soma / numeros.length) + "]" );
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}
