package P2_2018_1.Livro.GPT;

public class Livro {
    private String id;

    public Livro(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public boolean equals (Object o) {
        if (o instanceof Livro l) {
            return this.getId().equals(l.getId());
        }
        return false;
    }
}
