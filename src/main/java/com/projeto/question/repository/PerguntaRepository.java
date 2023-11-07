package com.projeto.question.repository;

import com.projeto.question.entity.PerguntaTeste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerguntaRepository extends JpaRepository<PerguntaTeste, Long> {
}
