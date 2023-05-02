package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Ge  reason: invalid class name and case insensitive filesystem */
public class C63113Ge implements C19550yc {
    public final AnonymousClass1CG A00;
    public final C31981fL A01;
    public final /* synthetic */ AnonymousClass1CQ A02;

    public C63113Ge(AnonymousClass1CG r1, AnonymousClass1CQ r2, C31981fL r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public final void A00() {
        AnonymousClass1CG r4 = this.A00;
        C14710pd r7 = r4.A0B;
        C16620tM r5 = C16620tM.A02;
        if (r7.A0E(r5, 1689)) {
            C13680ns.A0x(r4.A0D.A00("keystore").edit(), "last_failed_auth_key_rotation_attempt", r4.A06.A00());
        }
        r4.A09((!r7.A0E(r5, 1689) ? 0 : r4.A0D.A00("keystore").getInt("remaining_auth_key_rotation_attempts", 0)) - 1);
    }

    public void APb(String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onDeliveryFailure");
    }

    public void AQe(C28371Vv r2, String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onError: 500 IQ error");
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r10 > ((long) r7)) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        com.whatsapp.util.Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey");
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r16, java.lang.String r17) {
        /*
            r15 = this;
            X.1CG r2 = r15.A00
            X.1fL r6 = r15.A01
            monitor-enter(r2)
            X.0pd r4 = r2.A0B     // Catch:{ all -> 0x0110 }
            r0 = 1689(0x699, float:2.367E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x0110 }
            boolean r0 = r4.A0E(r1, r0)     // Catch:{ all -> 0x0110 }
            r3 = 0
            if (r0 == 0) goto L_0x0106
            r2.A07()     // Catch:{ all -> 0x0110 }
            X.0u3 r9 = r2.A0D     // Catch:{ all -> 0x0110 }
            java.lang.String r8 = "keystore"
            android.content.SharedPreferences r5 = r9.A00(r8)     // Catch:{ all -> 0x0110 }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = r4.A0E(r1, r0)     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x00d0
            X.1ma r0 = r2.A01     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "can_user_android_key_store"
            boolean r0 = r5.getBoolean(r0, r3)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x00d0
            android.content.SharedPreferences r10 = r9.A00(r8)     // Catch:{ all -> 0x0110 }
            r0 = 375(0x177, float:5.25E-43)
            int r14 = r4.A03(r1, r0)     // Catch:{ all -> 0x0110 }
            r0 = 384(0x180, float:5.38E-43)
            int r7 = r4.A03(r1, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "client_static_keypair_enc_success"
            r0 = 0
            long r12 = r10.getLong(r4, r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "client_static_keypair_enc_failed"
            long r10 = r10.getLong(r4, r0)     // Catch:{ all -> 0x0110 }
            long r0 = (long) r14     // Catch:{ all -> 0x0110 }
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x005a
            long r0 = (long) r7     // Catch:{ all -> 0x0110 }
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r0 = 1
            if (r4 <= 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            java.lang.String r7 = "AuthKeyStore/mismatch after rotation"
            if (r0 == 0) goto L_0x0096
            android.content.SharedPreferences r0 = r9.A00(r8)     // Catch:{ all -> 0x0110 }
            X.AnonymousClass1CG.A00(r0)     // Catch:{ all -> 0x0110 }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x0110 }
            boolean r0 = r2.A0F(r0)     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0110 }
            r1 = 0
            goto L_0x0078
        L_0x0077:
            r1 = 1
        L_0x0078:
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            boolean r0 = r5.contains(r0)     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x00e4
            goto L_0x00d7
        L_0x0083:
            if (r0 != 0) goto L_0x0106
            X.0so r4 = r2.A04     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "AuthKeyStore/failed to rotate KeyStore key"
            java.lang.String r0 = "Failed to update new authkey to KeyStore"
            r4.AcB(r1, r0, r3)     // Catch:{ all -> 0x0110 }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x0110 }
            r2.A0A(r5, r0)     // Catch:{ all -> 0x0110 }
            goto L_0x0106
        L_0x0096:
            android.content.SharedPreferences r0 = r9.A00(r8)     // Catch:{ all -> 0x0110 }
            X.AnonymousClass1CG.A00(r0)     // Catch:{ all -> 0x0110 }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x0110 }
            boolean r0 = r2.A0F(r0)     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0110 }
            r5 = 0
            goto L_0x00af
        L_0x00ae:
            r5 = 1
        L_0x00af:
            boolean r8 = r2.A0E(r6)     // Catch:{ all -> 0x0110 }
            if (r5 == r8) goto L_0x00d4
            X.0so r4 = r2.A04     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "KeyStoreKeyIsSuccessfullyRotated: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0110 }
            r1.append(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = ", PwdKeyIsSuccessfullyRotated: "
            r1.append(r0)     // Catch:{ all -> 0x0110 }
            r1.append(r8)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0110 }
            r4.AcB(r7, r0, r3)     // Catch:{ all -> 0x0110 }
            goto L_0x00d4
        L_0x00d0:
            boolean r8 = r2.A0E(r6)     // Catch:{ all -> 0x0110 }
        L_0x00d4:
            if (r8 == 0) goto L_0x0106
            goto L_0x00e4
        L_0x00d7:
            boolean r0 = r2.A0E(r6)     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x00e4
            X.0so r1 = r2.A04     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "KeyStore key was rotated, PWD key was not rotated"
            r1.AcB(r7, r0, r3)     // Catch:{ all -> 0x0110 }
        L_0x00e4:
            r1 = 7
            X.1fK r0 = new X.1fK     // Catch:{ all -> 0x0110 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0110 }
            r2.A00 = r0     // Catch:{ all -> 0x0110 }
            X.0rz r0 = r2.A07     // Catch:{ all -> 0x0110 }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "connection_lc"
            X.C13680ns.A0w(r1, r0, r3)     // Catch:{ all -> 0x0110 }
            X.11j r0 = r2.A08     // Catch:{ all -> 0x0110 }
            r0.A01()     // Catch:{ all -> 0x0110 }
            monitor-exit(r2)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A09(r3)
            return
        L_0x0106:
            monitor-exit(r2)
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r15.A00()
            return
        L_0x0110:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63113Ge.AYG(X.1Vv, java.lang.String):void");
    }
}
