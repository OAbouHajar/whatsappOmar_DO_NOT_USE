package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.3WS  reason: invalid class name */
public class AnonymousClass3WS extends AnonymousClass2f2 {
    public static int A00 = 1;

    public AnonymousClass3WS(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, googleSignInOptions, AnonymousClass4BN.A06, new C97964qs());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (X.C90844ev.A00(r3, "com.google.android.gms.auth.api.fallback") == 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A03() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r1 = A00     // Catch:{ all -> 0x002a }
            r0 = 1
            if (r1 != r0) goto L_0x0028
            android.content.Context r3 = r4.A01     // Catch:{ all -> 0x002a }
            X.2s9 r2 = X.C57892s9.A00     // Catch:{ all -> 0x002a }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A00(r3, r0)     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0015
            r1 = 4
            goto L_0x0026
        L_0x0015:
            r0 = 0
            android.content.Intent r0 = r2.A01(r3, r0, r1)     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "com.google.android.gms.auth.api.fallback"
            int r0 = X.C90844ev.A00(r3, r0)     // Catch:{ all -> 0x002a }
            r1 = 3
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            A00 = r1     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WS.A03():int");
    }
}
