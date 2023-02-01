package com.mikekrysan.module25_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    AlertDialog.Builder(ContextThemeWrapper(this, R.style.Theme_Module25_6))


    }

    override fun onBackPressed() {
        DialogFragment1().show(supportFragmentManager, "dialog1")
    }

}