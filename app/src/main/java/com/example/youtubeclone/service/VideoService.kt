package com.example.youtubeclone.service

import com.example.youtubeclone.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/f27afc67-4643-4c66-a2a0-1ef70819e8cb")
    fun listVideos(): Call<VideoDto>
}