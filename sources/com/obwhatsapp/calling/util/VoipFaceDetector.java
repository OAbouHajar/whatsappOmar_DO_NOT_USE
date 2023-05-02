package com.obwhatsapp.calling.util;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass4S3;
import X.C66153Xz;
import X.C67413bW;
import X.C85784Py;
import android.content.Context;
import com.whatsapp.util.Log;

public final class VoipFaceDetector {
    public static final String TAG = "voip/video/VoipFaceDetector/";
    public final boolean detectBounds;
    public final C85784Py detector;
    public final int maxDetections;
    public volatile int nextFrameId;
    public volatile boolean released;

    public VoipFaceDetector(C85784Py r1, int i2, boolean z2) {
        this.detector = r1;
        this.maxDetections = i2;
        this.detectBounds = z2;
    }

    public static VoipFaceDetector create(Context context, int i2, boolean z2) {
        AnonymousClass00B.A0F(AnonymousClass000.A1Q(i2));
        Context applicationContext = context.getApplicationContext();
        C66153Xz r1 = new C66153Xz();
        r1.A01 = 0;
        r1.A02 = 0;
        r1.A03 = 0;
        r1.A04 = true;
        r1.A05 = true;
        r1.A00 = -1.0f;
        return new VoipFaceDetector(new C67413bW(new AnonymousClass4S3(applicationContext, r1)), i2, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r23 <= 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C82554Dg detect(java.nio.ByteBuffer r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r2 = r20
            monitor-enter(r2)
            r10 = r21
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x027c }
            X.4Py r0 = r2.detector     // Catch:{ all -> 0x027c }
            X.3bW r0 = (X.C67413bW) r0     // Catch:{ all -> 0x027c }
            X.4S3 r0 = r0.A01     // Catch:{ all -> 0x027c }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x027c }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x027c }
            r7 = 0
            r6 = r22
            r5 = r23
            if (r22 <= 0) goto L_0x0023
            r0 = 1
            if (r23 > 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x027c }
            r1 = r25
            if (r25 == 0) goto L_0x003c
            r0 = 90
            if (r1 == r0) goto L_0x003b
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0039
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0275
            r7 = 3
            goto L_0x003c
        L_0x0039:
            r7 = 2
            goto L_0x003c
        L_0x003b:
            r7 = 1
        L_0x003c:
            X.4C5 r3 = new X.4C5     // Catch:{ all -> 0x027c }
            r3.<init>()     // Catch:{ all -> 0x027c }
            int r1 = r2.nextFrameId     // Catch:{ all -> 0x027c }
            int r0 = r1 + 1
            r2.nextFrameId = r0     // Catch:{ all -> 0x027c }
            X.4N1 r4 = r3.A00     // Catch:{ all -> 0x027c }
            r4.A02 = r1     // Catch:{ all -> 0x027c }
            r4.A03 = r7     // Catch:{ all -> 0x027c }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x027c }
            r4.A04 = r0     // Catch:{ all -> 0x027c }
            if (r21 == 0) goto L_0x026e
            int r1 = r10.capacity()     // Catch:{ all -> 0x027c }
            int r0 = r22 * r23
            if (r1 < r0) goto L_0x0267
            r0 = 16
            r3 = r24
            if (r3 == r0) goto L_0x007e
            r0 = 17
            if (r3 == r0) goto L_0x007e
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r3 == r0) goto L_0x007e
            r0 = 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x027c }
            java.lang.String r0 = "Unsupported image format: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)     // Catch:{ all -> 0x027c }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x027c }
            goto L_0x027b
        L_0x007e:
            r4.A00 = r6     // Catch:{ all -> 0x027c }
            r4.A01 = r5     // Catch:{ all -> 0x027c }
            X.4Py r7 = r2.detector     // Catch:{ all -> 0x027c }
            X.3bW r7 = (X.C67413bW) r7     // Catch:{ all -> 0x027c }
            java.lang.Object r5 = r7.A03     // Catch:{ all -> 0x027c }
            monitor-enter(r5)     // Catch:{ all -> 0x027c }
            boolean r0 = r7.A00     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x025d
            X.4S3 r3 = r7.A01     // Catch:{ all -> 0x0264 }
            X.3Xx r9 = new X.3Xx     // Catch:{ all -> 0x0264 }
            r9.<init>()     // Catch:{ all -> 0x0264 }
            int r0 = r4.A00     // Catch:{ all -> 0x0264 }
            r9.A00 = r0     // Catch:{ all -> 0x0264 }
            int r0 = r4.A01     // Catch:{ all -> 0x0264 }
            r9.A01 = r0     // Catch:{ all -> 0x0264 }
            int r0 = r4.A03     // Catch:{ all -> 0x0264 }
            r9.A03 = r0     // Catch:{ all -> 0x0264 }
            int r0 = r4.A02     // Catch:{ all -> 0x0264 }
            r9.A02 = r0     // Catch:{ all -> 0x0264 }
            long r0 = r4.A04     // Catch:{ all -> 0x0264 }
            r9.A04 = r0     // Catch:{ all -> 0x0264 }
            java.lang.Object r0 = r3.A00()     // Catch:{ all -> 0x0264 }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r8 = 0
            if (r0 != 0) goto L_0x00b8
            X.4Ng[] r6 = new X.C85134Ng[r8]     // Catch:{ all -> 0x0264 }
        L_0x00b5:
            monitor-exit(r5)     // Catch:{ all -> 0x0264 }
            goto L_0x0167
        L_0x00b8:
            X.2sR r6 = new X.2sR     // Catch:{ RemoteException -> 0x015b }
            r6.<init>(r10)     // Catch:{ RemoteException -> 0x015b }
            java.lang.Object r3 = r3.A00()     // Catch:{ RemoteException -> 0x015b }
            X.C13710nw.A01(r3)     // Catch:{ RemoteException -> 0x015b }
            X.5UA r3 = (X.AnonymousClass5UA) r3     // Catch:{ RemoteException -> 0x015b }
            X.3aY r3 = (X.C66823aY) r3     // Catch:{ RemoteException -> 0x015b }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x015b }
            java.lang.String r0 = r3.A01     // Catch:{ RemoteException -> 0x015b }
            r1.writeInterfaceToken(r0)     // Catch:{ RemoteException -> 0x015b }
            android.os.IBinder r0 = r6.asBinder()     // Catch:{ RemoteException -> 0x015b }
            r1.writeStrongBinder(r0)     // Catch:{ RemoteException -> 0x015b }
            r0 = 1
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x015b }
            r9.writeToParcel(r1, r8)     // Catch:{ RemoteException -> 0x015b }
            android.os.Parcel r1 = r3.A00(r1)     // Catch:{ RemoteException -> 0x015b }
            android.os.Parcelable$Creator r0 = X.C65973Xh.CREATOR     // Catch:{ RemoteException -> 0x015b }
            java.lang.Object[] r9 = r1.createTypedArray(r0)     // Catch:{ RemoteException -> 0x015b }
            X.3Xh[] r9 = (X.C65973Xh[]) r9     // Catch:{ RemoteException -> 0x015b }
            r1.recycle()     // Catch:{ RemoteException -> 0x015b }
            int r3 = r9.length     // Catch:{ all -> 0x0264 }
            X.4Ng[] r6 = new X.C85134Ng[r3]     // Catch:{ all -> 0x0264 }
        L_0x00f1:
            if (r8 >= r3) goto L_0x00b5
            r10 = r9[r8]     // Catch:{ all -> 0x0264 }
            int r0 = r10.A0B     // Catch:{ all -> 0x0264 }
            r19 = r0
            float r11 = r10.A00     // Catch:{ all -> 0x0264 }
            float r1 = r10.A01     // Catch:{ all -> 0x0264 }
            android.graphics.PointF r16 = new android.graphics.PointF     // Catch:{ all -> 0x0264 }
            r0 = r16
            r0.<init>(r11, r1)     // Catch:{ all -> 0x0264 }
            float r0 = r10.A02     // Catch:{ all -> 0x0264 }
            r18 = r0
            float r0 = r10.A03     // Catch:{ all -> 0x0264 }
            r17 = r0
            X.3Xc[] r14 = r10.A0D     // Catch:{ all -> 0x0264 }
            r0 = 0
            if (r14 != 0) goto L_0x013d
            X.4C7[] r13 = new X.AnonymousClass4C7[r0]     // Catch:{ all -> 0x0264 }
        L_0x0113:
            X.3X8[] r15 = r10.A0E     // Catch:{ all -> 0x0264 }
            r14 = 0
            if (r15 != 0) goto L_0x012a
            X.4C6[] r12 = new X.AnonymousClass4C6[r14]     // Catch:{ all -> 0x0264 }
        L_0x011a:
            X.4Ng r10 = new X.4Ng     // Catch:{ all -> 0x0264 }
            r11 = r16
            r14 = r18
            r15 = r17
            r16 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0264 }
            r6[r8] = r10     // Catch:{ all -> 0x0264 }
            goto L_0x0158
        L_0x012a:
            int r11 = r15.length     // Catch:{ all -> 0x0264 }
            X.4C6[] r12 = new X.AnonymousClass4C6[r11]     // Catch:{ all -> 0x0264 }
        L_0x012d:
            if (r14 >= r11) goto L_0x011a
            r0 = r15[r14]     // Catch:{ all -> 0x0264 }
            android.graphics.PointF[] r1 = r0.A01     // Catch:{ all -> 0x0264 }
            X.4C6 r0 = new X.4C6     // Catch:{ all -> 0x0264 }
            r0.<init>(r1)     // Catch:{ all -> 0x0264 }
            r12[r14] = r0     // Catch:{ all -> 0x0264 }
            int r14 = r14 + 1
            goto L_0x012d
        L_0x013d:
            int r12 = r14.length     // Catch:{ all -> 0x0264 }
            X.4C7[] r13 = new X.AnonymousClass4C7[r12]     // Catch:{ all -> 0x0264 }
            r11 = 0
        L_0x0141:
            if (r11 >= r12) goto L_0x0113
            r0 = r14[r11]     // Catch:{ all -> 0x0264 }
            float r15 = r0.A00     // Catch:{ all -> 0x0264 }
            float r0 = r0.A01     // Catch:{ all -> 0x0264 }
            android.graphics.PointF r1 = new android.graphics.PointF     // Catch:{ all -> 0x0264 }
            r1.<init>(r15, r0)     // Catch:{ all -> 0x0264 }
            X.4C7 r0 = new X.4C7     // Catch:{ all -> 0x0264 }
            r0.<init>(r1)     // Catch:{ all -> 0x0264 }
            r13[r11] = r0     // Catch:{ all -> 0x0264 }
            int r11 = r11 + 1
            goto L_0x0141
        L_0x0158:
            int r8 = r8 + 1
            goto L_0x00f1
        L_0x015b:
            r3 = move-exception
            java.lang.String r1 = "FaceNativeHandle"
            java.lang.String r0 = "Could not call native face detector"
            android.util.Log.e(r1, r0, r3)     // Catch:{ all -> 0x0264 }
            X.4Ng[] r6 = new X.C85134Ng[r8]     // Catch:{ all -> 0x0264 }
            goto L_0x00b5
        L_0x0167:
            java.util.HashSet r13 = X.C13680ns.A0o()     // Catch:{ all -> 0x027c }
            int r12 = r6.length     // Catch:{ all -> 0x027c }
            android.util.SparseArray r8 = new android.util.SparseArray     // Catch:{ all -> 0x027c }
            r8.<init>(r12)     // Catch:{ all -> 0x027c }
            r11 = 0
            r10 = 0
        L_0x0173:
            if (r11 >= r12) goto L_0x01b4
            r9 = r6[r11]     // Catch:{ all -> 0x027c }
            int r5 = r9.A02     // Catch:{ all -> 0x027c }
            int r10 = java.lang.Math.max(r10, r5)     // Catch:{ all -> 0x027c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x027c }
            boolean r0 = r13.contains(r0)     // Catch:{ all -> 0x027c }
            if (r0 == 0) goto L_0x018a
            int r5 = r10 + 1
            r10 = r5
        L_0x018a:
            X.C13690nt.A1O(r13, r5)     // Catch:{ all -> 0x027c }
            X.4Zm r14 = r7.A02     // Catch:{ all -> 0x027c }
            java.lang.Object r15 = X.C87994Zm.A03     // Catch:{ all -> 0x027c }
            monitor-enter(r15)     // Catch:{ all -> 0x027c }
            android.util.SparseIntArray r3 = r14.A00     // Catch:{ all -> 0x01b0 }
            r0 = -1
            int r1 = r3.get(r5, r0)     // Catch:{ all -> 0x01b0 }
            if (r1 != r0) goto L_0x01a9
            int r1 = X.C87994Zm.A02     // Catch:{ all -> 0x01b0 }
            int r0 = r1 + 1
            X.C87994Zm.A02 = r0     // Catch:{ all -> 0x01b0 }
            r3.append(r5, r1)     // Catch:{ all -> 0x01b0 }
            android.util.SparseIntArray r0 = r14.A01     // Catch:{ all -> 0x01b0 }
            r0.append(r1, r5)     // Catch:{ all -> 0x01b0 }
        L_0x01a9:
            monitor-exit(r15)     // Catch:{ all -> 0x01b0 }
            r8.append(r1, r9)     // Catch:{ all -> 0x027c }
            int r11 = r11 + 1
            goto L_0x0173
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01b0 }
            goto L_0x027b
        L_0x01b4:
            int r1 = r2.maxDetections     // Catch:{ all -> 0x027c }
        L_0x01b6:
            int r0 = r8.size()     // Catch:{ all -> 0x027c }
            if (r1 >= r0) goto L_0x01c2
            r8.removeAt(r1)     // Catch:{ all -> 0x027c }
            int r1 = r1 + 1
            goto L_0x01b6
        L_0x01c2:
            boolean r0 = r2.detectBounds     // Catch:{ all -> 0x027c }
            if (r0 == 0) goto L_0x0252
            int r0 = r8.size()     // Catch:{ all -> 0x027c }
            int r0 = r0 << 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x027c }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x027c }
            r7.order(r0)     // Catch:{ all -> 0x027c }
            r6 = 0
        L_0x01d8:
            int r0 = r8.size()     // Catch:{ all -> 0x027c }
            if (r6 >= r0) goto L_0x0253
            java.lang.Object r3 = r8.valueAt(r6)     // Catch:{ all -> 0x027c }
            X.4Ng r3 = (X.C85134Ng) r3     // Catch:{ all -> 0x027c }
            android.graphics.PointF r1 = r3.A03     // Catch:{ all -> 0x027c }
            float r9 = r1.x     // Catch:{ all -> 0x027c }
            float r0 = r3.A00     // Catch:{ all -> 0x027c }
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r5
            float r9 = r9 - r0
            float r1 = r1.y     // Catch:{ all -> 0x027c }
            float r0 = r3.A01     // Catch:{ all -> 0x027c }
            float r0 = r0 / r5
            float r1 = r1 - r0
            android.graphics.PointF r11 = new android.graphics.PointF     // Catch:{ all -> 0x027c }
            r11.<init>(r9, r1)     // Catch:{ all -> 0x027c }
            int r10 = r4.A03     // Catch:{ all -> 0x027c }
            r5 = 1
            if (r10 == 0) goto L_0x0235
            if (r10 == r5) goto L_0x0216
            r0 = 2
            if (r10 == r0) goto L_0x0204
            goto L_0x0224
        L_0x0204:
            int r0 = r4.A00     // Catch:{ all -> 0x027c }
            float r1 = (float) r0     // Catch:{ all -> 0x027c }
            float r0 = r11.x     // Catch:{ all -> 0x027c }
            float r1 = r1 - r0
            float r0 = r3.A00     // Catch:{ all -> 0x027c }
            float r1 = r1 - r0
            int r0 = r4.A01     // Catch:{ all -> 0x027c }
            float r9 = (float) r0     // Catch:{ all -> 0x027c }
            float r0 = r11.y     // Catch:{ all -> 0x027c }
            float r9 = r9 - r0
            float r0 = r3.A01     // Catch:{ all -> 0x027c }
            goto L_0x0220
        L_0x0216:
            float r1 = r11.y     // Catch:{ all -> 0x027c }
            int r0 = r4.A01     // Catch:{ all -> 0x027c }
            float r9 = (float) r0     // Catch:{ all -> 0x027c }
            float r0 = r11.x     // Catch:{ all -> 0x027c }
            float r9 = r9 - r0
            float r0 = r3.A00     // Catch:{ all -> 0x027c }
        L_0x0220:
            float r9 = r9 - r0
            if (r10 == r5) goto L_0x022f
            goto L_0x0239
        L_0x0224:
            int r0 = r4.A00     // Catch:{ all -> 0x027c }
            float r1 = (float) r0     // Catch:{ all -> 0x027c }
            float r0 = r11.y     // Catch:{ all -> 0x027c }
            float r1 = r1 - r0
            float r0 = r3.A01     // Catch:{ all -> 0x027c }
            float r1 = r1 - r0
            float r9 = r11.x     // Catch:{ all -> 0x027c }
        L_0x022f:
            float r5 = r3.A01     // Catch:{ all -> 0x027c }
            float r5 = r5 + r1
            float r3 = r3.A00     // Catch:{ all -> 0x027c }
            goto L_0x023e
        L_0x0235:
            float r1 = r11.x     // Catch:{ all -> 0x027c }
            float r9 = r11.y     // Catch:{ all -> 0x027c }
        L_0x0239:
            float r5 = r3.A00     // Catch:{ all -> 0x027c }
            float r5 = r5 + r1
            float r3 = r3.A01     // Catch:{ all -> 0x027c }
        L_0x023e:
            float r3 = r3 + r9
            int r0 = (int) r1     // Catch:{ all -> 0x027c }
            r7.putInt(r0)     // Catch:{ all -> 0x027c }
            int r0 = (int) r9     // Catch:{ all -> 0x027c }
            r7.putInt(r0)     // Catch:{ all -> 0x027c }
            int r0 = (int) r5     // Catch:{ all -> 0x027c }
            r7.putInt(r0)     // Catch:{ all -> 0x027c }
            int r0 = (int) r3     // Catch:{ all -> 0x027c }
            r7.putInt(r0)     // Catch:{ all -> 0x027c }
            int r6 = r6 + 1
            goto L_0x01d8
        L_0x0252:
            r7 = 0
        L_0x0253:
            r8.size()     // Catch:{ all -> 0x027c }
            X.4Dg r0 = new X.4Dg     // Catch:{ all -> 0x027c }
            r0.<init>(r7)     // Catch:{ all -> 0x027c }
            monitor-exit(r2)
            return r0
        L_0x025d:
            java.lang.String r0 = "Cannot use detector after release()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0264 }
            throw r0     // Catch:{ all -> 0x0264 }
        L_0x0264:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0264 }
            goto L_0x027b
        L_0x0267:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x027c }
            goto L_0x027b
        L_0x026e:
            java.lang.String r0 = "Null image data supplied."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x027c }
            goto L_0x027b
        L_0x0275:
            java.lang.String r0 = "Unsupported rotation"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x027c }
        L_0x027b:
            throw r0     // Catch:{ all -> 0x027c }
        L_0x027c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.util.VoipFaceDetector.detect(java.nio.ByteBuffer, int, int, int, int):X.4Dg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (((X.C67413bW) r2.detector).A01.A00() == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOperational() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            X.4Py r0 = r2.detector     // Catch:{ all -> 0x0015 }
            X.3bW r0 = (X.C67413bW) r0     // Catch:{ all -> 0x0015 }
            X.4S3 r0 = r0.A01     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r0.A00()     // Catch:{ all -> 0x0015 }
            r0 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.util.VoipFaceDetector.isOperational():boolean");
    }

    public synchronized void release() {
        if (!this.released) {
            Log.i("voip/video/VoipFaceDetector/Releasing face detector");
            this.released = true;
            this.detector.A00();
        }
    }
}
