package X;

/* renamed from: X.0Ep  reason: invalid class name and case insensitive filesystem */
public class C02730Ep extends AnonymousClass0QI {
    public final Object A00;
    public final Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 != X.AnonymousClass01A.A0m) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C02730Ep(X.AnonymousClass024 r5, X.AnonymousClass0S3 r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            X.0Kg r1 = r6.A01
            X.0Kg r0 = X.C03890Kg.VISIBLE
            X.01A r3 = r6.A04
            if (r1 != r0) goto L_0x003b
            X.0PD r0 = r3.A0C
            if (r7 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A08
            java.lang.Object r0 = X.AnonymousClass01A.A0m
            if (r2 != r0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r4.A01 = r2
            if (r8 == 0) goto L_0x0034
            if (r7 == 0) goto L_0x002d
            X.0PD r2 = r3.A0C
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r2.A0B
            java.lang.Object r0 = X.AnonymousClass01A.A0m
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A0A
        L_0x002a:
            r4.A00 = r1
            return
        L_0x002d:
            X.0PD r0 = r3.A0C
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r0.A0A
            goto L_0x002a
        L_0x0034:
            r1 = 0
            goto L_0x002a
        L_0x0036:
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r0.A07
            goto L_0x0018
        L_0x003b:
            if (r7 == 0) goto L_0x0017
            X.0PD r1 = r3.A0C
            if (r1 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A09
            java.lang.Object r0 = X.AnonymousClass01A.A0m
            if (r2 != r0) goto L_0x0018
            java.lang.Object r2 = r1.A07
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02730Ep.<init>(X.024, X.0S3, boolean, boolean):void");
    }

    public final AnonymousClass0WS A02(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass0WS r1 = AnonymousClass0Vo.A00;
        if (r1 != null && r1.A0G(obj)) {
            return r1;
        }
        AnonymousClass0WS r12 = AnonymousClass0Vo.A01;
        if (r12 != null && r12.A0G(obj)) {
            return r12;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Transition ");
        A0r.append(obj);
        A0r.append(" for fragment ");
        A0r.append(this.A01.A04);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" is not a valid framework Transition or AndroidX Transition", A0r));
    }
}
