package br.com.oraclechallenge.ForumHub.repository;

import br.com.oraclechallenge.ForumHub.domain.UsuarioDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioDomain, Long> {
}
