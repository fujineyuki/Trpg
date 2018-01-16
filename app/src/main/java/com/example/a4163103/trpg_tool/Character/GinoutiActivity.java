package com.example.a4163103.trpg_tool.Character;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a4163103.trpg_tool.R;


public class GinoutiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginouti1);

        setTitle("ステータス");

        Button btn1 = (Button)findViewById(R.id.ginouti);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(GinoutiActivity.this,Itiran_Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //戻るボタン無効化
    @Override
    public void onBackPressed() {
    }

}
