package X;

/* renamed from: X.2OX  reason: invalid class name */
public class AnonymousClass2OX extends AnonymousClass1ZS {
    public final C14870pt A00;
    public final C16000sG A01;
    public final C55892kc A02;
    public final AnonymousClass152 A03;
    public final C16980tz A04;
    public final AnonymousClass013 A05;
    public final boolean A06;
    public volatile boolean A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2OX(X.C14870pt r3, X.C16000sG r4, X.C55892kc r5, X.AnonymousClass152 r6, X.C16980tz r7, X.AnonymousClass013 r8, java.lang.String r9, boolean r10) {
        /*
            r2 = this;
            java.lang.String r1 = "contact-photos-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.A04 = r7
            r2.A05 = r8
            r2.A02 = r5
            r2.A00 = r3
            r2.A01 = r4
            r2.A03 = r6
            r2.A06 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2OX.<init>(X.0pt, X.0sG, X.2kc, X.152, X.0tz, X.013, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r14.A00.A0K(new com.facebook.redex.RunnableRunnableShape0S0500000_I0(r10, r11, r12, r13, r14, r15));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            r14 = r16
            boolean r0 = r14.A07     // Catch:{ InterruptedException -> 0x012d }
            if (r0 != 0) goto L_0x0132
            X.2kc r0 = r14.A02     // Catch:{ InterruptedException -> 0x012d }
            java.util.Stack r2 = r0.A00     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r2.isEmpty()     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x0023
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r14.A06     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x001d
            r0 = 15000(0x3a98, double:7.411E-320)
            goto L_0x001f
        L_0x001d:
            r0 = 0
        L_0x001f:
            r2.wait(r0)     // Catch:{ all -> 0x0123 }
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
        L_0x0023:
            boolean r0 = r14.A07     // Catch:{ InterruptedException -> 0x012d }
            if (r0 != 0) goto L_0x0132
            boolean r0 = r2.isEmpty()     // Catch:{ InterruptedException -> 0x012d }
            if (r0 != 0) goto L_0x0110
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x010d
            java.lang.Object r3 = r2.pop()     // Catch:{ all -> 0x0126 }
            X.2kf r3 = (X.C55922kf) r3     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x0005
            java.lang.Object r2 = r3.A01     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r2 instanceof X.C55902kd     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x00bf
            r6 = r2
            X.2kd r6 = (X.C55902kd) r6     // Catch:{ InterruptedException -> 0x012d }
            android.widget.ImageView r11 = r3.A04     // Catch:{ InterruptedException -> 0x012d }
            java.lang.Object r13 = r3.A05     // Catch:{ InterruptedException -> 0x012d }
            X.2OY r12 = r3.A00     // Catch:{ InterruptedException -> 0x012d }
            int r8 = r3.A03     // Catch:{ InterruptedException -> 0x012d }
            float r7 = r3.A02     // Catch:{ InterruptedException -> 0x012d }
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r0.equals(r13)     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x00bf
            int r5 = r11.getHeight()     // Catch:{ InterruptedException -> 0x012d }
            if (r5 > 0) goto L_0x0075
            android.content.Context r0 = r11.getContext()     // Catch:{ InterruptedException -> 0x012d }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ InterruptedException -> 0x012d }
            r0 = 2131167050(0x7f07074a, float:1.7948363E38)
            int r5 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x012d }
        L_0x0075:
            X.0tz r1 = r14.A04     // Catch:{ InterruptedException -> 0x012d }
            X.0sG r9 = r14.A01     // Catch:{ InterruptedException -> 0x012d }
            X.013 r0 = r14.A05     // Catch:{ InterruptedException -> 0x012d }
            X.1st r10 = new X.1st     // Catch:{ InterruptedException -> 0x012d }
            r10.<init>(r9, r1, r0)     // Catch:{ InterruptedException -> 0x012d }
            long r0 = r6.A04     // Catch:{ InterruptedException -> 0x012d }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ InterruptedException -> 0x012d }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x012d }
            java.util.Map r4 = r10.A03(r4)     // Catch:{ InterruptedException -> 0x012d }
            java.util.Collection r4 = r4.values()     // Catch:{ InterruptedException -> 0x012d }
            java.util.Iterator r10 = r4.iterator()     // Catch:{ InterruptedException -> 0x012d }
        L_0x0096:
            boolean r4 = r10.hasNext()     // Catch:{ InterruptedException -> 0x012d }
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r4 = r10.next()     // Catch:{ InterruptedException -> 0x012d }
            X.0rv r4 = (X.C15830rv) r4     // Catch:{ InterruptedException -> 0x012d }
            X.0sH r4 = r9.A08(r4)     // Catch:{ InterruptedException -> 0x012d }
            if (r4 == 0) goto L_0x0096
            r6.A01 = r4     // Catch:{ InterruptedException -> 0x012d }
            X.152 r1 = r14.A03     // Catch:{ InterruptedException -> 0x012d }
            android.content.Context r0 = r11.getContext()     // Catch:{ InterruptedException -> 0x012d }
            r15 = 1
            android.graphics.Bitmap r10 = r1.A01(r0, r4, r7, r8)     // Catch:{ InterruptedException -> 0x012d }
        L_0x00b5:
            com.facebook.redex.RunnableRunnableShape0S0500000_I0 r9 = new com.facebook.redex.RunnableRunnableShape0S0500000_I0     // Catch:{ InterruptedException -> 0x012d }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x012d }
            X.0pt r0 = r14.A00     // Catch:{ InterruptedException -> 0x012d }
            r0.A0K(r9)     // Catch:{ InterruptedException -> 0x012d }
        L_0x00bf:
            boolean r0 = r2 instanceof X.C16010sH     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x0005
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ InterruptedException -> 0x012d }
            android.widget.ImageView r11 = r3.A04     // Catch:{ InterruptedException -> 0x012d }
            java.lang.Object r13 = r3.A05     // Catch:{ InterruptedException -> 0x012d }
            X.2OY r12 = r3.A00     // Catch:{ InterruptedException -> 0x012d }
            int r4 = r3.A03     // Catch:{ InterruptedException -> 0x012d }
            float r3 = r3.A02     // Catch:{ InterruptedException -> 0x012d }
            X.152 r1 = r14.A03     // Catch:{ InterruptedException -> 0x012d }
            android.content.Context r0 = r11.getContext()     // Catch:{ InterruptedException -> 0x012d }
            r15 = 1
            android.graphics.Bitmap r10 = r1.A01(r0, r2, r3, r4)     // Catch:{ InterruptedException -> 0x012d }
            com.facebook.redex.RunnableRunnableShape0S0500000_I0 r9 = new com.facebook.redex.RunnableRunnableShape0S0500000_I0     // Catch:{ InterruptedException -> 0x012d }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x012d }
            X.0pt r0 = r14.A00     // Catch:{ InterruptedException -> 0x012d }
            r0.A0K(r9)     // Catch:{ InterruptedException -> 0x012d }
            goto L_0x0005
        L_0x00e6:
            android.content.Context r4 = r11.getContext()     // Catch:{ InterruptedException -> 0x012d }
            android.content.ContentResolver r7 = r4.getContentResolver()     // Catch:{ InterruptedException -> 0x012d }
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ InterruptedException -> 0x012d }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r4, r0)     // Catch:{ InterruptedException -> 0x012d }
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r7, r0)     // Catch:{ InterruptedException -> 0x012d }
            r10 = 0
            if (r0 == 0) goto L_0x0107
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ InterruptedException -> 0x012d }
            if (r1 == 0) goto L_0x0107
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.graphics.Bitmap r10 = X.C17970vw.A06(r1, r0, r5)     // Catch:{ InterruptedException -> 0x012d }
        L_0x0107:
            r6.A00 = r10     // Catch:{ InterruptedException -> 0x012d }
            if (r10 == 0) goto L_0x00bf
            r15 = 1
            goto L_0x00b5
        L_0x010d:
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            goto L_0x0005
        L_0x0110:
            boolean r0 = r14.A06     // Catch:{ InterruptedException -> 0x012d }
            if (r0 == 0) goto L_0x0005
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x012d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0120
            r0 = 1
            r14.A07 = r0     // Catch:{ all -> 0x012a }
            monitor-exit(r2)     // Catch:{ all -> 0x012a }
            goto L_0x0129
        L_0x0120:
            monitor-exit(r2)     // Catch:{ all -> 0x012a }
            goto L_0x0005
        L_0x0123:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
            goto L_0x012c
        L_0x0126:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            goto L_0x012c
        L_0x0129:
            return
        L_0x012a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x012a }
        L_0x012c:
            throw r0     // Catch:{ InterruptedException -> 0x012d }
        L_0x012d:
            java.lang.String r0 = "ContactPhotos/interrupted exception/allow thread to exit"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2OX.run():void");
    }
}
