package entities;

import entities.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador(){}

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }
    public void adicionarContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }

    public void removendoContrato(ContratoPorHora contrato){
        contratos.remove(contrato);
    }

    public double salario (int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora c: contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma+=c.totalContrato();
            }
        }
        return soma;
    }


}
