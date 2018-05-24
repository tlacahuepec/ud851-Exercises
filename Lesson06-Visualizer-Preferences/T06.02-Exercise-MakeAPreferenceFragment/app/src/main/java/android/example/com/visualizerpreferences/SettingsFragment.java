package android.example.com.visualizerpreferences;


import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by santi on 1/8/2018.
 */

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
