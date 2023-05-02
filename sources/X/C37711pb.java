package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1pb  reason: invalid class name and case insensitive filesystem */
public final class C37711pb {
    public static final void A00(C34151jm r2) {
        AnonymousClass1XO r1 = r2.A04;
        if (r1 != null) {
            String str = r2.A07;
            if (str == null || str.length() == 0) {
                C37781pj[] r0 = r1.A09;
                if (r0 != null) {
                    r2.A01(r0);
                }
            }
            r2.A0H = r1.A06;
            r2.A05 = r1.A00;
            return;
        }
        String str2 = r2.A09;
        if (str2 == null || str2.length() == 0) {
            Log.w("Unable to fill metadata, file path is null or empty.");
            return;
        }
        AnonymousClass00B.A06(str2);
        AnonymousClass1XO A00 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(str2));
        if (A00 != null) {
            r2.A04 = A00;
            r2.A0H = A00.A06;
            r2.A05 = A00.A00;
            C37781pj[] r02 = A00.A09;
            if (r02 != null) {
                r2.A01(r02);
            }
        }
    }
}
