package com.example.kmm_t.shared.api

import com.example.kmm_t.shared.model.User
import com.example.kmm_t.shared.util.Constants
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*


object Api {
    private val client = HttpClient{
        install(JsonFeature){
            serializer = GsonSerializer()
        }
        expectSuccess = true
    }

    suspend fun getUserInfo() : User{
        val response = client.get<User>(Constants.API_URL + "/user"){
            headers{
                append("Authorization","Bearer " + Constants.BEARER_KEY)
            }
        }
        return response
    }
}