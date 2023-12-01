public class Funcionario {
    private String id;
    private String nome;
    private double salario;

    public Funcionario (String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean equals(Object o) {
        if (o instanceof Funcionario x) {
            return this.getId().equals(x.getId());
        }
        return false;
    }
}
