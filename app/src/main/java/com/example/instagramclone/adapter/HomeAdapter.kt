package com.example.instagramclone.adapter

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instagramclone.R
import com.example.instagramclone.fragment.HomeFragment
import com.example.instagramclone.model.Post
import com.google.android.material.imageview.ShapeableImageView

class HomeAdapter(var fragment: HomeFragment, var items: ArrayList<Post>) : BaseAdapter() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post_home, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post: Post = items[position]
        if (holder is PostViewHolder) {
            val iv_post = holder.iv_post

            Glide.with(fragment).load(post.postImg).placeholder(ColorDrawable(Color.GRAY)).into(iv_post)
        }
    }

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iv_profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        val iv_post: ShapeableImageView = view.findViewById(R.id.iv_post)
        val tv_fullname: TextView = view.findViewById(R.id.tv_fullname)
        val tv_time: TextView = view.findViewById(R.id.tv_time)
        val tv_caption: TextView = view.findViewById(R.id.tv_caption)
        val iv_like: ImageView = view.findViewById(R.id.iv_like)
        val iv_share: ImageView = view.findViewById(R.id.iv_share)
        val iv_more: ImageView = view.findViewById(R.id.iv_more)
    }
}