package com.exemple.provaoficial1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_calc_des.*

class CalcDes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_des)

        main_button_cal.setOnClickListener {
            val parcel1 = main_edit_Text_valor.text.toString().toDouble()
            val parcel2 = main_edit_Text_din.text.toString().toDouble()
            var result = parcel1 * parcel2 /100.00
            var result1 = parcel1 - result
            main_edit_Text_tot.setText(result1.toString())

        }
    }

    fun clear(view: View) {
        main_edit_Text_valor.setText(null)
        main_edit_Text_din.setText(null)
        main_edit_Text_tot.setText(null)
    }
    }