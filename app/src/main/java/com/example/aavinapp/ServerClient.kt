package com.example.aavinapp

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response


class ServerClient (userSession: SessionDetails) {
    var user: SessionDetails = userSession
    val base_url = "http://localhost:8080"
    fun requestLogin(): String? {
        var json = Json.encodeToString(this.user)
        var res: Response = createPost("$base_url/login", json)
        return res.body?.string()
    }
}

fun main() {
    println("Running")
    println(
        ServerClient(
            SessionDetails("test", "test", "test")
        ).requestLogin()
    )
    println("Running")
}
fun createPost(url: String, json: String): Response {
    // Create OkHttpClient instance
    val client = OkHttpClient()
    val JSON = "application/json; charset=utf-8".toMediaTypeOrNull()

    // Define the request body
    val requestBody: RequestBody = json.toRequestBody(JSON)

    // Create the request object
    val request = Request.Builder()
        .url(url)
        .post(requestBody)
        .build()

    // Execute the request
    val response: Response = client.newCall(request).execute()

    return response
}
