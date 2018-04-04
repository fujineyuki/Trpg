package com.example.a4163103.trpg_tool.Character.syozi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4163103 on 2018/02/15.
 */

public class Syozi_MemoOpenHelper extends SQLiteOpenHelper {


    //static final private String SDBName = "MEMO_DB";

    static final private String SDBName = "SYOZI_DB";

    static final private int VERSION = 2;

    public Syozi_MemoOpenHelper(Context context){
        super(context, SDBName, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE SYOZI_TABLE (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "uuid TEXT, " +
                "body TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS SYOZI_TABLE");

        onCreate(db);
    }
}
