package br.com.braul.passagemservice.application.web.controller

import br.com.braul.passagemservice.application.web.request.AviaoRequest
import br.com.braul.passagemservice.domain.entity.Aviao
import br.com.braul.passagemservice.domain.service.AviaoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/avioes")
class AviaoController(private val aviaoService: AviaoService) {

    @PostMapping("/registrar")
    fun registrarAviao(@RequestBody aviao: AviaoRequest): ResponseEntity<Aviao> {
       return ResponseEntity.status(HttpStatus.CREATED).body(aviaoService.registrarAviao(aviao))
    }

    @GetMapping
    fun listarTodosAvioes() = aviaoService.listarTodosAvioes()

    @GetMapping("/companhia/{companhia}")
    fun listarTodosPorCompanhia(@PathVariable(name = "companhia") companhia: String) = aviaoService.listarPorCompanhia(companhia)

    @PutMapping("/atualizar/{id}")
    fun atualizarAviao(@PathVariable id: UUID, @RequestBody aviao: AviaoRequest): ResponseEntity<Aviao> {
        return ResponseEntity.status(HttpStatus.OK).body(aviaoService.atualizarAviao(id, aviao))
    }

    @GetMapping("/{id}")
    fun listarPorId(@PathVariable id: UUID) = aviaoService.listarPorId(id)

    @DeleteMapping("/{id}")
    fun deletarAviao(@PathVariable id: UUID) = aviaoService.deletarAviao(id)
}