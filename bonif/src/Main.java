import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        // Loop do menu
        while (true) {

            // Exibir opções do menu
            System.out.println("Escolha uma opção:\n 1- Cadastrar funcionário\n 2- Listar funcionários\n 3- Sair");

            // Ler a opção do usuário
            int opcao = scanner.nextInt();

            // Validar a entrada
            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            // Tratar cada opção
            switch (opcao) {
                case 1:
                    CadastroFuncionario.CadastrarFuncionario(funcionarios, scanner);
                    break;
                case 2:
                    ListarFuncionarios.ListarFuncionarios(funcionarios);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    return;
            }
        }
    }
}






