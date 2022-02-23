package com.example.memo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.Dto
import com.example.memo.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerViewAdapter internal constructor(private var context: Context, movieList: MainViewModel)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var movies = emptyList<Dto>() // Cached copy of words
    // inner =비정적 중첩함수
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rank = itemView.rank
        val openDt = itemView.openDt
        val movieNm = itemView.movieNm


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = inflater.inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val num = movies[position]
        holder.rank.text = num.rank.toString()
        holder.openDt.text = num.openDt.toString()
        holder.movieNm.text = num.movieNm.toString()

        holder.itemView.setOnClickListener {
        }
    }
    internal fun setMovies(movies: List<Dto>) {
        this.movies = movies
        notifyDataSetChanged()
    }


    override fun getItemCount() = movies.size


}