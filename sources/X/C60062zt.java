package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zt  reason: invalid class name and case insensitive filesystem */
public class C60062zt extends C607435q {
    public final C15900s5 A00;
    public final C16000sG A01;

    public C60062zt(C15900s5 r1, C16000sG r2, C16080sP r3, AnonymousClass1V8 r4, AnonymousClass013 r5, List list) {
        super(r3, r4, r5, list);
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list;
        ArrayList A0u = AnonymousClass000.A0u();
        WeakReference weakReference = this.A02;
        AnonymousClass1V8 r5 = (AnonymousClass1V8) weakReference.get();
        if (r5 != null) {
            r5.A3Z(A0u);
            AnonymousClass1V8 r1 = (AnonymousClass1V8) weakReference.get();
            if (r1 != null && (list = r1.A0Z) != null && !list.isEmpty() && r1.A0a) {
                HashSet A0o = C13680ns.A0o();
                Iterator it = A0u.iterator();
                while (it.hasNext()) {
                    A0o.add(C13680ns.A0U(it).A08(C15830rv.class));
                }
                Iterator it2 = r5.A0Z.iterator();
                while (it2.hasNext()) {
                    C15830rv A0B = C13700nu.A0B(it2);
                    if (A0B != null && !A0o.contains(A0B)) {
                        C16010sH A0A = this.A01.A0A(A0B);
                        if (A0A.A0D != null) {
                            A0u.add(A0A);
                        }
                    }
                }
            }
            Collections.sort(A0u, new C73583oO(this.A00, this.A01));
        }
        Iterator it3 = A0u.iterator();
        while (it3.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it3);
            A0U.A0g = this.A03.contains(A0U.A08(C15830rv.class));
        }
        return A0u;
    }
}
