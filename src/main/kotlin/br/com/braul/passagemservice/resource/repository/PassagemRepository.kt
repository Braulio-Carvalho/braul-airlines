package br.com.braul.passagemservice.resource.repository

import br.com.braul.passagemservice.domain.entity.Passagem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PassagemRepository: JpaRepository<Passagem, UUID>{

}