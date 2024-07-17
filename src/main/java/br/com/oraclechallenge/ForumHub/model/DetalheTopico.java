package br.com.oraclechallenge.ForumHub.model;

import br.com.oraclechallenge.ForumHub.domain.TopicoDomain;

import java.time.LocalDateTime;

public record DetalheTopico(TopicoDomain topico, String titulo, String mensage, String nomeAutor, LocalDateTime dataCriacao) {

    public DetalheTopico(TopicoDomain topico, String infoExtra) {
        this(topico, topico.getTitulo(), topico.getMensagem(), topico.getAutor().getNome(), topico.getDataCriacao());
    }
}
