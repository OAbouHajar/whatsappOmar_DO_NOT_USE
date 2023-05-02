package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1HO  reason: invalid class name */
public class AnonymousClass1HO {
    public final AnonymousClass0y3 A00;
    public final Map A01 = new HashMap();

    public AnonymousClass1HO(AnonymousClass0y3 r2) {
        this.A00 = r2;
    }

    public final synchronized AnonymousClass2IZ A00(C15830rv r4) {
        AnonymousClass2IZ r1;
        Map map = this.A01;
        r1 = (AnonymousClass2IZ) map.get(r4.getRawString());
        if (r1 == null) {
            r1 = new AnonymousClass2IZ(this);
            map.put(r4.getRawString(), r1);
        }
        return r1;
    }

    public void A01(C16740tZ r5) {
        C28381Vw r3 = r5.A11;
        C15830rv r0 = r3.A00;
        AnonymousClass00B.A06(r0);
        AnonymousClass2IZ A002 = A00(r0);
        synchronized (A002) {
            boolean z2 = false;
            if (A002.A01.remove(r3) != null) {
                z2 = true;
            }
            A002.A00.remove(r3);
            A002.toString();
            if (z2) {
                A002.A00();
            }
        }
    }
}
