package com.example.a4163103.trpg_tool.Character;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a4163103.trpg_tool.Character.jyumon.Jumon_ListActivity;
import com.example.a4163103.trpg_tool.Character.syozi.Syozi_ListActivity;
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


        //所持品
        Button btn_S = (Button)findViewById(R.id.itemText);

        btn_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GinoutiActivity.this, Syozi_ListActivity.class);
                startActivity(intent);
                finish();

            }
        });

        //呪文
        Button btn_J = (Button)findViewById(R.id.jyumonText);

        btn_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GinoutiActivity.this, Jumon_ListActivity.class);
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
