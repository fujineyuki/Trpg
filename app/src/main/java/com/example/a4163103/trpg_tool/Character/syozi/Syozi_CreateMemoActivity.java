package com.example.a4163103.trpg_tool.Character.syozi;

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

import java.util.UUID;

/**
 * Created by 4163103 on 2018/02/15.
 */

public class Syozi_CreateMemoActivity extends Activity {


    Syozi_MemoOpenHelper helper = null;

    boolean newFlag = false;

    String id = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_syozi_create_memo);

        if(helper == null){
            helper = new Syozi_MemoOpenHelper(Syozi_CreateMemoActivity.this);
        }



        Intent intent = this.getIntent();

        id = intent.getStringExtra("id");

        if(id.equals("")){

            newFlag = true;
        }else{

            SQLiteDatabase db = helper.getWritableDatabase();
            try {

                Cursor c = db.rawQuery("select body from SYOZI_TABLE where uuid = '"+ id +"'", null);

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
                    if(newFlag){

                        id = UUID.randomUUID().toString();

                        db.execSQL("insert into SYOZI_TABLE(uuid, body) VALUES('"+ id +"', '"+ bodyStr +"')");
                    }else{

                        db.execSQL("update SYOZI_TABLE set body = '"+ bodyStr +"' where uuid = '"+id+"'");
                    }
                } finally {

                    db.close();
                }

//                Intent intent = new Intent(CreateMemoActivity.this, com.example.a4163103.trpg_tool.Memo.ListActivity.class);
//                startActivity(intent);

                Intent intent1 = new Intent(getApplication(), Syozi_ListActivity.class);
                intent1.putExtra("data", 0);
                startActivity(intent1);
                finish();

            }
        });


        //戻るボタンpush
        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Intent intent = new Intent(CreateMemoActivity.this, com.example.a4163103.trpg_tool.Memo.ListActivity.class);
//                startActivity(intent);

                Intent intent1 = new Intent(getApplication(), Syozi_ListActivity.class);
                intent1.putExtra("data", 0);
                startActivity(intent1);
                finish();

            }
        });
    }

    //端末の戻るボタン
    @Override
    public void onBackPressed() {

//        Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
//        intent1.putExtra("data", 0);
//        startActivity(intent1);
//        finish();

    }
}
