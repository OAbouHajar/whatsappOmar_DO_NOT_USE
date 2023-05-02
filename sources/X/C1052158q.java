package X;

import java.io.Serializable;
import kotlin.jvm.internal.IDxLambdaShape59S0000000_2_I1;

/* renamed from: X.58q  reason: invalid class name and case insensitive filesystem */
public final class C1052158q implements AnonymousClass1UM, Serializable {
    public final AnonymousClass1UL element;
    public final AnonymousClass1UM left;

    public C1052158q(AnonymousClass1UL r1, AnonymousClass1UM r2) {
        C18450wi.A0J(r2, r1);
        this.left = r2;
        this.element = r1;
    }

    private final Object writeReplace() {
        int i2 = 2;
        C1052158q r1 = this;
        while (true) {
            AnonymousClass1UM r12 = r1.left;
            if (!(r12 instanceof C1052158q) || (r1 = (C1052158q) r12) == null) {
                AnonymousClass1UM[] r3 = new AnonymousClass1UM[i2];
                C1041354b r2 = new C1041354b();
                fold(AnonymousClass22M.A00, new C106985Fy(r2, r3));
            } else {
                i2++;
            }
        }
        AnonymousClass1UM[] r32 = new AnonymousClass1UM[i2];
        C1041354b r22 = new C1041354b();
        fold(AnonymousClass22M.A00, new C106985Fy(r22, r32));
        if (r22.element == i2) {
            return new C1042154j(r32);
        }
        throw AnonymousClass000.A0V("Check failed.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[LOOP:2: B:16:0x0029->B:20:0x003f, LOOP_START, PHI: r1 
      PHI: (r1v4 X.58q) = (r1v3 X.58q), (r1v7 X.58q) binds: [B:15:0x0027, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0052
            boolean r0 = r6 instanceof X.C1052158q
            if (r0 == 0) goto L_0x0054
            X.58q r6 = (X.C1052158q) r6
            r4 = 2
            r1 = r6
        L_0x000a:
            X.1UM r1 = r1.left
            boolean r0 = r1 instanceof X.C1052158q
            if (r0 == 0) goto L_0x0017
            X.58q r1 = (X.C1052158q) r1
            if (r1 == 0) goto L_0x0017
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0017:
            r1 = r5
            r3 = 2
            r2 = r5
        L_0x001a:
            X.1UM r2 = r2.left
            boolean r0 = r2 instanceof X.C1052158q
            if (r0 == 0) goto L_0x0027
            X.58q r2 = (X.C1052158q) r2
            if (r2 == 0) goto L_0x0027
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0027:
            if (r4 != r3) goto L_0x0054
        L_0x0029:
            X.1UL r2 = r1.element
            X.5NJ r0 = r2.getKey()
            X.1UL r0 = r6.get(r0)
            boolean r0 = X.C18450wi.A0R(r0, r2)
            if (r0 == 0) goto L_0x0054
            X.1UM r1 = r1.left
            boolean r0 = r1 instanceof X.C1052158q
            if (r0 == 0) goto L_0x0042
            X.58q r1 = (X.C1052158q) r1
            goto L_0x0029
        L_0x0042:
            X.1UL r1 = (X.AnonymousClass1UL) r1
            X.5NJ r0 = r1.getKey()
            X.1UL r0 = r6.get(r0)
            boolean r0 = X.C18450wi.A0R(r0, r1)
            if (r0 == 0) goto L_0x0054
        L_0x0052:
            r0 = 1
            return r0
        L_0x0054:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1052158q.equals(java.lang.Object):boolean");
    }

    public Object fold(Object obj, AnonymousClass1UJ r4) {
        C18450wi.A0H(r4, 1);
        return r4.AIV(this.left.fold(obj, r4), this.element);
    }

    public AnonymousClass1UL get(AnonymousClass5NJ r3) {
        C18450wi.A0H(r3, 0);
        C1052158q r1 = this;
        while (true) {
            AnonymousClass1UL r0 = r1.element.get(r3);
            if (r0 != null) {
                return r0;
            }
            AnonymousClass1UM r12 = r1.left;
            if (!(r12 instanceof C1052158q)) {
                return r12.get(r3);
            }
            r1 = (C1052158q) r12;
        }
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.element, this.left.hashCode());
    }

    public AnonymousClass1UM minusKey(AnonymousClass5NJ r4) {
        C18450wi.A0H(r4, 0);
        if (this.element.get(r4) != null) {
            return this.left;
        }
        AnonymousClass1UM minusKey = this.left.minusKey(r4);
        return minusKey == this.left ? this : minusKey == C1052258r.A00 ? this.element : new C1052158q(this.element, minusKey);
    }

    public AnonymousClass1UM plus(AnonymousClass1UM r3) {
        C18450wi.A0H(r3, 1);
        return r3 != C1052258r.A00 ? (AnonymousClass1UM) r3.fold(this, new IDxLambdaShape59S0000000_2_I1(3)) : this;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[");
        A0r.append((String) fold("", new IDxLambdaShape59S0000000_2_I1(2)));
        return AnonymousClass3K2.A0m(A0r);
    }
}
