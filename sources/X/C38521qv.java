package X;

/* renamed from: X.1qv  reason: invalid class name and case insensitive filesystem */
public class C38521qv extends C16690tT {
    public final AnonymousClass14W A00;
    public final C38511qu A01;
    public final AnonymousClass1CX A02;

    public C38521qv(AnonymousClass14W r1, C38511qu r2, AnonymousClass1CX r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r8.A0Q == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r4.A0C(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = new java.lang.StringBuilder("StickerRepository/uninstallStickerPackSync/sticker pack id: ");
        r0.append(r3);
        com.whatsapp.util.Log.i(r0.toString());
        r7 = r4.A0U;
        X.AnonymousClass00B.A00();
        r0 = r7.A05;
        r6 = r8.A0F;
        r0 = r0.A02(r6);
        r0.size();
        r5 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r5.hasNext() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r2 = (X.C34151jm) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r2.A09 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r4.A06.A07(r2.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r2 = true;
        r1 = r7.A02(r8, false);
        r0 = r4.A06(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (X.AnonymousClass1XI.A0N(r0) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        r4.A0J.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r1 = new X.C74753r3();
        r1.A00 = java.lang.Boolean.valueOf(r10);
        r1.A01 = r4.A0F.A03;
        r4.A0C.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.String[] r12 = (java.lang.String[]) r12
            r0 = 0
            r3 = r12[r0]
            X.AnonymousClass00B.A06(r3)
            X.1CX r4 = r11.A02
            java.lang.String r0 = " "
            boolean r0 = r3.contains(r0)
            r9 = 0
            if (r0 == 0) goto L_0x0028
            android.util.Pair r0 = X.C27031Qe.A00(r3)
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.A0J(r1, r0)
            if (r0 == 0) goto L_0x00ae
            return r3
        L_0x0028:
            X.14d r0 = r4.A0R
            r0.A00()
            r0 = 0
            X.1pi r8 = r4.A02(r0, r3, r9)
            if (r8 == 0) goto L_0x0039
            boolean r0 = r8.A0Q
            r10 = 1
            if (r0 != 0) goto L_0x003c
        L_0x0039:
            r10 = 0
            if (r8 == 0) goto L_0x003f
        L_0x003c:
            r4.A0C(r8)
        L_0x003f:
            java.lang.String r1 = "StickerRepository/uninstallStickerPackSync/sticker pack id: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14X r7 = r4.A0U
            X.AnonymousClass00B.A00()
            X.12k r0 = r7.A05
            java.lang.String r6 = r8.A0F
            java.util.List r0 = r0.A02(r6)
            r0.size()
            java.util.Iterator r5 = r0.iterator()
        L_0x0064:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r5.next()
            X.1jm r2 = (X.C34151jm) r2
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x0064
            X.01Z r1 = r4.A06
            java.lang.String r0 = r2.A0D
            r1.A07(r0)
            goto L_0x0064
        L_0x007c:
            r2 = 1
            boolean r1 = r7.A02(r8, r9)
            java.io.File r0 = r4.A06(r6)
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.AnonymousClass1XI.A0N(r0)
            if (r0 != 0) goto L_0x008e
            r2 = 0
        L_0x008e:
            if (r1 == 0) goto L_0x00ae
            X.18G r0 = r4.A0J
            r0.A00()
            if (r2 == 0) goto L_0x00ae
            X.3r3 r1 = new X.3r3
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.A00 = r0
            X.13a r0 = r4.A0F
            java.lang.String r0 = r0.A03
            r1.A01 = r0
            X.0t9 r0 = r4.A0C
            r0.A06(r1)
            return r3
        L_0x00ae:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38521qv.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        C38511qu r1 = this.A01;
        if (r1 != null) {
            boolean z2 = false;
            if (str != null) {
                z2 = true;
            }
            r1.AXr(z2);
        }
        if (str != null) {
            for (C41781we A05 : this.A00.A01()) {
                A05.A05(str);
            }
        }
    }
}
