package cn.studyjams.s1.sj26.tangtianpei;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//定义5个按钮
    Button buttonone;
    Button buttontwo;
    Button buttonthree;
    Button buttonfour;
    Button buttonfive;
    private Button btnFenXiang = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFenXiang = (Button) findViewById(R.id.btnFenXiang);
        btnFenXiang.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND); // 启动分享发送的属性
                intent.setType("text/plain"); // 分享发送的数据类型
                intent.putExtra(Intent.EXTRA_TEXT, "快使用 “在家健身” APP吧!让我们一起动起来!"); // 分享的内容
                MainActivity.this.startActivity(Intent.createChooser(
                        intent, "分享"));// 目标应用选择对话框的标题
            }
        });
//        为第一个按钮添加intent
        buttonone = (Button) findViewById(R.id.button1);
        buttonone.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }

        });
//        为第二个按钮添加intent
        buttontwo = (Button) findViewById(R.id.button2);
        buttontwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);

            }

        });
//        为第三个按钮添加intent
        buttonthree = (Button) findViewById(R.id.button3);
        buttonthree.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);

            }

        });
//        为第四个按钮添加intent
        buttonfour = (Button) findViewById(R.id.button4);
        buttonfour.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);

            }

        });
//        为第五个按钮添加intent
        buttonfive = (Button) findViewById(R.id.button5);
        buttonfive.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);

            }

        });

    }

}
