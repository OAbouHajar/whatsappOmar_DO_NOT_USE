package X;

import android.text.TextUtils;

/* renamed from: X.5n4  reason: invalid class name and case insensitive filesystem */
public class C114065n4 extends C110685ef {
    public final AnonymousClass027 A00 = C13690nt.A0O();

    public C114065n4(C15900s5 r2, C16440t3 r3, C16460t6 r4, C14710pd r5, C1222969a r6, C222617g r7) {
        super(r2, r3, r4, r5, r6, r7);
    }

    public void A0A(String str) {
        AnonymousClass027 r2;
        C116795rx r1;
        super.A0A(str);
        String A03 = this.A02.A03(C15910s6.A2C);
        if (TextUtils.isEmpty(A03) || !AnonymousClass1W1.A09(str)) {
            boolean isEmpty = TextUtils.isEmpty(A03);
            r2 = this.A00;
            if (!isEmpty) {
                r1 = new C116795rx(A03, (String) null);
            } else {
                r2.A0B((Object) null);
                return;
            }
        } else {
            r2 = this.A00;
            r1 = new C116795rx(A03, str);
        }
        r2.A0B(r1);
    }
}
