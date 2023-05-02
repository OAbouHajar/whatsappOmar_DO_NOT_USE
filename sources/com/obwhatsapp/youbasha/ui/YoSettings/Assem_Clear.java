package com.obwhatsapp.youbasha.ui.YoSettings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.Preference;
import com.obwhatsapp.yo.yo;
import m.A_Clear;

public class Assem_Clear extends BasePreferenceActivity {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1140g = 0;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c() {
        /*
            r10 = this;
            r2 = 0
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            r1.<init>()     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = com.obwhatsapp.yo.yo.datafolder     // Catch:{ Exception -> 0x004e }
            r1.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "files/Logs"
            r1.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x004e }
            com.obwhatsapp.yo.r1 r1 = new com.obwhatsapp.yo.r1     // Catch:{ Exception -> 0x004e }
            r4 = 10
            r1.<init>(r4)     // Catch:{ Exception -> 0x004e }
            java.io.File[] r4 = r0.listFiles(r1)     // Catch:{ Exception -> 0x004e }
            int r5 = r4.length     // Catch:{ Exception -> 0x004e }
            r0 = 0
        L_0x0027:
            r6 = -225519687(0xfffffffff28ed7b9, float:-5.658581E30)
            java.lang.String r1 = "۬ۖۡ۬ۙۛۚ۠ۦۘۤۡ۫ۤ۠۫ۖۚۗۢ۠ۡ۬ۖۥۢۢ"
        L_0x002c:
            int r7 = r1.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1095077060: goto L_0x0040;
                case -449360004: goto L_0x004f;
                case -328988740: goto L_0x0035;
                case -319672638: goto L_0x003b;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r1 = "۫۫ۘۘۡۥۦۙۡ۫ۡۡۥۦۦۙ۠ۧۨۘۢۡۥۘ۬ۢۙ"
            goto L_0x002c
        L_0x0038:
            java.lang.String r1 = "۠ۙۘۧۙۚۗۡۜۗۥۤۨۥۡۛ۠ۡ"
            goto L_0x002c
        L_0x003b:
            if (r0 >= r5) goto L_0x0038
            java.lang.String r1 = "ۥۛۦۘۛۛۖۚۖۜۡ۠ۧۡۜ۟ۙۙ۠۬ۘۥۢۨۘۢۜ"
            goto L_0x002c
        L_0x0040:
            r1 = r4[r0]     // Catch:{ Exception -> 0x004e }
            long r6 = r1.length()     // Catch:{ Exception -> 0x004e }
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r6 / r8
            long r2 = r2 + r6
            int r0 = r0 + 1
            goto L_0x0027
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.Assem_Clear.c():long");
    }

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        super.onCreatePrivate(bundle);
        setContentView(yo.getID("Assem_Clear", "layout"));
        addPreferencesFromResource(yo.getID("Assem_Clear", "xml"));
        Preference findPreference = findPreference("clear_logs");
        findPreference.setSummary(c() + " MB");
        findPreference.setOnPreferenceClickListener(new A_Clear(this, 1));
    }
}
