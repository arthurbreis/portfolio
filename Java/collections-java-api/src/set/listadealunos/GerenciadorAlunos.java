package set.listadealunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    protected Set<Alunos> alunosSet;
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, int matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public  void removerAlunoPorMatricula(int matricula){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for (Alunos a: alunosSet) {
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }else {
            throw new RuntimeException("Conjunto vazio");
        }
        if (alunoParaRemover == null){
            System.out.println("Matricula nao encontrada");
        }
    }
    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
