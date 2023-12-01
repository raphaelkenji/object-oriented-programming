package P2_2022_1.CorposCelestes;

public class Planeta extends CorpoCeleste {
    public Planeta (String id) {
        super(id);
    }

    public String toString() {
        return "[Planeta] " + super.toString();
    }
}
