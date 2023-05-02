package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.0Vx  reason: invalid class name */
public class AnonymousClass0Vx {
    public static final boolean A00;
    public static final byte[] A01 = A01("WEBP");
    public static final byte[] A02 = A01("RIFF");
    public static final byte[] A03 = A01("VP8L");
    public static final byte[] A04 = A01("VP8X");
    public static final byte[] A05 = A01("VP8 ");

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 <= 17) {
            z2 = true;
        }
        A00 = z2;
        if (i2 >= 17 && i2 == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r3 = r4.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(byte[] r7, int r8, int r9) {
        /*
            r0 = 20
            if (r9 < r0) goto L_0x0038
            byte[] r4 = A02
            if (r4 == 0) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            int r3 = r4.length
            int r0 = r3 + r8
            int r6 = r7.length
            if (r0 > r6) goto L_0x0038
            r2 = 0
        L_0x0011:
            if (r2 >= r3) goto L_0x001e
            int r0 = r2 + r8
            byte r1 = r7[r0]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x0011
        L_0x001e:
            int r5 = r8 + 8
            byte[] r4 = A01
            if (r4 == 0) goto L_0x0038
            int r3 = r4.length
            int r0 = r3 + r5
            if (r0 > r6) goto L_0x0038
            r2 = 0
        L_0x002a:
            r0 = 1
            if (r2 >= r3) goto L_0x0039
            int r0 = r2 + r5
            byte r1 = r7[r0]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0038:
            r0 = 0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Vx.A00(byte[], int, int):boolean");
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }
}
