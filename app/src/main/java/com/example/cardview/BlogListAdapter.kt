package com.example.cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.blog_mini.view.*

class BlogListAdapter(
    private val listener: OnItemClickListener
): ListAdapter<BlogPost, BlogListAdapter.BlogListViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogListViewHolder {
        return BlogListViewHolder(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BlogListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.blog_list_view
    }

    inner class BlogListViewHolder(
        override val containerView: View
    ) : RecyclerView.ViewHolder(containerView), LayoutContainer, View.OnClickListener
    {
        init {
            itemView.setOnClickListener(this)
        }
        fun bind(blogPost : BlogPost){

                containerView.title.text = blogPost.title
                containerView.timestamp.text = blogPost.timestamp
                containerView.description.text = blogPost.des
                containerView.label.text = blogPost.label
                containerView.imageView.setImageResource(blogPost.image)
        }
        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION){
                listener.onItemClick(position)
            }
        }
    }
    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
}


private class DiffUtilCallback : DiffUtil.ItemCallback<BlogPost>(){
    override fun areItemsTheSame(oldItem: BlogPost, newItem: BlogPost): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: BlogPost, newItem: BlogPost): Boolean = oldItem == newItem

}