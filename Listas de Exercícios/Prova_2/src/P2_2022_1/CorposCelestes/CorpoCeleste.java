package P2_2022_1.CorposCelestes;

public class CorpoCeleste implements Comparable <CorpoCeleste> {
    String id;
    String nome;
    double distancia;

    public CorpoCeleste (String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public boolean equals (Object o) {
        if (o instanceof CorpoCeleste u) {
            return this.getId().equals(u.getId());
        }
        return false;
    }

    public int compareTo(CorpoCeleste c) {
        return Double.compare(distancia, c.distancia);
    }

    public String toString() {
        return this.id + " / " + this.nome + " / " + this.distancia;
    }
}
