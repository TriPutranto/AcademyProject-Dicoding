package com.triputranto.academy.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.triputranto.academy.R
import kotlinx.android.synthetic.main.activity_home.*

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
        supportActionBar?.elevation = 0f
    }
}
