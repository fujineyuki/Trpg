package com.example.a4163103.trpg_tool.Character;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.a4163103.trpg_tool.R;
import com.example.a4163103.trpg_tool.TabHostActivity;

/**
 * Created by 4163103 on 2017/12/19.
 */

public class Itiran_Activity extends Activity implements PrefKey {

    private static final String TAG = "Ginoutiitirann";
    private PreferenceManager mPreferenceManager;
    private ArrayAdapter<Integer> adapter01;
    private ArrayAdapter<Integer> adapter05;
    private ArrayAdapter<Integer> adapter10;
    private ArrayAdapter<Integer> adapter15;
    private ArrayAdapter<Integer> adapter20;
    private ArrayAdapter<Integer> adapter25;
    private ArrayAdapter<Integer> adapter30;
    private ArrayAdapter<Integer> adapter40;
    private ArrayAdapter<Integer> adapter50;
    private ArrayAdapter<Integer> adapter00;


    //戻るボタン
    @Override
    public void onBackPressed() {

        Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
        intent1.putExtra("data", 2);
        startActivity(intent1);
        finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itiran);


        mPreferenceManager = new PreferenceManager(this);

        setTitle("技能値");

        Button btn4 = (Button) findViewById(R.id.back);

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Intent intent = new Intent(Itiran_Activity.this, GinoutiActivity.class);
//                startActivity(intent);
//                finish(); // アクティビティ終了

