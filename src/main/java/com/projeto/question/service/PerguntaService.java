package com.projeto.question.service;

import com.projeto.question.entity.PerguntaTeste;
import com.projeto.question.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerguntaService {
    @Autowired
    private PerguntaRepository perguntaRepository;

    public PerguntaTeste create(PerguntaTeste pergunta) {

        return perguntaRepository.save(pergunta);

    }

    public PerguntaTeste findById(Long id){

        Optional<PerguntaTeste> perguntas = perguntaRepository.findById(id);

        return perguntas.orElseThrow();

    }

    public List<PerguntaTeste> findAll() {

        return perguntaRepository.findAll();
    }
}
