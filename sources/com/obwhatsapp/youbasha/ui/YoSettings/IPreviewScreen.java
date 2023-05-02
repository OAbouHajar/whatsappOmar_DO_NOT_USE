package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.os.Handler;

public interface IPreviewScreen extends SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Handler mHandler = new Handler();

    static {
        String str = "ۧۜۥۘۧ۬ۤۗۥۚۦۛۖۘۚۖۗۨۡۡۘۘ۫";
        while (true) {
            switch ((str.hashCode() ^ 130) ^ 1780661247) {
                case -876060977:
                    str = "۟ۥۛ۟ۦۧۨۘۜۖۥۘ۠ۤۨۘ";
                    break;
                case -160709311:
                    return;
            }
        }
    }

    void initPreview();

    void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str);

    void updatePreview();
}
