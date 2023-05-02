package X;

import android.content.ClipData;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4Y8  reason: invalid class name */
public class AnonymousClass4Y8 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r4, java.lang.Integer r5, java.lang.String r6, boolean r7) {
        /*
            if (r7 == 0) goto L_0x0024
            if (r5 == 0) goto L_0x0024
            int r2 = r5.intValue()
            r1 = 1
            r3 = 2131889937(0x7f120f11, float:1.9414552E38)
            if (r2 == r1) goto L_0x0027
            r0 = 2
            if (r2 != r0) goto L_0x001e
            if (r6 == 0) goto L_0x0024
            r2 = 2131891971(0x7f121703, float:1.9418677E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            java.lang.String r0 = X.C13680ns.A0d(r4, r6, r1, r0, r2)
            return r0
        L_0x001e:
            r0 = 3
            r3 = 2131887719(0x7f120667, float:1.9410053E38)
            if (r2 == r0) goto L_0x0027
        L_0x0024:
            r3 = 2131888806(0x7f120aa6, float:1.9412258E38)
        L_0x0027:
            java.lang.String r0 = r4.getString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Y8.A00(android.content.Context, java.lang.Integer, java.lang.String, boolean):java.lang.String");
    }

    public static void A01(C14870pt r3, AnonymousClass01V r4, String str) {
        try {
            r4.A0B().setPrimaryClip(ClipData.newPlainText(str, str));
            r3.A09(R.string.str0c1c, 0);
        } catch (NullPointerException | SecurityException e2) {
            Log.e("sharedeeplink/copy/npe", e2);
            r3.A09(R.string.str19d7, 0);
        }
    }
}
