package X;

import java.util.HashMap;

/* renamed from: X.05k  reason: invalid class name and case insensitive filesystem */
public class C011305k extends AnonymousClass03P {
    public HashMap A00 = new HashMap();

    public AnonymousClass060 A00(Object obj) {
        return (AnonymousClass060) this.A00.get(obj);
    }

    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    public Object A02(Object obj, Object obj2) {
        AnonymousClass060 A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        HashMap hashMap = this.A00;
        AnonymousClass060 r1 = new AnonymousClass060(obj, obj2);
        this.A00++;
        AnonymousClass060 r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        hashMap.put(obj, r1);
        return null;
    }
}
