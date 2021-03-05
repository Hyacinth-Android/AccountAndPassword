package com.example.accountpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnQQ;
    private Button mBtnBlog;
    private Button mBtnGitHub;
    private Button mBtnOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnQQ = findViewById(R.id.btn_qq);
        mBtnQQ.setOnClickListener(this);

        mBtnBlog = findViewById(R.id.btn_blog);
        mBtnBlog.setOnClickListener(this);

        mBtnGitHub = findViewById(R.id.btn_github);
        mBtnGitHub.setOnClickListener(this);

        mBtnOther = findViewById(R.id.btn_other);
        mBtnOther.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        String s = String.valueOf(random.nextInt(13));
        switch(v.getId()){
            case R.id.btn_qq:
                QQ.actionStart(MainActivity.this,s);
                break;
            case R.id.btn_blog:
                Blog.actionStart(MainActivity.this,s);
                break;
            case R.id.btn_github:
                GitHub.actionStart(MainActivity.this,s);
                break;
            case R.id.btn_other:
                Other.actionStart(MainActivity.this,s);
                break;
        }
    }
}