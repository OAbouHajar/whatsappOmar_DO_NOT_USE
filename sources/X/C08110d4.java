package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0d4  reason: invalid class name and case insensitive filesystem */
public abstract class C08110d4 implements C12060jm {
    public C12070jn A00;
    public Object A01;
    public final AnonymousClass0V4 A02;
    public final List A03 = AnonymousClass000.A0u();
    public final List A04 = AnonymousClass000.A0u();

    public C08110d4(AnonymousClass0V4 r2) {
        this.A02 = r2;
    }

    public final void A00(C12070jn r9, Object obj) {
        List list = this.A04;
        if (!list.isEmpty() && r9 != null) {
            if (obj == null || A02(obj)) {
                AnonymousClass0d6 r92 = (AnonymousClass0d6) r9;
                synchronized (r92.A01) {
                    C13110lU r0 = r92.A00;
                    if (r0 != null) {
                        r0.AMO(list);
                    }
                }
                return;
            }
            AnonymousClass0d6 r93 = (AnonymousClass0d6) r9;
            synchronized (r93.A01) {
                ArrayList A0u = AnonymousClass000.A0u();
                for (Object next : list) {
                    if (r93.A00(((C007303i) next).A0J)) {
                        A0u.add(next);
                    }
                }
                Iterator it = A0u.iterator();
                while (it.hasNext()) {
                    C06530Wm.A00().A02(C04470Mr.A00, AnonymousClass000.A0e((C007303i) it.next(), "Constraints met for ", AnonymousClass000.A0o()));
                }
                C13110lU r02 = r93.A00;
                if (r02 != null) {
                    r02.AMN(A0u);
                }
            }
        }
    }

    public abstract boolean A01(C007303i r1);

    public abstract boolean A02(Object obj);
}
