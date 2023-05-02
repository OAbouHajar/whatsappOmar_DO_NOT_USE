package X;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5C4  reason: invalid class name */
public class AnonymousClass5C4 extends HashMap<C1041854g, Set<C1041854g>> {
    public AnonymousClass5C4() {
        C1041854g r2 = AnonymousClass4ZH.A03;
        C1041854g[] r1 = new C1041854g[2];
        C1041854g r5 = AnonymousClass4ZH.A01;
        r1[0] = r5;
        A00(AnonymousClass4ZH.A0l, r2, this, r1, 1);
        C1041854g r22 = AnonymousClass4ZH.A05;
        C1041854g[] r12 = new C1041854g[2];
        r12[0] = r5;
        A00(AnonymousClass4ZH.A0m, r22, this, r12, 1);
        A00(AnonymousClass4ZH.A08, AnonymousClass4ZH.A09, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0C, AnonymousClass4ZH.A0D, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0A, AnonymousClass4ZH.A0B, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0E, AnonymousClass4ZH.A0F, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0G, AnonymousClass4ZH.A0H, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0d, AnonymousClass4ZH.A0c, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0b, AnonymousClass4ZH.A0a, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0f, AnonymousClass4ZH.A0e, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0Y, AnonymousClass4ZH.A0X, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0u, AnonymousClass4ZH.A0t, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0k, AnonymousClass4ZH.A0j, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0w, AnonymousClass4ZH.A0v, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0o, AnonymousClass4ZH.A0n, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0q, AnonymousClass4ZH.A0p, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0s, AnonymousClass4ZH.A0r, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0h, AnonymousClass4ZH.A0g, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0T, AnonymousClass4ZH.A0U, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0R, AnonymousClass4ZH.A0S, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0V, AnonymousClass4ZH.A0W, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0x, AnonymousClass4ZH.A0y, this, new C1041854g[1], 0);
        C1041854g r23 = AnonymousClass4ZH.A0M;
        A00(r23, AnonymousClass4ZH.A0Q, this, new C1041854g[1], 0);
        A00(r23, AnonymousClass4ZH.A0P, this, new C1041854g[1], 0);
        A00(AnonymousClass4ZH.A0J, AnonymousClass4ZH.A0I, this, new C1041854g[1], 0);
    }

    public static void A00(Object obj, Object obj2, AbstractMap abstractMap, Object[] objArr, int i2) {
        objArr[i2] = obj;
        abstractMap.put(obj2, Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr))));
    }
}
