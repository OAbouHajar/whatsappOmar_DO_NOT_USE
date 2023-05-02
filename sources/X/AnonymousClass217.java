package X;

import java.io.File;

/* renamed from: X.217  reason: invalid class name */
public final /* synthetic */ class AnonymousClass217 implements AnonymousClass218 {
    public final /* synthetic */ AnonymousClass211 A00;
    public final /* synthetic */ AnonymousClass1XP A01;
    public final /* synthetic */ AnonymousClass213 A02;
    public final /* synthetic */ C27401Rp A03;
    public final /* synthetic */ AnonymousClass210 A04;

    public /* synthetic */ AnonymousClass217(AnonymousClass211 r1, AnonymousClass1XP r2, AnonymousClass213 r3, C27401Rp r4, AnonymousClass210 r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void ASr(C62033Bj r13) {
        C27401Rp r7 = this.A03;
        AnonymousClass1XP r5 = this.A01;
        AnonymousClass210 r8 = this.A04;
        AnonymousClass213 r6 = this.A02;
        AnonymousClass211 r4 = this.A00;
        C27391Ro r2 = r7.A04;
        File file = r8.A07;
        String str = r8.A0B;
        int i2 = r8.A00;
        C613838r r3 = new C613838r(r4, r5, r6, r7, r8, r13);
        if (file == null) {
            AnonymousClass00B.A06(str);
            C63063Fz r62 = new C63063Fz(r2.A00, r5, r3, str, i2);
            r2.A01(r62.A02, r62);
            return;
        }
        r3.A00(file, false);
    }
}
