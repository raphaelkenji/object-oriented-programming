package P2_2022_2.Ninja;

import java.util.List;
import java.util.ArrayList;

public class Academia {
    String nome;
    List ninjas = new ArrayList();

    public Academia (String nome) {
        this.nome = nome;
    }

    public void matriculaNinja (Ninja n) {
        ninjas.add(n);
    }

    public boolean imprimeDadosNinjaSeExistir (Ninja n) {
        if (ninjas.contains(n)) {
            System.out.println(ninjas.get(ninjas.indexOf(n)));
            return true;
        } else {
            System.out.println("Ninja não encontrado.");
            return false;
        }
    }

    public List listaNinjas() {
        return ninjas;
    }

    public String toString() {
        return nome + " - " + ninjas.size();
    }

}

