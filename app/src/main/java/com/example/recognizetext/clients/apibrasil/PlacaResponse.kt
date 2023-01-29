package com.example.recognizetext.clients.apibrasil

data class PlacaResponse(
    val cilindradas: String,
    val potencia: String,
    val chassi: String,
    val cor: String,
    val uf: String,
    val municipio: String,
    val renavam: String,
    val extra: Boolean,
    val ipva: String
)