package br.com.oraclechallenge.ForumHub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Table(name = "resposta")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespostaDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    @ManyToMany(mappedBy = "respostas")
    private Set<TopicoDomain> topico;
    private Date dataCriacao;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private UsuarioDomain autor;
    private String solucao;
}
