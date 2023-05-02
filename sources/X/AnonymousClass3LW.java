package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.3LW  reason: invalid class name */
public abstract class AnonymousClass3LW extends Binder implements IInterface {
    public AnonymousClass3LW() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if ((r4 instanceof X.C67423bX) != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r8.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cf, code lost:
        X.AnonymousClass3K2.A0N(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        throw X.C13680ns.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 <= r0) goto L_0x000d
            boolean r0 = super.onTransact(r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0010
        L_0x000b:
            r0 = 1
            return r0
        L_0x000d:
            X.AnonymousClass3K4.A0l(r5, r7)
        L_0x0010:
            r4 = r5
            X.3ba r4 = (X.C67453ba) r4
            switch(r6) {
                case 2: goto L_0x007f;
                case 3: goto L_0x0082;
                case 4: goto L_0x0085;
                case 5: goto L_0x0088;
                case 6: goto L_0x008b;
                case 7: goto L_0x008e;
                case 8: goto L_0x0091;
                case 9: goto L_0x0094;
                case 10: goto L_0x0018;
                case 11: goto L_0x0072;
                case 12: goto L_0x0097;
                case 13: goto L_0x009a;
                case 14: goto L_0x009d;
                case 15: goto L_0x00a0;
                case 16: goto L_0x00a0;
                case 17: goto L_0x00a3;
                case 18: goto L_0x00a6;
                case 19: goto L_0x00a9;
                case 20: goto L_0x00ac;
                case 21: goto L_0x0016;
                case 22: goto L_0x00af;
                case 23: goto L_0x00b2;
                case 24: goto L_0x0016;
                case 25: goto L_0x0016;
                case 26: goto L_0x00b5;
                case 27: goto L_0x00b8;
                case 28: goto L_0x00bb;
                case 29: goto L_0x00be;
                case 30: goto L_0x00c1;
                case 31: goto L_0x0016;
                case 32: goto L_0x0016;
                case 33: goto L_0x0016;
                case 34: goto L_0x00c4;
                case 35: goto L_0x00c7;
                case 36: goto L_0x00ca;
                case 37: goto L_0x00cd;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XJ.CREATOR
            android.os.Parcelable r1 = X.AnonymousClass3K2.A0N(r7, r0)
            X.3XJ r1 = (X.AnonymousClass3XJ) r1
            boolean r0 = r4 instanceof X.C67433bY
            if (r0 == 0) goto L_0x00d2
            X.3bY r4 = (X.C67433bY) r4
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L_0x0031
            r3.addAll(r0)
        L_0x0031:
            int r2 = r1.A00
            switch(r2) {
                case 4000: goto L_0x006f;
                case 4001: goto L_0x006c;
                case 4002: goto L_0x0069;
                case 4003: goto L_0x0066;
                case 4004: goto L_0x0063;
                case 4005: goto L_0x0060;
                case 4006: goto L_0x005d;
                case 4007: goto L_0x005a;
                case 4008: goto L_0x0057;
                case 4009: goto L_0x0054;
                case 4010: goto L_0x0051;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r1 = X.AnonymousClass45O.A00(r2)
        L_0x003a:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            X.4tA r1 = new X.4tA
            r1.<init>(r0, r3)
            X.21s r0 = r4.A00
            if (r0 == 0) goto L_0x007b
            com.google.android.gms.common.api.internal.BasePendingResult r0 = (com.google.android.gms.common.api.internal.BasePendingResult) r0
            r0.setResult(r1)
            r0 = 0
            r4.A00 = r0
            goto L_0x007b
        L_0x0051:
            java.lang.String r1 = "ACCOUNT_KEY_CREATION_FAILED"
            goto L_0x003a
        L_0x0054:
            java.lang.String r1 = "UNSUPPORTED_BY_TARGET"
            goto L_0x003a
        L_0x0057:
            java.lang.String r1 = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED"
            goto L_0x003a
        L_0x005a:
            java.lang.String r1 = "UNKNOWN_CAPABILITY"
            goto L_0x003a
        L_0x005d:
            java.lang.String r1 = "DUPLICATE_CAPABILITY"
            goto L_0x003a
        L_0x0060:
            java.lang.String r1 = "ASSET_UNAVAILABLE"
            goto L_0x003a
        L_0x0063:
            java.lang.String r1 = "INVALID_TARGET_NODE"
            goto L_0x003a
        L_0x0066:
            java.lang.String r1 = "DATA_ITEM_TOO_LARGE"
            goto L_0x003a
        L_0x0069:
            java.lang.String r1 = "UNKNOWN_LISTENER"
            goto L_0x003a
        L_0x006c:
            java.lang.String r1 = "DUPLICATE_LISTENER"
            goto L_0x003a
        L_0x006f:
            java.lang.String r1 = "TARGET_NODE_NOT_CONNECTED"
            goto L_0x003a
        L_0x0072:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.AnonymousClass3K2.A0N(r7, r0)
            boolean r0 = r4 instanceof X.C67423bX
            if (r0 == 0) goto L_0x00d2
        L_0x007b:
            r8.writeNoException()
            goto L_0x000b
        L_0x007f:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XH.CREATOR
            goto L_0x00cf
        L_0x0082:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XQ.CREATOR
            goto L_0x00cf
        L_0x0085:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XK.CREATOR
            goto L_0x00cf
        L_0x0088:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.data.DataHolder.CREATOR
            goto L_0x00cf
        L_0x008b:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3X9.CREATOR
            goto L_0x00cf
        L_0x008e:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XR.CREATOR
            goto L_0x00cf
        L_0x0091:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XM.CREATOR
            goto L_0x00cf
        L_0x0094:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XN.CREATOR
            goto L_0x00cf
        L_0x0097:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XY.CREATOR
            goto L_0x00cf
        L_0x009a:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XI.CREATOR
            goto L_0x00cf
        L_0x009d:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XO.CREATOR
            goto L_0x00cf
        L_0x00a0:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3X1.CREATOR
            goto L_0x00cf
        L_0x00a3:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XC.CREATOR
            goto L_0x00cf
        L_0x00a6:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XD.CREATOR
            goto L_0x00cf
        L_0x00a9:
            android.os.Parcelable$Creator r0 = X.C65893Wz.CREATOR
            goto L_0x00cf
        L_0x00ac:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3X0.CREATOR
            goto L_0x00cf
        L_0x00af:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XB.CREATOR
            goto L_0x00cf
        L_0x00b2:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XA.CREATOR
            goto L_0x00cf
        L_0x00b5:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3X2.CREATOR
            goto L_0x00cf
        L_0x00b8:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3X3.CREATOR
            goto L_0x00cf
        L_0x00bb:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XE.CREATOR
            goto L_0x00cf
        L_0x00be:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XF.CREATOR
            goto L_0x00cf
        L_0x00c1:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XV.CREATOR
            goto L_0x00cf
        L_0x00c4:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XX.CREATOR
            goto L_0x00cf
        L_0x00c7:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XL.CREATOR
            goto L_0x00cf
        L_0x00ca:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XP.CREATOR
            goto L_0x00cf
        L_0x00cd:
            android.os.Parcelable$Creator r0 = X.AnonymousClass3XG.CREATOR
        L_0x00cf:
            X.AnonymousClass3K2.A0N(r7, r0)
        L_0x00d2:
            java.lang.UnsupportedOperationException r0 = X.C13680ns.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LW.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
