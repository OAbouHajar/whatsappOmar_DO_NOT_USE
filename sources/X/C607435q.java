package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.35q  reason: invalid class name and case insensitive filesystem */
public abstract class C607435q extends C16690tT {
    public final C16080sP A00;
    public final AnonymousClass013 A01;
    public final WeakReference A02;
    public final Set A03 = C13680ns.A0o();

    public C607435q(C16080sP r5, AnonymousClass1V8 r6, AnonymousClass013 r7, List list) {
        super(r6, true);
        this.A02 = C13690nt.A0h(r6);
        this.A00 = r5;
        this.A01 = r7;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(C13680ns.A0U(it).A08(C15830rv.class));
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List list = (List) obj;
        AnonymousClass1V8 r0 = (AnonymousClass1V8) this.A02.get();
        if (r0 != null) {
            r0.A3b(list);
        }
    }
}
