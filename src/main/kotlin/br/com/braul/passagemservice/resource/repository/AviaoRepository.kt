package br.com.braul.passagemservice.resource.repository

import br.com.braul.passagemservice.domain.entity.Aviao
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AviaoRepository: JpaRepository<Aviao, UUID> {

     fun findAllByCompanhia(companhia: String): List<Aviao>
}