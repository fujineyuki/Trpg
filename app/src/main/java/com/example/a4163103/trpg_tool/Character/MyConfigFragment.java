package com.example.a4163103.trpg_tool.Character;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

import com.example.a4163103.trpg_tool.R;

/**
 * Created by 4163103 on 2017/12/19.
 */

public class MyConfigFragment extends PreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.ginoutiitirann_ver2);

    }

}