package com.example.kmm_t.shared.repository
import com.example.kmm_t.shared.api.Api
import com.example.kmm_t.shared.model.User
object Repository {
    suspend fun getUserInfo(): User{
        return Api.getUserInfo()
    }
}