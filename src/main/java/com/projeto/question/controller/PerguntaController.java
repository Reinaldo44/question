package com.projeto.question.controller;


import com.projeto.question.entity.PerguntaTeste;
import com.projeto.question.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perguntateste")
public class PerguntaController {
    @Autowired
    private PerguntaService perguntaService;
    @PostMapping
    public ResponseEntity<PerguntaTeste> create(@RequestBody PerguntaTeste pergunta){

        PerguntaTeste perguntas = perguntaService.create(pergunta);
        return ResponseEntity.ok(perguntas);

    }

    @GetMapping
    public ResponseEntity<List<PerguntaTeste>> findAll(){

        List<PerguntaTeste> pergunta = perguntaService.findAll();

        return ResponseEntity.ok(pergunta);

    }

}
