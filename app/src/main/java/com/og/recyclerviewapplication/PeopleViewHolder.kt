package com.og.recyclerviewapplication

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindMan(man:People.Man) {
        val contactInfoTextView:TextView=itemView.findViewById(R.id.contact_info_text_view)
        contactInfoTextView.text="Номер телефона - ${man.phoneNumder}"

    }

    fun bindWoman() {
        val contactInfoTextView:TextView=itemView.findViewById(R.id.contact_info_text_view)
        contactInfoTextView.text="Email - ${woman.email}"
    }

    @SuppressLint("SetTextI18n")
    fun bind(human: People.Human) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)
        nameTextView.text = human.name
        ageTextView.text = "${human.age} лет"

        when (human) {

            is People.Man -> bindMan()
            is People.Woman -> bindWoman()

        }
    }

}