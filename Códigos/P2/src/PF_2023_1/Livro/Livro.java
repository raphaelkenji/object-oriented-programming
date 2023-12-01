package PF_2023_1.Livro;

public abstract class Livro {
    String nome;
    String autor;
    int ano;
    String ISBN;

    public Livro (int ano) {
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean equals(Object o) {
        if (o instanceof Livro u) {
            return this.getISBN().equals(u.getISBN());
        }
        return false;
    }

}
