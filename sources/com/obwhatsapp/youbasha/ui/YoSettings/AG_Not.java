package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import com.obwhatsapp.yo.yo;

public class AG_Not extends BasePreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yo.getID("AG_Not", "layout"));
        addPreferencesFromResource(yo.getID("AG_Not", "xml"));
    }
}
