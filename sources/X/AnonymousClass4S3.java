package X;

import android.content.Context;

/* renamed from: X.4S3  reason: invalid class name */
public final class AnonymousClass4S3 {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final C66153Xz A04;
    public final Object A05 = C13690nt.A0Y();
    public final String A06;

    public AnonymousClass4S3(Context context, C66153Xz r5) {
        this.A03 = context;
        this.A06 = C13680ns.A0g(String.valueOf("face"), "com.google.android.gms.vision.dynamite.");
        this.A04 = r5;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        android.util.Log.e("FaceNativeHandle", "Error creating remote native handle", r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A[ExcHandler: 43p | RemoteException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:26:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r10 = this;
            java.lang.Object r3 = r10.A05
            monitor-enter(r3)
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0136
            r6 = 0
            r4 = 1
            android.content.Context r2 = r10.A03     // Catch:{ 43p -> 0x0014 }
            X.5Ny r1 = X.C90844ev.A08     // Catch:{ 43p -> 0x0014 }
            java.lang.String r0 = r10.A06     // Catch:{ 43p -> 0x0014 }
            X.4ev r6 = X.C90844ev.A06(r2, r1, r0)     // Catch:{ 43p -> 0x0014 }
            goto L_0x0084
        L_0x0014:
            java.lang.String r2 = "%s.%s"
            java.lang.Object[] r1 = X.C13690nt.A1Z()     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "com.google.android.gms.vision"
            r9 = 0
            r1[r9] = r0     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = "face"
            r1[r4] = r5     // Catch:{ all -> 0x0147 }
            java.lang.String r8 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0147 }
            java.lang.String r2 = "Cannot load thick client module, fall back to load optional module %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0147 }
            r1[r9] = r8     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = "Vision"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0147 }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x0147 }
        L_0x003d:
            android.content.Context r1 = r10.A03     // Catch:{ 43p -> 0x0046 }
            X.5Ny r0 = X.C90844ev.A09     // Catch:{ 43p -> 0x0046 }
            X.4ev r6 = X.C90844ev.A06(r1, r0, r8)     // Catch:{ 43p -> 0x0046 }
            goto L_0x0084
        L_0x0046:
            r2 = move-exception
            java.lang.String r1 = "Error loading optional module %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0147 }
            r0[r9] = r8     // Catch:{ all -> 0x0147 }
            X.AnonymousClass45N.A00(r1, r2, r0)     // Catch:{ all -> 0x0147 }
            boolean r0 = r10.A01     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0084
            java.lang.String r2 = "Broadcasting download intent for dependency %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0147 }
            r1[r9] = r5     // Catch:{ all -> 0x0147 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0147 }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x0147 }
        L_0x0068:
            android.content.Intent r2 = X.C13680ns.A09()     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"
            r2.setClassName(r1, r0)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCIES"
            r2.putExtra(r0, r5)     // Catch:{ all -> 0x0147 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCY"
            r2.setAction(r0)     // Catch:{ all -> 0x0147 }
            android.content.Context r0 = r10.A03     // Catch:{ all -> 0x0147 }
            r0.sendBroadcast(r2)     // Catch:{ all -> 0x0147 }
            r10.A01 = r4     // Catch:{ all -> 0x0147 }
        L_0x0084:
            if (r6 == 0) goto L_0x0123
            android.content.Context r2 = r10.A03     // Catch:{ 43p | RemoteException -> 0x011b }
            java.lang.String r0 = "com.google.android.gms.vision.dynamite.face"
            int r1 = X.C90844ev.A00(r2, r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            java.lang.String r0 = "com.google.android.gms.vision.dynamite"
            r7 = 0
            int r0 = X.C90844ev.A01(r2, r0, r7)     // Catch:{ 43p | RemoteException -> 0x011b }
            if (r1 <= r0) goto L_0x009a
            java.lang.String r5 = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"
            goto L_0x009c
        L_0x009a:
            java.lang.String r5 = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"
        L_0x009c:
            android.content.Context r0 = r6.A00     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x010a, 43p | RemoteException -> 0x011b }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x010a, 43p | RemoteException -> 0x011b }
            java.lang.Class r0 = r0.loadClass(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x010a, 43p | RemoteException -> 0x011b }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x010a, 43p | RemoteException -> 0x011b }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x010a, 43p | RemoteException -> 0x011b }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator"
            android.os.IInterface r6 = r1.queryLocalInterface(r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            boolean r0 = r6 instanceof X.AnonymousClass5UB     // Catch:{ 43p | RemoteException -> 0x011b }
            if (r0 == 0) goto L_0x00bb
            X.5UB r6 = (X.AnonymousClass5UB) r6     // Catch:{ 43p | RemoteException -> 0x011b }
            goto L_0x00c0
        L_0x00bb:
            X.3aZ r6 = new X.3aZ     // Catch:{ 43p | RemoteException -> 0x011b }
            r6.<init>(r1)     // Catch:{ 43p | RemoteException -> 0x011b }
        L_0x00c0:
            if (r6 == 0) goto L_0x00f0
            X.2sR r5 = new X.2sR     // Catch:{ 43p | RemoteException -> 0x011b }
            r5.<init>(r2)     // Catch:{ 43p | RemoteException -> 0x011b }
            X.3Xz r2 = r10.A04     // Catch:{ 43p | RemoteException -> 0x011b }
            X.C13710nw.A01(r2)     // Catch:{ 43p | RemoteException -> 0x011b }
            X.3aZ r6 = (X.C66833aZ) r6     // Catch:{ 43p | RemoteException -> 0x011b }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ 43p | RemoteException -> 0x011b }
            java.lang.String r0 = r6.A01     // Catch:{ 43p | RemoteException -> 0x011b }
            r1.writeInterfaceToken(r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            android.os.IBinder r0 = r5.asBinder()     // Catch:{ 43p | RemoteException -> 0x011b }
            r1.writeStrongBinder(r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            r1.writeInt(r4)     // Catch:{ 43p | RemoteException -> 0x011b }
            r2.writeToParcel(r1, r7)     // Catch:{ 43p | RemoteException -> 0x011b }
            android.os.Parcel r5 = r6.A00(r1)     // Catch:{ 43p | RemoteException -> 0x011b }
            android.os.IBinder r2 = r5.readStrongBinder()     // Catch:{ 43p | RemoteException -> 0x011b }
            if (r2 != 0) goto L_0x00f2
            r1 = 0
            goto L_0x00fe
        L_0x00f0:
            r1 = 0
            goto L_0x0101
        L_0x00f2:
            java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            boolean r0 = r1 instanceof X.AnonymousClass5UA     // Catch:{ 43p | RemoteException -> 0x011b }
            if (r0 == 0) goto L_0x0104
            X.5UA r1 = (X.AnonymousClass5UA) r1     // Catch:{ 43p | RemoteException -> 0x011b }
        L_0x00fe:
            r5.recycle()     // Catch:{ 43p | RemoteException -> 0x011b }
        L_0x0101:
            r10.A00 = r1     // Catch:{ 43p | RemoteException -> 0x011b }
            goto L_0x0123
        L_0x0104:
            X.3aY r1 = new X.3aY     // Catch:{ 43p | RemoteException -> 0x011b }
            r1.<init>(r2)     // Catch:{ 43p | RemoteException -> 0x011b }
            goto L_0x00fe
        L_0x010a:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ 43p | RemoteException -> 0x011b }
            java.lang.String r0 = "Failed to instantiate module class: "
            java.lang.String r1 = X.C13680ns.A0g(r1, r0)     // Catch:{ 43p | RemoteException -> 0x011b }
            X.43p r0 = new X.43p     // Catch:{ 43p | RemoteException -> 0x011b }
            r0.<init>(r1, r2)     // Catch:{ 43p | RemoteException -> 0x011b }
            throw r0     // Catch:{ 43p | RemoteException -> 0x011b }
        L_0x011b:
            r2 = move-exception
            java.lang.String r1 = "FaceNativeHandle"
            java.lang.String r0 = "Error creating remote native handle"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0147 }
        L_0x0123:
            boolean r1 = r10.A02     // Catch:{ all -> 0x0147 }
            if (r1 != 0) goto L_0x0138
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0138
            java.lang.String r1 = "FaceNativeHandle"
            java.lang.String r0 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0147 }
            r10.A02 = r4     // Catch:{ all -> 0x0147 }
        L_0x0134:
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0147 }
        L_0x0136:
            monitor-exit(r3)     // Catch:{ all -> 0x0147 }
            goto L_0x0146
        L_0x0138:
            if (r1 == 0) goto L_0x0134
            java.lang.Object r0 = r10.A00     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r1 = "FaceNativeHandle"
            java.lang.String r0 = "Native handle is now available."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0147 }
            goto L_0x0134
        L_0x0146:
            return r0
        L_0x0147:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0147 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4S3.A00():java.lang.Object");
    }
}
