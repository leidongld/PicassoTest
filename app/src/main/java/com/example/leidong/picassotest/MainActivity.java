package com.example.leidong.picassotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        clickListener();
    }

    /**
     * 按钮点击监听
     */
    private void clickListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(getApplicationContext())
                        .load("https://github.com/square/picasso/raw/master/website/static/sample.png")
                        .into(image1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageLoader.getInstance().displayImage(
                        "https://github.com/nostra13/Android-Universal-Image-Loader/raw/master/UniversalImageLoader.png",
                        image2,
                        MyApplication.getOptions()
                );
            }
        });
    }

    /**
     * 获取组件
     */
    private void initView() {
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
    }
}
