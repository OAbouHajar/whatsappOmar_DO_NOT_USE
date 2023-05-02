package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.1xF  reason: invalid class name and case insensitive filesystem */
public class C42111xF extends C42101xE {
    public C42111xF(C16880tn r1) {
        super(r1);
    }

    public String A05(Context context) {
        StringBuilder sb = new StringBuilder("🛍 ");
        String str = this.A00.A07;
        if (TextUtils.isEmpty(str)) {
            str = A03();
        }
        sb.append(str);
        return sb.toString();
    }

    public String A07(Context context) {
        String str = this.A00.A07;
        return TextUtils.isEmpty(str) ? A03() : str;
    }

    public void A09(C16740tZ r10, AnonymousClass21Q r11, AnonymousClass1GC r12) {
        super.A09(r10, r11, r12);
        C16880tn AAt = ((C16840tj) r10).AAt();
        if (AAt != null && AAt.A05 != null) {
            C33221iE r4 = r11.A04;
            AnonymousClass220 r0 = ((C33211iD) r4.A00).A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C28581Wr A0U = r0.A0U();
            AnonymousClass220 r1 = (AnonymousClass220) A0U.A00;
            C28581Wr A0U2 = (r1.A01 == 4 ? (C28541Wm) r1.A06 : C58652tq.A04).A0U();
            C35131lQ r8 = AAt.A05;
            String str = r8.A02;
            if (!TextUtils.isEmpty(str)) {
                A0U2.A03();
                C58652tq r13 = (C58652tq) A0U2.A00;
                r13.A00 |= 1;
                r13.A03 = str;
            }
            int i2 = r8.A00;
            C799942d r2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? C799942d.A03 : C799942d.A04 : C799942d.A02 : C799942d.A01;
            A0U2.A03();
            C58652tq r14 = (C58652tq) A0U2.A00;
            r14.A00 |= 2;
            r14.A02 = r2.value;
            int i3 = r8.A01;
            A0U2.A03();
            C58652tq r15 = (C58652tq) A0U2.A00;
            r15.A00 |= 4;
            r15.A01 = i3;
            if (AAt.A00 == 4) {
                A0U.A03();
                AnonymousClass220 r16 = (AnonymousClass220) A0U.A00;
                r16.A06 = A0U2.A02();
                r16.A01 = 4;
            }
            r4.A08((AnonymousClass220) A0U.A02());
        }
    }
}
