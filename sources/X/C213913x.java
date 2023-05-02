package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;

/* renamed from: X.13x  reason: invalid class name and case insensitive filesystem */
public final class C213913x {
    public final C16320sq A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;

    public C213913x(C16320sq r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r4, 3);
        C18450wi.A0H(r5, 4);
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public final void A00(AnonymousClass5SY r5, AnonymousClass4UI r6, C48802Pe r7, Runnable runnable, int i2) {
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r5, 4);
        if (!(i2 == 400 || i2 == 405)) {
            if (!(i2 == 408 || i2 == 429)) {
                if (i2 != 481) {
                    if (i2 != 500) {
                        if (i2 != 503) {
                            return;
                        }
                    }
                } else if (r6.A01()) {
                    this.A00.Aco(new RunnableRunnableShape12S0100000_I0_11((Object) runnable, 25));
                    return;
                }
            }
            Long A002 = r6.A00();
            if (A002 != null) {
                this.A00.Ad4(runnable, "AvatarUserIqErrorHelper/retryOperationWithBackoff", A002.longValue());
                return;
            }
        }
        r5.AQa(r7);
    }

    public final void A01(AnonymousClass5SY r10, AnonymousClass4UI r11, C48802Pe r12, Runnable runnable, AnonymousClass1DU r14, AnonymousClass22J r15) {
        boolean z2;
        AnonymousClass4UI r5 = r11;
        C18450wi.A0H(r11, 1);
        AnonymousClass5SY r4 = r10;
        C18450wi.A0H(r10, 3);
        C48802Pe r6 = r12;
        int A002 = C34451kH.A00(r12.node);
        if (A002 == 401 || A002 == 409) {
            ((AnonymousClass14L) this.A02.get()).A03(new C102034yI(r10, r12, r14), AnonymousClass146.A00);
        } else if (A002 != 480) {
            A00(r4, r5, r6, runnable, A002);
        } else {
            C102054yK r2 = new C102054yK(r10, r15);
            if (r11.A01()) {
                synchronized (r5) {
                    z2 = r11.A01;
                }
                if (!z2) {
                    synchronized (r5) {
                        r11.A01 = true;
                    }
                    AnonymousClass144 r1 = AnonymousClass146.A00;
                    ((AnonymousClass14C) this.A01.get()).A01(r1);
                    ((AnonymousClass14J) this.A03.get()).A01(r1, r2);
                    return;
                }
            }
            r2.AQa(r12);
        }
    }
}
