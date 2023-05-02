package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zu  reason: invalid class name and case insensitive filesystem */
public class C60072zu extends C607435q {
    public final C15900s5 A00;
    public final C16070sO A01;
    public final C17240ul A02;

    public C60072zu(C15900s5 r5, C16080sP r6, AnonymousClass1V8 r7, AnonymousClass013 r8, C16070sO r9, C17240ul r10, List list) {
        super(r6, r7, r8, list);
        this.A00 = r5;
        this.A02 = r10;
        this.A01 = r9;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(C13680ns.A0U(it).A08(C15830rv.class));
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16050sL A022;
        C17240ul r5 = this.A02;
        ArrayList A0E = r5.A0E.A0E();
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A0E.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            C15830rv r1 = A0U.A0E;
            if ((r1 instanceof C16050sL) && r5.A0a.A0A((GroupJid) r1)) {
                int A023 = r5.A0R.A02((GroupJid) A0U.A08(C16050sL.class));
                if (A023 == 2) {
                    A022 = r5.A0B.A02((C16050sL) A0U.A0E);
                } else if (A023 == 0) {
                    A022 = null;
                }
                A0U.A0E(r5.A06, new C34911l4(A022, A023));
                A0u.add(A0U);
            }
        }
        Iterator it2 = A0u.iterator();
        while (it2.hasNext()) {
            C15830rv r2 = C13680ns.A0U(it2).A0E;
            if (r2 != null) {
                this.A00.A0K((C16060sN) r2, 1, true);
            }
        }
        Collections.sort(A0u, new C73613oR(this, this.A00, this.A01));
        Iterator it3 = A0u.iterator();
        while (it3.hasNext()) {
            C16010sH A0U2 = C13680ns.A0U(it3);
            A0U2.A0g = this.A03.contains(A0U2.A08(C15830rv.class));
        }
        return A0u;
    }
}
