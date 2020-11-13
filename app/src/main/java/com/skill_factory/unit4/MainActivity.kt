package com.skill_factory.unit4

import android.graphics.Rect
import android.os.Bundle
import android.transition.*
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.scaleX = 0.5F
        img.scaleY = 0.5F
        var i = 0
        img.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, ChangeImageTransform())
            img.scaleType = ImageView.ScaleType.values()[i % ImageView.ScaleType.values().size]
            i++
            Toast.makeText(this, img.scaleType.name, Toast.LENGTH_SHORT).show()
        }
    }
}

