package com.kbu.lib.Recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kbu.lib.R
import com.kbu.lib.data.Mainnotice
import kotlinx.android.synthetic.main.notice_list.view.*

class NoticeViewHolder(view : View) : RecyclerView.ViewHolder(view){
    fun bindItem(data : Mainnotice){
        itemView.noticetitle.text = data.Title
        itemView.noticedate.text = data.date
    }
}

class MainNotice_Recycler(val notice: ArrayList<Mainnotice>) : RecyclerView.Adapter<NoticeViewHolder>() {
    override fun getItemCount(): Int  = notice.size

    override fun onBindViewHolder(p0: NoticeViewHolder, p1: Int) {
        p0.bindItem(notice[p1])
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NoticeViewHolder =
       NoticeViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.notice_list, p0, false))

}