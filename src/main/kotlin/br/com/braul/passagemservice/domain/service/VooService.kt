package br.com.braul.passagemservice.domain.service

import br.com.braul.passagemservice.domain.entity.Voo
import br.com.braul.passagemservice.resource.repository.VooRepository
import org.springframework.stereotype.Service

@Service
class VooService(private val vooRepository: VooRepository) {

    fun registraVoo(voo: Voo): Voo{
        //Adicionar regra que não permite criar voo para o mesmo avião no mesmo periodo
        return vooRepository.save(voo)
    }

    fun listaVoos() = vooRepository.findAll()
}