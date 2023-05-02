package com.AssemMods.accounts.WAclass;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;

@SuppressLint({"AppCompatCustomView"})
public class EULA extends BaseSettingsActivity implements View.OnClickListener {
    public static void _onCreate(Activity activity) {
        View findViewById = activity.findViewById(yo.getID("show_accounts", "id"));
        if (findViewById != null) {
            ((WaButton) findViewById).setOnClickListener(new waclass1(activity));
        }
    }
}
