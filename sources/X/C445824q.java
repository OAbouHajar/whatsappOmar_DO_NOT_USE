package X;

/* renamed from: X.24q  reason: invalid class name and case insensitive filesystem */
public class C445824q {
    public final AnonymousClass1ZU A00 = new AnonymousClass1ZU();
    public final AnonymousClass1ZU A01 = new AnonymousClass1ZU();
    public volatile boolean A02 = false;

    public static final boolean A00(AnonymousClass1ZU r3, boolean z2) {
        boolean z3;
        synchronized (r3) {
            z3 = false;
            if (r3.A00 > 3) {
                z3 = true;
            }
        }
        if (z3) {
            return false;
        }
        if (z2) {
            r3.A01();
            return true;
        }
        r3.A02();
        return true;
    }

    public final boolean A01() {
        boolean z2;
        boolean z3;
        AnonymousClass1ZU r3 = this.A01;
        synchronized (r3) {
            z2 = false;
            if (r3.A00 == 5) {
                z2 = true;
            }
        }
        if (z2) {
            AnonymousClass1ZU r32 = this.A00;
            synchronized (r32) {
                z3 = false;
                if (r32.A00 == 5) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    public final boolean A02() {
        boolean z2;
        boolean z3;
        AnonymousClass1ZU r3 = this.A01;
        synchronized (r3) {
            z2 = false;
            if (r3.A00 == 4) {
                z2 = true;
            }
        }
        if (!z2) {
            AnonymousClass1ZU r32 = this.A00;
            synchronized (r32) {
                z3 = false;
                if (r32.A00 == 4) {
                    z3 = true;
                }
            }
            return z3 || A01();
        }
    }
}
