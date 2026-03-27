package com.example.demo.Repository;

import com.example.demo.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    // Aqui você não precisa escrever NADA.
    // O JpaRepository já vem com métodos como:
    // save(), findAll(), findById(), delete()...
}