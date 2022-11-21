package com.example.mybook

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class BookDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_BOOK_TITLE = "book_name"
        const val EXTRA_BOOK_DESC = "book_desc"
        const val EXTRA_BOOK_AUTHOR = "book_author"
        const val EXTRA_BOOK_IMAGE = "book_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        val imageDetail: ImageView = findViewById(R.id.iv_img_detail)
        val tittleDetail: TextView = findViewById(R.id.tv_title_detail)
        val authorDetail: TextView = findViewById(R.id.tv_author_detail)
        val descDetail: TextView = findViewById(R.id.tv_desc_detail)

        val bookImage: Int? = intent.getIntExtra(EXTRA_BOOK_IMAGE, 0)
        val bookTitle: String? = intent.getStringExtra(EXTRA_BOOK_TITLE)
        val bookDesc: String? = intent.getStringExtra(EXTRA_BOOK_DESC)
        val bookAuthor: String? = intent.getStringExtra(EXTRA_BOOK_AUTHOR)


        Glide.with(this).load(bookImage).into(imageDetail)
        tittleDetail.text = bookTitle
        descDetail.text = bookDesc
        authorDetail.text = "Author: " + bookAuthor

    }
}

