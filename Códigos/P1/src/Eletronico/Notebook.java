package Eletronico;

public class Notebook extends Produto implements Eletronico {

    public Notebook (String id) {
        super(id);
    }
    public void ligar() {
        System.out.println("Notebook ligado!");
    }

    public void desligar() {
        System.out.println("Notebook desligado!");
    }
}
