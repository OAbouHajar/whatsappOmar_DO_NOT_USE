package X;

import android.app.Notification;
import android.os.DeadObjectException;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0yL  reason: invalid class name and case insensitive filesystem */
public class C19380yL {
    public final AnonymousClass03S A00;
    public final C221016q A01;

    public C19380yL(C16980tz r3, C221016q r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass03S(r3.A00);
    }

    public static String A00(C15830rv r2) {
        if (r2 == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(r2.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public void A01(int i2) {
        A03(i2, (String) null);
    }

    public void A02(int i2, Notification notification) {
        boolean z2 = true;
        if (i2 == 1) {
            z2 = false;
        }
        A04(notification, (String) null, i2, z2);
    }

    public void A03(int i2, String str) {
        AnonymousClass01E.A01();
        try {
            this.A00.A01(str, i2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder("wanotificationmanager/cancelfailed/");
                sb.append(e2);
                Log.e(sb.toString());
                return;
            }
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (android.text.TextUtils.isEmpty(r7.getChannelId()) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.app.Notification r7, java.lang.String r8, int r9, boolean r10) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r0 < r4) goto L_0x0011
            java.lang.String r0 = r7.getChannelId()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.AnonymousClass00B.A0G(r0)
            X.03S r0 = r6.A00     // Catch:{ RuntimeException -> 0x00ae }
            r0.A02(r8, r9, r7)     // Catch:{ RuntimeException -> 0x00ae }
            if (r10 == 0) goto L_0x00c9
            X.16q r3 = r6.A01     // Catch:{ RuntimeException -> 0x00ae }
            r2 = 6
            r0 = 4
            if (r9 != r0) goto L_0x0033
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ RuntimeException -> 0x00ae }
        L_0x0026:
            X.1WA r2 = r3.A03     // Catch:{ RuntimeException -> 0x00ae }
            r1 = 23
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ RuntimeException -> 0x00ae }
            r0.<init>(r3, r1, r4)     // Catch:{ RuntimeException -> 0x00ae }
            r2.execute(r0)     // Catch:{ RuntimeException -> 0x00ae }
            goto L_0x00ad
        L_0x0033:
            r0 = 23
            r5 = 21
            if (r9 == r0) goto L_0x00a7
            r0 = 27
            if (r9 == r0) goto L_0x00a7
            r0 = 51
            if (r9 == r0) goto L_0x00a7
            r0 = 5
            if (r9 == r0) goto L_0x00a0
            r0 = 46
            if (r9 == r0) goto L_0x00a0
            r0 = 9
            if (r9 == r0) goto L_0x009d
            r0 = 40
            if (r9 == r0) goto L_0x009d
            r0 = 43
            if (r9 == r0) goto L_0x009d
            r0 = 44
            if (r9 == r0) goto L_0x009d
            r1 = 15
            if (r9 == r1) goto L_0x009d
            if (r9 == r5) goto L_0x009d
            r0 = 24
            if (r9 == r0) goto L_0x009d
            r0 = 28
            if (r9 == r0) goto L_0x0098
            r0 = 29
            if (r9 == r0) goto L_0x0098
            r0 = 30
            if (r9 == r0) goto L_0x0098
            r0 = 37
            if (r9 == r0) goto L_0x0098
            r0 = 38
            if (r9 == r0) goto L_0x0098
            r0 = 47
            if (r9 == r0) goto L_0x0098
            if (r9 == r4) goto L_0x0098
            r0 = 17
            if (r9 == r0) goto L_0x0098
            r0 = 22
            if (r9 == r0) goto L_0x0098
            r0 = 16
            r1 = 20
            if (r9 == r0) goto L_0x00a2
            r0 = 31
            if (r9 != r0) goto L_0x0091
            r1 = 25
            goto L_0x00a2
        L_0x0091:
            if (r9 != r2) goto L_0x0096
            r1 = 19
            goto L_0x00a2
        L_0x0096:
            r4 = 0
            goto L_0x0026
        L_0x0098:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException -> 0x00ae }
            goto L_0x0026
        L_0x009d:
            r1 = 12
            goto L_0x00a2
        L_0x00a0:
            r1 = 13
        L_0x00a2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException -> 0x00ae }
            goto L_0x0026
        L_0x00a7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x00ae }
            goto L_0x0026
        L_0x00ad:
            return
        L_0x00ae:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00ca
            java.lang.String r1 = "wanotificationmanager/notifyfailed/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00c9:
            return
        L_0x00ca:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19380yL.A04(android.app.Notification, java.lang.String, int, boolean):void");
    }
}
