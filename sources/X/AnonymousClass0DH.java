package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0DH  reason: invalid class name */
public final class AnonymousClass0DH extends C05330Qh {
    public final WeakReference A00;

    public AnonymousClass0DH(AnonymousClass0F6 r2) {
        this.A00 = new WeakReference(r2);
    }

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && ((AnonymousClass0F6) weakReference.get()).A0I) {
            AnonymousClass0F6 r2 = (AnonymousClass0F6) weakReference.get();
            AnonymousClass027 r1 = r2.A0D;
            if (r1 == null) {
                r1 = new AnonymousClass027();
                r2.A0D = r1;
            }
            AnonymousClass0F6.A01(r1, true);
        }
    }

    public void A01(int i2, CharSequence charSequence) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && !((AnonymousClass0F6) weakReference.get()).A0J && ((AnonymousClass0F6) weakReference.get()).A0I) {
            AnonymousClass0F6 r2 = (AnonymousClass0F6) weakReference.get();
            AnonymousClass0QF r1 = new AnonymousClass0QF(i2, charSequence);
            AnonymousClass027 r0 = r2.A08;
            if (r0 == null) {
                r0 = new AnonymousClass027();
                r2.A08 = r0;
            }
            AnonymousClass0F6.A01(r0, r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if ((r1 & 32768) != 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C04730Nr r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r3 = r4.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r3.get()
            X.0F6 r0 = (X.AnonymousClass0F6) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0048
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0034
            X.0Wh r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.0F6 r0 = (X.AnonymousClass0F6) r0
            int r1 = r0.A05()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L_0x002e
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = -1
        L_0x002f:
            X.0Nr r5 = new X.0Nr
            r5.<init>(r2, r0)
        L_0x0034:
            java.lang.Object r1 = r3.get()
            X.0F6 r1 = (X.AnonymousClass0F6) r1
            X.027 r0 = r1.A0A
            if (r0 != 0) goto L_0x0045
            X.027 r0 = new X.027
            r0.<init>()
            r1.A0A = r0
        L_0x0045:
            X.AnonymousClass0F6.A01(r0, r5)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DH.A02(X.0Nr):void");
    }
}
