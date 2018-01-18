package com.example.a4163103.trpg_tool.Character;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;

import com.example.a4163103.trpg_tool.R;

/**
 * Created by 4163103 on 2017/12/19.
 */

public class MyConfigActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(android.R.id.content, new MyConfigFragment());
        fragmentTransaction.commit();

        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(this);



        // Key の設定
        checkBoxPreference.setKey(getString(R.string.app_name));
        // Title の設定
        checkBoxPreference.setTitle(R.string.app_name);

        // サマリーを設定
        //checkBoxPreference.setSummary(R.string.summary_checkbox_preference);
        // CheckBox が On の時のサマリーを設定
        checkBoxPreference.setSummaryOn("Summary On");
        // CheckBox が Off の時のサマリーを設定
        checkBoxPreference.setSummaryOff("Summary Off");

        // PrefenceScreen & PreferenceCategory
        PreferenceManager preferenceManager = getPreferenceManager();
        PreferenceScreen ps = preferenceManager.createPreferenceScreen(this);
        PreferenceCategory pc = new PreferenceCategory(this);
        // PreferenceCategory のタイトルを設定
        pc.setTitle(R.string.app_name);
        // PreferenceCategory を PreferenceScreen に追加
        ps.addPreference(pc);
        // Preference を PreferenceCategory に追加
        pc.addPreference(checkBoxPreference);
        // PreferenceScrren の設定
        setPreferenceScreen(ps);

        // Preference がチェックされているか
        checkBoxPreference.isChecked();
        // チェック状態を変更
        //checkBoxPreference.setChecked(true);

        // Preference が変更されたときに呼び出されるコールバックの登録
        checkBoxPreference.setOnPreferenceChangeListener(
                new Preference.OnPreferenceChangeListener() {
                    @Override
                    public boolean onPreferenceChange(
                            Preference preference,
                            Object newValue) {
                        // Preference が変更されたときの動作
                        return true;
                    }
                });
    }
}