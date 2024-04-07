import java.util.List;
import java.util.Scanner;

public class CadastroFuncionario {
    public static void CadastrarFuncionario(List<Funcionario> funcionarios, Scanner scanner) {
        // Obter dados do teclado
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        scanner.nextLine();


        // Criar novo funcionário
        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        // Adicionar o funcionário à lista
        funcionarios.add(funcionario);

        // Perguntar se deseja cadastrar mais funcionários
        System.out.println("Deseja cadastrar mais funcionários? (s/n)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("n")) {
            return;
        }
    }
}
