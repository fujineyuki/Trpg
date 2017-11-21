package com.example.a4163103.trpg_tool.Memo;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a4163103.trpg_tool.R;
import com.example.a4163103.trpg_tool.TabHostActivity;

import java.util.UUID;

/**
 * Created by 4163103 on 2017/10/19.
 */

public class CreateMemo_Activity extends Activity {





    Memo_Helper helper = null;

    boolean newF = false;

    String id = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_memo);



        // データベースから値を取得
        if(helper == null){
            helper = new Memo_Helper(CreateMemo_Activity.this);


        }
        Intent intent = this.getIntent();
        if(id.equals("")) {
            newF = true;
        } else {

            SQLiteDatabase db = helper.getWritableDatabase();
            try {

                Cursor c = db.rawQuery("select body from MEMO_TABLE where uuid = '"+ id +"'", null);

                boolean next = c.moveToFirst();

                while (next) {

                    String dispBody = c.getString(0);
                    EditText body = (EditText)findViewById(R.id.body);
                    body.setText(dispBody, TextView.BufferType.NORMAL);
                    next = c.moveToNext();
                }
            } finally {

                db.close();
            }
        }

        //登録ボタンpush
        Button registerButton = (Button) findViewById(R.id.register);
        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText body = (EditText)findViewById(R.id.body);
                String bodyStr = body.getText().toString();

                SQLiteDatabase db = helper.getWritableDatabase();
                try {
                    if(newF){

                        id = UUID.randomUUID().toString();
                        //追加                                                            id+
                        db.execSQL("insert into MEMO_TABLE(uuid, body) VALUES('"+ "', '"+ bodyStr +"')");
                    }else{
                        //更新                                                                            id+
                        db.execSQL("update MEMO_TABLE set body = '"+ bodyStr +"' where uuid = '"+"'");
                    }
                } finally {

                    db.close();
                }

                Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
                intent1.putExtra("data", 0);
                startActivity(intent1);

            }
        });


        //戻るボタンpush
        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
                intent1.putExtra("data", 0);
                startActivity(intent1);

            }
        });
    }

}
