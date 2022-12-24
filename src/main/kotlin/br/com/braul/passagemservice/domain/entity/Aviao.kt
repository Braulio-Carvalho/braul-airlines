package br.com.braul.passagemservice.domain.entity

import br.com.braul.passagemservice.application.web.request.AviaoRequest
import jakarta.persistence.*
import java.time.LocalDate
import java.util.*

@Entity
data class Aviao(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = UUID.randomUUID(),
    val modelo: String,
    @Column(name = "ano_fabricacao")
    val anoFabricacao: LocalDate,
    @Column(name = "qtd_assentos")
    val qtdAssentos: Int,
    val companhia : String,
    val assento: Int
)

fun Aviao.toRequest() = AviaoRequest(
    modelo = modelo,
    anoFabricacao = anoFabricacao,
    qtdAssentos = qtdAssentos,
    companhia = companhia,
    assento = assento
)