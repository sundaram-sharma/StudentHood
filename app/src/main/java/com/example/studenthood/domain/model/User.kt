package com.example.studenthood.domain.model

data class User(
    var name: String = "",
    var userName: String = "",
    var userid: String = "",
    var email: String ="",
    var password: String="",
    var imageUrl: String="",
    var following: List<String> = emptyList(), //list of the following
    var followers: List<String> = emptyList(), //list of the followers
    var totalPosts: String ="",
    var bio: String = "",
    var url: String = ""
)