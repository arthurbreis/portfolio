package entities;

import java.util.Date;

public class ContratoPorHora {
    private Date data;
    private double valorPorHora;
    private Integer horas;

    public ContratoPorHora(){}

    public ContratoPorHora(Date data, double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double totalContrato(){
        return valorPorHora*horas;
    }
}


