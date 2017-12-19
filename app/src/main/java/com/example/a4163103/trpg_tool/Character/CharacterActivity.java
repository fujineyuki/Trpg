package com.example.a4163103.trpg_tool.Character;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a4163103.trpg_tool.R;

/**
 * Created by 4163103 on 2017/11/09.
 */

public class CharacterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);


        //C1Activityに遷移するボタン
        Button btn_c1 = (Button)findViewById(R.id.button);
        btn_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), C1Activity.class);
                startActivity(intent);
            }
        });


    }

    //戻るボタン無効化
    @Override
    public void onBackPressed() {
    }


}
