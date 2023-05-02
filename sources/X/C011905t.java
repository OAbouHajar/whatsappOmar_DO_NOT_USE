package X;

import java.util.concurrent.Executor;

/* renamed from: X.05t  reason: invalid class name and case insensitive filesystem */
public class C011905t extends AnonymousClass05u {
    public static final Executor A02 = new AnonymousClass05v();
    public static volatile C011905t A03;
    public AnonymousClass05u A00;
    public AnonymousClass05u A01;

    public C011905t() {
        AnonymousClass05w r0 = new AnonymousClass05w();
        this.A00 = r0;
        this.A01 = r0;
    }

    public static C011905t A00() {
        if (A03 == null) {
            synchronized (C011905t.class) {
                if (A03 == null) {
                    A03 = new C011905t();
                }
            }
        }
        return A03;
    }

    public void A01(Runnable runnable) {
        this.A01.A01(runnable);
    }

    public void A02(Runnable runnable) {
        this.A01.A02(runnable);
    }

    public boolean A03() {
        return this.A01.A03();
    }
}
