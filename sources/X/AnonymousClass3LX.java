package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.3LX  reason: invalid class name */
public abstract class AnonymousClass3LX extends Binder implements IInterface {
    public AnonymousClass3LX(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        r10.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        throw X.C13680ns.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x000d
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0010
        L_0x000b:
            r0 = 1
            return r0
        L_0x000d:
            X.AnonymousClass3K4.A0l(r7, r9)
        L_0x0010:
            r2 = r7
            boolean r0 = r7 instanceof X.AnonymousClass3Yc
            if (r0 == 0) goto L_0x00eb
            X.3Yc r2 = (X.AnonymousClass3Yc) r2
            r4 = 1
            if (r8 == r4) goto L_0x002a
            r0 = 2
            if (r8 != r0) goto L_0x00f0
            r2.A00()
            android.content.Context r0 = r2.A00
            X.4ax r0 = X.C88704ax.A00(r0)
            r0.A01()
            goto L_0x000b
        L_0x002a:
            r2.A00()
            android.content.Context r3 = r2.A00
            X.4eD r0 = X.C90484eD.A00(r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r0.A02()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.A0D
            if (r2 == 0) goto L_0x003f
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r0.A03()
        L_0x003f:
            X.C13710nw.A01(r1)
            X.3WS r0 = new X.3WS
            r0.<init>(r3, r1)
            if (r2 == 0) goto L_0x00b5
            X.21f r6 = r0.A05
            android.content.Context r5 = r0.A01
            int r1 = r0.A03()
            r0 = 3
            boolean r3 = X.AnonymousClass000.A1R(r1, r0)
            X.4RN r2 = X.AnonymousClass4YK.A00
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Revoking access"
            r2.A00(r0, r1)
            X.4eD r1 = X.C90484eD.A00(r5)
            java.lang.String r0 = "refreshToken"
            java.lang.String r0 = r1.A04(r0)
            X.AnonymousClass4YK.A00(r5)
            if (r3 == 0) goto L_0x00ab
            if (r0 != 0) goto L_0x009b
            r2 = 4
            r0 = 0
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>(r2, r0)
            java.lang.String r0 = "Status code must not be SUCCESS"
            X.C13710nw.A03(r0, r4)
            X.3Wb r4 = new X.3Wb
            r4.<init>(r1)
            r4.setResult(r1)
        L_0x0085:
            X.4r0 r3 = new X.4r0
            r3.<init>()
            X.2fC r2 = X.C53182fB.A00
            X.0p3 r1 = new X.0p3
            r1.<init>()
            X.2fD r0 = new X.2fD
            r0.<init>(r4, r3, r2, r1)
            r4.addStatusListener(r0)
            goto L_0x000b
        L_0x009b:
            X.3IG r1 = new X.3IG
            r1.<init>(r0)
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            X.3Wa r4 = r1.A00
            goto L_0x0085
        L_0x00ab:
            X.3W8 r0 = new X.3W8
            r0.<init>(r6)
            X.21p r4 = r6.A03(r0)
            goto L_0x0085
        L_0x00b5:
            X.21f r5 = r0.A05
            android.content.Context r4 = r0.A01
            int r1 = r0.A03()
            r0 = 3
            boolean r3 = X.AnonymousClass000.A1R(r1, r0)
            X.4RN r2 = X.AnonymousClass4YK.A00
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "Signing out"
            r2.A00(r0, r1)
            X.AnonymousClass4YK.A00(r4)
            if (r3 == 0) goto L_0x00e1
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.A09
            java.lang.String r0 = "Result must not be null"
            X.C13710nw.A02(r1, r0)
            X.3Wa r4 = new X.3Wa
            r4.<init>(r5)
            r4.setResult(r1)
            goto L_0x0085
        L_0x00e1:
            X.3W7 r0 = new X.3W7
            r0.<init>(r5)
            X.21p r4 = r5.A03(r0)
            goto L_0x0085
        L_0x00eb:
            X.3Yd r2 = (X.AnonymousClass3Yd) r2
            switch(r8) {
                case 101: goto L_0x011e;
                case 102: goto L_0x00f2;
                case 103: goto L_0x0106;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            r0 = 0
            return r0
        L_0x00f2:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass3K2.A0N(r9, r0)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            boolean r0 = r2 instanceof X.AnonymousClass3W5
            if (r0 == 0) goto L_0x0134
            X.3W5 r2 = (X.AnonymousClass3W5) r2
            X.3W7 r0 = r2.A00
            r0.setResult(r1)
            goto L_0x0119
        L_0x0106:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass3K2.A0N(r9, r0)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            boolean r0 = r2 instanceof X.AnonymousClass3W6
            if (r0 == 0) goto L_0x0134
            X.3W6 r2 = (X.AnonymousClass3W6) r2
            X.3W8 r0 = r2.A00
            r0.setResult(r1)
        L_0x0119:
            r10.writeNoException()
            goto L_0x000b
        L_0x011e:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            int r0 = r9.readInt()
            if (r0 == 0) goto L_0x0129
            r1.createFromParcel(r9)
        L_0x0129:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            int r0 = r9.readInt()
            if (r0 == 0) goto L_0x0134
            r1.createFromParcel(r9)
        L_0x0134:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LX.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
