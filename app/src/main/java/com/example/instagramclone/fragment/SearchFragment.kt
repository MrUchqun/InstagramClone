package com.example.instagramclone.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramclone.R
import com.example.instagramclone.adapter.SearchAdapter
import com.example.instagramclone.model.User
import java.util.*
import java.util.Locale.getDefault
import kotlin.collections.ArrayList

/**
 * In SearchFragment, all registered users can found by searching keyword and following.
 */
class SearchFragment : BaseFragment() {

    lateinit var recyclerView: RecyclerView
    var items = ArrayList<User>()
    var users = ArrayList<User>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(activity, 1)

        val et_search = view.findViewById<EditText>(R.id.et_search)
        et_search.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val keyword = p0.toString().trim()
                usersByKeyword(keyword)
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        loadUsers()
        refreshAdapter(items)
    }

    private fun loadUsers(): ArrayList<User> {
        items = ArrayList()
        for (item in 0..10){
            items.add(User("mr_elyor", "mr.elyor111@gmail.com"))
            items.add(User("bekzod", "mr.elyor111@gmail.com"))
            items.add(User("sherzod", "mr.elyor111@gmail.com"))
            items.add(User("bekhruzbek", "mr.elyor111@gmail.com"))
        }
        return items
    }

    private fun refreshAdapter(items: ArrayList<User>) {
        val adapter = SearchAdapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun usersByKeyword(keyword: String) {
        if (keyword.isEmpty())
            refreshAdapter(items)

        users.clear()
        for (user in items)
            if (user.fullname.lowercase(getDefault()).startsWith(keyword.lowercase(getDefault())))
                users.add(user)

        refreshAdapter(users)
    }
}