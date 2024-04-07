import java.util.List;

public class ListarFuncionarios {
    public static void ListarFuncionarios(List<Funcionario> funcionarios) {
        // Percorrer a lista e imprimir os dados
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: R$" + funcionario.getSalario());
            System.out.println();
        }
    }
}

