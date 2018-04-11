package com.example.a4163103.trpg_tool.Character;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a4163103.trpg_tool.Character.jyumon.Jumon_ListActivity;
import com.example.a4163103.trpg_tool.Character.syozi.Syozi_ListActivity;
import com.example.a4163103.trpg_tool.R;

import java.util.Random;

public class GinoutiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ginouti1);

        setTitle("ステータス");

        //------------------------------------------------------------------------------------------
        Button btn1 = (Button)findViewById(R.id.ginouti);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(GinoutiActivity.this,Itiran_Activity.class);
                startActivity(intent);
                finish();
            }
        });


        //------------------------------------------------------------------------------------------所持品
        Button btn_S = (Button)findViewById(R.id.itemText);

        btn_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GinoutiActivity.this, Syozi_ListActivity.class);
                startActivity(intent);
                finish();

            }
        });

        //------------------------------------------------------------------------------------------呪文
        Button btn_J = (Button)findViewById(R.id.jyumonText);

        btn_J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GinoutiActivity.this, Jumon_ListActivity.class);
                startActivity(intent);
                finish();

            }
        });




        //-------------------------------------------------------------- STR
        Button StrButton = (Button)findViewById(R.id.STRButton);

        StrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences strText = getPreferences(0);
                SharedPreferences sizText = getPreferences(0);
                SharedPreferences dbText = getPreferences(0);

                //値をgetInt()等のメソッドでキーを与えて値を呼び出す
                //int useId = pref.getInt("id", 10001);
                //第1引数はキー、第2引数は デフォルト値 となります。なにも保存してない場合に呼び出された時にその値を返します。
                int SIZ = sizText.getInt("SizText",0 );

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int STR = a + b + c;

                String DB = "0";
                int DBformula = STR + SIZ;             //DB計算用変数


                if(DBformula <= 2){
                    DB = "-2D6";
                }else if(DBformula >= 2 && DBformula <= 12){
                    DB = "-1D6";
                }else if(DBformula >= 13 && DBformula <= 16){
                    DB = "-1D4";
                }else if(DBformula >= 17 && DBformula <= 24){
                    DB = "0";
                }else if(DBformula >= 25 && DBformula <= 32){
                    DB = "+1D4";
                }else if(DBformula >= 33 && DBformula <= 40){
                    DB = "+1D6";
                }else if(DBformula >= 41){
                    DB = "+2D6";
                }


                TextView StrText = (TextView)findViewById(R.id.StrText);
                StrText.setText(String.valueOf(STR));

                TextView DBText = (TextView)findViewById(R.id.dbText);
                DBText.setText(String.valueOf(DB));

                //edit()でオブジェクト取得
                //Editor editor = pref.edit();
//                SharedPreferences.Editor StrText = strText.edit();
//                SharedPreferences.Editor DBText = dbText.edit();
                //保存する値がint型の場合、putInt()でキーと値を保存
                //editor.putInt("id", userId);
//                StrText.putInt("StrText", STR);
//                DBText.putString("DBText", DB);
                //commit()で実際にファイルに書き込む
                //editor.commit();
