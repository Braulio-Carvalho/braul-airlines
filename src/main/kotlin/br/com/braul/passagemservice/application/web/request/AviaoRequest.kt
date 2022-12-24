package br.com.braul.passagemservice.application.web.request


import br.com.braul.passagemservice.domain.entity.Aviao
import java.time.LocalDate

data class AviaoRequest(
    val modelo: String,
    val anoFabricacao: LocalDate,
    val qtdAssentos: Int,
    val companhia : String,
    val assento: Int
)
fun AviaoRequest.toDomain() = Aviao(
    modelo = modelo,
    anoFabricacao = anoFabricacao,
    qtdAssentos = qtdAssentos,
    companhia = companhia,
    assento = assento
)


