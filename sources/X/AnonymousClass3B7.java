package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDxLambdaShape56S0000000_2_I1;

/* renamed from: X.3B7  reason: invalid class name */
public final class AnonymousClass3B7 {
    public final AnonymousClass028 A00;
    public final C86134Ri A01;
    public final C82614Dm A02;
    public final C15220qW A03;

    public AnonymousClass3B7(C86134Ri r3, C82614Dm r4) {
        this.A01 = r3;
        this.A02 = r4;
        AnonymousClass1DV r0 = new AnonymousClass1DV(new IDxLambdaShape56S0000000_2_I1(5));
        this.A03 = r0;
        this.A00 = (AnonymousClass028) r0.getValue();
    }

    public static final AnonymousClass2XV A00(AnonymousClass41I r0, AnonymousClass2XV r1, AnonymousClass2XV r2) {
        switch (r0.ordinal()) {
            case 0:
                return r1;
            case 1:
                return r2;
            default:
                throw new AnonymousClass2Xe();
        }
    }

    public final void A02(AnonymousClass41I r7, UserJid userJid, String str) {
        C87064Vf r3 = new C87064Vf(userJid, str);
        AnonymousClass3Ip r4 = new AnonymousClass3Ip(r7, this);
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        do {
            i2++;
            A0u.add(C73343nj.A00);
        } while (i2 < 3);
        ((AnonymousClass028) this.A03.getValue()).A0B(A00(r7, new AnonymousClass2XW(A0u), new AnonymousClass2XX(A0u)));
        if (r7.ordinal() != 0) {
            this.A01.A00(r3, r4);
            return;
        }
        C86134Ri r2 = this.A01;
        AnonymousClass4HU r1 = r2.A02;
        r1.A00 = null;
        ((AtomicReference) r1.A01.getValue()).set(r3);
        r2.A00(r3, r4);
    }
}
