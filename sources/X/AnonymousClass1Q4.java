package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.1Q4  reason: invalid class name */
public class AnonymousClass1Q4 implements AnonymousClass1Q5 {
    public final C16000sG A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;

    public AnonymousClass1Q4(C16000sG r1, C16980tz r2, AnonymousClass013 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A5i(C16740tZ r11, AnonymousClass21Q r12, AnonymousClass1GC r13) {
        C38811rS r5 = (C38811rS) r11;
        C33221iE r4 = r12.A04;
        C58602tl r0 = ((C33211iD) r4.A00).A09;
        if (r0 == null) {
            r0 = C58602tl.A04;
        }
        C28581Wr A0U = r0.A0U();
        if (!TextUtils.isEmpty(r5.A00)) {
            String str = r5.A00;
            A0U.A03();
            C58602tl r1 = (C58602tl) A0U.A00;
            r1.A00 |= 1;
            r1.A03 = str;
        }
        List A12 = r5.A12();
        int i2 = 0;
        while (i2 < A12.size() && i2 < 257) {
            String str2 = (String) A12.get(i2);
            C28581Wr A0U2 = C58592tk.A04.A0U();
            String A012 = new C39681st(this.A00, this.A01, this.A02).A01(str2);
            if (A012 != null) {
                A0U2.A03();
                C58592tk r14 = (C58592tk) A0U2.A00;
                r14.A00 |= 1;
                r14.A02 = A012;
            }
            A0U2.A03();
            C58592tk r15 = (C58592tk) A0U2.A00;
            r15.A00 |= 2;
            r15.A03 = str2;
            C28541Wm A022 = A0U2.A02();
            A0U.A03();
            C58602tl r2 = (C58602tl) A0U.A00;
            AnonymousClass1XE r16 = r2.A01;
            if (!((AnonymousClass1XF) r16).A00) {
                r16 = C28541Wm.A0G(r16);
                r2.A01 = r16;
            }
            r16.add(A022);
            i2++;
        }
        AnonymousClass1WV r22 = r12.A05;
        byte[] bArr = r12.A0A;
        if (C41071vB.A0O(r22, r11, bArr)) {
            AnonymousClass21S A002 = r13.A00(r22, r11, bArr, r12.A07);
            A0U.A03();
            C58602tl r17 = (C58602tl) A0U.A00;
            r17.A02 = A002;
            r17.A00 |= 2;
        }
        r4.A03();
        C33211iD r18 = (C33211iD) r4.A00;
        r18.A09 = (C58602tl) A0U.A02();
        r18.A00 |= 4096;
    }

    public int[] ACW() {
        return new int[]{14};
    }
}
