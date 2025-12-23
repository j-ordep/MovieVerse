package br.com.movieverse.repository;

import br.com.movieverse.entity.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;

// nõa é obrigatorio por @Repository
public interface StreamingRepository extends JpaRepository<Streaming, Long> {
}
