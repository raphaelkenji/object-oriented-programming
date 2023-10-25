package UFC;

public class MeioPesado extends Lutador {
    public MeioPesado (String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public String categoriaLutador() {
        return "Peso Meio Pesado";
    }
}
