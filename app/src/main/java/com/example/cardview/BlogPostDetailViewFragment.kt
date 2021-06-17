package com.example.cardview

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.blog_post_detail_view_fragment.*

class BlogPostDetailViewFragment : Fragment(R.layout.blog_post_detail_view_fragment) {

    private val args: BlogPostDetailViewFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailTextView.text = args.title
        bodyTextView.text = args.blogPost.des
        detailTimestamp.text = args.blogPost.timestamp
        detailImage.setImageResource(args.blogPost.image)


    }
}