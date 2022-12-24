package br.com.braul.passagemservice.domain.service

import br.com.braul.passagemservice.application.web.request.AviaoRequest
import br.com.braul.passagemservice.application.web.request.toDomain
import br.com.braul.passagemservice.domain.entity.Aviao
import br.com.braul.passagemservice.domain.service.exceptions.AviaoNotFoundException
import br.com.braul.passagemservice.resource.repository.AviaoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AviaoService(private val aviaoRepository: AviaoRepository) {

    fun registrarAviao(aviaoRequest: AviaoRequest): Aviao {
        val aviao = aviaoRequest.copy(
            modelo = aviaoRequest.modelo,
            anoFabricacao = aviaoRequest.anoFabricacao,
            assento = aviaoRequest.assento,
            qtdAssentos = aviaoRequest.qtdAssentos,
            companhia = aviaoRequest.companhia.uppercase()
        )
        return aviaoRepository.save(aviao.toDomain())
    }

    fun listarTodosAvioes() = aviaoRepository.findAll()

    fun listarPorId(id: UUID) =
        try {
            aviaoRepository.findById(id).orElseThrow { AviaoNotFoundException() }
        } catch (ex: AviaoNotFoundException) {
            throw AviaoNotFoundException(ex.msg)
        }

    fun listarPorCompanhia(companhia: String) = aviaoRepository.findAllByCompanhia(companhia.uppercase())

    fun atualizarAviao(id: UUID, aviaoRequest: AviaoRequest): Aviao {
        try {
            var aviao = aviaoRepository.findById(id).orElseThrow { AviaoNotFoundException() }
            aviao = aviao.copy(
                modelo = aviaoRequest.modelo,
                anoFabricacao = aviaoRequest.anoFabricacao,
                qtdAssentos = aviaoRequest.qtdAssentos,
                assento = aviaoRequest.assento,
                companhia = aviaoRequest.companhia.uppercase()
            )
            return aviaoRepository.saveAndFlush(aviao)
        } catch (ex: AviaoNotFoundException) {
            throw AviaoNotFoundException(ex.msg)
        }
    }

    fun deletarAviao(id: UUID) =
        try {
            val aviao = aviaoRepository.findById(id).orElseThrow { AviaoNotFoundException() }
            aviaoRepository.delete(aviao)
        } catch (ex: AviaoNotFoundException) {
            throw AviaoNotFoundException(ex.msg)
        }
}