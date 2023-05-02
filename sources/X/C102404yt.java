package X;

import com.facebook.redex.IDxECallbackShape109S0200000_2_I1;

/* renamed from: X.4yt  reason: invalid class name and case insensitive filesystem */
public class C102404yt implements AnonymousClass1KD {
    public final C16440t3 A00;
    public final AnonymousClass14L A01;
    public final AnonymousClass144 A02;
    public final C108775Ph A03;

    public C102404yt(C16440t3 r1, AnonymousClass14L r2, AnonymousClass144 r3, C108775Ph r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void Aah(C448025p r11) {
        AnonymousClass14L r6 = this.A01;
        AnonymousClass144 r2 = this.A02;
        AnonymousClass28T A002 = r6.A00(r2);
        if (A002 != null) {
            C108775Ph r8 = this.A03;
            C16440t3 r0 = this.A00;
            Long l2 = A002.A05;
            if (l2 != null) {
                long A09 = C13690nt.A09(r0.A00());
                long j2 = A002.A00;
                AnonymousClass00B.A06(l2);
                if (A09 > j2 + l2.longValue()) {
                    r6.A01(A002, new IDxECallbackShape109S0200000_2_I1(this, r11, 1), (AnonymousClass4UI) null);
                    return;
                }
            }
            Object obj = A002.A02.A00;
            AnonymousClass00B.A06(obj);
            r8.A6z((String) obj).Aah(new C102374yq(A002, this, r11));
            return;
        }
        r6.A02(new IDxECallbackShape109S0200000_2_I1(this, r11, 0), r2);
    }
}
