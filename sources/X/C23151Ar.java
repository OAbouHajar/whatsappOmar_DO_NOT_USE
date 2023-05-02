package X;

import com.AssemMods.translator.Language;

/* renamed from: X.1Ar  reason: invalid class name and case insensitive filesystem */
public class C23151Ar {
    public final C14710pd A00;
    public final C16490t9 A01;
    public final C23141Aq A02;
    public volatile Boolean A03;

    public C23151Ar(C14710pd r1, C16490t9 r2, C23141Aq r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final int A00(String str) {
        int hashCode = str.hashCode();
        return hashCode != 3551 ? (hashCode == 109935 || hashCode != 3005871 || !str.equals(Language.AUTO_DETECT)) ? 3 : 1 : str.equals("on") ? 2 : 3;
    }

    public void A01(int i2) {
        if (A04()) {
            C52322da r3 = new C52322da();
            r3.A09 = 1;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                C23141Aq r2 = this.A02;
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
            r3.A0G = this.A02.A00;
            r3.A08 = Integer.valueOf(i2);
            this.A01.A04(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r7 == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r6, int r7, int r8, long r9, boolean r11, boolean r12) {
        /*
            r5 = this;
            boolean r0 = r5.A04()
            if (r0 == 0) goto L_0x006b
            X.2da r2 = new X.2da
            r2.<init>()
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A09 = r0
            X.1Aq r0 = r5.A02
            java.lang.Long r0 = r0.A00
            r2.A0G = r0
            r0 = 2
            if (r11 == 0) goto L_0x001c
            r0 = 1
        L_0x001c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 100
            if (r7 == r0) goto L_0x0029
            r0 = 1
            if (r7 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            int r0 = A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            if (r12 == 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A0C = r0
            double r3 = (double) r9
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r2.A06 = r0
            java.lang.String r0 = ""
            r2.A0H = r0
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            X.0t9 r0 = r5.A01
            r0.A04(r2)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23151Ar.A02(java.lang.String, int, int, long, boolean, boolean):void");
    }

    public void A03(boolean z2, int i2) {
        if (A04()) {
            C52322da r2 = new C52322da();
            r2.A0G = this.A02.A00;
            r2.A02 = Boolean.TRUE;
            r2.A09 = 4;
            int i3 = 1;
            if (z2) {
                i3 = 2;
            }
            r2.A0B = Integer.valueOf(i3);
            r2.A0F = Long.valueOf((long) i2);
            this.A01.A04(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2.A0E(r1, 2012) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0026
            monitor-enter(r3)
            X.0pd r2 = r3.A00     // Catch:{ all -> 0x0023 }
            r0 = 2755(0xac3, float:3.86E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x0023 }
            boolean r0 = r2.A0E(r1, r0)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001a
            r0 = 2012(0x7dc, float:2.82E-42)
            boolean r1 = r2.A0E(r1, r0)     // Catch:{ all -> 0x0023 }
            r0 = 1
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0023 }
            r3.A03 = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0023 }
            throw r0
        L_0x0026:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r3.A03
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23151Ar.A04():boolean");
    }
}
