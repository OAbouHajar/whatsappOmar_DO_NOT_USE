package X;

import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import java.util.HashMap;

/* renamed from: X.4Rj  reason: invalid class name and case insensitive filesystem */
public class C86144Rj {
    public boolean A00;
    public final C14870pt A01;
    public final C18940xV A02;
    public final C19150xq A03;
    public final HashMap A04 = AnonymousClass000.A0x();

    public C86144Rj(C14870pt r2, AnonymousClass5PP r3, C86144Rj r4, C19150xq r5) {
        if (r4 != null) {
            r4.A00();
        }
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = false;
        C74033pd r0 = new C74033pd(r3, this);
        this.A02 = r0;
        r5.A02(r0);
    }

    public void A00() {
        this.A00 = true;
        C14870pt r2 = this.A01;
        r2.A02.post(new RunnableRunnableShape18S0100000_I1_1((Object) this, 9));
    }
}
