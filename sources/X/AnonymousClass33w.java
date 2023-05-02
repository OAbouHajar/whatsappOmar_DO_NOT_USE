package X;

/* renamed from: X.33w  reason: invalid class name */
public class AnonymousClass33w extends C63193Gm {
    public AnonymousClass33w(C35101lN r1) {
        super(r1);
    }

    public void A5k(AnonymousClass21Q r9, C39041rp r10, AnonymousClass1GC r11) {
        super.A5k(r9, r10, r11);
        C35101lN r3 = r10.A00;
        if (r3 != null && r3.A00 != null && r3.A04 == 2) {
            C33221iE r6 = r9.A04;
            C58762u4 r0 = ((C33211iD) r6.A00).A0P;
            if (r0 == null) {
                r0 = C58762u4.A05;
            }
            C28581Wr A0U = r0.A0U();
            C58762u4 r1 = (C58762u4) A0U.A00;
            C28581Wr A0U2 = (r1.A01 == 2 ? (C28541Wm) r1.A04 : C58662tr.A04).A0U();
            C35091lM r32 = r3.A00;
            String str = r32.A00;
            if (str != null) {
                C58662tr r12 = (C58662tr) C28581Wr.A00(A0U2);
                r12.A00 |= 1;
                r12.A02 = str;
            }
            String str2 = r32.A01;
            if (str2 != null) {
                C58662tr r13 = (C58662tr) C28581Wr.A00(A0U2);
                r13.A00 |= 2;
                r13.A03 = str2;
            }
            C58762u4 r14 = (C58762u4) C28581Wr.A00(A0U);
            r14.A04 = A0U2.A02();
            r14.A01 = 2;
            C33211iD r15 = (C33211iD) C28581Wr.A00(r6);
            r15.A0P = (C58762u4) A0U.A02();
            r15.A01 |= 32;
        }
    }
}
