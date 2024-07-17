package br.com.oraclechallenge.ForumHub.repository;

import br.com.araujo.jonas.ForumHub.domain.CursoDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoDomain, Long> {
}
