public class Exercicio_3 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i < 10000; i++) {
            if (!(i % 2 == 0)) {
                soma = soma + i;
            }
        }

        System.out.println("A soma dos números ímpares de 0 a 10000 é: " + soma);
    }
}
