package com.example.recognizetext.clients.apibrasil

import com.google.gson.annotations.SerializedName

data class PlacaResponse(
    @SerializedName("Valor")
    val valor: String,
    @SerializedName("Marca")
    val marca: String,
    @SerializedName("Modelo")
    val modelo: String,
    @SerializedName("AnoModelo")
    val anoModelo: String,
    @SerializedName("Combustivel")
    val combustivel: String,
    @SerializedName("CodigoFipe")
    val codigoFipe: String,
    @SerializedName("MesReferencia")
    val mesReferencia: String,
    @SerializedName("Autenticacao")
    val autenticacao: String,
    @SerializedName("TipoVeiculo")
    val tipoVeiculo: String,
    @SerializedName("SiglaCombustivel")
    val siglaCombustivel: String,
    @SerializedName("DataConsulta")
    val dataConsulta: String,
    val cilindradas: String,
    val potencia: String,
    val chassi: String,
    val cor: String,
    val uf: String,
    val municipio: String,
    val renavam: String,
    val extra: Boolean,
    val ipva: String
) {
    override fun toString(): String {
        return "valor: $valor, " +
                "marca: $marca, " +
                "modelo: $modelo, " +
                "anoModelo: $anoModelo, " +
                "combustivel: $combustivel, " +
                "codigoFipe: $codigoFipe, " +
                "mesReferencia: $mesReferencia, " +
                "autenticacao: $autenticacao, " +
                "tipoVeiculo: $tipoVeiculo, " +
                "siglaCombustivel: $siglaCombustivel, " +
                "cilindradas: $cilindradas, " +
                "potencia: $potencia, " +
                "chassi: $chassi, " +
                "cor: $cor, " +
                "uf: $uf, " +
                "municipio: $municipio, " +
                "renavam: $renavam, " +
                "extra: $extra, " +
                "ipva: $ipva, " +
                "dataConsulta: $dataConsulta"
    }
}