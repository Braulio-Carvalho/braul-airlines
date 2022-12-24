package br.com.braul.passagemservice.domain.service

import br.com.braul.passagemservice.domain.entity.Passagem
import br.com.braul.passagemservice.resource.repository.PassagemRepository
import org.springframework.stereotype.Service

@Service
class PassagemService(private val passagemRepository: PassagemRepository) {

    fun registroDePassagem(passagem: Passagem): Passagem{
        return passagemRepository.save(passagem)
    }

    fun listaTodasPassagens(): List<Passagem>{
      return passagemRepository.findAll()
    }
}
