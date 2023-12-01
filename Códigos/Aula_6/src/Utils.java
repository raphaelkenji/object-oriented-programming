import java.util.ArrayList;
import java.util.List;
public class Utils {
    public static boolean existe(List x, Funcionario y) {
        if (x instanceof Funcionario) {
            return true;
        }
        return false;
    }

    public List retornaDados(String[] array_funcionarios) {
        List funcionarios = new ArrayList();

        for (int i = 0; i < array_funcionarios.length; i++) {
            String[] dados_funcionario = array_funcionarios[i].split("#");
            String id = dados_funcionario[0];
            String nome = dados_funcionario[1];
            double salario = Double.parseDouble(dados_funcionario[2]);
            char tipo = dados_funcionario[3].charAt(0);

            if (tipo == 'A') {
                System.out.println("Criando Perfil de Analista de Sistemas: " + nome);
                Funcionario temp = new AnalistaSistemas(id);
                temp.setNome(nome);
                temp.setSalario(salario);
                funcionarios.add(temp);
            } else if (tipo == 'P') {
                System.out.println("Criando Perfil de Programador: " + nome);
                Funcionario temp = new Programador(id);
                temp.setNome(nome);
                temp.setSalario(salario);
                funcionarios.add(temp);
            }
        }

        return funcionarios;
    }
}
