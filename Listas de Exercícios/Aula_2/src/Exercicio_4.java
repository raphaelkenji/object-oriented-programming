public class Exercicio_4 {
    public static void main(String[] args) {
        long soma = 0;

        for (long i = 1; i < 50000; i++) {
            if (i < 100 || i > 137) {
                soma = soma + i;
            }
        }

        System.out.println("A soma de todos os números de 1 a 50.000 (exceto os entre 100 e 137): " + soma);
    }
}
