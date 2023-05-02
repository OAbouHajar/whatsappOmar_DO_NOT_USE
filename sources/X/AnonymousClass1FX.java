package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;

/* renamed from: X.1FX  reason: invalid class name */
public class AnonymousClass1FX implements C19400yN {
    public final AnonymousClass1DL A00;
    public final C19220xx A01;
    public final AnonymousClass1DN A02;

    public AnonymousClass1FX(AnonymousClass1DL r1, C19220xx r2, AnonymousClass1DN r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public String AGT() {
        return "UserNoticeAsyncInit";
    }

    public void AMc() {
        C19220xx r4 = this.A01;
        boolean A0E = r4.A03.A0E(C16620tM.A02, 366);
        if (A0E && !r4.A05.A00().getBoolean("is_cleared", false)) {
            r4.A03();
            r4.A05();
        }
        r4.A05.A00().edit().putBoolean("is_cleared", A0E).apply();
        AnonymousClass1DN r42 = this.A02;
        if (r42.A01 == null) {
            AnonymousClass1WA r3 = new AnonymousClass1WA(r42.A0A, false);
            r42.A01 = r3;
            r3.A02(new RunnableRunnableShape12S0100000_I0_11((Object) r42, 22), 800);
        }
        AnonymousClass1DL r2 = this.A00;
        r2.A02.A00.put(2, r2);
    }
}
