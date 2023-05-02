package com.AssemMods.fakechat.preference;

import android.content.Intent;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.yo.yo;

public class BaseSettingsActivity extends BaseActivity {
    public static boolean mustRestart;

    public static void restartHome() {
        Intent intent = new Intent(yo.getCtx(), HomeActivity.class);
        intent.setFlags(268435456);
        yo.getCtx().startActivity(intent);
        System.exit(0);
    }
}
