package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1rY  reason: invalid class name and case insensitive filesystem */
public abstract class C38871rY extends C16740tZ implements C30081bi {
    public String A00;

    public C38871rY(C28381Vw r2, byte b2, long j2) {
        super(r2, b2, j2);
        this.A02 = 0;
    }

    public void A12(C33241iG r4) {
        C28381Vw r2 = this.A11;
        C15830rv r0 = r2.A00;
        AnonymousClass00B.A06(r0);
        r4.A07(r0.getRawString());
        boolean z2 = this instanceof C38861rX;
        boolean z3 = r2.A02;
        if (z2) {
            z3 = !z3;
        }
        r4.A08(z3);
        String str = this.A00;
        if (str != null) {
            r4.A05(str);
        }
        C15830rv A0B = A0B();
        if (A0B != null) {
            r4.A06(A0B.getRawString());
        }
    }

    public void A5j(AnonymousClass21Q r5, AnonymousClass1GC r6) {
        C33211iD r3;
        int i2;
        int i3;
        boolean z2 = this instanceof C38861rX;
        C33221iE r32 = r5.A04;
        C33211iD r0 = (C33211iD) r32.A00;
        if (z2) {
            C58172t4 r02 = r0.A0A;
            if (r02 == null) {
                r02 = C58172t4.A02;
            }
            C28581Wr A0U = r02.A0U();
            C33231iF r03 = ((C58172t4) A0U.A00).A01;
            if (r03 == null) {
                r03 = C33231iF.A05;
            }
            C33241iG r04 = (C33241iG) r03.A0U();
            A12(r04);
            A0U.A03();
            C58172t4 r1 = (C58172t4) A0U.A00;
            r1.A01 = (C33231iF) r04.A02();
            r1.A00 |= 1;
            r32.A03();
            r3 = (C33211iD) r32.A00;
            r3.A0A = (C58172t4) A0U.A02();
            i2 = r3.A00;
            i3 = AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
        } else {
            C58162t3 r05 = r0.A06;
            if (r05 == null) {
                r05 = C58162t3.A02;
            }
            C28581Wr A0U2 = r05.A0U();
            C33231iF r06 = ((C58162t3) A0U2.A00).A01;
            if (r06 == null) {
                r06 = C33231iF.A05;
            }
            C33241iG r07 = (C33241iG) r06.A0U();
            A12(r07);
            A0U2.A03();
            C58162t3 r12 = (C58162t3) A0U2.A00;
            r12.A01 = (C33231iF) r07.A02();
            r12.A00 |= 1;
            r32.A03();
            r3 = (C33211iD) r32.A00;
            r3.A06 = (C58162t3) A0U2.A02();
            i2 = r3.A00;
            i3 = AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
        }
        r3.A00 = i2 | i3;
    }
}
