package com.demo.restservices


object ApiUtils {

    val BASE_URL="https://www.w3schools.com"
    val apiService: APIService
        get() = RetrofitClient.getClient(BASE_URL).create(APIService::class.java)
}