package UFC;

public class PesoMedio extends Lutador {
    public PesoMedio (String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public String categoriaLutador() {
        return "Peso Médio";
    }
}
