package set.listadealunos;

public class MainTest {
    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000);
        gerenciadorAlunos.removerAlunoPorMatricula(123457);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
