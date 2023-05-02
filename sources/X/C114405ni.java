package X;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ni  reason: invalid class name and case insensitive filesystem */
public class C114405ni extends C16690tT {
    public WeakReference A00;
    public final C221116r A01;

    public C114405ni(C221116r r2, C110595eU r3) {
        this.A01 = r2;
        this.A00 = new WeakReference(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Integer[] numArr = new Integer[1];
        AnonymousClass000.A1M(numArr, 300, 0);
        return this.A01.A0c(new Integer[0], numArr, 0);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List<AnonymousClass1Vt> list = (List) obj;
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            C110595eU r5 = (C110595eU) weakReference.get();
            C13700nu.A0V(r5.A00, false);
            C13700nu.A0V(r5.A01, true);
            C118875vO r3 = r5.A07;
            ArrayList A0u = AnonymousClass000.A0u();
            C113315lq r7 = null;
            for (AnonymousClass1Vt r0 : list) {
                C113315lq A002 = r3.A00(r0.A05);
                if (r7 != null) {
                    if (r7.get(2) == A002.get(2) && r7.get(1) == A002.get(1)) {
                        r7.count++;
                    } else {
                        A0u.add(r7);
                    }
                }
                A002.count = 0;
                r7 = A002;
                r7.count++;
            }
            if (r7 != null) {
                A0u.add(r7);
            }
            ArrayList A0u2 = AnonymousClass000.A0u();
            for (int i2 = 0; i2 < list.size(); i2++) {
                AnonymousClass1Vt r9 = (AnonymousClass1Vt) list.get(i2);
                C113905mo r72 = new C113905mo();
                r72.A01 = C28891Zc.A05(r5.A05, r5.A04.A02(r9.A05));
                r72.A00 = r5.A08.A0J(r9);
                boolean z2 = true;
                if (i2 < list.size() - 1) {
                    C113315lq A003 = r3.A00(r9.A05);
                    C113315lq A004 = r3.A00(((AnonymousClass1Vt) list.get(i2 + 1)).A05);
                    if (A003.get(2) != A004.get(2) || A003.get(1) != A004.get(1)) {
                        z2 = false;
                    }
                }
                r72.A02 = z2;
                A0u2.add(r72);
            }
            r5.A02.A0B(Pair.create(A0u2, A0u));
        }
    }
}
