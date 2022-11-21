package com.example.mybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBook: RecyclerView
    private var list : ArrayList<Book> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBook =findViewById(R.id.rv_book)
        rvBook.setHasFixedSize(true)

        list.addAll(BookData.listData)
        showRecyclerList()

        val actionBar = supportActionBar
        actionBar!!.title
        actionBar.setTitle("MyBook")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveProfile = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(moveProfile)
        return super.onOptionsItemSelected(item)
    }


    private fun showRecyclerList() {
        rvBook.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListAdapterBook(list)
        rvBook.adapter = listBookAdapter

    }


}
