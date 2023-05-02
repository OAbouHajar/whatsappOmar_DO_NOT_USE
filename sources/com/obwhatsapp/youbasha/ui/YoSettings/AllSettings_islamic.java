package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import com.obwhatsapp.yo.yo;

public class AllSettings_islamic extends BasePreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yo.getID("yo_settings_Islamic", "layout"));
        addPreferencesFromResource(yo.getID("yo_Islamic_style", "xml"));
    }
}
