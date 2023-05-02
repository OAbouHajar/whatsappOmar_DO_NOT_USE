package X;

import com.whatsapp.util.Log;

/* renamed from: X.1RV  reason: invalid class name */
public class AnonymousClass1RV {
    public final C14870pt A00;
    public final AnonymousClass1RU A01;
    public final AnonymousClass1RT A02;
    public final AnonymousClass1QO A03;
    public final AnonymousClass18C A04;
    public final C16320sq A05;

    public AnonymousClass1RV(C14870pt r1, AnonymousClass1RU r2, AnonymousClass1RT r3, AnonymousClass1QO r4, AnonymousClass18C r5, C16320sq r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A00(C16740tZ r4) {
        C42591y4 A12;
        C42591y4 A122;
        if (r4 != null) {
            if (AnonymousClass01E.A01()) {
                Log.w("message is lazy loaded on ui thread", new Throwable());
            }
            if (r4 instanceof C38701rH) {
                AnonymousClass1RT r2 = this.A02;
                C38701rH r1 = (C38701rH) r4;
                if (r1.A00 == null && r1.A10(32768)) {
                    r2.A00.A01(r1);
                }
            }
            this.A04.A00(r4);
            AnonymousClass1QO r22 = this.A03;
            synchronized (r22) {
                if ((r4 instanceof C16730tY) && (A122 = ((C16730tY) r4).A12()) != null) {
                    r22.A00(A122);
                    A122.A00 = true;
                }
                C16740tZ A0D = r4.A0D();
                if ((A0D instanceof C16730tY) && (A12 = ((C16730tY) A0D).A12()) != null) {
                    A12.A00 = true;
                }
            }
            for (Number byteValue : AnonymousClass15G.A0O) {
                this.A01.A01(r4, byteValue.byteValue());
            }
            if (!C30921dB.A02(r4)) {
                throw new IllegalStateException("ensureCompletelyLoaded failed");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.A10(32768) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r4, java.lang.Runnable r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C38701rH
            if (r0 == 0) goto L_0x0021
            r1 = r4
            X.1rH r1 = (X.C38701rH) r1
            X.1yC r0 = r1.A00
            if (r0 != 0) goto L_0x0021
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r1.A10(r0)
            if (r0 == 0) goto L_0x0021
        L_0x0014:
            X.0sq r2 = r3.A05
            r1 = 49
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r3, r4, r5, r1)
            r2.Acl(r0)
            return
        L_0x0021:
            X.18C r0 = r3.A04
            boolean r0 = r0.A03(r4)
            if (r0 != 0) goto L_0x0014
            X.1QO r0 = r3.A03
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x0014
            if (r4 == 0) goto L_0x0050
            java.util.List r0 = X.AnonymousClass15G.A0O
            java.util.Iterator r1 = r0.iterator()
        L_0x0039:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            boolean r0 = X.AnonymousClass1RU.A00(r4, r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x0014
        L_0x0050:
            X.0pt r0 = r3.A00
            r0.Acq(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RV.A01(X.0tZ, java.lang.Runnable):void");
    }
}
