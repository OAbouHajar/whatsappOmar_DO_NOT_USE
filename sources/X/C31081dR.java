package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1dR  reason: invalid class name and case insensitive filesystem */
public class C31081dR {
    public long A00;
    public AnonymousClass2IV A01;
    public boolean A02;
    public final long A03;
    public final C16440t3 A04;
    public final C16490t9 A05;
    public final C31091dS A06;
    public final AnonymousClass17S A07;
    public final C19500yX A08;
    public final String A09;

    public C31081dR(C16440t3 r8, C16490t9 r9, AnonymousClass17S r10, C19500yX r11, String str, int i2) {
        this(r8, r9, new C31091dS(i2), r10, r11, str);
    }

    public C31081dR(C16440t3 r3, C16490t9 r4, C31091dS r5, AnonymousClass17S r6, C19500yX r7, String str) {
        this.A00 = -1;
        this.A02 = false;
        this.A08 = r7;
        this.A09 = str;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = System.nanoTime();
        this.A07 = r6;
    }

    public final void A00() {
        AnonymousClass2IV r8 = this.A01;
        if (r8 != null && !this.A02) {
            r8.A03 = Integer.valueOf(this.A06.A00);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanoTime = System.nanoTime();
            long j2 = this.A00;
            if (j2 <= 0) {
                j2 = this.A03;
            }
            r8.A06 = Long.valueOf(timeUnit.convert(nanoTime - j2, TimeUnit.NANOSECONDS));
            this.A05.A06(this.A01);
            this.A02 = true;
        }
    }

    public void A01(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A03(i2, sb.toString());
    }

    public void A02(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A03(i2, sb.toString());
    }

    public void A03(int i2, String str) {
        int i3;
        C31091dS r1 = this.A06;
        if (r1.A03 && (i3 = r1.A05) > 0) {
            this.A08.AL9(i3, str, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4.A05 <= 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            r2 = -1
            X.1dS r4 = r8.A06
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x000d
            int r0 = r4.A05
            r1 = 1
            if (r0 > 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r1 != 0) goto L_0x0015
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            r8.A00 = r2
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0022
            X.2IV r0 = new X.2IV
            r0.<init>()
            r8.A01 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0014
            X.17S r2 = r8.A07
            int r5 = r4.A05
            boolean r1 = r4.A02
            java.lang.String r3 = "perf_origin"
            java.lang.String r4 = "Censored"
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x0014
        L_0x0036:
            X.0yX r2 = r2.A01
            r6 = r9
            r7 = r11
            r2.ALI(r3, r4, r5, r6, r7)
            return
        L_0x003e:
            r4 = r10
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31081dR.A04(int, java.lang.String, boolean):void");
    }

    public void A05(int i2, short s2) {
        int i3;
        C31091dS r2 = this.A06;
        if (r2.A03 && (i3 = r2.A05) > 0) {
            this.A08.AKy(i3, i2, s2);
        }
        if (r2.A04) {
            A00();
        }
    }

    public void A06(long j2) {
        C19500yX r5 = this.A08;
        int i2 = this.A06.A05;
        StringBuilder sb = new StringBuilder("launch_2_");
        String str = this.A09;
        sb.append(str);
        sb.append("_start");
        String obj = sb.toString();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        r5.ALC(obj, timeUnit, i2, j2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch_2_");
        sb2.append(str);
        sb2.append("_end");
        String obj2 = sb2.toString();
        long j3 = this.A03;
        r5.ALC(obj2, timeUnit, i2, j3);
        StringBuilder sb3 = new StringBuilder("init_2_");
        sb3.append(str);
        sb3.append("_start");
        r5.ALC(sb3.toString(), timeUnit, i2, j3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("init_2_");
        sb4.append(str);
        A07(sb4.toString());
    }

    public void A07(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A09(sb.toString());
    }

    public void A08(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A09(sb.toString());
    }

    public void A09(String str) {
        int i2;
        C31091dS r1 = this.A06;
        if (r1.A03 && (i2 = r1.A05) > 0) {
            this.A08.AL5(i2, str);
        }
    }

    public void A0A(String str, String str2, boolean z2) {
        if (z2) {
            this.A08.AKi(this.A06.A05, str, str2);
        } else {
            this.A07.AKi(this.A06.A05, str, str2);
        }
    }

    public void A0B(String str, boolean z2, boolean z3) {
        if (z3) {
            this.A08.AKj(this.A06.A05, str, z2);
        } else {
            this.A07.AKj(this.A06.A05, str, z2);
        }
    }

    public void A0C(short s2) {
        int i2;
        C31091dS r2 = this.A06;
        if (r2.A03 && (i2 = r2.A05) > 0) {
            this.A08.AKz(i2, s2);
        }
        if (r2.A04) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.A05 <= 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(java.lang.String r10, long r11) {
        /*
            r9 = this;
            X.1dS r3 = r9.A06
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x000b
            int r0 = r3.A05
            r1 = 1
            if (r0 > 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 != 0) goto L_0x0014
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0014
            r0 = 0
            return r0
        L_0x0014:
            r7 = r11
            r9.A00 = r11
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0022
            X.2IV r0 = new X.2IV
            r0.<init>()
            r9.A01 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0046
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            X.17S r2 = r9.A07
            int r6 = r3.A05
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r3.A02
            java.lang.String r3 = "perf_origin"
            java.lang.String r4 = "Censored"
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0048
            if (r1 == 0) goto L_0x0043
        L_0x003e:
            X.0yX r2 = r2.A01
            r2.ALJ(r3, r4, r5, r6, r7)
        L_0x0043:
            r9.A06(r11)
        L_0x0046:
            r0 = 1
            return r0
        L_0x0048:
            r4 = r10
            goto L_0x003e
        L_0x004a:
            X.17S r5 = r9.A07
            int r4 = r3.A05
            boolean r3 = r3.A02
            java.lang.String r2 = "perf_origin"
            java.lang.String r1 = "Censored"
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x005d
            if (r3 == 0) goto L_0x0046
            r10 = r1
        L_0x005d:
            X.0yX r0 = r5.A01
            r0.ALH(r4, r2, r10)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31081dR.A0D(java.lang.String, long):boolean");
    }
}
