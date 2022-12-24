package br.com.braul.passagemservice.stub

import br.com.braul.passagemservice.domain.entity.Assento
import br.com.braul.passagemservice.domain.entity.Aviao
import java.time.LocalDate

val aviaoStub = Aviao(
    modelo = "784",
    anoFabricacao = LocalDate.now(),
    qtdAssentos = 240,
    companhia = "GOL",
    assento = Assento(1L)
)