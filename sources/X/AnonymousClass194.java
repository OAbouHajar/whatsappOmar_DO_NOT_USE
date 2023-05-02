package X;

import java.util.HashMap;

/* renamed from: X.194  reason: invalid class name */
public class AnonymousClass194 {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public void A00(C38571r0 r3) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            hashMap.put(r3.A03, r3);
        }
        if (r3.A01 != null) {
            HashMap hashMap2 = this.A01;
            synchronized (hashMap2) {
                hashMap2.put(r3.A01, r3);
            }
        }
    }
}
