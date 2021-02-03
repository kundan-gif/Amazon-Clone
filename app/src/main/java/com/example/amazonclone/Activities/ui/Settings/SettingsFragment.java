package com.example.amazonclone.Activities.ui.Settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.amazonclone.Activities.LoginActivityP;
import com.example.amazonclone.PreferenceClass.PreferenceHelper;
import com.example.amazonclone.R;
public class SettingsFragment extends PreferenceFragmentCompat {
private Preference preference;
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
        preference=findPreference("Sign Out");
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent=new Intent(getActivity(), LoginActivityP.class);
                startActivity(intent);
                return false;
            }
        });
    }

}