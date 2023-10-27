package ConsoleAraras;

public class TesteArara {
    public static void main(String[] args) {
        Arara x = new Arara();
        Arara y = x;
        x.setCor("Preta");
        System.out.println(y.getCor());
        y.setCor("Rosa");
        y = new Arara();
        System.out.println(y.getCor());
        y.setIdade(22);
        new Arara();
        y.teste = y.teste + 15;
        System.out.println(x.teste);
        teste1(y, x);
        System.out.println(x.getCor());
        System.out.println(y.getCor());
        int k = 9;
        teste2(k, x.getIdade(), x);
        System.out.println(x.teste);
        y.teste = y.teste + 3;
        System.out.println(x.teste);
        System.out.println(k);
        System.out.println(x.getCor());
        System.out.println(x.getIdade());
    }
    public static void teste1(Arara x, Arara y) {
        x.setCor("Dourada");
        x = new Arara();
        x.setCor("Azul");
        y.setCor("Creme");
        y = x;
        x = y;
        System.out.println(x.getCor());
    }
    public static Arara teste2(int a, int b, Arara x) {
        a = 11;
        b=8;
        x.setCor("Verde");
        x.teste = x.teste + 7;
        System.out.println("valor: " + a + b);
        return x;
    }
}

