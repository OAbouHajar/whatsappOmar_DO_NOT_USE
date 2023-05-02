package X;

import java.util.HashMap;

/* renamed from: X.1P8  reason: invalid class name */
public class AnonymousClass1P8 {
    public final HashMap A00 = new HashMap();

    public C30701co A00(C16750ta r3) {
        C30701co r0;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            r0 = (C30701co) hashMap.get(r3);
        }
        return r0;
    }
}
