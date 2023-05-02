package X;

import android.os.SystemClock;

/* renamed from: X.38x  reason: invalid class name and case insensitive filesystem */
public class C614438x {
    public final C17690vU A00;
    public final C17680vT A01;
    public final AnonymousClass1AO A02;
    public final C38141qJ A03;
    public final AnonymousClass4MS A04 = new AnonymousClass4MS();
    public final AnonymousClass21K A05 = new AnonymousClass21K();
    public final AnonymousClass2A0 A06;
    public final String A07;

    public C614438x(C17690vU r2, C20330zs r3, C17680vT r4, AnonymousClass1AO r5, C38141qJ r6, AnonymousClass2A0 r7, String str) {
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = r6;
        this.A07 = str;
        this.A06 = r7;
        r3.A01.A01();
    }

    public C87264Wb A00() {
        int i2;
        AnonymousClass21K r2 = this.A05;
        SystemClock.elapsedRealtime();
        C87264Wb r1 = (C87264Wb) this.A03.A00(new AnonymousClass3G1(this));
        if (r1 == null || r1.A02 == null) {
            String A0h = AnonymousClass000.A0h(this.A07, AnonymousClass000.A0r("resumecheck/failed; no routes; hash="));
            r1 = new C87264Wb();
            r1.A02 = C798841s.FAILURE;
            r1.A04 = A0h;
        }
        C798841s r0 = r1.A02;
        AnonymousClass00B.A06(r0);
        SystemClock.elapsedRealtime();
        if (r0 != null) {
            switch (r0.ordinal()) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        r2.A01 = Integer.valueOf(i2);
        AnonymousClass4MS r02 = this.A04;
        r2.A00 = new AnonymousClass21J(r02.A03, r02.A00, r02.A02, r02.A01);
        return r1;
    }
}
