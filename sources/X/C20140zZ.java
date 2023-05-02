package X;

/* renamed from: X.0zZ  reason: invalid class name and case insensitive filesystem */
public class C20140zZ {
    public AnonymousClass1JF A00;
    public final AnonymousClass03L A01;

    public C20140zZ(AnonymousClass1JF r3) {
        C64383Or r1 = new C64383Or(10);
        this.A01 = r1;
        r1.A00 = new AnonymousClass53N();
        this.A00 = r3;
        r3.Abe(new AnonymousClass4FT(this));
        r3.AIE(this);
    }

    public final AnonymousClass4FU A00(String str) {
        AnonymousClass4FU r0;
        AnonymousClass03L r3 = this.A01;
        AnonymousClass4FU r02 = (AnonymousClass4FU) r3.A02(str);
        if (r02 != null) {
            return r02;
        }
        synchronized (r3) {
            r0 = (AnonymousClass4FU) r3.A02(str);
            if (r0 == null) {
                int A9c = this.A00.A9c();
                int i2 = 50;
                if (A9c < 2016) {
                    i2 = 10;
                    if (A9c >= 2014) {
                        i2 = 30;
                    }
                }
                r0 = new AnonymousClass4FU(str, i2);
                r3.A06(str, r0);
            }
        }
        return r0;
    }

    public Object A01(String str, String str2) {
        C89924dA r7 = (C89924dA) A00(str).A00.A02(str2);
        if (r7 != null) {
            long j2 = r7.A01;
            if (j2 == -1 || System.currentTimeMillis() < r7.A00 + j2) {
                Object obj = r7.A02;
                if (obj != null) {
                    return obj;
                }
            } else {
                A04(str, str2);
            }
        }
        return null;
    }

    public void A02(C89924dA r2, String str, String str2) {
        A00(str).A00.A06(str2, r2);
        if ((r2.A02 instanceof String) && r2.A03) {
            this.A00.Ad2(r2, str, str2);
        }
    }

    public void A03(Object obj, String str, String str2, long j2, boolean z2) {
        A02(new C89924dA(obj, j2, z2), str, str2);
    }

    public void A04(String str, String str2) {
        AnonymousClass4FU r0 = (AnonymousClass4FU) this.A01.A02(str);
        if (r0 != null) {
            r0.A00.A03(str2);
        }
        this.A00.Abx(str, str2);
    }
}
