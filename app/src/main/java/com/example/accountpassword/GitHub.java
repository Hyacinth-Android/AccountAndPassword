package com.example.accountpassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GitHub extends AppCompatActivity {

    private ImageView img;
    private RecyclerView rv;

    public static void actionStart(Context context,String imgId){
        Intent intent = new Intent(context, GitHub.class);
        intent.putExtra("imgId",imgId);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        img = findViewById(R.id.layout_bg);
        rv = findViewById(R.id.layout_rv);

        String s = getIntent().getStringExtra("imgId");
        int x = Integer.parseInt(s);
        img.setImageResource(GetBackground.getImg(x));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        MsgAdapter adapter = new MsgAdapter(new GetData().getGitHubData());
        rv.setAdapter(adapter);
    }
}
