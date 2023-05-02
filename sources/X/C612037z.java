package X;

/* renamed from: X.37z  reason: invalid class name and case insensitive filesystem */
public class C612037z {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        r0 = (X.C31201dg) (r0 = (android.util.SparseArray) r0.A01.get(r13.A00)).get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C31201dg A00(X.AnonymousClass3AN r11, X.C31201dg r12, X.C31201dg r13, java.util.List r14, java.util.List r15, java.util.Map r16) {
        /*
            java.lang.Object r0 = X.C13690nt.A0Z(r15)
            int r4 = X.AnonymousClass000.A0D(r0)
            r0 = 1
            java.lang.Object r6 = r15.get(r0)
            java.util.Map r6 = (java.util.Map) r6
            r0 = 2
            java.lang.String r3 = X.AnonymousClass000.A0n(r15, r0)
            r0 = 143(0x8f, float:2.0E-43)
            java.util.List r2 = r12.A0M(r0)
            if (r4 < 0) goto L_0x00c1
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x00c1
            X.1dg r4 = X.C13690nt.A0Q(r2, r4)
            X.4Qf r0 = r11.A02
            int r5 = r0.A00(r12, r4, r3)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r14)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.add(r0)
            r8 = 124(0x7c, float:1.74E-43)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0o()
            java.util.Iterator r1 = r2.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = X.AnonymousClass000.A0m(r1)
            r7.append(r8)
            r7.append(r0)
            goto L_0x0042
        L_0x0053:
            java.lang.String r8 = r7.toString()
            if (r6 == 0) goto L_0x009e
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r6)
        L_0x005d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009e
            java.util.Map$Entry r9 = X.AnonymousClass000.A0z(r10)
            java.lang.String r0 = X.C13690nt.A0f(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = "#"
            r1.append(r0)
            java.lang.String r7 = X.AnonymousClass000.A0h(r8, r1)
            java.lang.Object r6 = r9.getValue()
            java.util.Map r0 = r11.A0A
            r0.put(r7, r6)
            java.util.Set r1 = r11.A0C
            if (r1 == 0) goto L_0x0094
            java.util.Map r0 = r11.A0B
            java.lang.Object r0 = r0.get(r7)
            boolean r0 = X.AnonymousClass45W.A00(r0, r6)
            if (r0 != 0) goto L_0x0094
            r1.add(r7)
        L_0x0094:
            java.lang.Object r0 = r9.getValue()
            r1 = r16
            r1.put(r7, r0)
            goto L_0x005d
        L_0x009e:
            X.4Ju r0 = r11.A03
            if (r13 == 0) goto L_0x00b7
            android.util.SparseArray r1 = r0.A01
            int r0 = r13.A00
            java.lang.Object r0 = r1.get(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r0.get(r5)
            X.1dg r0 = (X.C31201dg) r0
            if (r0 == 0) goto L_0x00b7
            return r0
        L_0x00b7:
            X.4td r0 = new X.4td
            r0.<init>(r11, r12, r3, r2)
            X.1dg r0 = X.AnonymousClass382.A00(r0, r4)
            return r0
        L_0x00c1:
            java.lang.String r0 = "["
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            X.1dg r0 = (X.C31201dg) r0
            int r0 = r0.A01
            r5.append(r0)
            java.lang.String r0 = ", "
            r5.append(r0)
            goto L_0x00cb
        L_0x00e2:
            java.lang.String r0 = "]"
            r5.append(r0)
            java.lang.String r0 = "BloksCrash: children-binding index "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = " scopeKey: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " out of bounds for array of size "
            r1.append(r0)
            X.C13700nu.A0b(r1, r2)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612037z.A00(X.3AN, X.1dg, X.1dg, java.util.List, java.util.List, java.util.Map):X.1dg");
    }
}
