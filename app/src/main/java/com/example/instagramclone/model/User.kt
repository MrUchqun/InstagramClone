package com.example.instagramclone.model

class User {
    var fullname: String = ""
    var email: String = ""

    constructor()

    constructor(fullname: String, email: String) {
        this.fullname = fullname
        this.email = email
    }
}