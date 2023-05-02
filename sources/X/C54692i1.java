package X;

import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.2i1  reason: invalid class name and case insensitive filesystem */
public class C54692i1 {
    public static Integer A00(C28331Vq r2) {
        int i2;
        if (r2 != null) {
            if (r2.A02()) {
                i2 = 2;
            } else if (r2.A01()) {
                i2 = 3;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static String A01(int i2, String str) {
        if (i2 == 0) {
            return str.substring(17);
        }
        if (i2 == 2 || i2 == 3) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
        } else {
            StringBuilder sb = new StringBuilder("ContactQrUtils/getUniqueIdFromContactQrCode/invalid code type");
            sb.append(i2);
            Log.e(sb.toString());
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r1 != 2) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r7 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        if ((!r7.A00()) != false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C28331Vq r6, X.AnonymousClass284 r7, X.C16490t9 r8, X.AnonymousClass2RN r9, java.lang.Boolean r10, java.lang.Integer r11, int r12, boolean r13) {
        /*
            if (r11 != 0) goto L_0x000d
            if (r7 == 0) goto L_0x0056
            int r0 = r7.A00
            if (r0 != 0) goto L_0x0056
            r0 = 3
        L_0x0009:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x000d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            if (r9 == 0) goto L_0x001f
            int r1 = r9.A01
            r2 = 1
            if (r1 == 0) goto L_0x0020
            r0 = 1
            r2 = 3
            if (r1 == r0) goto L_0x0020
            r2 = 2
            if (r1 == r2) goto L_0x0020
        L_0x001f:
            r2 = 7
        L_0x0020:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = A00(r6)
            r0 = 0
            if (r11 != 0) goto L_0x002c
            r0 = 1
        L_0x002c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            X.2iB r1 = new X.2iB
            r1.<init>()
            r1.A03 = r5
            r1.A04 = r11
            r1.A05 = r4
            r1.A01 = r2
            r1.A00 = r10
            r1.A02 = r3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A06 = r0
        L_0x0052:
            r8.A05(r1)
            return
        L_0x0056:
            if (r9 == 0) goto L_0x006d
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0077
            if (r7 == 0) goto L_0x0079
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x006f
            int r1 = r9.A01
            if (r1 == 0) goto L_0x006f
            r0 = 2
            if (r1 == r0) goto L_0x006f
            r0 = 4
            goto L_0x0009
        L_0x006d:
            if (r7 == 0) goto L_0x0079
        L_0x006f:
            boolean r0 = r7.A00()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r0 = 2
            goto L_0x0009
        L_0x0079:
            r11 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54692i1.A02(X.1Vq, X.284, X.0t9, X.2RN, java.lang.Boolean, java.lang.Integer, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = android.net.Uri.parse(r3).getQueryParameter("src");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            if (r0 != 0) goto L_0x001d
            android.net.Uri r1 = android.net.Uri.parse(r3)
            java.lang.String r0 = "src"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "qr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r2 = 1
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54692i1.A03(java.lang.String):boolean");
    }
}