//                StrText.commit();
//                DBText.commit();



            }
        });


        //------------------------------------------------------------ Int
        Button IntButton = (Button)findViewById(R.id.INTButton);

        IntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences intText = getPreferences(0);
                SharedPreferences ideaText = getPreferences(0);

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int INT = a + b + 6;
                int Idea = INT * 5;

                TextView IntText = (TextView)findViewById(R.id.IntText);
                IntText.setText(String.valueOf(INT));

                TextView IdeaText = (TextView)findViewById(R.id.IdeaText);
                IdeaText.setText(String.valueOf(Idea));

            }
        });


        //------------------------------------------------------------ DEX
        Button DexButton = (Button)findViewById(R.id.DEXButton);

        DexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences dexText = getPreferences(0);

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int DEX = a + b + c;

                TextView DexText = (TextView)findViewById(R.id.DexText);
                DexText.setText(String.valueOf(DEX));
            }
        });


        //------------------------------------------------------------ CON
        Button ConButton = (Button)findViewById(R.id.CONButton);

        ConButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences conText = getPreferences(0);
                SharedPreferences sizText = getPreferences(0);

                int SIZ = sizText.getInt("SizText",0 );

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int CON = a + b + c;

                int HP = (SIZ + CON) / 2;

                TextView ConText = (TextView)findViewById(R.id.ConText);
                ConText.setText(String.valueOf(CON));

                TextView hpText = (TextView)findViewById(R.id.HpText);
                hpText.setText(String.valueOf(HP));
            }
        });


        //------------------------------------------------------------ APP
        Button AppButton = (Button)findViewById(R.id.APPButton);

        AppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences appText = getPreferences(0);

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int APP = a + b + c;

                TextView AppText = (TextView)findViewById(R.id.AppText);
                AppText.setText(String.valueOf(APP));
            }
        });


        //------------------------------------------------------------ POW
        Button PowButton = (Button)findViewById(R.id.POWButton);

        PowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences powText = getPreferences(0);
                SharedPreferences sanText = getPreferences(0);

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int POW = a + b + c;
                int SAN = POW * 5;
                int MP  = POW;

                TextView PowText = (TextView)findViewById(R.id.PowText);
                PowText.setText(String.valueOf(POW));

                TextView mpText = (TextView)findViewById(R.id.MpText);
                mpText.setText(String.valueOf(MP));

                TextView SanText = (TextView)findViewById(R.id.SanText);
                SanText.setText(String.valueOf(SAN));
            }
        });


        //------------------------------------------------------------ Siz
        Button SizButton = (Button)findViewById(R.id.SIZButton);


        SizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences strText = getPreferences(0);
                SharedPreferences sizText = getPreferences(0);
                SharedPreferences conText = getPreferences(0);
                SharedPreferences HPText = getPreferences(0);
                SharedPreferences dbText = getPreferences(0);

                //値をgetInt()等のメソッドでキーを与えて値を呼び出す
                //int useId = pref.getInt("id", 10001);
                //第1引数はキー、第2引数は デフォルト値 となります。なにも保存してない場合に呼び出された時にその値を返します。
                int STR = strText.getInt("StrText",0 );
                int CON = conText.getInt("ConText",0 );

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int SIZ = a + b + 6;

                int HP = (SIZ + CON) / 2 ;


                String DB = "0";
                int DBformula = STR + SIZ;             //DB計算用変数


                if(DBformula <= 2){
                    DB = "-2D6";
                }else if(DBformula >= 2 && DBformula <= 12){
                    DB = "-1D6";
                }else if(DBformula >= 13 && DBformula <= 16){
                    DB = "-1D4";
                }else if(DBformula >= 17 && DBformula <= 24){
                    DB = "0";
                }else if(DBformula >= 25 && DBformula <= 32){
                    DB = "+1D4";
                }else if(DBformula >= 33 && DBformula <= 40){
                    DB = "+1D6";
                }else if(DBformula >= 41){
                    DB = "+2D6";
                }

                TextView SizText = (TextView)findViewById(R.id.SizText);
                SizText.setText(String.valueOf(SIZ));

                TextView DBText = (TextView)findViewById(R.id.dbText);
                DBText.setText(String.valueOf(DB));

                TextView hpText = (TextView)findViewById(R.id.HpText);
                hpText.setText(String.valueOf(HP));
            }
        });

        //------------------------------------------------------------ EDU
        Button EduButton = (Button)findViewById(R.id.EDUButton);

        EduButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences eduText = getPreferences(0);
                SharedPreferences knowledgeText = getPreferences(0);

                Random r = new Random();
                int a = r.nextInt(6) + 1;
                int b = r.nextInt(6) + 1;
                int c = r.nextInt(6) + 1;
                int EDU = a + b + c + 3;
                int Knowledge = EDU * 5;

                TextView EduText = (TextView)findViewById(R.id.EduText);
                EduText.setText(String.valueOf(EDU));

                TextView KnowledgeText = (TextView)findViewById(R.id.KnowledgeText);
                KnowledgeText.setText(String.valueOf(Knowledge));
            }
        });


        //------------------------------------------------------------ ALL
        Button AllButton = (Button)findViewById(R.id.ALLButton);


        AllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //SharedPreferenceseオブジェクトを取得
                //SharedPreferences pref = getSharedPreferences("user_data", MODE_PRIVATE);
                //保存先のファイル名とアクティビティ名が同じ場合に限り、getPreferences()が使え、こちらは引数がモードのみです。
                SharedPreferences strText = getPreferences(0);
                SharedPreferences intText = getPreferences(0);
                SharedPreferences ideaText = getPreferences(0);
                SharedPreferences dexText = getPreferences(0);
                SharedPreferences conText = getPreferences(0);
                SharedPreferences appText = getPreferences(0);
                SharedPreferences powText = getPreferences(0);
                SharedPreferences sanText = getPreferences(0);
                SharedPreferences sizText = getPreferences(0);
                SharedPreferences dbText = getPreferences(0);
                SharedPreferences eduText = getPreferences(0);
                SharedPreferences knowledgeText = getPreferences(0);

                //値をgetInt()等のメソッドでキーを与えて値を呼び出す
                //int useId = pref.getInt("id", 10001);
                //第1引数はキー、第2引数は デフォルト値 となります。なにも保存してない場合に呼び出された時にその値を返します。

                Random rstr = new Random();
                int astr = rstr.nextInt(6) + 1;
                int bstr = rstr.nextInt(6) + 1;
                int cstr = rstr.nextInt(6) + 1;
                int STR = astr + bstr + cstr;

                Random rint = new Random();
                int aint = rint.nextInt(6) + 1;
                int bint = rint.nextInt(6) + 1;
                int cint = rint.nextInt(6) + 1;
                int INT = aint + bint + cint;
                int Idea = INT * 5;

                Random rdex = new Random();
                int adex = rdex.nextInt(6) + 1;
                int bdex = rdex.nextInt(6) + 1;
                int cdex = rdex.nextInt(6) + 1;
                int DEX = adex + bdex + cdex;

                Random rcon = new Random();
                int acon = rcon.nextInt(6) + 1;
                int bcon = rcon.nextInt(6) + 1;
                int ccon = rcon.nextInt(6) + 1;
                int CON = acon + bcon + ccon;

                Random rapp = new Random();
                int aapp = rapp.nextInt(6) + 1;
                int bapp = rapp.nextInt(6) + 1;
                int capp = rapp.nextInt(6) + 1;
                int APP = aapp + bapp + capp;

                Random rpow = new Random();
                int apow = rpow.nextInt(6) + 1;
                int bpow = rpow.nextInt(6) + 1;
                int cpow = rpow.nextInt(6) + 1;
                int POW = apow + bpow + cpow;
                int MP = POW;
                int SAN = POW * 5;
                int Fortune = POW * 5;

                Random redu = new Random();
                int aedu = redu.nextInt(6) + 1;
                int bedu = redu.nextInt(6) + 1;
                int cedu = redu.nextInt(6) + 1;
                int EDU = aedu + bedu + cedu + 3;
                int Knowledge = EDU * 5;

                Random rsiz = new Random();
                int asiz = rsiz.nextInt(6) + 1;
                int bsiz = rsiz.nextInt(6) + 1;
                int SIZ = asiz + bsiz + 6;

                String DB = "0";
                int DBformula = STR + SIZ;             //DB計算用変数

                int HP = (SIZ + CON) / 2 ;

                if(DBformula <= 2){
                    DB = "-2D6";
                }else if(DBformula >= 2 && DBformula <= 12){
                    DB = "-1D6";
                }else if(DBformula >= 13 && DBformula <= 16){
                    DB = "-1D4";
                }else if(DBformula >= 17 && DBformula <= 24){
                    DB = "0";
                }else if(DBformula >= 25 && DBformula <= 32){
                    DB = "+1D4";
                }else if(DBformula >= 33 && DBformula <= 40){
                    DB = "+1D6";
                }else if(DBformula >= 41){
                    DB = "+2D6";
                }

                TextView StrText = (TextView)findViewById(R.id.StrText);
                StrText.setText(String.valueOf(STR));

                TextView IntText = (TextView)findViewById(R.id.IntText);
                IntText.setText(String.valueOf(INT));

                TextView DexText = (TextView)findViewById(R.id.DexText);
                DexText.setText(String.valueOf(DEX));

                TextView AppText = (TextView)findViewById(R.id.AppText);
                AppText.setText(String.valueOf(APP));

                TextView ConText = (TextView)findViewById(R.id.ConText);
                ConText.setText(String.valueOf(CON));

                TextView PowText = (TextView)findViewById(R.id.PowText);
                PowText.setText(String.valueOf(POW));

                TextView SizText = (TextView)findViewById(R.id.SizText);
                SizText.setText(String.valueOf(SIZ));

                TextView EduText = (TextView)findViewById(R.id.EduText);
                EduText.setText(String.valueOf(EDU));

                TextView IdeaText = (TextView)findViewById(R.id.IdeaText);
                IdeaText.setText(String.valueOf(Idea));

                TextView KnowledgeText = (TextView)findViewById(R.id.KnowledgeText);
                KnowledgeText.setText(String.valueOf(Knowledge));

                TextView HPText = (TextView)findViewById(R.id.HpText);
                HPText.setText(String.valueOf(HP));

                TextView MPText = (TextView)findViewById(R.id.MpText);
                MPText.setText(String.valueOf(MP));

                TextView FortuneText = (TextView)findViewById(R.id.FortuneText);
                FortuneText.setText(String.valueOf(Fortune));

                TextView DBText = (TextView)findViewById(R.id.dbText);
                DBText.setText(String.valueOf(DB));

                TextView SANText = (TextView)findViewById(R.id.SanText);
                SANText.setText(String.valueOf(SAN));
