package com.sum.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
        service.listRepos("octocat")?.enqueue(object : Callback<List<String>?>{
            override fun onResponse(call: Call<List<String>?>, response: Response<List<String>?>) {
                Log.v("AKBANK",response.body().toString())

            }

            override fun onFailure(call: Call<List<String>?>, t: Throwable) {
                Log.v("AKBANK","ERROR: ${t.message}")

            }


        })
    }
}

interface GithubService{
    fun listRepos(@Path("user") user:String?): Call<List<String>?>?
}