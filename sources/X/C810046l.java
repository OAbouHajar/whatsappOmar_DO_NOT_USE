package X;

import java.util.Iterator;

/* renamed from: X.46l  reason: invalid class name and case insensitive filesystem */
public final class C810046l {
    public static final C13510mV A00(C05370Qr r2) {
        C13510mV r1;
        C18450wi.A0H(r2, 0);
        Iterator it = r2.A00.iterator();
        while (true) {
            r1 = null;
            if (!it.hasNext()) {
                break;
            }
            C12020ji r12 = (C12020ji) it.next();
            if ((r12 instanceof C13510mV) && (r1 = (C13510mV) r12) != null) {
                break;
            }
        }
        return r1;
    }
}
