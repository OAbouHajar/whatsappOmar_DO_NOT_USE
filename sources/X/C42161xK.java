package X;

import android.content.Context;

/* renamed from: X.1xK  reason: invalid class name and case insensitive filesystem */
public class C42161xK extends C42101xE {
    public C42161xK(C16880tn r1) {
        super(r1);
    }

    public String A05(Context context) {
        C16880tn r2 = this.A00;
        if (!"review_order".equals(r2.A00()) && !"payment_status".equals(r2.A00()) && !"payment_method".equals(r2.A00())) {
            return super.A05(context);
        }
        String A04 = A04(context);
        return A04 == null ? "" : A04;
    }

    public String A07(Context context) {
        C16880tn r2 = this.A00;
        if (!"review_order".equals(r2.A00()) && !"payment_status".equals(r2.A00()) && !"payment_method".equals(r2.A00())) {
            return super.A07(context);
        }
        String A04 = A04(context);
        return A04 == null ? "" : A04;
    }

    public void A09(C16740tZ r10, AnonymousClass21Q r11, AnonymousClass1GC r12) {
        super.A09(r10, r11, r12);
        C16880tn AAt = ((C16840tj) r10).AAt();
        if (AAt != null && AAt.A03 != null && AAt.A00 == 5) {
            C33221iE r3 = r11.A04;
            AnonymousClass220 r0 = ((C33211iD) r3.A00).A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C28581Wr A0U = r0.A0U();
            C28581Wr A0U2 = ((AnonymousClass220) A0U.A00).A0d().A0U();
            for (C35181lV r1 : AAt.A03.A00) {
                C28581Wr A0U3 = AnonymousClass222.A03.A0U();
                C35071lK r7 = r1.A01;
                String str = r7.A00;
                A0U3.A03();
                AnonymousClass222 r13 = (AnonymousClass222) A0U3.A00;
                r13.A00 |= 1;
                r13.A02 = str;
                String str2 = r7.A01;
                if (str2 != null) {
                    A0U3.A03();
                    AnonymousClass222 r14 = (AnonymousClass222) A0U3.A00;
                    r14.A00 |= 2;
                    r14.A01 = str2;
                }
                A0U2.A03();
                AnonymousClass221 r2 = (AnonymousClass221) A0U2.A00;
                AnonymousClass1XE r15 = r2.A02;
                if (!((AnonymousClass1XF) r15).A00) {
                    r15 = C28541Wm.A0G(r15);
                    r2.A02 = r15;
                }
                r15.add(A0U3.A02());
            }
            A0U.A03();
            AnonymousClass220 r16 = (AnonymousClass220) A0U.A00;
            r16.A06 = A0U2.A02();
            r16.A01 = 6;
            r3.A08((AnonymousClass220) A0U.A02());
        }
    }
}
