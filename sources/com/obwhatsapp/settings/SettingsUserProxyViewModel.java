package com.obwhatsapp.settings;

import X.AnonymousClass027;
import X.AnonymousClass124;
import X.AnonymousClass1S6;
import X.C003401n;
import X.C14870pt;
import X.C15860rz;
import X.C16320sq;
import X.C16440t3;
import X.C16470t7;
import X.C16600tK;
import X.C18950xW;
import X.C19090xk;
import X.C19310yE;
import X.C74773r5;
import X.C85994Qu;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.R;

public class SettingsUserProxyViewModel extends C003401n implements C18950xW {
    public Integer A00 = 0;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass027 A04 = new AnonymousClass027();
    public final AnonymousClass027 A05 = new AnonymousClass027();
    public final AnonymousClass027 A06 = new AnonymousClass027();
    public final C14870pt A07;
    public final C16600tK A08;
    public final C19310yE A09;
    public final C16440t3 A0A;
    public final C15860rz A0B;
    public final C19090xk A0C;
    public final AnonymousClass124 A0D;
    public final C85994Qu A0E;
    public final AnonymousClass1S6 A0F;
    public final C16320sq A0G;

    public SettingsUserProxyViewModel(C14870pt r2, C16600tK r3, C19310yE r4, C16440t3 r5, C15860rz r6, C19090xk r7, AnonymousClass124 r8, C85994Qu r9, AnonymousClass1S6 r10, C16320sq r11) {
        this.A0A = r5;
        this.A07 = r2;
        this.A0G = r11;
        this.A0D = r8;
        this.A0C = r7;
        this.A0E = r9;
        this.A0F = r10;
        this.A08 = r3;
        this.A0B = r6;
        this.A09 = r4;
    }

    public void A04() {
        this.A08.A03(this);
    }

    public void A05() {
        if (!this.A0F.A02() || this.A01 == null) {
            this.A03 = false;
            A06(4, false);
            this.A0D.A00();
            this.A0C.A0C((String) null, (String) null, 0, true, false, false, false, false, true);
            this.A07.A0K(new RunnableRunnableShape14S0100000_I0_13((Object) this, 37));
            return;
        }
        this.A07.A0K(new RunnableRunnableShape14S0100000_I0_13((Object) this, 39));
        this.A03 = true;
        A06(1, false);
        this.A0D.A00();
        this.A0C.A0C((String) null, (String) null, 0, true, false, false, false, false, true);
    }

    public void A06(int i2, boolean z2) {
        C85994Qu r3;
        boolean z3;
        this.A00 = Integer.valueOf(i2);
        if (!z2) {
            if (i2 == 2) {
                r3 = this.A0E;
                z3 = true;
            } else if (i2 == 3 || i2 == 4) {
                r3 = this.A0E;
                z3 = false;
            }
            Boolean valueOf = Boolean.valueOf(z3);
            C74773r5 r2 = new C74773r5();
            r2.A01 = null;
            r2.A00 = valueOf;
            if (!r3.A01.A04()) {
                r3.A00.A0A(r2, C16470t7.DEFAULT_SAMPLING_RATE);
            }
        }
        AnonymousClass027 r32 = this.A05;
        int intValue = this.A00.intValue();
        int i3 = R.string.str1376;
        if (intValue != 1) {
            i3 = R.string.str131f;
            if (intValue != 2) {
                i3 = R.string.str1123;
                if (intValue != 3) {
                    i3 = R.string.str1323;
                    if (intValue != 4) {
                        i3 = R.string.str1320;
                        if (intValue != 5) {
                            i3 = R.string.str1325;
                        }
                    }
                }
            }
        }
        r32.A09(Integer.valueOf(i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (X.C818149v.A00.matcher(r1).matches() != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A07(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r3 = 443(0x1bb, float:6.21E-43)
            r2 = r11
            if (r11 == 0) goto L_0x00bd
            java.lang.String r6 = ":"
            java.lang.String[] r5 = r11.split(r6)     // Catch:{ all -> 0x00ba }
            int r1 = r5.length     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00bd
            r0 = 1
            r4 = 0
            if (r1 != r0) goto L_0x003c
            r1 = r5[r4]     // Catch:{ all -> 0x00ba }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x00bd
            java.util.regex.Pattern r0 = X.C818149v.A00     // Catch:{ all -> 0x00ba }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r1.<init>()     // Catch:{ all -> 0x00ba }
            r0 = r5[r4]     // Catch:{ all -> 0x00ba }
            r1.append(r0)     // Catch:{ all -> 0x00ba }
            r1.append(r6)     // Catch:{ all -> 0x00ba }
            r1.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x00ba }
            goto L_0x0053
        L_0x003c:
            r0 = 2
            if (r1 != r0) goto L_0x00bd
            r1 = r5[r4]     // Catch:{ all -> 0x00ba }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x00bd
            java.util.regex.Pattern r0 = X.C818149v.A00     // Catch:{ all -> 0x00ba }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00bd
        L_0x0053:
            if (r2 == 0) goto L_0x00bd
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r0
            r0 = 2
            java.lang.String[] r1 = r2.split(r6, r0)     // Catch:{ all -> 0x00ba }
            r0 = 0
            r0 = r1[r0]     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r0)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            r9 = 1
            r0 = r1[r9]     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            short r0 = java.lang.Short.parseShort(r0)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            java.lang.Short r5 = java.lang.Short.valueOf(r0)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            r8 = 0
            if (r0 != r3) goto L_0x007c
            r8 = 1
        L_0x007c:
            r7 = 3
            X.1mS r3 = new X.1mS     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ NumberFormatException | UnknownHostException -> 0x00a7 }
            if (r2 == 0) goto L_0x00bd
            X.4Qu r0 = r10.A0E     // Catch:{ all -> 0x00ba }
            r0.A00(r9)     // Catch:{ all -> 0x00ba }
            X.1S6 r1 = r10.A0F     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = r2.second     // Catch:{ all -> 0x00ba }
            X.1mS r0 = (X.C35761mS) r0     // Catch:{ all -> 0x00ba }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00ba }
            r1.A01(r0)     // Catch:{ all -> 0x00ba }
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ba }
            r10.A01 = r1     // Catch:{ all -> 0x00ba }
            X.027 r0 = r10.A04     // Catch:{ all -> 0x00ba }
            r0.A09(r1)     // Catch:{ all -> 0x00ba }
            monitor-exit(r10)
            return r9
        L_0x00a7:
            r2 = move-exception
            java.lang.String r1 = "SettingsManualProxyViewModel/buildDNSCacheEntry/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r0.<init>(r1)     // Catch:{ all -> 0x00ba }
            r0.append(r11)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ba }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00ba }
            goto L_0x00bd
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00bd:
            r0 = 0
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.SettingsUserProxyViewModel.A07(java.lang.String):boolean");
    }

    public void ARy() {
        if (this.A03) {
            A06(2, false);
        }
    }

    public void ARz() {
        A06(1, false);
    }

    public void AS0() {
        int i2 = 5;
        if (this.A09.A02()) {
            i2 = 4;
        }
        A06(i2, false);
    }

    public /* synthetic */ void AS1() {
    }
}
