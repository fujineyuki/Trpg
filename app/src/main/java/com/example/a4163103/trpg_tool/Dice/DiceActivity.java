package com.example.a4163103.trpg_tool.Dice;


import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.a4163103.trpg_tool.R;

import java.util.Arrays;
import java.util.Random;

public class DiceActivity extends Activity implements View.OnClickListener {
    private final static int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    TextView tv2;
    TextView tv7;
    Button button1;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        String q = new String();
        tv2 = (TextView) findViewById(R.id.text2);;

        Spinner spinner = (Spinner) findViewById(R.id.kahendaisu);
        int idx = spinner.getSelectedItemPosition();
        int o = idx;


        q = "100面ダイス";
        button1 = (Button) findViewById(R.id.button100);
        button1.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.kahensu);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.taikoudaisu);
        button5.setOnClickListener(this);
        tv2.setText(String.valueOf(q));
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加
        adapter.add(1);
        adapter.add(2);
        adapter.add(3);
        adapter.add(4);
        adapter.add(5);
        adapter.add(6);
        adapter.add(8);
        adapter.add(10);
        adapter.add(12);
        adapter.add(15);
        adapter.add(18);
        adapter.add(24);
        Spinner spinner1 = (Spinner) findViewById(R.id.kahenkosuu);
        spinner1.setAdapter(adapter);

        ArrayAdapter<Integer> adapter1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加
        adapter1.add(2);
        adapter1.add(3);
        adapter1.add(4);
        adapter1.add(5);
        adapter1.add(6);
        adapter1.add(7);
        adapter1.add(8);
        adapter1.add(9);
        adapter1.add(10);
        adapter1.add(12);
        adapter1.add(20);
        adapter1.add(100);
        Spinner spinner2 = (Spinner) findViewById(R.id.kahendaisu);

        spinner2.setAdapter(adapter1);


        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加
        for (int i = 3; i <= 40; i++) adapter2.add(i);
        Spinner spinner3 = (Spinner) findViewById(R.id.zyudouSp);
        spinner3.setAdapter(adapter2);

        ArrayAdapter<Integer> adapter3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加
        for (int i = 3; i <= 40; i++) adapter3.add(i);
        Spinner spinner4 = (Spinner) findViewById(R.id.noudouSp);
        spinner4.setAdapter(adapter3);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }


    @Override
    public void onClick(View v) {
        if (v == button1) {
            Random r = new Random();
            String w = new String();
            int n = r.nextInt(100);
            if (n == 0) {
                n = 100;
            }
            if (n >= 96) {
                w = "ファンブル";
            } else if (n <= 5) {
                w = "クリティカル";
            } else w = " ";
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("今回のダイスは" + n + "\n" + w)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            builder.show();
        }else if (v == button4) {
            Spinner item = (Spinner) findViewById(R.id.kahenkosuu);
// 選択したアイテムを取得
            int sa = (int) item.getSelectedItem();

            ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加

            Spinner item2 = (Spinner) findViewById(R.id.kahendaisu);
// 選択したアイテムを取得
            int sa1 = (int) item2.getSelectedItem();


            Random daisu = new Random();
            int kahen[] = new int[sa];
            int kaheng = 0;
            for (int i = 0; i < sa; i++) {
                int sw = daisu.nextInt(sa1);
                sw++;
                kahen[i] = sw;

                adapter2.add(kahen[i]);


                kaheng += sw;
            }

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("今回のダイスは" + kaheng + "\n" + Arrays.toString(kahen))
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            builder.show();


        } else if (v == button5) {

            Random r = new Random();
            String w = new String();
            String s = "失敗";
            String win = "成功";
            int noudaisu = r.nextInt(100);
            int noudou;
            ArrayAdapter<Integer> adapter3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner item3 = (Spinner) findViewById(R.id.zyudouSp);
// 選択したアイテムを取得
            int sa2 = (int) item3.getSelectedItem();

            ArrayAdapter<Integer> adapter4 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item);
            adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加

            Spinner item4 = (Spinner) findViewById(R.id.noudouSp);

            int sa3 = (int) item4.getSelectedItem();


            noudou = sa2 - sa3;
            noudou = 50 + (noudou * 5);
            String string = String.valueOf(s);
            if (noudou <= 0){w = s;}
            else if (noudou >= 100){ w = win;}
            else {

                if (noudaisu <= noudou) w = win;
                else if (noudaisu > noudou) w = s;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("対抗ダイスの結果は" + noudaisu + "\n" + w)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            builder.show();
        }
    }
}
