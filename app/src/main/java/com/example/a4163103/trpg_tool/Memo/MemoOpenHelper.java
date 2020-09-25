package com.example.a4163103.trpg_tool.Memo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4163103 on 2017/12/12.
 */

public class MemoOpenHelper extends SQLiteOpenHelper {


    static final private String DBName = "MEMO_DB";

    static final private int VERSION = 1;

    public MemoOpenHelper(Context context){
        super(context, DBName, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE MEMO_TABLE (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "uuid TEXT, " +
                "body TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS MEMO_TABLE");

        onCreate(db);
    }

}