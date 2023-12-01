package P2_2018_2.Doceria;

public class Principal {
    public static void main(String[] args) {
        Rocambole d = new Rocambole();
        Rocambole d2 = new Rocambole();
        d.setNome("caramelo");
        d2.setNome("chocolate");
        teste(d, d2);
        int k = d.getNumero();
        System.out.println(k);
        k++;
        ++k;

        System.out.println(k);
        System.out.println(d.getNome());
        System.out.println(d2.getNome());
    }

    public static void teste(Rocambole d, Rocambole d2) {
        Rocambole d3 = d;
        d = d2;
        d2 = d3;
        d3.setNome("morango");
        d3 = new Rocambole();
        d2.setNome("pessego");
        d3.setNome("Abacate");
    }

}
