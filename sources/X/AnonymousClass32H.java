package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.32H  reason: invalid class name */
public class AnonymousClass32H extends C51142b3 {
    public static final Uri A00;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("content://");
        A0r.append("com.obwhatsapp");
        A00 = Uri.parse(AnonymousClass000.A0h(".provider.media/items", A0r));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass32H(X.C16980tz r8, X.C20350zu r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            android.net.Uri r0 = A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "bucketId"
            r4 = r10
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r10)
            r0 = 1
            java.lang.String r1 = "include"
            if (r11 == r0) goto L_0x002e
            r0 = 2
            if (r11 == r0) goto L_0x002b
            r0 = 4
            if (r11 != r0) goto L_0x001e
            java.lang.String r0 = "video"
        L_0x001b:
            r2.appendQueryParameter(r1, r0)
        L_0x001e:
            android.net.Uri r1 = r2.build()
            r5 = 2
            r6 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x002b:
            java.lang.String r0 = "gif"
            goto L_0x001b
        L_0x002e:
            java.lang.String r0 = "images"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32H.<init>(X.0tz, X.0zu, java.lang.String, int):void");
    }

    public HashMap AAC() {
        return AnonymousClass000.A0x();
    }
}
