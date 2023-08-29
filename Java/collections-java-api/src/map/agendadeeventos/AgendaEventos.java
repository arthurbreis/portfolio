package map.agendadeeventos;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    protected Map<LocalDate,Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        agendaMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(agendaMap);
        System.out.println(eventosTreemap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(agendaMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreemap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("Proximo evento: " + entry.getValue() + "será em " + entry.getKey());
                break;
            }
        }
    }
}
