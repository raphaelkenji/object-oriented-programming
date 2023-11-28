package P2_2023_1.Arara;

public class TesteArara {
    public static void main(String[] args) {
        Arara x = new Arara();
        Arara y = x;
        x.setCor("Azul");
        System.out.println(y.getCor());
        y.setCor("Lilás");
        y = new Arara();
        System.out.println(y.getCor());
        y.setIdade(25);
        new Arara();
        y.teste = y.teste + 23;
        System.out.println(x.teste);
        teste1(x, y);
        System.out.println(x.getCor());
        System.out.println(y.getCor());
        int k = 9;
        teste2(k, x.getIdade(), x, y);
        System.out.println(x.teste);
        y.teste = y.teste + 93;
        System.out.println(x.teste);
        System.out.println(k);
        System.out.println(x.getCor());
        System.out.println(x.getIdade());
    }
    public static void teste1(Arara x, Arara y) {
        x.setCor("Dourada");
        x = new Arara();
        x.setCor("Creme");
        y.setCor("Prata");
        y = x;
        x = y;
        System.out.println(x.getCor());
    }
    public static Arara teste2(int a, int b, Arara y, Arara x) {
        a = 8;
        b=11;
        x.setCor("Verde");
        x.teste = x.teste + 17;
        System.out.println("resultado: " + a + a);
        y=x;
        return x;
    }
}
