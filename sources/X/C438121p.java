package X;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.21p  reason: invalid class name and case insensitive filesystem */
public abstract class C438121p extends BasePendingResult implements C438321s {
    public final AnonymousClass458 A00;
    public final C437721l A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C438121p(C437721l r2, C437121f r3) {
        super(r3);
        C13710nw.A02(r3, "GoogleApiClient must not be null");
        C13710nw.A02(r2, "Api must not be null");
        this.A00 = r2.A01;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C15760ro r20) {
        /*
            r19 = this;
            r4 = r20
            r5 = r19
            boolean r0 = r5 instanceof X.C53232fI
            if (r0 == 0) goto L_0x0028
            X.2fI r5 = (X.C53232fI) r5
            X.0rp r4 = (X.C15770rp) r4
            X.5UH r1 = r5.A00
            android.os.IInterface r5 = r4.A01()
            X.4gy r5 = (X.C92074gy) r5
            android.os.Parcel r4 = android.os.Parcel.obtain()
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r4.writeInterfaceToken(r0)
            if (r1 != 0) goto L_0x0020
            r1 = 0
        L_0x0020:
            r4.writeStrongBinder(r1)
            r0 = 5
        L_0x0024:
            r5.A00(r0, r4)
            return
        L_0x0028:
            boolean r0 = r5 instanceof X.C53142f5
            if (r0 == 0) goto L_0x005d
            X.2f5 r5 = (X.C53142f5) r5
            X.3Wr r4 = (X.C65813Wr) r4
            X.5UH r3 = r5.A00
            byte[] r2 = r5.A02
            java.lang.String r1 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r4.A0C()
        L_0x0040:
            android.os.IInterface r5 = r4.A01()
            X.4gy r5 = (X.C92074gy) r5
            android.os.Parcel r4 = android.os.Parcel.obtain()
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r4.writeInterfaceToken(r0)
            if (r3 != 0) goto L_0x0052
            r3 = 0
        L_0x0052:
            r4.writeStrongBinder(r3)
            r4.writeByteArray(r2)
            r4.writeString(r1)
            r0 = 7
            goto L_0x0024
        L_0x005d:
            boolean r0 = r5 instanceof X.C437821m
            if (r0 == 0) goto L_0x00b6
            X.21m r5 = (X.C437821m) r5
            X.2sG r4 = (X.C57962sG) r4
            X.21d r2 = r5.A00
            java.lang.String r1 = "LocationListener"
            java.lang.String r0 = "Listener must not be null"
            X.C13710nw.A02(r2, r0)
            java.lang.String r0 = "Listener type must not be empty"
            X.C13710nw.A07(r1, r0)
            X.4Sd r3 = new X.4Sd
            r3.<init>(r2)
            X.3a7 r6 = new X.3a7
            r6.<init>(r5)
            X.4N0 r1 = r4.A00
            X.5M1 r0 = r1.A01
            X.4sH r0 = (X.C98354sH) r0
            X.2sG r2 = r0.A00
            X.C57962sG.A01(r2)
            java.util.Map r1 = r1.A02
            monitor-enter(r1)
            java.lang.Object r4 = r1.remove(r3)     // Catch:{ all -> 0x00b3 }
            X.3a8 r4 = (X.C66573a8) r4     // Catch:{ all -> 0x00b3 }
            if (r4 == 0) goto L_0x00b1
            monitor-enter(r4)     // Catch:{ all -> 0x00b3 }
            X.4Jh r0 = r4.A00     // Catch:{ all -> 0x009c }
            r3 = 0
            r0.A02 = r3     // Catch:{ all -> 0x009c }
            r0.A01 = r3     // Catch:{ all -> 0x009c }
            goto L_0x009f
        L_0x009c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x009f:
            monitor-exit(r4)     // Catch:{ all -> 0x00b3 }
            android.os.IInterface r0 = r2.A01()     // Catch:{ all -> 0x00b3 }
            X.5UF r0 = (X.AnonymousClass5UF) r0     // Catch:{ all -> 0x00b3 }
            r8 = 2
            r7 = r3
            X.3Xf r2 = new X.3Xf     // Catch:{ all -> 0x00b3 }
            r5 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b3 }
            r0.AjO(r2)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r0
        L_0x00b6:
            X.21t r5 = (X.C438421t) r5
            X.2sG r4 = (X.C57962sG) r4
            X.3a7 r3 = new X.3a7
            r3.<init>(r5)
            com.google.android.gms.location.LocationRequest r7 = r5.A01
            X.21d r2 = r5.A00
            android.os.Looper r0 = android.os.Looper.myLooper()
            r1 = 0
            if (r0 == 0) goto L_0x00cb
            r1 = 1
        L_0x00cb:
            java.lang.String r0 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.C13710nw.A04(r0, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            java.lang.String r0 = "Listener must not be null"
            X.C13710nw.A02(r2, r0)
            java.lang.String r0 = "Looper must not be null"
            X.C13710nw.A02(r1, r0)
            X.4Jh r6 = new X.4Jh
            r6.<init>(r1, r2)
            X.4N0 r1 = r4.A00
            monitor-enter(r1)
            X.5M1 r0 = r1.A01     // Catch:{ all -> 0x0137 }
            X.4sH r0 = (X.C98354sH) r0     // Catch:{ all -> 0x0137 }
            X.2sG r5 = r0.A00     // Catch:{ all -> 0x0137 }
            X.C57962sG.A01(r5)     // Catch:{ all -> 0x0137 }
            X.4Sd r0 = r6.A01     // Catch:{ all -> 0x0137 }
            r8 = 0
            if (r0 == 0) goto L_0x0135
            java.util.Map r4 = r1.A02     // Catch:{ all -> 0x0137 }
            monitor-enter(r4)     // Catch:{ all -> 0x0137 }
            java.lang.Object r2 = r4.get(r0)     // Catch:{ all -> 0x0109 }
            X.3a8 r2 = (X.C66573a8) r2     // Catch:{ all -> 0x0109 }
            if (r2 != 0) goto L_0x0104
            X.3a8 r2 = new X.3a8     // Catch:{ all -> 0x0109 }
            r2.<init>(r6)     // Catch:{ all -> 0x0109 }
        L_0x0104:
            r4.put(r0, r2)     // Catch:{ all -> 0x0109 }
            monitor-exit(r4)     // Catch:{ all -> 0x0109 }
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x010c:
            android.os.IInterface r0 = r5.A01()     // Catch:{ all -> 0x0137 }
            X.5UF r0 = (X.AnonymousClass5UF) r0     // Catch:{ all -> 0x0137 }
            java.util.List r11 = X.C57992sJ.A0B     // Catch:{ all -> 0x0137 }
            r14 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            X.2sJ r6 = new X.2sJ     // Catch:{ all -> 0x0137 }
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0137 }
            r13 = 1
            X.3Xf r4 = new X.3Xf     // Catch:{ all -> 0x0137 }
            r7 = r4
            r9 = r2
            r11 = r3
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0137 }
            r0.AjO(r4)     // Catch:{ all -> 0x0137 }
        L_0x0135:
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            return
        L_0x0137:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0137 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C438121p.A00(X.0ro):void");
    }

    public final void A01(C15760ro r8) {
        try {
            A00(r8);
        } catch (DeadObjectException e2) {
            A02(new Status((PendingIntent) null, (C15700rh) null, e2.getLocalizedMessage(), 1, 8));
            throw e2;
        } catch (RemoteException e3) {
            A02(new Status((PendingIntent) null, (C15700rh) null, e3.getLocalizedMessage(), 1, 8));
        }
    }

    public final void A02(Status status) {
        boolean z2 = false;
        if (status.A01 <= 0) {
            z2 = true;
        }
        C13710nw.A03("Failed result must not be success", !z2);
        setResult(createFailedResult(status));
    }
}
