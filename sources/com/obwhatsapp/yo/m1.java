package com.obwhatsapp.yo;

import android.os.LocaleList;
import java.util.Locale;

public abstract /* synthetic */ class m1 {
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* bridge */ /* synthetic */ android.os.LocaleList a() {
        /*
            java.lang.String r0 = "ۛۥۖۘ۟ۨۡۦۡۜۘ۠ۢ۬ۙۘۙ۬ۘۧ۟ۙۘۘۢۙ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 51
            r3 = 671564854(0x28074436, float:7.508796E-15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -196366813: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.m1.a():android.os.LocaleList");
    }

    public static /* bridge */ /* synthetic */ Locale b(LocaleList localeList) {
        String str = "ۗ۟ۡۛۘۗۢ۠۬ۘۢۜ۟ۙۢۘ۬ۡۤۗۗۥۖۧ";
        while (true) {
            switch ((str.hashCode() ^ 276) ^ -1797076809) {
                case -1460976065:
                    str = "ۥۘۥۘۘۛۦۘۛۡۚۡۧۖۘۦۤۨۘۛۗ۬ۧۘۗۙۤۥۡ۬ۥۘ";
                    break;
                case -425812048:
                    return localeList.get(0);
            }
        }
    }
}
