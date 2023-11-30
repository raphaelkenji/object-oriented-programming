package P2_2023_1.Pais;

import java.util.ArrayList;
public class CriaPaises {
    public ArrayList<Pais> retornaPaises () {
        ArrayList<Pais> paises = new ArrayList<>();
        Pais canada = new Pais("CA", "Canada", 100000);
        Pais eua = new Pais("EUA", "Estados Unidos", 200000);
        Pais mexico = new Pais("MX", "México", 50000);
        canada.addFronteira(eua);
        eua.addFronteira(canada);
        eua.addFronteira(mexico);
        mexico.addFronteira(eua);
        canada.setPopulacao(200000);
        eua.setPopulacao(9999999);
        mexico.setPopulacao(30000);
        paises.add(canada);
        paises.add(eua);
        paises.add(mexico);
        return paises;
    }

    public ArrayList<Pais> retornaPaises (String[] str) {
        ArrayList<Pais> paises = new ArrayList<>();
        try {
            for (int i = 0; i < str.length; i++) {
                String[] x = str[i].split("#");
                if (x.length < 3) {
                    throw new FormatoIncorretoException(x.length, str[i]);
                }
                Pais pais = new Pais(x[0], x[1], Double.parseDouble(x[2]));
                paises.add(pais);
            }
        } catch (FormatoIncorretoException e) {
            System.out.println(e.getMessage());
        }
        return paises;
    }
}
