package com.example.recognizetext.clients

class Retrofit {

    companion object {

        fun getInstance(path: String): retrofit2.Retrofit {
            return retrofit2.Retrofit.Builder()
                .baseUrl(path)
//                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ApiWorker.gsonConverter)
                .client(ApiWorker.client)
                .build()
        }
    }
}