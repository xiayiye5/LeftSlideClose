package cn.xiayiye5.leftslideclose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mSlidingLayout = SlidingLayout(this)
        mSlidingLayout.bindActivity(this);
    }
}