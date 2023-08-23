package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenadosPorData = new TreeMap<>(eventos);
        System.out.println(eventosOrdenadosPorData);
    }

    public void obterProximoEvento() {
        var dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
