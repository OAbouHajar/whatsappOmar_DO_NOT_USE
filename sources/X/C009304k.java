package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

@Deprecated
/* renamed from: X.04k  reason: invalid class name and case insensitive filesystem */
public class C009304k {
    public final Context A00;

    public C009304k(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager.AuthenticationCallback A00(C009404l r1) {
        return new C02250Ao(r1);
    }

    public static FingerprintManager.CryptoObject A01(AnonymousClass04m r0) {
        return C009504n.A00(r0);
    }

    public static FingerprintManager A02(Context context) {
        return C009504n.A02(context);
    }

    public static AnonymousClass04m A03(FingerprintManager.CryptoObject cryptoObject) {
        return C009504n.A03(cryptoObject);
    }

    public void A04(C009404l r8, AnonymousClass04m r9, AnonymousClass024 r10) {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT >= 23 && (A02 = A02(this.A00)) != null) {
            C009504n.A04((CancellationSignal) r10.A00(), (Handler) null, A02, A01(r9), A00(r8), 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = A02(r3.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r3 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 23
            if (r2 < r0) goto L_0x0016
            android.content.Context r0 = r3.A00
            android.hardware.fingerprint.FingerprintManager r0 = A02(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C009504n.A05(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009304k.A05():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = A02(r3.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06() {
        /*
            r3 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 23
            if (r2 < r0) goto L_0x0016
            android.content.Context r0 = r3.A00
            android.hardware.fingerprint.FingerprintManager r0 = A02(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.C009504n.A06(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009304k.A06():boolean");
    }
}
