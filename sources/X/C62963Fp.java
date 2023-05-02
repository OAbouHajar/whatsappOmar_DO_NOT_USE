package X;

import java.io.File;

/* renamed from: X.3Fp  reason: invalid class name and case insensitive filesystem */
public class C62963Fp implements AnonymousClass2NY {
    public final /* synthetic */ AnonymousClass3AE A00;
    public final /* synthetic */ C16010sH A01;
    public final /* synthetic */ AnonymousClass1WP A02;

    public C62963Fp(AnonymousClass3AE r1, C16010sH r2, AnonymousClass1WP r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AQR(int i2) {
        AnonymousClass3AE r1 = this.A00;
        AnonymousClass3AE.A00(r1, r1.A0H.decrementAndGet());
    }

    public void AYI(AnonymousClass4MJ r7, C16050sL r8) {
        AnonymousClass3AE r5 = this.A00;
        r5.A0G.remove(this.A02);
        File A002 = r5.A08.A00(this.A01);
        if (A002 != null && A002.exists()) {
            r5.A0E.A0B(r5.A07.A0A(r8), A002, (byte[]) null, false);
        }
        AnonymousClass3AE.A00(r5, r5.A0H.decrementAndGet());
    }

    public void AYu() {
        AnonymousClass3AE r1 = this.A00;
        AnonymousClass3AE.A00(r1, r1.A0H.decrementAndGet());
    }
}
