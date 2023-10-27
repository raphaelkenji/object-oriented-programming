package ConsoleLampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada x = new Lampada();
        Lampada y = x;
        x.setCor("Branca");
        System.out.println(y.getCor());
        y.setCor("Rosa");
        x = new Lampada();
        y = x;
        System.out.println(y.getCor());
        y.setHorasUteis(2200);
        y.teste = y.teste + 15;
        System.out.println(x.teste);
        teste1(y, x);
        System.out.println(x.getCor());
        System.out.println(y.getCor());
        int k = 9;
        teste2(k, x.getHorasUteis(), x);
        System.out.println(x.teste);
        y.teste = y.teste + 3;
        System.out.println(x.teste);
        System.out.println(k);
        System.out.println(x.getCor());
        System.out.println(x.getHorasUteis());
    }
    public static void teste1(Lampada x, Lampada y) {
        x.setCor("Azul");
        x = new Lampada();
        x.setCor("Verde");
        y.setCor("Amarela");
        y = x;
        x = y;
        System.out.println(x.getCor());
    }
    public static Lampada teste2(int a, int b, Lampada x) {
        a = 11;
        b = 8;
        x.setCor("Laranja");
        x.teste = x.teste + 7;
        System.out.println("valor: " + a + b);
        return x;
    }
}

