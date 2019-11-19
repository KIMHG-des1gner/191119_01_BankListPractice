package com.tjoeun.a191119_01_banklistpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {

    var mContext = this

    abstract  fun SetupEvents()
    abstract  fun setValues()

}