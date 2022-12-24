package br.com.braul.passagemservice.application.web.controller

import br.com.braul.passagemservice.domain.entity.Voo
import br.com.braul.passagemservice.domain.service.VooService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/voos")
class VooController(private val vooService: VooService) {

    @PostMapping
    fun registrarVoo(@RequestBody voo: Voo) = vooService.registraVoo(voo)

    @GetMapping
    fun listaTodosVoos() = vooService.listaVoos()

}