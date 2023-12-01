package P2_2019_1.Ligavel;

public class Televisao extends Produto implements Ligavel {
    public Televisao (String id) {
        super(id);
    }

    public void ligavel() {
        System.out.println("Televisão ligando...");
    }
}
