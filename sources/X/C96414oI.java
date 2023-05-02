package X;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* renamed from: X.4oI  reason: invalid class name and case insensitive filesystem */
public final class C96414oI implements ExoMediaCrypto {
    public static final boolean A00;

    static {
        boolean z2;
        if ("Amazon".equals(AnonymousClass3C1.A04)) {
            String str = AnonymousClass3C1.A05;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z2 = true;
                A00 = z2;
            }
        }
        z2 = false;
        A00 = z2;
    }
}
