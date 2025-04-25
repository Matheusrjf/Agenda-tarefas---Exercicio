import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir linha

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    tarefas.add(new Tarefa(desc));
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("\nTarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Número da tarefa a concluir: ");
                    int indexConcluir = scanner.nextInt();
                    if (indexConcluir >= 0 && indexConcluir < tarefas.size()) {
                        tarefas.get(indexConcluir).marcarConcluida();
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.print("Número da tarefa a remover: ");
                    int indexRemover = scanner.nextInt();
                    if (indexRemover >= 0 && indexRemover < tarefas.size()) {
                        tarefas.remove(indexRemover);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
