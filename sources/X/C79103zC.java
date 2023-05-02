package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3zC  reason: invalid class name and case insensitive filesystem */
public class C79103zC extends C16690tT {
    public final AnonymousClass10G A00;
    public final AnonymousClass1XZ A01;
    public final Set A02;

    public C79103zC(AnonymousClass10G r2, C15830rv r3, AnonymousClass1XZ r4) {
        this.A00 = r2;
        HashSet A0o = C13680ns.A0o();
        this.A02 = A0o;
        A0o.add(r3);
        this.A01 = r4;
    }

    public C79103zC(AnonymousClass10G r2, AnonymousClass1XZ r3, Set set) {
        this.A00 = r2;
        this.A02 = new HashSet(set);
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z2;
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            C15830rv r1 = (C15830rv) it.next();
            if (!C16690tT.A02(this)) {
                if (this.A00.A00(r1) > 0) {
                    z2 = true;
                    break;
                }
            } else {
                return null;
            }
        }
        if (!C16690tT.A02(this)) {
            return Boolean.valueOf(z2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !C16690tT.A02(this)) {
            this.A01.AHG(bool.booleanValue());
        }
    }
}
