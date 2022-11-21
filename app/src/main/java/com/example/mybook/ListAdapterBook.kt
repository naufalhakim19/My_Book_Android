package com.example.mybook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapterBook(private val listBook: ArrayList<Book>): RecyclerView.Adapter<ListAdapterBook.ListViewHolder>() {


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvBook : TextView = itemView.findViewById(R.id.tv_title)
        var tvDesc : TextView = itemView.findViewById(R.id.tv_desc)
        var tvAuthor : TextView = itemView.findViewById(R.id.tv_author)
        var imgBook : ImageView = itemView.findViewById(R.id.iv_img)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_book,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.img)
            .apply(RequestOptions().override(100,100))
            .into(holder.imgBook)

        holder.tvBook.text = book.tittle
        holder.tvDesc.text = book.desc
        holder.tvAuthor.text = "Author: " + book.author

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener(View.OnClickListener() {


            val moveDetail = Intent(mContext, BookDetail::class.java)
            moveDetail.putExtra(BookDetail.EXTRA_BOOK_TITLE, book.tittle)
            moveDetail.putExtra(BookDetail.EXTRA_BOOK_DESC, book.desc)
            moveDetail.putExtra(BookDetail.EXTRA_BOOK_AUTHOR, book.author)
            moveDetail.putExtra(BookDetail.EXTRA_BOOK_IMAGE, book.img)
            mContext.startActivity(moveDetail)


        })

    }
}