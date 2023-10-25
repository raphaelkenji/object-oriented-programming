public class GatoTeste {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();

        gato1.nome = "José";
        gato2.nome = "Carlos";
        gato3.nome = "Michael";

        gato1.vivo = true;
        gato2.vivo = true;
        gato3.vivo = false;

        gato1.cor = "Marrom";
        gato2.cor = "Cinza";
        gato3.cor = "Branco";

        gato1.idade = 4;
        gato2.idade = 7;
        gato3.idade = 13;

        System.out.println(gato1.idade + gato1.nome + gato1.vivo + gato1.cor);
        System.out.println(gato2.idade + gato2.nome + gato2.vivo + gato2.cor);
        System.out.println(gato3.idade + gato3.nome + gato3.vivo + gato3.cor);
    }
}
