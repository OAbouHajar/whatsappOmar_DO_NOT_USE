package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.1iE  reason: invalid class name and case insensitive filesystem */
public final class C33221iE extends C28581Wr implements C28561Wp {
    public C33221iE() {
        super(C33211iD.A0o);
    }

    public C59022uY A05() {
        C59022uY r0 = ((C33211iD) this.A00).A0k;
        return r0 == null ? C59022uY.A06 : r0;
    }

    public void A06(C58852uG r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A03 = r3;
        r1.A01 |= 1;
    }

    public void A07(C69603fJ r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A0E = (C53012ep) r3.A02();
        r1.A00 |= 32;
    }

    public void A08(AnonymousClass220 r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A0O = r3;
        r1.A01 |= 8;
    }

    public void A09(C69613fK r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A0b = (C53002eo) r3.A02();
        r1.A00 |= 2048;
    }

    public void A0A(C53002eo r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A0b = r3;
        r1.A00 |= 2048;
    }

    public void A0B(C69623fL r3) {
        A03();
        C33211iD r1 = (C33211iD) this.A00;
        r1.A0h = (C58472tY) r3.A02();
        r1.A00 |= 2;
    }

    public void A0C(C69573fG r4) {
        A03();
        C33211iD r2 = (C33211iD) this.A00;
        r2.A0i = (C37521pI) r4.A02();
        r2.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
    }

    public void A0D(C69633fM r4) {
        A03();
        C33211iD r2 = (C33211iD) this.A00;
        r2.A0k = (C59022uY) r4.A02();
        r2.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
    }
}
