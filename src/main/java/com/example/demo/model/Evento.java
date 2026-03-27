package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity // Indica que isso é uma tabela no banco de dados
public class Evento {

    @Id // Define que o ID é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID sozinho (1, 2, 3...)
    private Long id;

    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime horario;
    private String descricao;

    // 1. Construtor Vazio (Obrigatório para o Hibernate/Spring)
    public Evento() {
    }

    // 2. Construtor com Atributos (O que você já tinha)
    public Evento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    // 3. Getters (Para o Spring conseguir ler os dados e mandar para o navegador)
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCategoria() { return categoria; }
    public LocalDateTime getHorario() { return horario; }
    public String getDescricao() { return descricao; }

    // 4. Setters (Importante para o Spring salvar os dados que vêm da web)
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    // Seu método de status (Pode manter!)
    public String getStatus() {
        LocalDateTime agora = LocalDateTime.now();
        if (horario.isBefore(agora)) {
            return "Já ocorreu";
        } else if (horario.getHour() == agora.getHour() && horario.toLocalDate().equals(agora.toLocalDate())) {
            return "Ocorrendo agora";
        } else {
            return "Futuro";
        }
    }
}