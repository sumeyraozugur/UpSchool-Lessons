package com.sum.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Path

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit =Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()

        val service = retrofit.create(GithubService::class.java)
    }
}

interface GithubService{
    fun listRepos(@Path("user") user:String?): Call<List<String>?>?
}