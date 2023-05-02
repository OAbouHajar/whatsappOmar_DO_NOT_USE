package com.obwhatsapp.youbasha.backuprestore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

@SuppressLint({"AppCompatCustomView"})
public class RestoreBtn extends Button implements View.OnClickListener {
    public RestoreBtn(Context context) {
        super(context);
        init();
    }

    public RestoreBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RestoreBtn(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    public void init() {
        String str = "ۢۦۢۛۘۜۗ۫ۛۡۨۥۦۖۥۖۖۘ۠۬ۨ";
        while (true) {
            switch ((str.hashCode() ^ 320) ^ 1666306443) {
                case -1925705145:
                    return;
                case -1082763128:
                    setBackgroundColor(Color.parseColor("#ffea0038"));
                    str = "ۥۧۢ۟ۧۥ۫ۡۤۤۧۚ۟ۥۘ";
                    break;
                case 351100586:
                    str = "ۤۨۦ۠ۛۨۘۤۚۤۧۨۨۜ۟ۢۘۜۘۘ";
                    break;
                case 411335990:
                    setOnClickListener(this);
                    str = "۬ۨۗۥۛۜۚۛ۬ۗۧ۬ۤۜۘ۫ۜۜ۫ۙۘ";
                    break;
            }
        }
    }

    public void onClick(View view) {
        String str = "ۧۦۚۢۥۧۘۦۚۚۜۙۜۘۖۖۚۖۘۦۤۤۦۙۢ";
        while (true) {
            switch ((str.hashCode() ^ 740) ^ 1091862916) {
                case -1869562653:
                    return;
                case -62211276:
                    Controller.restoreBackup(getContext());
                    str = "ۥۧۚۡ۫ۥۜ۟ۚ۬ۘۘۘۖ۟۬";
                    break;
                case 1095423635:
                    str = "ۗۙۥۘۢۤۖۘۚۜۙۤۛ۠ۘۗۗۖۜۘۛۨۛۗ۫ۡۘ";
                    break;
                case 1580488469:
                    str = "ۨۛۨۡۤۡۘ۫۟۟۬ۨۡۘۤۛۙ";
                    break;
            }
        }
    }
}
