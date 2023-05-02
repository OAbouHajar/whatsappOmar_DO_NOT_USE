package com.facebook.redex;

import X.AnonymousClass02C;
import X.AnonymousClass05g;

public class IDxRCallbackShape214S0100000_I0 implements AnonymousClass05g {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape214S0100000_I0(AnonymousClass02C r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = X.AnonymousClass000.A0r(r0);
        r0.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r2.A0x(r3, r8.A00, r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r0 = X.AnonymousClass000.A0r(r0);
        r0.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        android.util.Log.w(r5, r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AM3(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0YD r8 = (X.AnonymousClass0YD) r8
            java.lang.Object r1 = r7.A00
            X.02C r1 = (X.AnonymousClass02C) r1
            java.util.ArrayDeque r0 = r1.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Y9 r0 = (X.AnonymousClass0Y9) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "No Activities were started for result for "
        L_0x0019:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r7)
        L_0x0020:
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r5, r0)
            return
        L_0x0028:
            X.0YD r8 = (X.AnonymousClass0YD) r8
            java.lang.Object r1 = r7.A00
            X.02C r1 = (X.AnonymousClass02C) r1
            java.util.ArrayDeque r0 = r1.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Y9 r0 = (X.AnonymousClass0Y9) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "No IntentSenders were started for "
            goto L_0x0019
        L_0x003d:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.065 r0 = r1.A0U
            X.01A r2 = r0.A00(r4)
            if (r2 != 0) goto L_0x00d3
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            goto L_0x005a
        L_0x004c:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.065 r0 = r1.A0U
            X.01A r2 = r0.A00(r4)
            if (r2 != 0) goto L_0x00d3
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
        L_0x005a:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r4)
            goto L_0x0020
        L_0x0062:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r1 = r8.keySet()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            int r0 = r3.size()
            int[] r6 = new int[r0]
            r2 = 0
        L_0x0081:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0098
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            r0 = -1
            if (r1 == 0) goto L_0x0093
            r0 = 0
        L_0x0093:
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x0081
        L_0x0098:
            java.lang.Object r4 = r7.A00
            X.02C r4 = (X.AnonymousClass02C) r4
            java.util.ArrayDeque r0 = r4.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Y9 r0 = (X.AnonymousClass0Y9) r0
            java.lang.String r3 = "FragmentManager"
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "No permissions were requested for "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r7)
        L_0x00b1:
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            return
        L_0x00b9:
            java.lang.String r2 = r0.A01
            int r1 = r0.A00
            X.065 r0 = r4.A0U
            X.01A r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            goto L_0x00b1
        L_0x00cf:
            r0.A0j(r1, r5, r6)
            return
        L_0x00d3:
            int r1 = r8.A00
            android.content.Intent r0 = r8.A01
            r2.A0x(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxRCallbackShape214S0100000_I0.AM3(java.lang.Object):void");
    }
}
