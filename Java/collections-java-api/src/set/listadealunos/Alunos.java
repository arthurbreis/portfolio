package set.listadealunos;

import java.util.Objects;

public class Alunos implements Comparable<Alunos> {

    @Override
    public int compareTo(Alunos alunos) {
        return nome.compareToIgnoreCase(alunos.getNome());
    }
    private String nome;
    private int matricula;
    private double media;

    public Alunos(String nome, int matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }


}
