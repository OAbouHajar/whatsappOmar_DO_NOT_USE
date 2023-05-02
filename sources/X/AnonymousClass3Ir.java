package X;

/* renamed from: X.3Ir  reason: invalid class name */
public final class AnonymousClass3Ir extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass22J $onError;
    public final /* synthetic */ AnonymousClass22J $onSuccess;
    public final /* synthetic */ AnonymousClass4NR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ir(AnonymousClass4NR r2, AnonymousClass22J r3, AnonymousClass22J r4) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
        this.$onSuccess = r4;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.1vQ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object AIU(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r16
            X.4j4 r0 = (X.C93364j4) r0
            r9 = 0
            X.C18450wi.A0H(r0, r9)
            java.lang.String r3 = r0.A00
            X.4NR r0 = r15.this$0
            if (r3 != 0) goto L_0x001a
            X.0pt r2 = r0.A00
            X.22J r1 = r15.$onError
            r0 = 10
        L_0x0014:
            X.C14870pt.A01(r2, r1, r0)
        L_0x0017:
            X.22M r0 = X.AnonymousClass22M.A00
            return r0
        L_0x001a:
            X.01D r0 = r0.A03
            java.lang.Object r2 = r0.get()
            X.13g r2 = (X.C212213g) r2
            X.C18450wi.A09(r2)
            r1 = 0
            X.4j7 r0 = new X.4j7
            r0.<init>(r3, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C18450wi.A0B(r0)
            r1 = 0
            java.util.List r2 = r2.A01(r0, r9)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x004b
            r0 = 0
        L_0x003e:
            X.4Vq r0 = (X.AnonymousClass4Vq) r0
            if (r0 != 0) goto L_0x0050
            X.4NR r0 = r15.this$0
            X.0pt r2 = r0.A00
            X.22J r1 = r15.$onError
            r0 = 11
            goto L_0x0014
        L_0x004b:
            java.lang.Object r0 = r2.get(r9)
            goto L_0x003e
        L_0x0050:
            android.graphics.Bitmap r7 = r0.A00
            int r4 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r3 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
            int r2 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
            int r2 = r2 * r0
            int[] r8 = new int[r2]     // Catch:{ all -> 0x00f8 }
            int r10 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r13 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r14 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
            r11 = 0
            r12 = 0
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00f8 }
            r6 = 0
            r5 = 0
        L_0x0078:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            if (r5 >= r0) goto L_0x0095
            r2 = 0
        L_0x007f:
            int r0 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
            if (r2 >= r0) goto L_0x0092
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r0 = r0 * r2
            int r0 = r0 + r5
            r0 = r8[r0]     // Catch:{ all -> 0x00f8 }
            if (r0 != 0) goto L_0x0096
            int r2 = r2 + 1
            goto L_0x007f
        L_0x0092:
            int r5 = r5 + 1
            goto L_0x0078
        L_0x0095:
            r5 = 0
        L_0x0096:
            int r0 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
            if (r1 >= r0) goto L_0x00b5
            r2 = r5
        L_0x009d:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            if (r2 >= r0) goto L_0x00b1
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r0 = r0 * r1
            int r0 = r0 + r2
            r0 = r8[r0]     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x0096
        L_0x00b4:
            r6 = r1
        L_0x00b5:
            int r2 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
        L_0x00b9:
            int r2 = r2 + -1
            if (r2 < r5) goto L_0x00d0
            int r1 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
        L_0x00c1:
            int r1 = r1 + -1
            if (r1 < r6) goto L_0x00b9
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r0 = r0 * r1
            int r0 = r0 + r2
            r0 = r8[r0]     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00c1
            r4 = r2
        L_0x00d0:
            int r2 = r7.getHeight()     // Catch:{ all -> 0x00f8 }
        L_0x00d4:
            int r2 = r2 + -1
            if (r2 < r6) goto L_0x00eb
            int r1 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
        L_0x00dc:
            int r1 = r1 + -1
            if (r1 < r5) goto L_0x00d4
            int r0 = r7.getWidth()     // Catch:{ all -> 0x00f8 }
            int r0 = r0 * r2
            int r0 = r0 + r1
            r0 = r8[r0]     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00dc
            r3 = r2
        L_0x00eb:
            int r4 = r4 - r5
            int r3 = r3 - r6
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r7, r5, r6, r4, r3)     // Catch:{ all -> 0x00f8 }
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x00f8 }
            r7.recycle()     // Catch:{ all -> 0x00f8 }
            goto L_0x00fe
        L_0x00f8:
            r0 = move-exception
            X.1vQ r1 = new X.1vQ
            r1.<init>(r0)
        L_0x00fe:
            boolean r0 = r1 instanceof X.C41211vQ
            if (r0 != 0) goto L_0x0103
            r7 = r1
        L_0x0103:
            X.4NR r0 = r15.this$0
            X.0pt r2 = r0.A00
            X.22J r1 = r15.$onSuccess
            r0 = 43
            X.C14870pt.A03(r2, r1, r7, r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ir.AIU(java.lang.Object):java.lang.Object");
    }
}
