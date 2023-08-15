package list.operacoesbasicas.listatarefas;

public class MainTest {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Total de elementos: " + listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("Total de elementos: " + listaTarefas.obterTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("Total de elementos: " + listaTarefas.obterTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
