package com.exemple.provaoficial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn_bol.setOnClickListener {

            openNewActivity()
        }

        main_btn_des.setOnClickListener {
            openNewActivity2()
        }

        main_btn_con.setOnClickListener {
            openNewActivity3()
        }

    }
        private fun openNewActivity(){

            val intent = Intent (this, CalcBolso::class.java)
            startActivity(intent)
        }

        private fun openNewActivity2(){

            val intent = Intent (this, CalcDes::class.java)
            startActivity(intent)
        }

        private fun openNewActivity3(){

            val intent = Intent (this, CalcCon::class.java)
            startActivity(intent)
         }

    }
