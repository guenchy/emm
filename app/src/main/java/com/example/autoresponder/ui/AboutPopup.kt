package com.example.autoresponder.ui


import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.example.autoresponder.BuildConfig
import com.example.autoresponder.R
import kotlinx.android.synthetic.main.about_popup.*


class AboutPopup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_popup)
        close_dialog_button.setOnClickListener { finish() }

     




}
