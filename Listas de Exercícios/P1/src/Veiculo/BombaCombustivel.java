package Veiculo;
import java.util.ArrayList;

public class BombaCombustivel {
    double quantidadeLitros;
    double precoPorLitro = 4.50;

    public void setQuantidadeLitros(double quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public double getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void completarTanque(Abastecivel abastecivel) {
        double abastecido = 0.0;
        if (abastecivel.abastecer(0.1) && quantidadeLitros >= 0.1) {
            while (abastecivel.abastecer(0.1) && quantidadeLitros >= 0.1) {
                abastecido += 0.1;
                quantidadeLitros -= 0.1;
            }

            double precoTotal = abastecido * precoPorLitro;
            System.out.println("Abastecimento - " + abastecivel);
            System.out.println("Abastecido: " + abastecido);
            System.out.println("Total a ser pago: " + precoTotal);
        } else {
            System.out.println("Veículo " + abastecivel + " já está com o tanque cheio.");
        }
    }

    public void abastecerFila(ArrayList<Abastecivel> fila) {
        for (int i = 0; i < fila.size(); i++) {
            Abastecivel abastecivel = fila.get(i);
            completarTanque(abastecivel);
        }
    }
}
