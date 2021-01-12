package com.example.contadorkotlin
import kotlinx.android.synthetic.main.activity_main.*

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var cont = 0;
    fun acrescentar(view: View) {
        cont++;
        contador.setText(cont.toString());
    }
    fun retirar(view: View) {
        cont--;
        contador.setText(cont.toString());
    }
    fun zerar(view: View) {
        cont=0;
        contador.setText(cont.toString());
    }
}