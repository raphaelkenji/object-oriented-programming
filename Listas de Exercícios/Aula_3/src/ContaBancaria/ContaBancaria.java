package ContaBancaria;

public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;

    public double getSaldo() {
        return saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(Data data) {
        this.dataAbertura = data;
    }

    public String getDataAberturaFormatada() {
        return this.dataAbertura.getDia() + "/" + this.dataAbertura.getMes() + "/" + this.dataAbertura.getAno();
    }

    public String getSaldoFormatado() {
        return "Saldo: R$ " + this.saldo;
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Você não possui saldo o suficiente.");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

}
