package com.example.prinshita

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btn_songkhla.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.img_songkhla)?.let { it1 -> setProvice(it1, getString(R.string.btn_songkhla),getString(R.string.history_songkhla)) }

        })
        btn_trang.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.img_trang)?.let { it1 -> setProvice(it1, getString(R.string.btn_trang),getString(R.string.history_trang)) }

        })
        btn_khon_kaen.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.img_khon_kaen)?.let { it1 -> setProvice(it1, getString(R.string.btn_khon_kaen),getString(R.string.history_khon_kaen)) }

        })

        btn_lamphun.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.img_lamphun)?.let { it1 -> setProvice(it1, getString(R.string.btn_lamphun),getString(R.string.history_lamphun)) }

        })


    }

    fun setProvice (drawable : Drawable, header:String, content:String ){

        img_province.setImageDrawable(drawable)
        tv_header.setText("information province"+header)
        tv_history.setText(content)

        Toast.makeText(this,
            "this information province"+header,Toast.LENGTH_LONG).show()
    }
}