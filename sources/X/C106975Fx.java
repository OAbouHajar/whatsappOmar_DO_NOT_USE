package X;

/* renamed from: X.5Fx  reason: invalid class name and case insensitive filesystem */
public final class C106975Fx extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final /* synthetic */ AnonymousClass5D2 $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106975Fx(AnonymousClass5D2 r2) {
        super(2);
        this.$this_checkContext = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r6 == r2) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object AIV(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r3 = X.AnonymousClass000.A0D(r5)
            X.1UL r6 = (X.AnonymousClass1UL) r6
            X.5NJ r1 = r6.getKey()
            X.5D2 r0 = r4.$this_checkContext
            X.1UM r0 = r0.collectContext
            X.1UL r2 = r0.get(r1)
            X.58o r0 = X.C004001t.A00
            if (r1 == r0) goto L_0x0021
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r2) goto L_0x001c
        L_0x001a:
            int r0 = r3 + 1
        L_0x001c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0021:
            if (r6 == r2) goto L_0x001a
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = ", expected child of "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106975Fx.AIV(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
