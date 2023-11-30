package PF_2021_2.Carro;

import java.util.List;
import java.util.ArrayList;
public class Carro {
    private String placa;
    private String cor;
    private int ano;
    private String renavan;
    private List<Acessorio> acessorios = new ArrayList<>();

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getRenavan() {
        return renavan;
    }

    public void addAcessorio(Acessorio o) {
        acessorios.add(o);
    }

    public List <Acessorio> getAcessorios () {
        return acessorios;
    }

}
