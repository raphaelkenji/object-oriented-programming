package Carro;
import java.util.Scanner;

public class Programa1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        Motor motor = new Motor();
        carro.setId(scanner.nextInt());
        scanner.nextLine();
        motor.setCor(scanner.nextLine());
        carro.setMotor(motor);
        imprimeDadosCarro(carro);
    }
    public static void imprimeDadosCarro(Carro n) {
        System.out.println("ID do veículo: " + n.getId());
        System.out.println("Cor do motor: " + n.getMotor().getCor());
    }
}
