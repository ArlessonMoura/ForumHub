package br.com.oraclechallenge.ForumHub.repository;

import br.com.oraclechallenge.ForumHub.domain.PerfilDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerfilRepository extends JpaRepository<PerfilDomain, Long> {
    Optional<PerfilDomain> findByNome(String name);
}
