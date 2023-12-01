package P2_2018_2.Aluno;

import java.util.*;

public class Utils {
    public static boolean existe(List<Aluno> x, Aluno y) {
        return x.contains(y);
    }

    public static void ordena(List<Aluno> x) {
        Collections.sort(x);
    }

    public Map<String, Aluno> retornaDados(Set conjuntoAlunos) throws RuntimeException {
        Iterator iterator = conjuntoAlunos.iterator();
        Map<String, Aluno> mapa = new HashMap<>();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            String[] dados = str.split("#");
            Aluno aluno = null;
            if (dados[3].equals("R")) {
                aluno = new AlunoRegular(dados[0]);
            } else if (dados[3].equals("E")) {
                aluno = new AlunoEspecial(dados[0]);
            } else {
                throw new RuntimeException("O último caractere da string não é R nem E: " + str);
            }
            aluno.setNome(dados[1]);
            aluno.setNota(Double.parseDouble(dados[2]));
            mapa.put(aluno.getId(), aluno);
        }
        return mapa;
    }
}
