package br.com.braul.passagemservice.domain.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class Voo(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = UUID.randomUUID(),
    val origem: String,
    val destino: String,
    val dataPartida: LocalDateTime,
    val dataChegada: LocalDateTime,
    @OneToOne
    @JoinColumn(name = "id_aviao")
    val aviao: Aviao
)
