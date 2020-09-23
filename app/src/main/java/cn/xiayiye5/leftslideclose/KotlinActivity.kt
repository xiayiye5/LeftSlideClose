package cn.xiayiye5.leftslideclose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val mSlidingLayout = SlidingLayout(this)
        mSlidingLayout.bindActivity(this);
    }
}