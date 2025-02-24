package com.darkempire78.opencalculator.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.darkempire78.opencalculator.BuildConfig
import com.darkempire78.opencalculator.MyPreferences
import com.darkempire78.opencalculator.R
import com.darkempire78.opencalculator.Themes
//import com.darkempire78.opencalculator.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
 //   private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Themes
        val themes = Themes(this)
        themes.applyDayNightOverride()
        setTheme(themes.getTheme())

        // Change the status bar color
        if (MyPreferences(this).theme == 1) { // Amoled theme
            window.statusBarColor = ContextCompat.getColor(this, R.color.amoled_background_color)
        } else {
            window.statusBarColor = ContextCompat.getColor(this, R.color.background_color)
        }

    //    binding = ActivityAboutBinding.inflate(layoutInflater)
      //  val view = binding.root
       // setContentView(view)

        // Set app version
        val versionName =  this.getString(R.string.about_other_version) + " "+ BuildConfig.VERSION_NAME + " (" + BuildConfig.VERSION_CODE + ")"
       // binding.aboutAppVersion.text = versionName

        // back button
       // binding.aboutBackButton.setOnClickListener {
        //    finish()
        }
       // binding.aboutBackButtonHitbox.setOnClickListener {
            //finish()
        }







