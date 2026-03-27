package com.example.demo.controller;

import com.example.demo.model.Evento;
import com.example.demo.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private EventoRepository Repository;

    @GetMapping
    public List<Evento> listar() {
        return Repository.findAll();
    }

    @PostMapping
    public Evento cadastrar(@RequestBody Evento novoEvento) {
        return Repository.save(novoEvento);
    }

    @PutMapping("/{id}")
    public Evento atualizar(@PathVariable Long id, @RequestBody Evento eventoAtualizado) {
        return Repository.findById(id)
                .map(evento -> {
                    evento.setNome(eventoAtualizado.getNome());
                    evento.setEndereco(eventoAtualizado.getEndereco());
                    evento.setCategoria(eventoAtualizado.getCategoria());
                    evento.setHorario(eventoAtualizado.getHorario());
                    evento.setDescricao(eventoAtualizado.getDescricao());
                    evento.setId(id); // Garante que o ID não mude
                    return Repository.save(evento);
                }).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        Repository.deleteById(id);
    }
}