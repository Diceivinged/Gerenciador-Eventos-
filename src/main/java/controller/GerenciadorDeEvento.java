package controller;

import com.example.demo.model.Evento;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEvento {
    private static final String NOME_ARQUIVO = "events.data";

    // Método para salvar a lista de eventos no arquivo
    public static void salvarEventos(List<Evento> eventos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(NOME_ARQUIVO))) {
            for (Evento e : eventos) {
                // Salvamos os atributos separados por ";" para facilitar a leitura depois
                writer.println(e.getNome() + ";" + e.getEndereco() + ";" +
                        e.getCategoria() + ";" + e.getHorario() + ";" + e.getDescricao());
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar eventos: " + e.getMessage());
        }
    }

    // Método para carregar os eventos ao iniciar o programa
    public static List<Evento> carregarEventos() {
        List<Evento> eventos = new ArrayList<>();
        File arquivo = new File(NOME_ARQUIVO);

        if (!arquivo.exists()) return eventos;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 5) {
                    Evento evento = new Evento(
                            dados[0],
                            dados[1],
                            dados[2],
                            LocalDateTime.parse(dados[3]),
                            dados[4]
                    );
                    eventos.add(evento);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar eventos: " + e.getMessage());
        }
        return eventos;
    }
}