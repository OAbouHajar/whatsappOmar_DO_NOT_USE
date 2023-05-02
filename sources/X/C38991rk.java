package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1rk  reason: invalid class name and case insensitive filesystem */
public class C38991rk extends C38691rG implements C39001rl, C16850tk, C30081bi {
    public int A00 = 0;

    public C38991rk(C16750ta r10, C28381Vw r11, C38991rk r12, long j2) {
        super(r10, r11, r12, r12.A10, j2, true);
        this.A00 = r12.A00;
    }

    public C38991rk(C28381Vw r2, long j2) {
        super(r2, (byte) 42, j2);
    }

    public C16870tm A0F() {
        C16870tm A0F = super.A0F();
        AnonymousClass00B.A06(A0F);
        return A0F;
    }

    public void A5j(AnonymousClass21Q r9, AnonymousClass1GC r10) {
        C33221iE r3 = r9.A04;
        C52992en r0 = ((C33211iD) r3.A00).A0K;
        if (r0 == null) {
            r0 = C52992en.A02;
        }
        C69513fA r4 = (C69513fA) r0.A0U();
        C33211iD r02 = ((C52992en) r4.A00).A01;
        if (r02 == null) {
            r02 = C33211iD.A0o;
        }
        C28581Wr A0U = r02.A0U();
        C445224k r03 = ((C33211iD) A0U.A00).A0N;
        if (r03 == null) {
            r03 = C445224k.A0R;
        }
        C68803e1 A19 = A19((C68803e1) r03.A0U(), r9, r10);
        if (A19 != null) {
            A19.A03();
            C445224k r5 = (C445224k) A19.A00;
            r5.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
            r5.A0Q = true;
            A0U.A03();
            C33211iD r1 = (C33211iD) A0U.A00;
            r1.A0N = (C445224k) A19.A02();
            r1.A00 |= 4;
            r4.A05((C33211iD) A0U.A02());
            if ((!r9.A09 || !r9.A03.A0E(C16620tM.A02, 1710) || r9.A00) && !r9.A03.A0E(C16620tM.A02, 1711)) {
                r3.A03();
                C33211iD r2 = (C33211iD) r3.A00;
                r2.A0K = (C52992en) r4.A02();
                r2.A00 |= 268435456;
                return;
            }
            r3.A03();
            C33211iD r12 = (C33211iD) r3.A00;
            r12.A0J = (C52992en) r4.A02();
            r12.A01 |= 2048;
        }
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r7) {
        long j2 = this.A0I;
        C16750ta r1 = this.A02;
        AnonymousClass00B.A06(r1);
        return new C38991rk(r1, r7, this, j2);
    }

    public int AGz() {
        return this.A00;
    }

    public void Aey(int i2) {
        this.A00 = i2;
    }
}
