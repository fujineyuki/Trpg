package com.example.a4163103.trpg_tool.Memo;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TwoLineListItem;

import com.example.a4163103.trpg_tool.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 4163103 on 2017/11/09.
 */

public class MemoActivity extends Activity {

    Memo_Helper helper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);


        if(helper == null){
            helper = new Memo_Helper(MemoActivity.this);
        }

        final ArrayList<HashMap<String, String>> memoList = new ArrayList<>();
        // データベース取得
        SQLiteDatabase db = helper.getWritableDatabase();
        try {

            Cursor c = db.rawQuery("select uuid, body from MEMO_TABLE order by id", null);
            boolean next = c.moveToFirst();


            while (next) {
                HashMap<String,String> data = new HashMap<>();

                String uuid = c.getString(0);
                String body = c.getString(1);
                if(body.length() > 1000){
                    // 1000文字表示
                    body = body.substring(0, 1001) + "..." ;
                }

                data.put("body",body);
                data.put("id",uuid);
                memoList.add(data);
                // 次の行が存在するか確認
                next = c.moveToNext();
            }
        } finally {

            db.close();
        }

        final SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                memoList,
                android.R.layout.simple_list_item_2,
                new String[]{"body","id"},
                new int[]{android.R.id.text1, android.R.id.text2}
        );


        ListView listView = (ListView) findViewById(R.id.memoList);
        listView.setAdapter(simpleAdapter);


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            /**
             * @param parent ListView
             * @param view 選択した項目
             * @param position 選択した項目の添え字
             * @param id 選択した項目のID
             */
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                TwoLineListItem two = (TwoLineListItem)view;
                TextView idTextView = (TextView)two.getText2();
                String idStr = (String) idTextView.getText();

                // 長押しした項目データベース削除
                SQLiteDatabase db = helper.getWritableDatabase();
                try {
                    db.execSQL("DELETE FROM MEMO_TABLE WHERE uuid = '"+ idStr +"'");
                } finally {
                    db.close();
                }
                // 長押しした項目画面削除
                memoList.remove(position);
                simpleAdapter.notifyDataSetChanged();
                return true;
            }
        });


        //新規作成ボタンpush
        Button newButton = (Button) findViewById(R.id.newButton);
        // clickイベント追加
        newButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MemoActivity.this, CreateMemo_Activity.class);
                intent.putExtra("id", "");
                startActivity(intent);

            }
        });
    }
    //戻るボタン無効化
    @Override
    public void onBackPressed() {
    }

}
