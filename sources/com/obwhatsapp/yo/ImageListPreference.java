package com.obwhatsapp.yo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.ListPreference;
import android.util.AttributeSet;

public class ImageListPreference extends ListPreference {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f549a;

    /* renamed from: b  reason: collision with root package name */
    public final int f550b = yo.getID("yo_imgpref", "layout");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{yo.getID("entryImages", "attr")});
        String[] stringArray = context.getResources().getStringArray(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndexCount() - 1, -1));
        this.f549a = new int[stringArray.length];
        while (true) {
            String str = "ۦۜ۫ۡۥۦۘۚۙۖۖ۟ۨۘۡ۟ۦۘۛ۟ۧ۟ۦۤۖۧۥ";
            while (true) {
                switch (str.hashCode() ^ 974279025) {
                    case -1386416524:
                        if (i2 >= stringArray.length) {
                            str = "ۖ۟ۡ۟ۜۧۘۛۦۖۙۢۦۘۨۗۧۗ۬ۜ";
                            break;
                        } else {
                            str = "ۜۖۜۘۙۚۥۘۛ۫ۡۖ۟ۚ۟ۘۦ";
                            break;
                        }
                    case -599100081:
                        this.f549a[i2] = yo.getID(stringArray[i2], "drawable");
                        i2++;
                    case -252053742:
                        str = "ۧ۫ۖۛۨ۬ۦۥۘۘۚۨ۫ۗۤۜۘۨ۟ۥۘ۠ۢۤ";
                        break;
                    case 1529342558:
                        obtainStyledAttributes.recycle();
                        return;
                }
            }
        }
    }

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        String str = "۬۫ۚۡ۠ۡۗ۬ۦ۠ۨ۟ۡۡۜ۬ۚۜۘۧۧۦ۟ۖۙ";
        while (true) {
            switch ((str.hashCode() ^ 73) ^ -1878082771) {
                case -1890614163:
                    return;
                case -1653594610:
                    builder.setAdapter(new ImageArrayAdapter(getContext(), this.f550b, getEntries(), this.f549a, findIndexOfValue(getSharedPreferences().getString(getKey(), "1"))), this);
                    str = "ۦۘۜۜ۠ۡۤۥ۫ۥۜ۠ۖۧۧۤۥۨۘۦ۬ۨۘ۠۠ۨ۟ۥۜ";
                    break;
                case -520037498:
                    str = "ۤۛۖۨ۟ۜۘۙۚۘ۬۟ۜۨۥۧۤۙۜۙۧۥۘۨۥۘۘۨۡۢ";
                    break;
                case 939858321:
                    str = "ۘۛۜ۟ۗۥۖۖ۫ۖۖ۟ۘۘ۟ۤۜۨۘ۠ۧۨ";
                    break;
                case 1078539645:
                    super.onPrepareDialogBuilder(builder);
                    str = "ۡۥۥۘ۫ۨۡۛۨۥۘۤۚۖۘۘ۟ۨۛۜۡۦۗۦۗۧ۬ۧۚۧ";
                    break;
            }
        }
    }
}
