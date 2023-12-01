import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] funcionarios = {
                "000-1#Michael Jackson#3000#P",
                "000-2#David Guetta#4000#A",
                "000-3#Lady Gaga#1000#P",
                "000-4#Bruno Mars#5000#P",
                "000-5#Mia Khalifa#6000#A"
        };

        List dados_funcionarios = new Utils().retornaDados(funcionarios);
        double soma = 0.0;
        for (int i = 0; i < dados_funcionarios.size(); i ++) {
            Funcionario x = (Funcionario) dados_funcionarios.get(i);
            soma += x.getSalario();
        }
        
        System.out.println("Media de salarios: " + (soma/dados_funcionarios.size()));

    }
}
