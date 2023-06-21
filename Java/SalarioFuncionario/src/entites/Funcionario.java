package entites;

public class Funcionario {
    private String nome;
    private double salario, imposto;

    public double salarioLiquido(){
        return salario - imposto;
    }
    public void setName(String name) {
        this.nome = name;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }


}