                Intent intent1 = new Intent(getApplication(), TabHostActivity.class);
                intent1.putExtra("data", 2);
                startActivity(intent1);
                finish();

            }
        });
        //ダイス初期値1
        adapter01 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 1; i <= 100; i++) {
            adapter01.add(i);
        }

        // ダイス初期1用
        Spinner.OnItemSelectedListener onItemSelectedListener01 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter01.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        //初期値1
        Spinner spinner011 = (Spinner) findViewById(R.id.sp6);
        Spinner spinner012 = (Spinner) findViewById(R.id.sp8);
        Spinner spinner013 = (Spinner) findViewById(R.id.sp15);
        Spinner spinner014 = (Spinner) findViewById(R.id.sp16);
        Spinner spinner015 = (Spinner) findViewById(R.id.sp19);
        Spinner spinner016 = (Spinner) findViewById(R.id.sp23);
        Spinner spinner017 = (Spinner) findViewById(R.id.sp27);
        Spinner spinner018 = (Spinner) findViewById(R.id.sp28);
        Spinner spinner019 = (Spinner) findViewById(R.id.sp29);
        Spinner spinner0110 = (Spinner) findViewById(R.id.sp30);
        Spinner spinner0111 = (Spinner) findViewById(R.id.sp34);
        Spinner spinner0112 = (Spinner) findViewById(R.id.sp35);
        Spinner spinner0113 = (Spinner) findViewById(R.id.sp37);
        Spinner spinner0114 = (Spinner) findViewById(R.id.sp38);
        Spinner spinner0115 = (Spinner) findViewById(R.id.sp45);
        Spinner spinner0116 = (Spinner) findViewById(R.id.sp47);
        Spinner spinner0117 = (Spinner) findViewById(R.id.sp49);
        Spinner spinner0118 = (Spinner) findViewById(R.id.sp51);
        Spinner spinner0119 = (Spinner) findViewById(R.id.sp53);
        Spinner spinner0120 = (Spinner) findViewById(R.id.sp55);
        Spinner spinner0121 = (Spinner) findViewById(R.id.sp65);
        Spinner spinner0122 = (Spinner) findViewById(R.id.sp66);
        Spinner spinner0123 = (Spinner) findViewById(R.id.sp67);
        Spinner spinner0124 = (Spinner) findViewById(R.id.sp68);
        Spinner spinner0125 = (Spinner) findViewById(R.id.sp7);
        Spinner spinner0126 = (Spinner) findViewById(R.id.sp17);
        Spinner spinner0127 = (Spinner) findViewById(R.id.sp20);
        Spinner spinner0128 = (Spinner) findViewById(R.id.sp24);

        spinner011.setAdapter(adapter01);
        spinner012.setAdapter(adapter01);
        spinner013.setAdapter(adapter01);
        spinner014.setAdapter(adapter01);
        spinner015.setAdapter(adapter01);
        spinner016.setAdapter(adapter01);
        spinner017.setAdapter(adapter01);
        spinner018.setAdapter(adapter01);
        spinner019.setAdapter(adapter01);
        spinner0110.setAdapter(adapter01);
        spinner0111.setAdapter(adapter01);
        spinner0112.setAdapter(adapter01);
        spinner0113.setAdapter(adapter01);
        spinner0114.setAdapter(adapter01);
        spinner0115.setAdapter(adapter01);
        spinner0116.setAdapter(adapter01);
        spinner0117.setAdapter(adapter01);
        spinner0118.setAdapter(adapter01);
        spinner0119.setAdapter(adapter01);
        spinner0120.setAdapter(adapter01);
        spinner0121.setAdapter(adapter01);
        spinner0122.setAdapter(adapter01);
        spinner0123.setAdapter(adapter01);
        spinner0124.setAdapter(adapter01);
        spinner0125.setAdapter(adapter01);
        spinner0126.setAdapter(adapter01);
        spinner0127.setAdapter(adapter01);
        spinner0128.setAdapter(adapter01);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner011.setTag(PrefKey.SP011);
        spinner012.setTag(PrefKey.SP012);
        spinner013.setTag(PrefKey.SP013);
        spinner014.setTag(PrefKey.SP014);
        spinner015.setTag(PrefKey.SP015);
        spinner016.setTag(PrefKey.SP016);
        spinner017.setTag(PrefKey.SP017);
        spinner018.setTag(PrefKey.SP018);
        spinner019.setTag(PrefKey.SP019);
        spinner0110.setTag(PrefKey.SP0110);
        spinner0111.setTag(PrefKey.SP0111);
        spinner0112.setTag(PrefKey.SP0112);
        spinner0113.setTag(PrefKey.SP0113);
        spinner0114.setTag(PrefKey.SP0114);
        spinner0115.setTag(PrefKey.SP0115);
        spinner0116.setTag(PrefKey.SP0116);
        spinner0117.setTag(PrefKey.SP0117);
        spinner0118.setTag(PrefKey.SP0118);
        spinner0119.setTag(PrefKey.SP0119);
        spinner0120.setTag(PrefKey.SP0120);
        spinner0121.setTag(PrefKey.SP0121);
        spinner0122.setTag(PrefKey.SP0122);
        spinner0123.setTag(PrefKey.SP0123);
        spinner0124.setTag(PrefKey.SP0124);
        spinner0125.setTag(PrefKey.SP0125);
        spinner0126.setTag(PrefKey.SP0126);
        spinner0127.setTag(PrefKey.SP0127);
        spinner0128.setTag(PrefKey.SP0128);

        //TODO 初期値設定
        spinner011.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP011, 0)));
        spinner012.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP012, 0)));
        spinner013.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP013, 0)));
        spinner014.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP014, 0)));
        spinner015.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP015, 0)));
        spinner016.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP016, 0)));
        spinner017.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP017, 0)));
        spinner018.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP018, 0)));
        spinner019.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP019, 0)));
        spinner0110.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0110, 0)));
        spinner0111.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0111, 0)));
        spinner0112.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0112, 0)));
        spinner0113.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0113, 0)));
        spinner0114.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0114, 0)));
        spinner0115.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0115, 0)));
        spinner0116.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0116, 0)));
        spinner0117.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0117, 0)));
        spinner0118.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0118, 0)));
        spinner0119.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0119, 0)));
        spinner0120.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0120, 0)));
        spinner0121.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0121, 0)));
        spinner0122.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0122, 0)));
        spinner0123.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0123, 0)));
        spinner0124.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0124, 0)));
        spinner0125.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0125, 0)));
        spinner0126.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0126, 0)));
        spinner0127.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0127, 0)));
        spinner0128.setSelection(checkAdapterItemPosition(adapter01, mPreferenceManager.getIntData(PrefKey.SP0128, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner011.setOnItemSelectedListener(onItemSelectedListener01);
        spinner012.setOnItemSelectedListener(onItemSelectedListener01);
        spinner013.setOnItemSelectedListener(onItemSelectedListener01);
        spinner014.setOnItemSelectedListener(onItemSelectedListener01);
        spinner015.setOnItemSelectedListener(onItemSelectedListener01);
        spinner016.setOnItemSelectedListener(onItemSelectedListener01);
        spinner017.setOnItemSelectedListener(onItemSelectedListener01);
        spinner018.setOnItemSelectedListener(onItemSelectedListener01);
        spinner019.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0110.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0111.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0112.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0113.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0114.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0115.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0116.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0117.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0118.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0119.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0120.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0121.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0122.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0123.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0124.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0125.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0126.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0127.setOnItemSelectedListener(onItemSelectedListener01);
        spinner0128.setOnItemSelectedListener(onItemSelectedListener01);

        //ダイス初期値5
        adapter05 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter05.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 5; i <= 100; i++) {
            adapter05.add(i);
        }

        // ダイス初期5用
        Spinner.OnItemSelectedListener onItemSelectedListener05 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter05.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner051 = (Spinner) findViewById(R.id.sp1);
        Spinner spinner052 = (Spinner) findViewById(R.id.sp2);
        Spinner spinner053 = (Spinner) findViewById(R.id.sp5);
        Spinner spinner054 = (Spinner) findViewById(R.id.sp14);
        Spinner spinner055 = (Spinner) findViewById(R.id.sp21);
        Spinner spinner056 = (Spinner) findViewById(R.id.sp23);
        Spinner spinner057 = (Spinner) findViewById(R.id.sp25);
        Spinner spinner058 = (Spinner) findViewById(R.id.sp33);
        Spinner spinner059 = (Spinner) findViewById(R.id.sp44);

        spinner051.setAdapter(adapter05);
        spinner052.setAdapter(adapter05);
        spinner053.setAdapter(adapter05);
        spinner054.setAdapter(adapter05);
        spinner055.setAdapter(adapter05);
        spinner056.setAdapter(adapter05);
        spinner057.setAdapter(adapter05);
        spinner058.setAdapter(adapter05);
        spinner059.setAdapter(adapter05);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner051.setTag(PrefKey.SP051);
        spinner052.setTag(PrefKey.SP052);
        spinner053.setTag(PrefKey.SP053);
        spinner054.setTag(PrefKey.SP054);
        spinner055.setTag(PrefKey.SP055);
        spinner056.setTag(PrefKey.SP056);
        spinner057.setTag(PrefKey.SP057);
        spinner058.setTag(PrefKey.SP058);
        spinner059.setTag(PrefKey.SP059);

        //TODO 初期値設定
        spinner051.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP051, 0)));
        spinner052.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP052, 0)));
        spinner053.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP053, 0)));
        spinner054.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP054, 0)));
        spinner055.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP055, 0)));
        spinner056.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP056, 0)));
        spinner057.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP057, 0)));
        spinner058.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP058, 0)));
        spinner059.setSelection(checkAdapterItemPosition(adapter05, mPreferenceManager.getIntData(PrefKey.SP059, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner051.setOnItemSelectedListener(onItemSelectedListener05);
        spinner052.setOnItemSelectedListener(onItemSelectedListener05);
        spinner053.setOnItemSelectedListener(onItemSelectedListener05);
        spinner054.setOnItemSelectedListener(onItemSelectedListener05);
        spinner055.setOnItemSelectedListener(onItemSelectedListener05);
        spinner056.setOnItemSelectedListener(onItemSelectedListener05);
        spinner057.setOnItemSelectedListener(onItemSelectedListener05);
        spinner058.setOnItemSelectedListener(onItemSelectedListener05);
        spinner059.setOnItemSelectedListener(onItemSelectedListener05);


        //ダイス初期値10

        adapter10 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //ArrayAdapter<Integer> adapter10 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        //adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 10; i <= 100; i++) {
            adapter10.add(i);
        }

        // ダイス初期10用
        Spinner.OnItemSelectedListener onItemSelectedListener10 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter10.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner101 = (Spinner) findViewById(R.id.sp10);
        Spinner spinner102 = (Spinner) findViewById(R.id.sp15);
        Spinner spinner103 = (Spinner) findViewById(R.id.sp18);
        Spinner spinner104 = (Spinner) findViewById(R.id.sp19);
        Spinner spinner105 = (Spinner) findViewById(R.id.sp40);
        Spinner spinner106 = (Spinner) findViewById(R.id.sp41);
        Spinner spinner107 = (Spinner) findViewById(R.id.sp43);
        Spinner spinner108 = (Spinner) findViewById(R.id.sp54);
        Spinner spinner109 = (Spinner) findViewById(R.id.sp62);
        Spinner spinner1010 = (Spinner) findViewById(R.id.sp26);
        Spinner spinner1011 = (Spinner) findViewById(R.id.sp64);

        spinner101.setAdapter(adapter10);
        spinner102.setAdapter(adapter10);
        spinner103.setAdapter(adapter10);
        spinner104.setAdapter(adapter10);
        spinner105.setAdapter(adapter10);
        spinner106.setAdapter(adapter10);
        spinner107.setAdapter(adapter10);
        spinner108.setAdapter(adapter10);
        spinner109.setAdapter(adapter10);
        spinner1010.setAdapter(adapter10);
        spinner1011.setAdapter(adapter10);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner101.setTag(PrefKey.SP101);
        spinner102.setTag(PrefKey.SP102);
        spinner103.setTag(PrefKey.SP103);
        spinner104.setTag(PrefKey.SP104);
        spinner105.setTag(PrefKey.SP105);
        spinner106.setTag(PrefKey.SP106);
        spinner107.setTag(PrefKey.SP107);
        spinner108.setTag(PrefKey.SP108);
        spinner109.setTag(PrefKey.SP109);
        spinner1010.setTag(PrefKey.SP1010);
        spinner1011.setTag(PrefKey.SP1011);

        //TODO 初期値設定
        spinner101.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP101, 0)));
        spinner102.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP102, 0)));
        spinner103.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP103, 0)));
        spinner104.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP104, 0)));
        spinner105.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP105, 0)));
        spinner106.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP106, 0)));
        spinner107.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP107, 0)));
        spinner108.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP108, 0)));
        spinner109.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP109, 0)));
        spinner1010.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP1010, 0)));
        spinner1011.setSelection(checkAdapterItemPosition(adapter10, mPreferenceManager.getIntData(PrefKey.SP1011, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner101.setOnItemSelectedListener(onItemSelectedListener10);
        spinner102.setOnItemSelectedListener(onItemSelectedListener10);
        spinner103.setOnItemSelectedListener(onItemSelectedListener10);
        spinner104.setOnItemSelectedListener(onItemSelectedListener10);
        spinner105.setOnItemSelectedListener(onItemSelectedListener10);
        spinner106.setOnItemSelectedListener(onItemSelectedListener10);
        spinner107.setOnItemSelectedListener(onItemSelectedListener10);
        spinner108.setOnItemSelectedListener(onItemSelectedListener10);
        spinner109.setOnItemSelectedListener(onItemSelectedListener10);
        spinner1010.setOnItemSelectedListener(onItemSelectedListener10);
        spinner1011.setOnItemSelectedListener(onItemSelectedListener10);

        //ダイス初期値15
        adapter15 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 15; i <= 100; i++) {
            adapter15.add(i);
        }

        // ダイス初期15用
        Spinner.OnItemSelectedListener onItemSelectedListener15 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter15.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner151 = (Spinner) findViewById(R.id.sp9);
        Spinner spinner152 = (Spinner) findViewById(R.id.sp22);
        Spinner spinner153 = (Spinner) findViewById(R.id.sp36);
        Spinner spinner154 = (Spinner) findViewById(R.id.sp57);
        Spinner spinner155 = (Spinner) findViewById(R.id.sp59);

        spinner151.setAdapter(adapter15);
        spinner152.setAdapter(adapter15);
        spinner153.setAdapter(adapter15);
        spinner154.setAdapter(adapter15);
        spinner155.setAdapter(adapter15);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner151.setTag(PrefKey.SP151);
        spinner152.setTag(PrefKey.SP152);
        spinner153.setTag(PrefKey.SP153);
        spinner154.setTag(PrefKey.SP154);
        spinner155.setTag(PrefKey.SP155);

        //TODO 初期値設定
        spinner151.setSelection(checkAdapterItemPosition(adapter15, mPreferenceManager.getIntData(PrefKey.SP151, 0)));
        spinner152.setSelection(checkAdapterItemPosition(adapter15, mPreferenceManager.getIntData(PrefKey.SP152, 0)));
        spinner153.setSelection(checkAdapterItemPosition(adapter15, mPreferenceManager.getIntData(PrefKey.SP153, 0)));
        spinner154.setSelection(checkAdapterItemPosition(adapter15, mPreferenceManager.getIntData(PrefKey.SP154, 0)));
        spinner155.setSelection(checkAdapterItemPosition(adapter15, mPreferenceManager.getIntData(PrefKey.SP155, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner151.setOnItemSelectedListener(onItemSelectedListener15);
        spinner152.setOnItemSelectedListener(onItemSelectedListener15);
        spinner153.setOnItemSelectedListener(onItemSelectedListener15);
        spinner154.setOnItemSelectedListener(onItemSelectedListener15);
        spinner155.setOnItemSelectedListener(onItemSelectedListener15);

        //ダイス初期値20
        adapter20 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 20; i <= 100; i++) {
            adapter20.add(i);
        }

        // ダイス初期20用
        Spinner.OnItemSelectedListener onItemSelectedListener20 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter20.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner201 = (Spinner) findViewById(R.id.sp3);
        Spinner spinner202 = (Spinner) findViewById(R.id.sp11);
        Spinner spinner203 = (Spinner) findViewById(R.id.sp50);
        Spinner spinner204 = (Spinner) findViewById(R.id.sp52);
        Spinner spinner205 = (Spinner) findViewById(R.id.sp56);

        spinner201.setAdapter(adapter20);
        spinner202.setAdapter(adapter20);
        spinner203.setAdapter(adapter20);
        spinner204.setAdapter(adapter20);
        spinner205.setAdapter(adapter20);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner201.setTag(PrefKey.SP201);
        spinner202.setTag(PrefKey.SP202);
        spinner203.setTag(PrefKey.SP203);
        spinner204.setTag(PrefKey.SP204);
        spinner205.setTag(PrefKey.SP205);

        //TODO 初期値設定
        spinner201.setSelection(checkAdapterItemPosition(adapter20, mPreferenceManager.getIntData(PrefKey.SP201, 0)));
        spinner202.setSelection(checkAdapterItemPosition(adapter20, mPreferenceManager.getIntData(PrefKey.SP202, 0)));
        spinner203.setSelection(checkAdapterItemPosition(adapter20, mPreferenceManager.getIntData(PrefKey.SP203, 0)));
        spinner204.setSelection(checkAdapterItemPosition(adapter20, mPreferenceManager.getIntData(PrefKey.SP204, 0)));
        spinner205.setSelection(checkAdapterItemPosition(adapter20, mPreferenceManager.getIntData(PrefKey.SP205, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner201.setOnItemSelectedListener(onItemSelectedListener20);
        spinner202.setOnItemSelectedListener(onItemSelectedListener20);
        spinner203.setOnItemSelectedListener(onItemSelectedListener20);
        spinner204.setOnItemSelectedListener(onItemSelectedListener20);
        spinner205.setOnItemSelectedListener(onItemSelectedListener20);

        //ダイス初期25
        adapter25 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 25; i <= 100; i++) {
            adapter25.add(i);
        }

        // ダイス初期25用
        Spinner.OnItemSelectedListener onItemSelectedListener25 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter25.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner251 = (Spinner) findViewById(R.id.sp12);
        Spinner spinner252 = (Spinner) findViewById(R.id.sp31);
        Spinner spinner253 = (Spinner) findViewById(R.id.sp32);
        Spinner spinner254 = (Spinner) findViewById(R.id.sp39);
        Spinner spinner255 = (Spinner) findViewById(R.id.sp48);
        Spinner spinner256 = (Spinner) findViewById(R.id.sp60);
        Spinner spinner257 = (Spinner) findViewById(R.id.sp61);
        Spinner spinner258 = (Spinner) findViewById(R.id.sp62);
        Spinner spinner259 = (Spinner) findViewById(R.id.sp42);


        spinner251.setAdapter(adapter25);
        spinner252.setAdapter(adapter25);
        spinner253.setAdapter(adapter25);
        spinner254.setAdapter(adapter25);
        spinner255.setAdapter(adapter25);
        spinner256.setAdapter(adapter25);
        spinner257.setAdapter(adapter25);
        spinner258.setAdapter(adapter25);
        spinner259.setAdapter(adapter25);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner251.setTag(PrefKey.SP251);
        spinner252.setTag(PrefKey.SP252);
        spinner253.setTag(PrefKey.SP253);
        spinner254.setTag(PrefKey.SP254);
        spinner255.setTag(PrefKey.SP255);
        spinner256.setTag(PrefKey.SP256);
        spinner257.setTag(PrefKey.SP257);
        spinner258.setTag(PrefKey.SP258);
        spinner259.setTag(PrefKey.SP259);


        //TODO 初期値設定
        spinner251.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP251, 0)));
        spinner252.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP252, 0)));
        spinner253.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP253, 0)));
        spinner254.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP254, 0)));
        spinner255.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP255, 0)));
        spinner256.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP256, 0)));
        spinner257.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP257, 0)));
        spinner258.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP258, 0)));
        spinner259.setSelection(checkAdapterItemPosition(adapter25, mPreferenceManager.getIntData(PrefKey.SP259, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner251.setOnItemSelectedListener(onItemSelectedListener25);
        spinner252.setOnItemSelectedListener(onItemSelectedListener25);
        spinner253.setOnItemSelectedListener(onItemSelectedListener25);
        spinner254.setOnItemSelectedListener(onItemSelectedListener25);
        spinner255.setOnItemSelectedListener(onItemSelectedListener25);
        spinner256.setOnItemSelectedListener(onItemSelectedListener25);
        spinner257.setOnItemSelectedListener(onItemSelectedListener25);
        spinner258.setOnItemSelectedListener(onItemSelectedListener25);
        spinner259.setOnItemSelectedListener(onItemSelectedListener25);

        //ダイス初期値30
        adapter30 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter30.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 30; i <= 100; i++) {
            adapter30.add(i);
        }

        // ダイス初期30用
        Spinner.OnItemSelectedListener onItemSelectedListener30 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter30.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner301 = (Spinner) findViewById(R.id.sp4);
        Spinner spinner302 = (Spinner) findViewById(R.id.sp58);

        spinner301.setAdapter(adapter30);
        spinner302.setAdapter(adapter30);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner301.setTag(PrefKey.SP301);
        spinner302.setTag(PrefKey.SP302);

        //TODO 初期値設定
        spinner301.setSelection(checkAdapterItemPosition(adapter30, mPreferenceManager.getIntData(PrefKey.SP301, 0)));
        spinner302.setSelection(checkAdapterItemPosition(adapter30, mPreferenceManager.getIntData(PrefKey.SP302, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner301.setOnItemSelectedListener(onItemSelectedListener30);
        spinner302.setOnItemSelectedListener(onItemSelectedListener30);

        //ダイス初期値40
        adapter40 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 40; i <= 100; i++) {
            adapter40.add(i);
        }

        // ダイス初期40用
        Spinner.OnItemSelectedListener onItemSelectedListener40 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter40.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner401 = (Spinner) findViewById(R.id.sp69);

        spinner401.setAdapter(adapter40);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner401.setTag(PrefKey.SP401);

        //TODO 初期値設定
        spinner401.setSelection(checkAdapterItemPosition(adapter40, mPreferenceManager.getIntData(PrefKey.SP401, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner401.setOnItemSelectedListener(onItemSelectedListener40);

        //ダイス初期値50
        adapter50 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter50.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 50; i <= 100; i++) {
            adapter50.add(i);
        }

        // ダイス初期50用
        Spinner.OnItemSelectedListener onItemSelectedListener50 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter50.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };


        Spinner spinner501 = (Spinner) findViewById(R.id.sp63);

        spinner501.setAdapter(adapter50);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner501.setTag(PrefKey.SP501);

        //TODO 初期値設定
        spinner501.setSelection(checkAdapterItemPosition(adapter50, mPreferenceManager.getIntData(PrefKey.SP501, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner501.setOnItemSelectedListener(onItemSelectedListener50);

        //ダイス初期値0
        adapter00 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (int i = 0; i <= 100; i++) {
            adapter00.add(i);
        }

        // ダイス初期0用
        Spinner.OnItemSelectedListener onItemSelectedListener00 = new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // スピナーの値が選択されたら
                String prefKey;
                if (parent.getTag() != null) {
                    prefKey = parent.getTag().toString();
                    mPreferenceManager.putData(prefKey, adapter00.getItem(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        Spinner spinner001 = (Spinner) findViewById(R.id.sp13);
        Spinner spinner002 = (Spinner) findViewById(R.id.sp46);

        spinner001.setAdapter(adapter00);
        spinner002.setAdapter(adapter00);

        //TODO  タグ指定(プリファンレスのKeyを指定)
        spinner001.setTag(PrefKey.SP001);
        spinner002.setTag(PrefKey.SP002);

        //TODO 初期値設定
        spinner001.setSelection(checkAdapterItemPosition(adapter00, mPreferenceManager.getIntData(PrefKey.SP001, 0)));
        spinner002.setSelection(checkAdapterItemPosition(adapter00, mPreferenceManager.getIntData(PrefKey.SP002, 0)));

        //TODO  スピナーの値が変更されたら呼び出す
        spinner001.setOnItemSelectedListener(onItemSelectedListener00);
        spinner002.setOnItemSelectedListener(onItemSelectedListener00);
    }

    /**
     * TODO checkItemがAdapterの何個目かチェックする
     *
     * @param adapter
     * @param checkItem
     * @return
     */
    public int checkAdapterItemPosition(ArrayAdapter adapter, int checkItem) {
        try {
            for (int i = 0; i < adapter.getCount(); ++i) {
                if ((Integer) adapter.getItem(i) == checkItem) {
                    return i;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
        return 0;
    }
    /*----------------------------------------------------------------------
    public class Ginou extends Activity {
        com.example.a4163103.trpg_tool.Character.Status status;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ginouti1);

            //グローバル変数を取得
            status = (com.example.a4163103.trpg_tool.Character.Status) this.getApplication();
            //初期化
            status.StatusAllInit();
        }

        private Button.OnClickListener NextActivity = new Button.OnClickListener() {
            public void onClick(View v) {
                //現在の技能値の合計を算出
                NowPoint =
                        spinner011 +
                        spinner012 +
                        spinner013 +
                        spinner014 +
                        spinner015 +
                        spinner016 +
                        spinner017 +
                        spinner018 +
                        spinner019 +
                        spinner0110 +
                        spinner0111 +
                        spinner0112 +
                        spinner0113 +
                        spinner0114 +
                        spinner0115 +
                        spinner0116 +
                        spinner0117 +
                        spinner0118 +
                        spinner0119 +
                        spinner0120 +
                        spinner0121 +
                        spinner0122 +
                        spinner0123 +
                        spinner0124 +
                        spinner0125 +
                        spinner0126 +
                        spinner0127 +
                        spinner0128 +
                        spinner051 +
                        spinner052 +
                        spinner053 +
                        spinner054 +
                        spinner055 +
                        spinner056 +
                        spinner057 +
                        spinner058 +
                        spinner059 +
                        spinner151 +
                        spinner152 +
                        spinner153 +
                        spinner154 +
                        spinner155 +
                        spinner201 +
                        spinner202 +
                        spinner203 +
                        spinner204 +
                        spinner205 +
                        spinner251 +
                        spinner252 +
                        spinner253 +
                        spinner254 +
                        spinner255 +
                        spinner256 +
                        spinner257 +
                        spinner258 +
                        spinner259 +
                        spinner301 +
                        spinner302 +
                        spinner401 +
                        spinner501 +
                        spinner001 +
                        spinner002 ;

                //インテントの生成
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //アクティビティの起動
                startActivity(intent);
            }
        };
    }

    ----------------------------------------------------------------------*/

}



