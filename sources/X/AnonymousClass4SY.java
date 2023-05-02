package X;

/* renamed from: X.4SY  reason: invalid class name */
public abstract class AnonymousClass4SY {
    public Object A00(Object obj) {
        boolean z2;
        C89474cF r1;
        C107175Gs r4 = (C107175Gs) this;
        Object obj2 = r4._consensus;
        Object obj3 = AnonymousClass4AA.A00;
        if (obj2 == obj3) {
            Object A01 = r4.A01(obj);
            obj2 = r4._consensus;
            if (obj2 == obj3) {
                if (!AnonymousClass0LG.A00(r4, obj3, A01, C107175Gs.A00)) {
                    A01 = r4._consensus;
                }
                obj2 = A01;
            }
        }
        C107125Gm r42 = (C107125Gm) r4;
        if (obj2 == null) {
            z2 = true;
            r1 = r42.A01;
        } else {
            z2 = false;
            r1 = r42.A00;
        }
        if (r1 != null && AnonymousClass0LG.A00(obj, r42, r1, C89474cF.A00) && z2) {
            C89474cF r12 = r42.A01;
            C89474cF r0 = r42.A00;
            C18450wi.A0F(r0);
            r12.A07(r0);
        }
        return obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        return AnonymousClass000.A0h(AnonymousClass3K2.A0l(this, A0o), A0o);
    }
}
