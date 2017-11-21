package com.example.a4163103.trpg_tool;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

import com.example.a4163103.trpg_tool.Character.CharacterActivity;
import com.example.a4163103.trpg_tool.Dice.DiceActivity;
import com.example.a4163103.trpg_tool.Memo.MemoActivity;

public class TabHostActivity extends TabActivity {

    static TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);

        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;
        Intent intent;

        spec = tabHost.newTabSpec("Memo");
        spec.setIndicator("メモ");
        intent = new Intent(this, MemoActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);



        spec = tabHost.newTabSpec("Dice");
        spec.setIndicator("ダイス");
        intent = new Intent(this, DiceActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);



        spec = tabHost.newTabSpec("Character");
        spec.setIndicator("キャラシ");
        intent = new Intent(this, CharacterActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);


        //set tab which one you want to open first time 0 or 1 or 2
        //tabHost.setCurrentTab(1);


        //遷移先から値を受け取ってsetCurrentTabにセット
        //ただし起動時は1を設定してダイスにしている
        Intent intent1 = getIntent();
        String data = String.valueOf(intent1.getIntExtra("data", 1));
        Log.d("ttt", data);

        //setCurrentTab
        //0:MemoActivity, 1:DiceActivity, 2:CharacterActivity
        tabHost.setCurrentTab(Integer.parseInt(data));




        //タブを切り替えたときにトースト出すだけの処理
//        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//            @Override
//            public void onTabChanged(String tabId) {
//
//                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

}