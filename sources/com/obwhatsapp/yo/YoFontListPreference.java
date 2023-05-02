package com.obwhatsapp.yo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.TextView;
import c.d;

public class YoFontListPreference extends ListPreference {

    /* renamed from: a  reason: collision with root package name */
    public static int f605a;
    public static AssetManager astm;

    /* renamed from: b  reason: collision with root package name */
    public int f606b;

    /* renamed from: c  reason: collision with root package name */
    public String f607c;

    public YoFontListPreference(Context context) {
        super(context);
    }

    public YoFontListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(YoFontListPreference yoFontListPreference, TextView textView, CharSequence charSequence) {
        yoFontListPreference.getClass();
        try {
            AssetManager assetManager = astm;
            textView.setTypeface(Typeface.createFromAsset(assetManager, "fonts/" + charSequence + ".ttf"));
            textView.setTextColor(ColorStore.getPrimaryTextColor());
            String str = "ۢۨۛۥ۠ۦۘۛۨۦۘۖۗۚ۠ۤ۬ۨ۫ۡۘ";
            while (true) {
                switch (str.hashCode() ^ -1694612877) {
                    case -400940059:
                        str = "۟ۖ۟ۜۚۡۧۜۜۙۨۘۜ۠ۡۘۛۨۘ";
                        break;
                    case 273392921:
                        if (!charSequence.equals(yoFontListPreference.f607c)) {
                            str = "۠ۡ۬ۖۧۡۡ۬ۡۦۥۤۥۡ";
                            break;
                        } else {
                            str = "ۛۧۧۨ۠ۦۘ۬ۤۡۘۙۧۛۚۦ۟ۛۤۥۘۧۗۘۙۡۘۜۡۙ";
                            break;
                        }
                    case 388450083:
                        return;
                    case 1231389696:
                        textView.setBackgroundColor(Color.parseColor("#84DFDFDF"));
                        return;
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r0 = "ۙۘۥۘۚۡ۫ۤۨ۫۬۟۫ۥۙ۟ۡۥۙۖ۟ۨۦۗۗۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDialogClosed(boolean r8) {
        /*
            r7 = this;
            r2 = 0
            r3 = 0
            java.lang.String r0 = "ۚۤۡۙ۫ۦۖۡۨۘۙ۠ۛۦۥۤۘ۬ۥ۠ۤۥ"
            r1 = r2
            r4 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r5 = 816(0x330, float:1.143E-42)
            r6 = 1640812660(0x61ccd074, float:4.7226955E20)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1720410139: goto L_0x004b;
                case -1597988721: goto L_0x0045;
                case -1435719388: goto L_0x00ae;
                case -1233637622: goto L_0x001b;
                case -995554438: goto L_0x0067;
                case 62608899: goto L_0x0021;
                case 110630774: goto L_0x0083;
                case 286903453: goto L_0x0015;
                case 715478401: goto L_0x00b9;
                case 1088760294: goto L_0x008d;
                case 1698268410: goto L_0x0018;
                case 1787620545: goto L_0x0029;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۘ۠ۡۘۛۘۜۗۥۥۚۡۘۘۦۥۡۢۚۗۗ۠ۛ۟ۢۘ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "ۚۚۦۙۢۥۘۤ۬ۖۦۨۥۘ۬ۧ۟۟ۦۢۢۗۜۢۘۖۚۗ"
            goto L_0x0006
        L_0x001b:
            super.onDialogClosed(r8)
            java.lang.String r0 = "ۚۙۙۘۦۦۘۦ۟ۘۢۚۘۘۦ۬ۜۘۢۘۘۜۡۦۥۥۨۘ۟ۖ۬"
            goto L_0x0006
        L_0x0021:
            java.lang.CharSequence[] r2 = r7.getEntryValues()
            java.lang.String r0 = "ۚۛۨۤۤۛۡۛۦۘ۬ۨۘۙۢ"
            r4 = r2
            goto L_0x0006
        L_0x0029:
            r2 = 1274613641(0x4bf90f89, float:3.2644882E7)
            java.lang.String r0 = "۟ۢۧ۬ۘ۠ۢۜۢۧۙۥۡ"
        L_0x002e:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1638056842: goto L_0x0042;
                case -468435501: goto L_0x00b5;
                case -463022116: goto L_0x0037;
                case 877214799: goto L_0x003d;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "ۡۚ۫ۥۨۡۘۥۦۘۘۖۚۡۢۙۨۘۤۦۦۘ"
            goto L_0x0006
        L_0x003a:
            java.lang.String r0 = "۠ۦۢۘۨۥ۟ۜۜۘۦۙ۟ۦۦۖۘ۬۬ۖ"
            goto L_0x002e
        L_0x003d:
            if (r8 == 0) goto L_0x003a
            java.lang.String r0 = "ۧ۠ۖۥۜۡۘۜۤۡۡۙۢۨۦۙ"
            goto L_0x002e
        L_0x0042:
            java.lang.String r0 = "ۡ۟ۨ۬ۨ۠ۙ۟ۧۘۛۧۧۡۘۘۚۜۜۘ"
            goto L_0x002e
        L_0x0045:
            int r2 = r7.f606b
            java.lang.String r0 = "ۘۙۘۖۨۘۘۛۖۡۢ۠ۦۡۥۛۡ۠۬"
            r3 = r2
            goto L_0x0006
        L_0x004b:
            r2 = -435377431(0xffffffffe60caae9, float:-1.6607101E23)
            java.lang.String r0 = "۫ۘۤۧۛ۫ۖۡۥۨۘۖۙۢ۠ۚۥۢۡۜۘۧۙ"
        L_0x0050:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1498023422: goto L_0x0064;
                case -1092877754: goto L_0x0059;
                case 1446598736: goto L_0x00b5;
                case 2144705450: goto L_0x005f;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ۧۤۘ۬ۨۜۘۡۡ۫ۤ۠ۜۘۦۨۧ۫۬ۨۘۢۖۘ"
            goto L_0x0006
        L_0x005c:
            java.lang.String r0 = "ۤ۫ۜۘۢ۠ۜۚ۟۬۠ۧ۫ۖۦۧۘ"
            goto L_0x0050
        L_0x005f:
            if (r3 < 0) goto L_0x005c
            java.lang.String r0 = "۠ۜ۟ۤۖۙ۠ۜۧ۬ۧۡۘۧ۠ۨۘۡۦۦ۠ۘۘۘ۬ۙۥۘ۟ۙۜ"
            goto L_0x0050
        L_0x0064:
            java.lang.String r0 = "۟ۦۜۦۦۜۖۦۗۖۘۘ۬ۥۦۘۤ۬ۡۨ۫۬۟ۧۖۗۦۛ"
            goto L_0x0050
        L_0x0067:
            r2 = 409915797(0x186ed195, float:3.086659E-24)
            java.lang.String r0 = "ۘ۠ۙۛ۬ۨۜۛۘۖۤۙ۬۫۫ۨۤۛۨۚۤۢ۠ۡ"
        L_0x006c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1828970084: goto L_0x007d;
                case -1794409927: goto L_0x00b5;
                case -561602487: goto L_0x0075;
                case 30262173: goto L_0x0080;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            java.lang.String r0 = "ۖ۠ۜۦۖۦۘ۬ۘۥۘ۟ۦۧۧۢ۫ۜۥۗۚۘ"
            goto L_0x006c
        L_0x007a:
            java.lang.String r0 = "ۘۗۖۘ۠ۧۢ۬ۥۦۘۖۙۥ۫ۤ۬ۘۖۥۘ۫۠ۘۖۧۘۘۥۢۖ"
            goto L_0x006c
        L_0x007d:
            java.lang.String r0 = "۫۟ۧۚۙ۬ۢۘۚۥۧ۫ۨۚۙ"
            goto L_0x006c
        L_0x0080:
            java.lang.String r0 = "ۙۢۥۘۥۤۧ۠ۗۙۛۚۤۗۘ۬ۜۙۦ۠ۥۜۢۧ۫ۛۥۘ"
            goto L_0x0006
        L_0x0083:
            r0 = r4[r3]
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ۛۤۡۘۜۛۖۙ۫۠ۛۘۜۘۜۡۨۘ۬ۤ۠ۤۙۧۚۤۛ"
            goto L_0x0006
        L_0x008d:
            r2 = -225062477(0xfffffffff295d1b3, float:-5.9349475E30)
            java.lang.String r0 = "۬ۦ۠ۖۡۖۘۥۗۥۘۤۦۢۛۚۢۚۥۗ۟۫۟ۢ۫ۥۡۘ۫"
        L_0x0092:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1378505334: goto L_0x00b5;
                case -844472254: goto L_0x00aa;
                case 1291663484: goto L_0x00a7;
                case 1493663913: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x0092
        L_0x009b:
            boolean r0 = r7.callChangeListener(r1)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "ۢۡۧۘۜۧۜۘۤۛۜۧۗۚۨ۠ۜۧۧۤۖۢۛۖۖۢ"
            goto L_0x0092
        L_0x00a4:
            java.lang.String r0 = "ۧۡۤ۟ۧۡۚۜۡۘۖۛۖۘۦۢۛۜۢۘۘۥۖۦۘ"
            goto L_0x0092
        L_0x00a7:
            java.lang.String r0 = "ۚۗۦۡۨۡ۠ۜۢۜۜۚۦۦۧۘۥۙۥۘۨۦۜۨۖ۠"
            goto L_0x0092
        L_0x00aa:
            java.lang.String r0 = "ۡۘۦۤۗۨۘۦۘۨۙ۬ۘۢۛۨ۟ۙۡۘ۫۫ۜ۫ۘۜۘ۠۟ۥ"
            goto L_0x0006
        L_0x00ae:
            r7.setValue(r1)
            java.lang.String r0 = "ۙۘۥۘۚۡ۫ۤۨ۫۬۟۫ۥۙ۟ۡۥۙۖ۟ۨۦۗۗۙ"
            goto L_0x0006
        L_0x00b5:
            java.lang.String r0 = "ۙۘۥۘۚۡ۫ۤۨ۫۬۟۫ۥۙ۟ۡۥۙۖ۟ۨۦۗۗۙ"
            goto L_0x0006
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.YoFontListPreference.onDialogClosed(boolean):void");
    }

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        int i2 = 0;
        String str = "ۥۢۨۥۗۚ۟ۡۡۘۦۚۙ۟ۥۘۡ۟ۧۧۗ۟۟ۗۛۢ";
        x0 x0Var = null;
        CharSequence[] charSequenceArr = null;
        CharSequence[] charSequenceArr2 = null;
        while (true) {
            switch ((str.hashCode() ^ 20) ^ -1433135076) {
                case -1925742720:
                    str = "ۥۙۤۙ۟ۦۥۙۗۙۙۖ۟ۡۨۢۖ۠ۖۙۛۛۗۨۖ";
                    break;
                case -1200349466:
                    builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
                    str = "ۗۦۛۗۦۘۘۗۘۜۚۙۘۘ۫ۜ۫";
                    break;
                case -1054245391:
                    str = "ۢ۟ۧۨۢۛۜۥۛۢ۠۫ۤۤۚ";
                    break;
                case -1001747856:
                    i2 = findIndexOfValue(getValue());
                    str = "ۥۚۨۘۨۖۥۛۖۜۘۦۘ۬ۗۢ۫";
                    break;
                case -449353876:
                    builder.setSingleChoiceItems(x0Var, i2, new d(this, 5));
                    str = "ۧۘ۬۬۬ۚ۬۠۬ۜۛۤ۟ۦۤۦ۬ۡۘ";
                    break;
                case -232848313:
                    this.f606b = i2;
                    str = "۠ۜۖۚۤۛ۠۟ۙۤۖۧۘۜ۟ۛ۫ۙۖۘۦۧۡۘۗۤۦ۬ۤۛ";
                    break;
                case -158151936:
                    super.onPrepareDialogBuilder(builder);
                    str = "ۜۦۖۘ۫ۨۥۙۡۘۘۡ۬ۜۛۘۢۤ۫ۦۗۨۢۖۖ";
                    break;
                case -145161069:
                    return;
                case 373840579:
                    this.f607c = shp.getFontName();
                    str = "۫ۜۖۡۡۡۘۢۗۜۘۦۜۛۡۥ۫ۤۗۛۧۖۚۜۖۖۘۗۖۜۘ";
                    break;
                case 797693418:
                    charSequenceArr = getEntryValues();
                    str = "ۚۦۧۚۚۨۘۜۢ۟ۨۥۧۗۨۙۦۜ۟ۢۡۘۢ۠ۥ";
                    break;
                case 1391240577:
                    x0Var = new x0(this, charSequenceArr2, charSequenceArr);
                    str = "ۜۜۜۘۘۜۗۙۧۨۨ۠۬ۧ۫ۡۘۤۛۛ";
                    break;
                case 1959279394:
                    charSequenceArr2 = getEntries();
                    str = "ۚۢۘ۠۫ۖۘۥ۠ۜۘۤۥۦۘۘۙۘۘۛۚۦۘۢۥۧۘۥۜۡۖۗ۠";
                    break;
            }
        }
    }

    public boolean persistString(String str) {
        String str2 = "ۚۖۛ۫۫۬ۚۡۨ۟ۧۡۘۤ۬ۡۧۛۜۘۧۖۡۘۤۛۙۡۥۜ";
        while (true) {
            switch ((str2.hashCode() ^ 540) ^ -271530078) {
                case -1142411913:
                    return super.persistString(str);
                case -1130982676:
                    str2 = "۟۫۟ۗۨۗۖ۟ۤ۟ۗۤۙۧ۟ۧ۠ۥۚۨۗۨۛۨ";
                    break;
                case -808410603:
                    str2 = "۟ۙۦۡۥۜ۫ۢۘۡ۟ۢۗ۫ۤۛۚۘۘ۠ۛ۟ۘۥۜۘۖۗۗ";
                    break;
            }
        }
    }
}
