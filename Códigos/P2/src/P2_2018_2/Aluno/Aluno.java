package P2_2018_2.Aluno;

public class Aluno implements Comparable<Aluno> {
    private String id;
    private String nome;
    private double nota;

    public Aluno(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean equals(Object o) {
        if (o instanceof Aluno a) {
            return this.getId().equals(a.getId());
        }
        return false;
    }

    public int compareTo(Aluno a) {
        return this.getNome().compareTo(a.getNome());
    }

    public String toString() {
        return this.id + "/" + this.nome + "/" + this.nota;
    }
}
