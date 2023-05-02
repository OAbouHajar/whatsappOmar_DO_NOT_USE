package com.mod.bomfab.bomb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import com.mod.bomfab.utils.Tools;

public class AturUlang extends DialogPreference {
    protected Context context;

    public AturUlang(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i2) {
        super.onClick(dialogInterface, i2);
        if (i2 == -1) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
            edit.clear();
            PreferenceManager.setDefaultValues(this.context, Tools.intXml("settings"), true);
            edit.commit();
            getOnPreferenceChangeListener().onPreferenceChange(this, new Boolean(true));
        }
    }
}