//
//                //edit()でオブジェクト取得
//                //Editor editor = pref.edit();
//                SharedPreferences.Editor StrText = strText.edit();
//                SharedPreferences.Editor IntText = intText.edit();
//                SharedPreferences.Editor IdeaText = ideaText.edit();
//                SharedPreferences.Editor DexText = dexText.edit();
//                SharedPreferences.Editor ConText = conText.edit();
//                SharedPreferences.Editor AppText = appText.edit();
//                SharedPreferences.Editor PowText = powText.edit();
//                SharedPreferences.Editor SanText = sanText.edit();
//                SharedPreferences.Editor SizText = sizText.edit();
//                SharedPreferences.Editor DBText  = dbText.edit();
//                SharedPreferences.Editor EduText = eduText.edit();
//                SharedPreferences.Editor KnowledgeText = knowledgeText.edit();
//
//                //保存する値がint型の場合、putInt()でキーと値を保存
//                //editor.putInt("id", userId);
//                StrText.putInt("StrText", STR);
//                IntText.putInt("IntText", INT);
//                IdeaText.putInt("IdeaText", Idea);
//                DexText.putInt("DexText", DEX);
//                ConText.putInt("ConText", CON);
//                AppText.putInt("AppText", APP);
//                PowText.putInt("PowText", POW);
//                PowText.putInt("SanText", SAN);
//                SizText.putInt("SizText", SIZ);
//                DBText.putString("DBText", DB);
//                EduText.putInt("IntText", EDU);
//                EduText.putInt("KnowledgeText", Knowledge);
//
//                //commit()で実際にファイルに書き込む
//                //editor.commit();
//                StrText.commit();
//                IntText.commit();
//                IdeaText.commit();
//                DexText.commit();
//                ConText.commit();
//                AppText.commit();
//                PowText.commit();
//                SanText.commit();
//                SizText.commit();
//                DBText.commit();
//                EduText.commit();
//                KnowledgeText.commit();
            }
        });
    }

    //戻るボタン無効化
    @Override
    public void onBackPressed() {
    }

}
