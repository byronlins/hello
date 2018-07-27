package com.byron.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.byron.github01.ImageLoaderHelper;

import test.byron.com.lib.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.iv);

        ImageLoaderHelper.load(this,
              "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533284634&di=b6d884ade6c552406f6e9f4c5b988896&imgtype=jpg&er=1&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fwh%253D680%252C800%2Fsign%3Da130fc56a451f3dec3e7b162acdedc27%2Fbf096b63f6246b60301586e8e0f81a4c510fa216.jpg",
                iv);

        MyClass.test();
    }
}
