package cn.xiayiye5.leftslideclose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun javaVersion(view: View) {
        startActivity(Intent(this, JavaActivity::class.java))
    }

    fun kotlinVersion(view: View) {
        startActivity(Intent(this, KotlinActivity::class.java))

    }
}