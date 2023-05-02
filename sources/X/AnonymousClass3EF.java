package X;

/* renamed from: X.3EF  reason: invalid class name */
public final class AnonymousClass3EF implements C437321h {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5 A[Catch:{ Exception -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location AD3(X.C437121f r8) {
        /*
            r7 = this;
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1V(r8)
            java.lang.String r0 = "GoogleApiClient parameter is required."
            X.C13710nw.A03(r0, r1)
            X.458 r1 = X.C437221g.A01
            boolean r0 = r8 instanceof X.C57912sB
            if (r0 == 0) goto L_0x00cc
            r0 = r8
            X.2sB r0 = (X.C57912sB) r0
            java.util.Map r0 = r0.A0G
            java.lang.Object r4 = r0.get(r1)
            X.0rn r4 = (X.C15750rn) r4
            java.lang.String r0 = "Appropriate Api was not requested."
            X.C13710nw.A02(r4, r0)
            X.2sG r4 = (X.C57962sG) r4
            if (r4 != 0) goto L_0x0025
            r2 = 0
        L_0x0025:
            java.lang.String r0 = "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature."
            X.C13710nw.A04(r0, r2)
            android.content.Context r6 = r8.A00()
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r0 = 30
            if (r1 < r0) goto L_0x004b
            if (r6 == 0) goto L_0x004b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.Object r2 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            goto L_0x004c
        L_0x004b:
            r2 = r5
        L_0x004c:
            X.3Xv r0 = r4.A0Q     // Catch:{ Exception -> 0x00cb }
            if (r0 != 0) goto L_0x0052
            r1 = 0
            goto L_0x0054
        L_0x0052:
            X.3Y2[] r1 = r0.A03     // Catch:{ Exception -> 0x00cb }
        L_0x0054:
            X.3Y2 r0 = X.AnonymousClass4BF.A02     // Catch:{ Exception -> 0x00cb }
            boolean r0 = X.AnonymousClass45B.A00(r0, r1)     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x007e
            X.4N0 r0 = r4.A00     // Catch:{ Exception -> 0x00cb }
            X.5M1 r0 = r0.A01     // Catch:{ Exception -> 0x00cb }
            X.4sH r0 = (X.C98354sH) r0     // Catch:{ Exception -> 0x00cb }
            X.2sG r0 = r0.A00     // Catch:{ Exception -> 0x00cb }
            X.C57962sG.A01(r0)     // Catch:{ Exception -> 0x00cb }
            android.os.IInterface r1 = r0.A01()     // Catch:{ Exception -> 0x00cb }
            X.5UF r1 = (X.AnonymousClass5UF) r1     // Catch:{ Exception -> 0x00cb }
            X.3a4 r1 = (X.C66533a4) r1     // Catch:{ Exception -> 0x00cb }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x00cb }
            r4.writeInterfaceToken(r0)     // Catch:{ Exception -> 0x00cb }
            r4.writeString(r2)     // Catch:{ Exception -> 0x00cb }
            r3 = 80
            goto L_0x009b
        L_0x007e:
            X.4N0 r0 = r4.A00     // Catch:{ Exception -> 0x00cb }
            X.5M1 r0 = r0.A01     // Catch:{ Exception -> 0x00cb }
            X.4sH r0 = (X.C98354sH) r0     // Catch:{ Exception -> 0x00cb }
            X.2sG r0 = r0.A00     // Catch:{ Exception -> 0x00cb }
            X.C57962sG.A01(r0)     // Catch:{ Exception -> 0x00cb }
            android.os.IInterface r1 = r0.A01()     // Catch:{ Exception -> 0x00cb }
            X.5UF r1 = (X.AnonymousClass5UF) r1     // Catch:{ Exception -> 0x00cb }
            X.3a4 r1 = (X.C66533a4) r1     // Catch:{ Exception -> 0x00cb }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x00cb }
            r4.writeInterfaceToken(r0)     // Catch:{ Exception -> 0x00cb }
            r3 = 7
        L_0x009b:
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x00cb }
            android.os.IBinder r1 = r1.A00     // Catch:{ RuntimeException -> 0x00c1 }
            r0 = 0
            r1.transact(r3, r4, r2, r0)     // Catch:{ RuntimeException -> 0x00c1 }
            r2.readException()     // Catch:{ RuntimeException -> 0x00c1 }
            r4.recycle()     // Catch:{ Exception -> 0x00cb }
            android.os.Parcelable$Creator r1 = android.location.Location.CREATOR     // Catch:{ Exception -> 0x00cb }
            int r0 = r2.readInt()     // Catch:{ Exception -> 0x00cb }
            if (r0 != 0) goto L_0x00b5
            r0 = 0
            goto L_0x00bb
        L_0x00b5:
            java.lang.Object r0 = r1.createFromParcel(r2)     // Catch:{ Exception -> 0x00cb }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x00cb }
        L_0x00bb:
            android.location.Location r0 = (android.location.Location) r0     // Catch:{ Exception -> 0x00cb }
            r2.recycle()     // Catch:{ Exception -> 0x00cb }
            return r0
        L_0x00c1:
            r0 = move-exception
            r2.recycle()     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            r4.recycle()     // Catch:{ Exception -> 0x00cb }
            throw r0     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            return r5
        L_0x00cc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EF.AD3(X.21f):android.location.Location");
    }
}
