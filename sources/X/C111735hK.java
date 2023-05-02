package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5hK  reason: invalid class name and case insensitive filesystem */
public class C111735hK extends AnonymousClass2HH {
    public final AnonymousClass68I A00;
    public final AnonymousClass160 A01;
    public final String A02;

    public C111735hK(AnonymousClass68I r1, AnonymousClass2HF r2, AnonymousClass160 r3, AnonymousClass1GR r4, C16320sq r5, String str) {
        super(r2, r3, r4, r5);
        this.A01 = r3;
        this.A02 = str;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0A = this.A01.A0A();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            C30671cl A0F = C110115dX.A0F(it);
            if (this.A02.equals(A0F.A0A)) {
                int i2 = ((AnonymousClass606) this.A00).A00;
                C39891tE r0 = (C39891tE) A0F.A08;
                if (r0 != null) {
                    r0.A04 = i2;
                }
            }
        }
        C83684Hq A0B = A0B(A0A);
        ArrayList A0i = C13690nt.A0i(1);
        if (!A0B.A01) {
            return A0B;
        }
        Iterator it2 = A0B.A00.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C30671cl A0F2 = C110115dX.A0F(it2);
            if (this.A02.equals(A0F2.A0A)) {
                A0i.add(A0F2);
                break;
            }
        }
        return new C83684Hq(A0i, true);
    }
}
