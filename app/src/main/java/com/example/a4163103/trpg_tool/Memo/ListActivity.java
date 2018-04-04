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

public class ListActivity extends Activity {


    MemoOpenHelper helper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        if(helper == null){
            helper = new MemoOpenHelper(ListActivity.this);
        }

        final ArrayList<HashMap<String, String>> memoList = new ArrayList<>();

        SQLiteDatabase db = helper.getWritableDatabase();
        try {

            Cursor c = db.rawQuery("select uuid, body from MEMO_TABLE order by id", null);

            boolean next = c.moveToFirst();

            while (next) {
                HashMap<String,String> data = new HashMap<>();

                String uuid = c.getString(0);
                String body = c.getString(1);
                if(body.length() > 1000){
                    // リストに表示するのは1000文字まで
                    body = body.substring(0, 1001) + "...";
                }

                data.put("body",body);
                data.put("id",uuid);
                memoList.add(data);

                next = c.moveToNext();
            }
        } finally {

            db.close();
        }

        // Adapter生成
        final SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                memoList,
                android.R.layout.simple_list_item_2,
                new String[]{"body",""},
                new int[]{android.R.id.text1, android.R.id.text2}
        );

        ListView listView = (ListView) findViewById(R.id.memoList);
        listView.setAdapter(simpleAdapter);

        // リスト項目をクリックした時の処理
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListActivity.this, com.example.a4163103.trpg_tool.Memo.CreateMemoActivity.class);

                HashMap<String,String> t = memoList.get(position);
                String s = t.get("id");

                TwoLineListItem two = (TwoLineListItem)view;
//                TextView idTextView = (TextView)two.findViewById(android.R.id.text2);
                TextView idTextView = (TextView)two.getText2();
                String idStr = (String) idTextView.getText();

                intent.putExtra("id", idStr);
                intent.putExtra("id", s);

                startActivity(intent);
                finish();
            }
        });

        // リスト項目を長押しした時の処理
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){

            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                HashMap<String,String> t = memoList.get(position);
                String s = t.get("id");

                TwoLineListItem two = (TwoLineListItem)view;
                TextView idTextView = (TextView)two.getText2();
                String idStr = (String) idTextView.getText();

                // 長押しした項目をデータベースから削除
                SQLiteDatabase db = helper.getWritableDatabase();
                try {
                    db.execSQL("DELETE FROM MEMO_TABLE WHERE uuid = '"+ idStr + s +"'");
                } finally {
                    db.close();
                }

                memoList.remove(position);
                simpleAdapter.notifyDataSetChanged();

                return true;
            }
        });


        //新規作成ボタン作成
        Button newButton = (Button) findViewById(R.id.newButton);

        newButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // CreateMemoActivityへ遷移
                Intent intent = new Intent(ListActivity.this, com.example.a4163103.trpg_tool.Memo.CreateMemoActivity.class);
                intent.putExtra("id", "");
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