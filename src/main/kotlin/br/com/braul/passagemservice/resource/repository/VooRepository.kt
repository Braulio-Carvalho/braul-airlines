package br.com.braul.passagemservice.resource.repository

import br.com.braul.passagemservice.domain.entity.Aviao
import br.com.braul.passagemservice.domain.entity.Voo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface VooRepository: JpaRepository<Voo, UUID?> {

//     fun findAllByCompanhia(companhia: String): List<Aviao>
}