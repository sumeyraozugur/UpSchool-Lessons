package com.sum.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

class MainActivity : AppCompatActivity() {
    private lateinit var avatarImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        avatarImage = findViewById(R.id.imageAvatar)

        val retrofit =Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(GithubService::class.java)
        service.listRepos("octocat")?.enqueue(object : Callback<RepoModel>{

            override fun onResponse(call: Call<RepoModel>, response: Response<RepoModel>?) {
                val repoModel = response?.body()
                //Log.v("AKBANK", repoModel!!.get(0).description)
               // Picasso.get().load("repoModel!!.get(0).owner.avatar_url").into(avatarImage);
                Glide.with(this@MainActivity).load("repoModel!!.get(0).owner.avatar_url").into(avatarImage);
                Log.v("AKBANK", repoModel!!.get(0).owner.avatar_url)

            }

            override fun onFailure(call: Call<RepoModel>?, t: Throwable) {
                Log.v("AKBANK","ERROR: ${t.message}")

            }


        })
    }
}

interface GithubService{
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user:String?): Call<RepoModel>?
}