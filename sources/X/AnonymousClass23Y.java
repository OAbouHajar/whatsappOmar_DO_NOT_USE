package X;

/* renamed from: X.23Y  reason: invalid class name */
public final class AnonymousClass23Y extends C41071vB {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r7 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass23X A00(X.C16040sK r6, X.C15830rv r7, X.C33231iF r8, X.C28381Vw r9) {
        /*
            java.lang.String r0 = r8.A02
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.getNullable(r0)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0035
            X.0rv r4 = r9.A00
            boolean r3 = X.C16030sJ.A0L(r4)
            boolean r0 = r8.A04
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L_0x0028
            if (r3 == 0) goto L_0x0033
            if (r7 == 0) goto L_0x0033
        L_0x001a:
            r5 = r7
        L_0x001b:
            java.lang.String r0 = r8.A01
            X.1Vw r1 = new X.1Vw
            r1.<init>(r4, r0, r2)
            X.23X r0 = new X.23X
            r0.<init>(r5, r1)
            return r0
        L_0x0028:
            boolean r0 = r6.A0I(r5)
            if (r0 != 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            r7 = r5
            goto L_0x001a
        L_0x0032:
            r2 = 1
        L_0x0033:
            r7 = r1
            goto L_0x001a
        L_0x0035:
            boolean r2 = r8.A04
            X.0rv r4 = r9.A00
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23Y.A00(X.0sK, X.0rv, X.1iF, X.1Vw):X.23X");
    }

    public static AnonymousClass23X A01(C16740tZ r5) {
        if (!r5.A0t) {
            return null;
        }
        C28381Vw r4 = r5.A11;
        return new AnonymousClass23X(r4.A00, new C28381Vw(r5.A0B(), r4.A01, r4.A02));
    }

    public static void A02(C15830rv r2, C33241iG r3, C28381Vw r4) {
        C15830rv r1 = r4.A00;
        AnonymousClass00B.A06(r1);
        r3.A07(r1.getRawString());
        r3.A05(r4.A01);
        boolean z2 = r4.A02;
        r3.A08(z2);
        if (r2 == null) {
            return;
        }
        if ((!z2 && C16030sJ.A0L(r1)) || C16030sJ.A0G(r1)) {
            r3.A06(r2.getRawString());
        }
    }
}
