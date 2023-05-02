package X;

import java.util.List;

/* renamed from: X.1We  reason: invalid class name and case insensitive filesystem */
public class C28461We {
    public AnonymousClass1WK A00;
    public AnonymousClass1XB A01;
    public Integer A02;
    public List A03;
    public byte[] A04;
    public byte[] A05;
    public final String A06;
    public final List A07;
    public final byte[] A08;

    public C28461We(String str, List list, byte[] bArr) {
        this.A06 = str;
        this.A07 = list;
        this.A08 = bArr;
    }

    public C28471Wf A00() {
        String str;
        List list;
        AnonymousClass1XC r0;
        if (this.A03 == null && this.A01 == null) {
            str = this.A06;
            list = this.A07;
            r0 = null;
        } else {
            C28581Wr A0U = AnonymousClass1XC.A09.A0U();
            List list2 = this.A03;
            if (list2 != null) {
                A0U.A03();
                AnonymousClass1XC r2 = (AnonymousClass1XC) A0U.A00;
                AnonymousClass1XE r1 = r2.A04;
                if (!((AnonymousClass1XF) r1).A00) {
                    r1 = C28541Wm.A0G(r1);
                    r2.A04 = r1;
                }
                C28591Ws.A01(list2, r1);
            } else {
                AnonymousClass1XB r02 = this.A01;
                if (r02 != null) {
                    A0U.A03();
                    AnonymousClass1XC r12 = (AnonymousClass1XC) A0U.A00;
                    r12.A06 = r02;
                    r12.A00 |= 2;
                }
            }
            if (this.A00 != null) {
                C28581Wr A0U2 = AnonymousClass1X1.A02.A0U();
                byte[] bArr = this.A00.A00;
                C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
                A0U2.A03();
                AnonymousClass1X1 r13 = (AnonymousClass1X1) A0U2.A00;
                r13.A00 |= 1;
                r13.A01 = A012;
                A0U.A03();
                AnonymousClass1XC r14 = (AnonymousClass1XC) A0U.A00;
                r14.A07 = (AnonymousClass1X1) A0U2.A02();
                r14.A00 |= 16;
            }
            byte[] bArr2 = this.A05;
            if (bArr2 != null) {
                C28631Ww A013 = C28631Ww.A01(bArr2, 0, bArr2.length);
                A0U.A03();
                AnonymousClass1XC r15 = (AnonymousClass1XC) A0U.A00;
                r15.A00 |= 4;
                r15.A03 = A013;
            }
            byte[] bArr3 = this.A04;
            if (bArr3 != null) {
                C28631Ww A014 = C28631Ww.A01(bArr3, 0, bArr3.length);
                A0U.A03();
                AnonymousClass1XC r16 = (AnonymousClass1XC) A0U.A00;
                r16.A00 |= 8;
                r16.A02 = A014;
            }
            Integer num = this.A02;
            if (num != null) {
                int intValue = num.intValue();
                A0U.A03();
                AnonymousClass1XC r17 = (AnonymousClass1XC) A0U.A00;
                r17.A00 |= 64;
                r17.A01 = intValue;
            }
            str = this.A06;
            list = this.A07;
            r0 = (AnonymousClass1XC) A0U.A02();
        }
        return new C28471Wf(r0, str, list, this.A08);
    }
}
