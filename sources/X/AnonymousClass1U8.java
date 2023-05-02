package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.1U8  reason: invalid class name */
public final class AnonymousClass1U8 {
    public static int A00;

    public static int A00() {
        int i2 = A00;
        if (i2 == 0) {
            i2 = C31111dU.A01();
            if (i2 <= 0 && (i2 = Runtime.getRuntime().availableProcessors()) <= 0) {
                i2 = 1;
            }
            A00 = i2;
        }
        return i2;
    }

    public static int A01(TelephonyManager telephonyManager, C16260sj r3) {
        if (r3.A03("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        return Build.VERSION.SDK_INT < 30 ? telephonyManager.getNetworkType() : telephonyManager.getDataNetworkType();
    }

    public static String A02() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr[0];
            }
        }
        return Build.CPU_ABI;
    }

    public static String[] A03() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }
}
