package X;

/* renamed from: X.3HH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HH implements AnonymousClass1WE {
    public final /* synthetic */ C18220wL A00;
    public final /* synthetic */ AnonymousClass1XP A01;

    public /* synthetic */ AnonymousClass3HH(C18220wL r1, AnonymousClass1XP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0132, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0133, code lost:
        com.whatsapp.util.Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", r2);
        r0.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013a, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r31) {
        /*
            r30 = this;
            r15 = r31
            r0 = r30
            X.0wL r1 = r0.A00
            X.1XP r0 = r0.A01
            X.21D r15 = (X.AnonymousClass21D) r15
            X.210 r2 = r0.A01()
            X.1XK r5 = r2.A05
            X.1XL r2 = r0.A0L
            X.1XJ r4 = r2.A02
            boolean r3 = r4.A01
            X.1qS r2 = r0.A00()
            int[] r2 = r2.A0E
            boolean r2 = r1.A0E(r5, r2, r3)
            r14 = 0
            if (r2 != 0) goto L_0x0026
            r0.A03 = r14
        L_0x0025:
            return
        L_0x0026:
            byte[] r5 = r0.A03
            if (r5 == 0) goto L_0x0025
            X.12X r2 = r1.A07     // Catch:{ IOException -> 0x0132 }
            X.1XH r3 = r2.A00     // Catch:{ IOException -> 0x0132 }
            java.lang.String r2 = ""
            java.io.File r3 = r3.A00(r2)     // Catch:{ IOException -> 0x0132 }
            X.AnonymousClass1XI.A0G(r3, r5)     // Catch:{ IOException -> 0x0132 }
            r3.getAbsolutePath()     // Catch:{ IOException -> 0x0132 }
            X.210 r2 = r0.A01()     // Catch:{ IOException -> 0x0132 }
            X.1XK r2 = r2.A05     // Catch:{ IOException -> 0x0132 }
            byte r2 = r2.A00     // Catch:{ IOException -> 0x0132 }
            X.1XK r16 = X.C31831f6.A00(r2)     // Catch:{ IOException -> 0x0132 }
            r24 = 0
            r2 = 0
            r26 = 1
            java.lang.String r20 = "mms"
            r19 = r14
            r21 = r14
            r22 = 0
            r23 = 0
            r27 = 1
            r28 = 0
            r29 = 0
            X.1qS r13 = new X.1qS     // Catch:{ IOException -> 0x0132 }
            r17 = r3
            r18 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0132 }
            X.0wK r6 = r1.A08     // Catch:{ IOException -> 0x0132 }
            X.210 r5 = r0.A01()     // Catch:{ IOException -> 0x0132 }
            X.1XK r5 = r5.A05     // Catch:{ IOException -> 0x0132 }
            byte r11 = r5.A00     // Catch:{ IOException -> 0x0132 }
            X.210 r5 = r0.A01()     // Catch:{ IOException -> 0x0132 }
            int r10 = r5.A01     // Catch:{ IOException -> 0x0132 }
            X.1zh r5 = r0.A0K     // Catch:{ IOException -> 0x0132 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ IOException -> 0x0132 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0132 }
            boolean r9 = r5.A0I     // Catch:{ all -> 0x012f }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0132 }
            X.1f1 r5 = r0.A0J     // Catch:{ IOException -> 0x0132 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ IOException -> 0x0132 }
            java.lang.String r12 = r5.A0D     // Catch:{ IOException -> 0x0132 }
            X.1OJ r8 = r6.A0J     // Catch:{ IOException -> 0x0132 }
            r5 = 2
            X.1f1 r7 = r8.A02(r12, r5)     // Catch:{ IOException -> 0x0132 }
            if (r7 != 0) goto L_0x0124
            X.1f1 r7 = r8.A01(r12, r5)     // Catch:{ IOException -> 0x0132 }
        L_0x0091:
            X.0sq r5 = r6.A0Q     // Catch:{ IOException -> 0x0132 }
            X.1zh r6 = new X.1zh     // Catch:{ IOException -> 0x0132 }
            r6.<init>(r7, r8, r5, r9)     // Catch:{ IOException -> 0x0132 }
            r6.A03(r11, r10, r2)     // Catch:{ IOException -> 0x0132 }
            X.21A r5 = new X.21A     // Catch:{ IOException -> 0x0132 }
            r5.<init>(r7, r6)     // Catch:{ IOException -> 0x0132 }
            X.1XK r6 = r13.A05     // Catch:{ IOException -> 0x0132 }
            X.1x7 r8 = new X.1x7     // Catch:{ IOException -> 0x0132 }
            r8.<init>(r6, r3, r14, r2)     // Catch:{ IOException -> 0x0132 }
            X.1XK r7 = r8.A00     // Catch:{ IOException -> 0x0132 }
            X.1XK r3 = X.AnonymousClass1XK.A09     // Catch:{ IOException -> 0x0132 }
            if (r7 != r3) goto L_0x00f0
            r7 = 96
            r17 = r14
            r18 = 96
            r19 = 96
            r20 = 1
            X.25c r15 = new X.25c     // Catch:{ IOException -> 0x0132 }
            r16 = r14
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x0132 }
            java.io.File r3 = r8.A01     // Catch:{ IOException -> 0x0132 }
            X.25d r9 = X.C37741pe.A06(r15, r3)     // Catch:{ IOException -> 0x0132 }
            android.graphics.Bitmap r3 = r9.A02     // Catch:{ IOException -> 0x0132 }
            if (r3 == 0) goto L_0x00f0
            android.graphics.Bitmap r8 = X.C17970vw.A07(r3, r14, r7, r7)     // Catch:{ IOException -> 0x0132 }
            r3 = 48
            byte[] r7 = X.AnonymousClass20E.A00(r8, r3, r2)     // Catch:{ IOException -> 0x0132 }
            if (r7 == 0) goto L_0x00f0
            int r2 = r9.A01     // Catch:{ IOException -> 0x0132 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0132 }
            int r2 = r9.A00     // Catch:{ IOException -> 0x0132 }
            android.util.Pair r2 = X.C13680ns.A0F(r3, r2)     // Catch:{ IOException -> 0x0132 }
            r8.getWidth()     // Catch:{ IOException -> 0x0132 }
            r8.getHeight()     // Catch:{ IOException -> 0x0132 }
            X.1x9 r3 = new X.1x9     // Catch:{ IOException -> 0x0132 }
            r3.<init>(r2, r14, r7, r14)     // Catch:{ IOException -> 0x0132 }
            X.1XS r2 = r0.A04     // Catch:{ IOException -> 0x0132 }
            r2.A04(r3)     // Catch:{ IOException -> 0x0132 }
        L_0x00f0:
            X.1f1 r3 = r5.A00     // Catch:{ IOException -> 0x0132 }
            X.1zi r2 = new X.1zi     // Catch:{ IOException -> 0x0132 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0132 }
            X.1f0 r6 = new X.1f0     // Catch:{ IOException -> 0x0132 }
            r6.<init>(r2, r3, r13, r4)     // Catch:{ IOException -> 0x0132 }
            X.1zh r3 = r5.A01     // Catch:{ IOException -> 0x0132 }
            X.21E r2 = r6.A04     // Catch:{ IOException -> 0x0132 }
            r3.A06(r2)     // Catch:{ IOException -> 0x0132 }
            r0.A01 = r5     // Catch:{ IOException -> 0x0132 }
            X.1Rq r3 = r1.A0E     // Catch:{ IOException -> 0x0132 }
            java.lang.String r2 = "mediauploadqueue/enqueue "
            java.lang.String r2 = X.AnonymousClass000.A0g(r2, r6)     // Catch:{ IOException -> 0x0132 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException -> 0x0132 }
            java.lang.Runnable r4 = r3.A01(r5, r6)     // Catch:{ IOException -> 0x0132 }
            X.1er r4 = (X.C31681er) r4     // Catch:{ IOException -> 0x0132 }
            r2 = 7
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r3 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1     // Catch:{ IOException -> 0x0132 }
            r3.<init>(r0, r2)     // Catch:{ IOException -> 0x0132 }
            java.util.concurrent.Executor r2 = r1.A0K     // Catch:{ IOException -> 0x0132 }
            X.1XS r1 = r4.A0H     // Catch:{ IOException -> 0x0132 }
            r1.A03(r3, r2)     // Catch:{ IOException -> 0x0132 }
            goto L_0x012e
        L_0x0124:
            if (r9 == 0) goto L_0x0091
            int r5 = r7.A03     // Catch:{ IOException -> 0x0132 }
            int r5 = r5 + 1
            r7.A03 = r5     // Catch:{ IOException -> 0x0132 }
            goto L_0x0091
        L_0x012e:
            return
        L_0x012f:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0132 }
            throw r1     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            r2 = move-exception
            java.lang.String r1 = "MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file"
            com.whatsapp.util.Log.e(r1, r2)
            r0.A03 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HH.accept(java.lang.Object):void");
    }
}
