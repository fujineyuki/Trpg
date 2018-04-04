package com.example.a4163103.trpg_tool.Character.jyumon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4163103 on 2018/02/15.
 */

public class Jumon_MemoOpenHelper extends SQLiteOpenHelper {


    //static final private String SDBName = "MEMO_DB";

    static final private String JDBName = "JUMON_DB";

    static final private int VERSION = 2;

    public Jumon_MemoOpenHelper(Context context){
        super(context, JDBName, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE JUMON_TABLE (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "uuid TEXT, " +
                "body TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS JUMON_TABLE");

        onCreate(db);
    }
}
