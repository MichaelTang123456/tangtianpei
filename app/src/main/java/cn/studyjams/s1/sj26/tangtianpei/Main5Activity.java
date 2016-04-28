package cn.studyjams.s1.sj26.tangtianpei;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Main5Activity extends AppCompatActivity {
    Button FX = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //为分享按钮添加intent
        FX = (Button) findViewById(R.id.FX);
        FX.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND); // 启动分享发送的属性
                intent.setType("text/plain"); // 分享发送的数据类型
                intent.putExtra(Intent.EXTRA_TEXT, "快使用 “在家健身” APP吧!让我们一起动起来!"); // 分享的内容
                Main5Activity.this.startActivity(Intent.createChooser(
                        intent, "分享"));// 目标应用选择对话框的标题
            }
        });
        Button button = (Button) findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(intent);

            }

        });
    }
}
