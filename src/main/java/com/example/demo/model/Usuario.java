package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String cidade; // Importante para o contexto da atividade
    private List<Evento> meusEventos; // Para o requisito de confirmar presença

    public Usuario(String nome, String email, String cidade) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.meusEventos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCidade() { return cidade; }
    public List<Evento> getMeusEventos() { return meusEventos; }

    // Método para confirmar presença
    public void confirmarPresenca(Evento evento) {
        if (!meusEventos.contains(evento)) {
            meusEventos.add(evento);
            System.out.println("Presença confirmada em: " + evento.getNome());
        }
    }

    // Método para cancelar participação
    public void cancelarParticipacao(Evento evento) {
        meusEventos.remove(evento);
        System.out.println("Participação cancelada.");
    }
    //  Guardar a lista de eventos
    private List<Evento> eventosConfirmados = new ArrayList<>();

    public void participarEvento(Evento evento) {
        if (!eventosConfirmados.contains(evento)) {
            eventosConfirmados.add(evento);
            System.out.println("Presença confirmada no evento: " + evento.getNome());
        } else {
            System.out.println("Tu já estás inscrito neste evento!");
        }
    }
    public List<Evento> getEventosConfirmados() {
        return eventosConfirmados;
    }
}