package Aluno;

import java.util.*;

public class Utils {

    public static boolean existe (List x, Aluno y) {
        return x.contains(y);
    }

    public static void ordena (List<Aluno> x) {
        Collections.sort(x);
    }

    public Map<String, Aluno> retornaDados (Set conjuntoAlunos) throws RuntimeException {
        Map <String, Aluno> mapa = new HashMap<>();
        Iterator<String> iterator = conjuntoAlunos.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            String[] dados = str.split("#");
            Aluno a = null;
            if (dados[3].equals("R")) {
                a = new AlunoRegular(dados[0]);
            } else if (dados[3].equals("E")) {
                a = new AlunoEspecial(dados[0]);
            } else {
                throw new RuntimeException("Tipo de aluno inválido: " + dados[3]);
            }
            a.setNome(dados[1]);
            a.setNota(Double.parseDouble(dados[2]));
            mapa.put(dados[0], a);
        }
        return mapa;
    }

}
