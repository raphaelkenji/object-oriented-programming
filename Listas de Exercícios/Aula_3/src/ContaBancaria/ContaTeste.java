package ContaBancaria;

public class ContaTeste {
    public static void main(String[] args) {
        Data data = new Data();
        ContaBancaria conta = new ContaBancaria();

        data.setAno(2001);
        data.setMes(10);
        data.setDia(23);

        conta.setDataAbertura(data);
        System.out.println(conta.getDataAberturaFormatada());
        conta.setSaldo(1000);
        conta.depositar(1000);
        conta.sacar(3000);
        System.out.println(conta.getSaldoFormatado());
    }
}
