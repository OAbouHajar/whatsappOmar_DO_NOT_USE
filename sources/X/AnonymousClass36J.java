package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36J  reason: invalid class name */
public class AnonymousClass36J extends C16690tT {
    public final C16080sP A00;
    public final C220516l A01;
    public final WeakReference A02;
    public final ArrayList A03;
    public final List A04;

    public AnonymousClass36J(C16080sP r2, AnonymousClass1V8 r3, C220516l r4, List list, List list2) {
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = list != null ? C13680ns.A0n(list) : null;
        this.A04 = list2;
        this.A02 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            if (C16080sP.A01(this.A00, A0U, this.A03)) {
                A0u.add(A0U);
            }
        }
        if (A0u.isEmpty()) {
            C220516l r3 = this.A01;
            if (r3.A04.A0E(C16620tM.A02, 1666)) {
                r3.A05.A06(new C74163px());
            }
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List list = (List) obj;
        AnonymousClass1V8 r0 = (AnonymousClass1V8) this.A02.get();
        if (r0 != null) {
            r0.A3a(list);
        }
    }
}
