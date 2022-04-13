package com.example.instagramclone.activity

import androidx.appcompat.app.AppCompatActivity

/**
 * BaseActivity is parent for all Activities
 */

open class BaseActivity : AppCompatActivity() {
    val TAG: String = this::class.java.simpleName
}