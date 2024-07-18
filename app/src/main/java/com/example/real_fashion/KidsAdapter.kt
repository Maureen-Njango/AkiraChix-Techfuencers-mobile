package com.example.real_fashion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KidsAdapter (var kids: List<Kids>): RecyclerView.Adapter<KIdsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KIdsViewHolder {
        val kidsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fashion_wear,parent, false)
        return KIdsViewHolder(kidsView)
    }

    override fun onBindViewHolder(holder: KIdsViewHolder, position: Int) {
        val kid = kids[position]
        holder.tvdress.text = kid.tvdress
        holder.tvJumpshort.text = kid.tvJumpshort
        holder.tvShort.text = kid.tvShort
    }

    override fun getItemCount(): Int {
        return kids.size
    }
}

class KIdsViewHolder(textView: View): RecyclerView.ViewHolder(textView){

    val tvdress = textView.findViewById<TextView>(R.id.tvdress)
    val tvJumpshort = textView.findViewById<TextView>(R.id.tvJumpshort)
    val tvShort = textView.findViewById<TextView>(R.id.tvShort)
}
