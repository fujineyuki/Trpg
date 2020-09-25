package com.example.a4163103.trpg_tool.Character;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by 4163103 on 2017/12/19.
 */

public class PreferenceManager  {
    // デバック用のタグ
    private static final String TAG = "PreferenceManager";

    private Context mContext;
    private String PREFERENCE_NAME = "pref";
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEdit;

    /**
     * コンストラクター
     *
     * @param context 呼び出し元のcontext
     */
    public PreferenceManager(Context context) {
        mContext = context;
        mPreferences = mContext.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        mEdit = mPreferences.edit();
    }

    /**
     * データをPreferenceに保存する
     *
     * @param key 保存する値のkey
     * @param val 保存する値
     */
    public void putData(String key, Object val) {
        if (val instanceof Integer) {
            mEdit.putInt(key, (int) val);
            mEdit.apply();
            Log.i(TAG, String.format("保存成功：key=%s val=%d", key, val));
        }  else if (val instanceof Long) {
            mEdit.putLong(key, (long) val);
            mEdit.apply();
            Log.i(TAG, String.format("保存成功：key=%s val=%d", key, val));
        } else if (val instanceof Float) {
            mEdit.putFloat(key, (float) val);
            mEdit.apply();
            Log.i(TAG, String.format("保存成功：key=%s val=%f", key, val));
        } else if (val instanceof String) {
            mEdit.putString(key, (String) val);
            mEdit.apply();
            Log.i(TAG, String.format("保存成功：key=%s val=%s", key, val));
        } else if (val instanceof Boolean) {
            mEdit.putBoolean(key, (boolean) val);
            mEdit.apply();
            Log.i(TAG, String.format("保存成功：key=%s val=%b", key, val));
        } else {
            Log.e(TAG, "この型は保存出来ません");
        }
    }


    /**
     * Preferenceからデータ（Int型）を読み込む
     *
     * @param key    読み込むデータのkey
     * @param defVal データがなかった時の戻り値（初期値）
     * @return
     */
    public int getIntData(String key, int defVal) {
        return mPreferences.getInt(key, defVal);
    }

    /**
     * Preferenceからデータ（Long型）を読み込む
     *
     * @param key    読み込むデータのkey
     * @param defVal データがなかった時の戻り値（初期値）
     * @return
     */
    public long getLongData(String key, long defVal) {
        return mPreferences.getLong(key, defVal);
    }

    /**
     * Preferenceからデータ（String型）を読み込む
     *
     * @param key    読み込むデータのkey
     * @param defVal データがなかった時の戻り値（初期値）
     * @return
     */
    public float getFloatData(String key, float defVal) {
        return mPreferences.getFloat(key, defVal);
    }

    /**
     * Preferenceからデータ（String型）を読み込む
     *
     * @param key    読み込むデータのkey
     * @param defVal データがなかった時の戻り値（初期値）
     * @return
     */
    public String getStringData(String key, String defVal) {
        return mPreferences.getString(key, defVal);
    }

    /**
     * Preferenceからデータ（Boolean型）を読み込む
     *
     * @param key    読み込むデータのkey
     * @param defVal データがなかった時の戻り値（初期値）
     * @return
     */
    public boolean getBooleanData(String key, boolean defVal) {
        return mPreferences.getBoolean(key, defVal);
    }
}

/**
 * プリファンレンスで使用するデータのkey
 */
interface PrefKey {
    //初期値1
    String SP011 = "SP011";
    String SP012 = "SP012";
    String SP013 = "SP013";
    String SP014 = "SP014";
    String SP015 = "SP015";
    String SP016 = "SP016";
    String SP017 = "SP017";
    String SP018 = "SP018";
    String SP019 = "SP019";
    String SP0110 = "SP0110";
    String SP0111 = "SP0111";
    String SP0112 = "SP0112";
    String SP0113 = "SP0113";
    String SP0114 = "SP0114";
    String SP0115 = "SP0115";
    String SP0116 = "SP0116";
    String SP0117 = "SP0117";
    String SP0118 = "SP0118";
    String SP0119 = "SP0119";
    String SP0120 = "SP0120";
    String SP0121 = "SP0121";
    String SP0122 = "SP0122";
    String SP0123 = "SP0123";
    String SP0124 = "SP0124";
    String SP0125 = "SP0125";
    String SP0126 = "SP0126";
    String SP0127 = "SP0127";
    String SP0128 = "SP0128";


    //初期値5
    String SP051 = "SP051";
    String SP052 = "SP052";
    String SP053 = "SP053";
    String SP054 = "SP054";
    String SP055 = "SP055";
    String SP056 = "SP056";
    String SP057 = "SP057";
    String SP058 = "SP058";
    String SP059 = "SP059";

    //初期値10
    String SP101 = "SP101";
    String SP102 = "SP102";
    String SP103 = "SP103";
    String SP104 = "SP104";
    String SP105 = "SP105";
    String SP106 = "SP106";
    String SP107 = "SP107";
    String SP108 = "SP108";
    String SP109 = "SP109";
    String SP1010 = "SP1010";
    String SP1011 = "SP1011";

    //初期値15
    String SP151 = "SP151";
    String SP152 = "SP152";
    String SP153 = "SP153";
    String SP154 = "SP154";
    String SP155 = "SP155";

    //初期値20
    String SP201 = "SP201";
    String SP202 = "SP202";
    String SP203 = "SP203";
    String SP204 = "SP204";
    String SP205 = "SP205";

    //初期値25
    String SP251 = "SP251";
    String SP252 = "SP252";
    String SP253 = "SP253";
    String SP254 = "SP254";
    String SP255 = "SP255";
    String SP256 = "SP256";
    String SP257 = "SP257";
    String SP258 = "SP258";
    String SP259 = "SP259";

    //初期値30
    String SP301 = "SP301";
    String SP302 = "SP302";

    //初期値40
    String SP401 = "SP401";

    //初期値50
    String SP501 = "SP501";

    //初期値0
    String SP001 = "SP001";
    String SP002 = "SP002";
}