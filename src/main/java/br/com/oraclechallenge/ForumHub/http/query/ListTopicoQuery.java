package br.com.oraclechallenge.ForumHub.http.query;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ListTopicoQuery {
    private Long id;
    private LocalDateTime dataCriacao;
    private Long cursoId;
    private String nomeCurso;
    private String ano;
}
