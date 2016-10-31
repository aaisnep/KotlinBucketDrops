package nl.rekenbinair.h.kotlinbucketdrops

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by H on 22-10-2016.
 */
class MainKotlin: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        ToolBar()
        initBackgroundImage()

    }

    private fun initBackgroundImage( ) {
       val  mBackground = findViewById(R.id.iv_background)as ImageView
        Glide.with(this).load(R.drawable.background)


    }

    private fun ToolBar() {
        val mToolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(mToolbar)
    }

}