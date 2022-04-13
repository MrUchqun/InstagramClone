package com.example.instagramclone.fragment

import androidx.fragment.app.Fragment
import com.example.instagramclone.model.Post

/**
 *  BaseFragment is parent for all fragments
 */

open class BaseFragment : Fragment() {
    val TAG: String = this::class.java.simpleName

    fun loadPost(): ArrayList<Post> {
        val items = ArrayList<Post>()
        for (count in 0..5) {
            items.add(Post("https://images.unsplash.com/photo-1422393462206-207b0fbd8d6b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"))
            items.add(Post("https://images.unsplash.com/photo-1643427577448-770e77fccdc3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1887&q=80"))
            items.add(Post("https://images.unsplash.com/photo-1523800503107-5bc3ba2a6f81?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80"))
        }
        return items
    }
}