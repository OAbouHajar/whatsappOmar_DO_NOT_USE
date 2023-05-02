package X;

import android.text.TextUtils;

/* renamed from: X.1Kl  reason: invalid class name and case insensitive filesystem */
public class C25611Kl implements C25591Kj {
    public static final Double A06 = Double.valueOf(0.0d);
    public final C16300so A00;
    public final C14870pt A01;
    public final C17180uf A02;
    public final C25581Ki A03;
    public final C25541Ke A04;
    public final C16320sq A05;

    public C25611Kl(C16300so r1, C14870pt r2, C17180uf r3, C25581Ki r4, C25541Ke r5, C16320sq r6) {
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void AbJ(AnonymousClass260 r4) {
        C17180uf r0 = this.A02;
        String A002 = r0.A00();
        if (!r0.A0B() || TextUtils.isEmpty(A002)) {
            this.A03.AbJ(r4);
            return;
        }
        C25541Ke r1 = this.A04;
        AnonymousClass00B.A06(A002);
        r1.A0C(new AnonymousClass262(r4, this), A002);
    }
}
