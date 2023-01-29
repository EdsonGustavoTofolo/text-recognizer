package com.example.recognizetext.clients

import com.example.recognizetext.clients.apibrasil.ApiBrasilService
import com.example.recognizetext.clients.apibrasil.PlacaRequest
import com.example.recognizetext.clients.apibrasil.PlacaResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarroClient  {

    companion object {

        private const val BASE_URL = "https://placa-fipe.apibrasil.com.br"

        fun findByPlaca(placa: String,
                        onSuccess: (PlacaResponse) -> Unit,
                        onFail: (ResponseBody) -> Unit
        ) {
            val retrofit = Retrofit.getInstance(BASE_URL)

            val apiBrasilService = retrofit.create(ApiBrasilService::class.java)

            val request = PlacaRequest(placa)

            val call = apiBrasilService.consultarPlaca(request)

            call.enqueue(object : Callback<PlacaResponse?> {
                override fun onResponse(
                    call: Call<PlacaResponse?>,
                    response: Response<PlacaResponse?>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let { onSuccess(it) }
                    } else {
                        response.errorBody()?.let { onFail(it) }
                    }
                }

                override fun onFailure(call: Call<PlacaResponse?>, t: Throwable) {
                    throw java.lang.IllegalArgumentException("Placa nao foi encontrada!", t)
                }
            })
        }
    }
}