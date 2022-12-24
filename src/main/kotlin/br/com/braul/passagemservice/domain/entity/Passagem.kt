package br.com.braul.passagemservice.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class Passagem (
    @Id
    val id: UUID? = UUID.randomUUID(),
    @ManyToOne
    @JoinColumn(name = "id_voo")
    val voo: Voo,
    val valor: BigDecimal,
    val dataCompra: LocalDateTime? = LocalDateTime.now()
)