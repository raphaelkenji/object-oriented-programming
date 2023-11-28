package PF_2023_1.Escrever;

public class Principal {
    public static void main(String[] args) {
        Caneta c = new Caneta();
        c.setCor("azul");
        Caneta c2 = new Caneta();
        c2.setCor("preta");
        c2.setQuantidade(3);
        metodoCan1(c);
        metodoCan2(c2);
        int i=15;
        Integer j = i++;
        qtd(i);
        ++i;
        qtd2(j);
        System.out.println(i);
        System.out.println(j);
        System.out.println(c.getQuantidade());
        System.out.println(c2.getQuantidade());
        System.out.println(c.getCor());
        System.out.println(c2.getCor());
    }
    public static void metodoCan1(Caneta c) {
        c.setCor("vermelho");
        c.setQuantidade(9);
    }
    public static void metodoCan2(Caneta c) {
        c.setQuantidade(2);
        c = new Caneta();
        c.setCor("lilas");
    }
    public static void qtd(int i) {
        i = 19;
    }
    public static Integer qtd2(Integer i) {
        return i+15;
    }
}