package br.com.oraclechallenge.ForumHub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "curso")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursoDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
}
