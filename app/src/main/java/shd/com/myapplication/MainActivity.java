package shd.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        for (int i = 0; i < 10; i++) {
            RadioButton radioButton = new RadioButton(this);
            RadioGroup.LayoutParams lp = new RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            //设置RadioButton边距 (int left, int top, int right, int bottom)
            lp.setMargins(15,0,0,0);
            //设置RadioButton背景
            //radioButton.setBackgroundResource(R.drawable.xx);
            //设置RadioButton的样式
            //radioButton.setButtonDrawable(R.drawable.radio_bg);
            //设置文字距离四周的距离
            radioButton.setPadding(80, 0, 0, 0);
            //设置文字
            radioButton.setText("this is radioButton  " + i);
            final int finalI = i;
            //设置radioButton的点击事件
            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "this is radioButton  " + finalI, Toast.LENGTH_SHORT).show();
                }
            });
            //将radioButton添加到radioGroup中
            radioGroup.addView(radioButton);
        }
    }
}

