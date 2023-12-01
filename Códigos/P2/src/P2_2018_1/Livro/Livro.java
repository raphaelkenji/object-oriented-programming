package P2_2018_1.Livro;

public class Livro {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean equals(Object o) {
        if (o instanceof Livro l) {
            return this.getId().equals(l.getId());
        }
        return false;
    }
}
