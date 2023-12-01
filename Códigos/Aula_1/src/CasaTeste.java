public class CasaTeste {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();

        casa1.numero = 15;
        casa2.numero = 30;

        casa1.cor = "Azul";
        casa2.cor = "Vermelho";

        System.out.println("A casa de número " + casa1.numero + " tem a cor " + casa1.cor);
        System.out.println("A casa de número " + casa2.numero + " tem a cor " + casa2.cor);
    }
}
