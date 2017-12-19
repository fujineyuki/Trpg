package com.example.a4163103.trpg_tool.Character;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a4163103.trpg_tool.R;
import com.example.a4163103.trpg_tool.TabHostActivity;


/**
 * Created by 4163103 on 2017/11/16.
 */

public class C1Activity extends Activity {


    //テスト用遷移先Activity
    //もしCharacterActivityから遷移してボタンで戻るみたいなことをするときに参考に
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);

        Button btn_CA = (Button)findViewById(R.id.button3);
        btn_CA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //CreateMemo_ActivityのIntentも同様
                //戻るときにCharacterActivityを表示させるためTabHostActivityのsetCurrentTabの値を2している
                //setCurrentTab
                //0:MemoActivity, 1:DiceActivity, 2:CharacterActivity
                Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
                intent1.putExtra("data", 2);
                startActivity(intent1);

            }
        });


    }




}
