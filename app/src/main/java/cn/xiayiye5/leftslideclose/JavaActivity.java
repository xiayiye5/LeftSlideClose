package cn.xiayiye5.leftslideclose;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        SlidingLayout mSlidingLayout = new SlidingLayout(this);
        mSlidingLayout.bindActivity(this);
    }
}
