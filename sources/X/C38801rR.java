package X;

/* renamed from: X.1rR  reason: invalid class name and case insensitive filesystem */
public class C38801rR extends C38721rJ implements C16850tk, C30081bi {
    public C38801rR(C16750ta r9, C28381Vw r10, C38801rR r11, long j2) {
        super(r9, r10, (C16730tY) r11, (byte) 13, j2, false);
    }

    public C38801rR(C16750ta r9, C28381Vw r10, C38801rR r11, long j2, boolean z2) {
        super(r9, r10, (C16730tY) r11, r11.A10, j2, z2);
    }

    public C38801rR(C28381Vw r2, byte b2, long j2) {
        super(r2, (byte) 29, j2);
    }

    public C38801rR(C28381Vw r2, long j2) {
        super(r2, (byte) 13, j2);
    }

    public C38801rR(C445524n r9, C28381Vw r10, long j2, boolean z2, boolean z3) {
        super(r9, r10, (byte) 13, j2, z2, z3);
        A1B(r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r5 != null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5j(X.AnonymousClass21Q r15, X.AnonymousClass1GC r16) {
        /*
            r14 = this;
            r7 = r14
            boolean r0 = r14 instanceof X.C38931re
            r10 = r16
            if (r0 == 0) goto L_0x00a3
            X.1re r7 = (X.C38931re) r7
            X.1iE r3 = r15.A04
            X.2uY r0 = r3.A05()
            X.1Wr r2 = r0.A0U()
            X.3fM r2 = (X.C69633fM) r2
            X.2uY r0 = r3.A05()
            X.2uZ r4 = r0.A03
            if (r4 != 0) goto L_0x001f
            X.2uZ r4 = X.C59032uZ.A07
        L_0x001f:
            int r1 = r4.A01
            r0 = 4
            if (r1 != r0) goto L_0x00a0
            java.lang.Object r0 = r4.A03
            X.1Wm r0 = (X.C28541Wm) r0
        L_0x0028:
            X.1Wr r8 = r0.A0U()
            X.3fI r8 = (X.C69593fI) r8
            boolean r12 = r15.A09
            boolean r13 = r15.A07
            X.1WV r9 = r15.A05
            byte[] r11 = r15.A0A
            X.3fI r5 = r7.A19(r8, r9, r10, r11, r12, r13)
            X.0ta r6 = r7.A02
            if (r6 == 0) goto L_0x008a
            if (r12 != 0) goto L_0x0044
            byte[] r0 = r6.A0U
            if (r0 == 0) goto L_0x008a
        L_0x0044:
            if (r5 == 0) goto L_0x008a
            r5.A03()
            X.1Wm r1 = r5.A00
            X.24n r1 = (X.C445524n) r1
            r4 = 1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A0M = r4
            int r1 = r6.A05
            if (r1 == r4) goto L_0x0087
            r0 = 2
            if (r1 == r0) goto L_0x0084
            X.42V r0 = X.AnonymousClass42V.A02
        L_0x005f:
            r5.A05(r0)
        L_0x0062:
            X.1cf r0 = r7.A00
            if (r0 == 0) goto L_0x010f
            X.3fH r4 = X.AnonymousClass38C.A00(r3, r0)
            r4.A03()
            X.1Wm r1 = r4.A00
            X.2uZ r1 = (X.C59032uZ) r1
            X.1Wm r0 = r5.A02()
            r1.A03 = r0
            r0 = 4
            r1.A01 = r0
            r2.A06(r4)
            r2.A05(r4)
            r3.A0D(r2)
            return
        L_0x0084:
            X.42V r0 = X.AnonymousClass42V.A03
            goto L_0x005f
        L_0x0087:
            X.42V r0 = X.AnonymousClass42V.A01
            goto L_0x005f
        L_0x008a:
            java.lang.String r0 = "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            byte r0 = r7.A10
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r5 == 0) goto L_0x010f
            goto L_0x0062
        L_0x00a0:
            X.24n r0 = X.C445524n.A0O
            goto L_0x0028
        L_0x00a3:
            X.1iE r3 = r15.A04
            X.1Wm r0 = r3.A00
            X.1iD r0 = (X.C33211iD) r0
            X.24n r0 = r0.A0l
            if (r0 != 0) goto L_0x00af
            X.24n r0 = X.C445524n.A0O
        L_0x00af:
            X.1Wr r8 = r0.A0U()
            X.3fI r8 = (X.C69593fI) r8
            boolean r12 = r15.A09
            boolean r13 = r15.A07
            X.1WV r9 = r15.A05
            byte[] r11 = r15.A0A
            X.3fI r5 = r7.A19(r8, r9, r10, r11, r12, r13)
            X.0ta r4 = r14.A02
            if (r4 == 0) goto L_0x0105
            if (r12 != 0) goto L_0x00cb
            byte[] r0 = r4.A0U
            if (r0 == 0) goto L_0x0105
        L_0x00cb:
            if (r5 == 0) goto L_0x0105
            r5.A03()
            X.1Wm r1 = r5.A00
            X.24n r1 = (X.C445524n) r1
            r2 = 1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A0M = r2
            int r1 = r4.A05
            if (r1 == r2) goto L_0x0102
            r0 = 2
            if (r1 == r0) goto L_0x00ff
            X.42V r0 = X.AnonymousClass42V.A02
        L_0x00e6:
            r5.A05(r0)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.1iD r1 = (X.C33211iD) r1
            X.1Wm r0 = r5.A02()
            X.24n r0 = (X.C445524n) r0
            r1.A0l = r0
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            return
        L_0x00ff:
            X.42V r0 = X.AnonymousClass42V.A03
            goto L_0x00e6
        L_0x0102:
            X.42V r0 = X.AnonymousClass42V.A01
            goto L_0x00e6
        L_0x0105:
            java.lang.String r0 = "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            byte r0 = r14.A10
            goto L_0x0118
        L_0x010f:
            java.lang.String r0 = "MessageTemplateGif: cannot send encrypted media message, "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            byte r0 = r7.A10
        L_0x0118:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38801rR.A5j(X.21Q, X.1GC):void");
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r8) {
        C28381Vw r2 = r8;
        if (this instanceof C38931re) {
            C38931re r3 = (C38931re) this;
            return new C38931re(r3.A02, r2, r3, r3.A0I);
        }
        return new C38801rR(this.A02, r2, this, this.A0I, true);
    }
}
