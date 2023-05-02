package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.4Z4  reason: invalid class name */
public class AnonymousClass4Z4 {
    public static HashMap A00 = AnonymousClass000.A0x();
    public static HashMap A01 = AnonymousClass000.A0x();

    static {
        A00(AnonymousClass489.class);
        A00(C62113Br.class);
    }

    public static void A00(Class cls) {
        Class<Object> cls2 = Object.class;
        HashMap hashMap = A01;
        synchronized (hashMap) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(cls2);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                hashMap.put(cls2, linkedHashSet);
            }
            linkedHashSet.add(cls);
        }
    }
}
