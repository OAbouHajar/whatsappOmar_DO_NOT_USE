package X;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.0wJ  reason: invalid class name and case insensitive filesystem */
public class C18200wJ {
    public HashMap A00;
    public final C16440t3 A01;
    public final C14710pd A02;
    public final C16490t9 A03;

    public C18200wJ(C16440t3 r2, C14710pd r3, C16490t9 r4, HashMap hashMap) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r4, 3);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = hashMap;
    }

    public final void A00(int i2) {
        if (this.A02.A0E(C16620tM.A02, 2013)) {
            AnonymousClass3qJ r2 = new AnonymousClass3qJ();
            r2.A00 = Integer.valueOf(i2);
            C16490t9 r1 = this.A03;
            r1.A06(r2);
            r1.A0F(true);
        }
    }

    public final void A01(C15830rv r4, int i2) {
        if (r4 != null) {
            HashMap hashMap = this.A00;
            if (!hashMap.containsKey(r4)) {
                hashMap.put(r4, new HashSet());
            }
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r4);
            if (abstractCollection != null) {
                Integer valueOf = Integer.valueOf(i2);
                if (!abstractCollection.contains(valueOf)) {
                    A00(i2);
                    abstractCollection.add(valueOf);
                }
            }
        }
    }
}
