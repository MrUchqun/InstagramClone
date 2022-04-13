package com.example.instagramclone.model

class Post {
    var caption: String = ""
    var image: String = ""

    constructor()

    constructor(image: String) {
        this.image = image
    }
}