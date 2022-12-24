package br.com.braul.passagemservice.application.web.controller

import br.com.braul.passagemservice.domain.entity.Passagem
import br.com.braul.passagemservice.domain.service.PassagemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/passagens")
class PassagemController(private val passagemService: PassagemService) {

    @PostMapping("registro")
    fun registroDePassagem(@RequestBody passagem: Passagem): ResponseEntity<Passagem>{
        return ResponseEntity.status(HttpStatus.CREATED).body(passagemService.registroDePassagem(passagem))
    }

    @GetMapping
    fun listaTodasPassagens(): ResponseEntity<List<Passagem>>{
        return ResponseEntity.status(HttpStatus.OK).body(passagemService.listaTodasPassagens())
    }

}