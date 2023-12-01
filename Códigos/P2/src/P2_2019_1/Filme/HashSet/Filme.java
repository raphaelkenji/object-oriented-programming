package P2_2019_1.Filme.HashSet;

public class Filme implements Comparable {
    int id;
    String titulo;
    int ano;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int compareTo(Object o) {
        Filme f = (Filme) o;
        return this.getTitulo().compareTo(f.getTitulo());
    }

    public boolean equals(Object o) {
        if (o instanceof Filme f){
            return this.getTitulo().equals(f.getTitulo());
        }
        return false;
    }
}
