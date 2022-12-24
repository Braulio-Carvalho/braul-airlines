package br.com.braul.passagemservice.domain.service.exceptions

class AviaoNotFoundException(val msg: String = "Aviao não encontrado"): RuntimeException(msg)