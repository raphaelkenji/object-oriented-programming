package P2_2022_1.CorposCelestes;

public class Estrela extends CorpoCeleste {
    public Estrela (String id) {
        super(id);
    }

    public String toString() {
        return "[Estrela] " + super.toString();
    }
}
