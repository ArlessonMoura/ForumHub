package br.com.oraclechallenge.ForumHub.repository;

import br.com.oraclechallenge.ForumHub.domain.RespostaDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<RespostaDomain, Long> {
}
