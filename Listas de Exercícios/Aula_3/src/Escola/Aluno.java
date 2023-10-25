package Escola;

public class Aluno {
    private String nome;
    private double nota_1;
    private double nota_2;

    public double getNota_1() {
        return nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota_1(double nota_1) {
        if (nota_1 > 10) {
            this.nota_1 = 10;
        } else if (nota_1 < 0) {
            this.nota_1 = 0;
        } else {
            this.nota_1 = nota_1;
        }
    }

    public void setNota_2(double nota_2) {
        if (nota_2 > 10) {
            this.nota_2 = 10;
        } else if (nota_2 < 0) {
            this.nota_2 = 0;
        } else {
            this.nota_2 = nota_2;
        }
    }

    private String getResultado(double nota_1, double nota_2) {
        String status;
        double media = (nota_1 + nota_2) / 2;
        if (media < 4) {
            status = "Reprovado";
        } else if (media >= 4 && media <= 5.9) {
            status = "Recuperação";
        } else {
            status = "Aprovado";
        }
        return status;
    }

    @Override
    public String toString() {
        return ("Escola.Aluno: " + getNome() + "\nNota 1: " + getNota_1() + "\nNota 2: " + getNota_2() + "\nResultado: " + getResultado(getNota_1(), getNota_2()));
    }

}
