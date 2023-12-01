package ConsoleCaneca;

public class TestaCaneca {
    public static void main(String[] args) {
        Caneca c = new Caneca();
        c.setCor("verde");
        Caneca c2 = new Caneca();
        c2.setCor("azul");
        c2.setQuantidade(6);
        Caneca c3 = new Caneca();
        c3.setCor("rosa");
        metodoCan1(c2, c3);
        metodoCan2(c3);
        metodoCan3(c);
        c.x = 20;
        c2.x = 15;
        System.out.println(c.x+c2.x+c3.x);
        int i = c3.getQuantidade();
        System.out.println(i);
        System.out.println(c.getQuantidade());
        System.out.println(c2.getQuantidade());
        System.out.println(c3.getQuantidade());
        System.out.println(c.getCor());
        System.out.println(c2.getCor());
        System.out.println(c3.getCor());
        int y = 11;
        c = metodoCan4(c, y);
        System.out.println(c.getCor());
        System.out.println(c.getQuantidade());
        System.out.println(c.x);
        System.out.println(y);
    }
    public static void metodoCan1(Caneca d, Caneca c) {
        d.setCor("bege");
        c.setCor("vermelho");
        c = d;
        c.setQuantidade(9);
        c=null;
    }
    public static void metodoCan2(Caneca c) {
        c.setQuantidade(2);
        c = new Caneca();
        c.setCor("lilás");
    }
    public static void metodoCan3(Caneca c) {
        c = new Caneca();
        c.setCor("prata");
        c.setQuantidade(1);
    }
    public static Caneca metodoCan4(Caneca c, int u) {
        c=new Caneca();
        c.setCor("prata");
        u = u + 15;
        return c;
    }
}
