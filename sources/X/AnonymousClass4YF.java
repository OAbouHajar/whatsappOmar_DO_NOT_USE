package X;

import android.os.Build;

/* renamed from: X.4YF  reason: invalid class name */
public class AnonymousClass4YF {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (AnonymousClass4YF.class) {
            if (!A00) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        C31281dr.A01("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                C31281dr.A01("c++_shared");
                C31281dr.A01("static-webp");
                A00 = true;
            }
        }
    }
}
