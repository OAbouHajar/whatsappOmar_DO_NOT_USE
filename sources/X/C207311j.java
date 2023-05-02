package X;

import com.whatsapp.util.Log;
import java.security.KeyStore;

/* renamed from: X.11j  reason: invalid class name and case insensitive filesystem */
public class C207311j {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final AnonymousClass01K A04;

    public C207311j(C16300so r1, C16440t3 r2, C15860rz r3, C14710pd r4, C16490t9 r5) {
        this.A02 = r4;
        this.A04 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public void A00() {
        if (A03()) {
            this.A01.A0K().putLong("ka_refresh_ts", System.currentTimeMillis() / 1000).apply();
        }
    }

    public void A01() {
        if (A03()) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                String A06 = this.A02.A06(C16620tM.A02, 2074);
                if (A06 == null) {
                    A06 = "my_personal_mini_pony";
                }
                instance.deleteEntry(A06);
            } catch (Exception e2) {
                Log.e("blacknoise/exception on certificate wipe", e2);
            } catch (Throwable th) {
                C15860rz r4 = this.A01;
                r4.A0K().putLong("ka_retried_ts", 0).apply();
                r4.A0K().putLong("ka_refresh_ts", 0).apply();
                throw th;
            }
            C15860rz r42 = this.A01;
            r42.A0K().putLong("ka_retried_ts", 0).apply();
            r42.A0K().putLong("ka_refresh_ts", 0).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (((java.security.KeyStore.PrivateKeyEntry) r2).getPrivateKey().getAlgorithm().equalsIgnoreCase(r6.A06(r5, 2076)) == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079 A[Catch:{ ProviderException -> 0x015c, Exception -> 0x0175 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(byte[] r21) {
        /*
            r20 = this;
            r9 = r21
            java.lang.String r13 = "AndroidKeyStore"
            java.lang.String r12 = "att-gen"
            r7 = r20
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x01d8
            long r18 = android.os.SystemClock.elapsedRealtime()
            r8 = 1
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r13)     // Catch:{ Exception -> 0x0175 }
            r1 = 0
            r3.load(r1)     // Catch:{ Exception -> 0x0175 }
            X.0pd r6 = r7.A02     // Catch:{ Exception -> 0x0175 }
            r0 = 2074(0x81a, float:2.906E-42)
            X.0tM r5 = X.C16620tM.A02     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = r6.A06(r5, r0)     // Catch:{ Exception -> 0x0175 }
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "my_personal_mini_pony"
        L_0x0029:
            java.security.KeyStore$Entry r2 = r3.getEntry(r0, r1)     // Catch:{ Exception -> 0x0175 }
            boolean r10 = r2 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ Exception -> 0x0175 }
            r4 = 0
            boolean r0 = r7.A03()     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x0039
            if (r10 == 0) goto L_0x0092
            goto L_0x003c
        L_0x0039:
            if (r10 != 0) goto L_0x01a5
            goto L_0x0053
        L_0x003c:
            r0 = 2076(0x81c, float:2.909E-42)
            java.lang.String r1 = r6.A06(r5, r0)     // Catch:{ Exception -> 0x0175 }
            r0 = r2
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x0175 }
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = r0.getAlgorithm()     // Catch:{ Exception -> 0x0175 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0175 }
            if (r0 != 0) goto L_0x0092
        L_0x0053:
            X.0rz r11 = r7.A01     // Catch:{ Exception -> 0x0175 }
            X.01D r0 = r11.A01     // Catch:{ Exception -> 0x0175 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0175 }
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14     // Catch:{ Exception -> 0x0175 }
            java.lang.String r10 = "ka_retried_ts"
            r0 = 0
            long r16 = r14.getLong(r10, r0)     // Catch:{ Exception -> 0x0175 }
            r0 = 2427(0x97b, float:3.401E-42)
            int r0 = r6.A03(r5, r0)     // Catch:{ Exception -> 0x0175 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0175 }
            long r16 = r16 + r0
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0175 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01a5
            boolean r0 = r7.A03()     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x00b9
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0175 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r14
            android.content.SharedPreferences$Editor r11 = r11.A0K()     // Catch:{ Exception -> 0x0175 }
            android.content.SharedPreferences$Editor r0 = r11.putLong(r10, r0)     // Catch:{ Exception -> 0x0175 }
            r0.apply()     // Catch:{ Exception -> 0x0175 }
            goto L_0x00b9
        L_0x0092:
            X.0rz r0 = r7.A01     // Catch:{ Exception -> 0x0175 }
            X.01D r0 = r0.A01     // Catch:{ Exception -> 0x0175 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0175 }
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14     // Catch:{ Exception -> 0x0175 }
            java.lang.String r11 = "ka_refresh_ts"
            r0 = 0
            long r16 = r14.getLong(r11, r0)     // Catch:{ Exception -> 0x0175 }
            r0 = 2079(0x81f, float:2.913E-42)
            int r0 = r6.A03(r5, r0)     // Catch:{ Exception -> 0x0175 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0175 }
            long r16 = r16 + r0
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0175 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            goto L_0x0053
        L_0x00b9:
            if (r2 == 0) goto L_0x00ce
            r0 = 2074(0x81a, float:2.906E-42)
            java.lang.String r0 = r6.A06(r5, r0)     // Catch:{ Exception -> 0x00c9 }
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "my_personal_mini_pony"
        L_0x00c5:
            r3.deleteEntry(r0)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r0 = "blacknoise/error deleting previous pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0175 }
        L_0x00ce:
            r0 = 2076(0x81c, float:2.909E-42)
            java.lang.String r11 = r6.A06(r5, r0)     // Catch:{ Exception -> 0x0175 }
            if (r11 != 0) goto L_0x00d8
            java.lang.String r11 = "EC"
        L_0x00d8:
            java.security.KeyPairGenerator r10 = java.security.KeyPairGenerator.getInstance(r11, r13)     // Catch:{ Exception -> 0x0175 }
            java.util.Date r13 = new java.util.Date     // Catch:{ Exception -> 0x0175 }
            r13.<init>()     // Catch:{ Exception -> 0x0175 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0175 }
            r0 = 2079(0x81f, float:2.913E-42)
            int r0 = r6.A03(r5, r0)     // Catch:{ Exception -> 0x0175 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0175 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r14
            long r2 = r2 + r0
            r13.setTime(r2)     // Catch:{ Exception -> 0x0175 }
            r0 = 2074(0x81a, float:2.906E-42)
            java.lang.String r1 = r6.A06(r5, r0)     // Catch:{ Exception -> 0x0175 }
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "my_personal_mini_pony"
        L_0x00fd:
            r0 = 4
            android.security.keystore.KeyGenParameterSpec$Builder r2 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x0175 }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0175 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = "SHA-256"
            r1[r4] = r0     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = "SHA-512"
            r1[r8] = r0     // Catch:{ Exception -> 0x0175 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r2.setDigests(r1)     // Catch:{ Exception -> 0x0175 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setUserAuthenticationRequired(r4)     // Catch:{ Exception -> 0x0175 }
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r0.setCertificateNotAfter(r13)     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = "RSA"
            boolean r0 = r11.equals(r0)     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x012b
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0175 }
            java.lang.String r0 = "PKCS1"
            r1[r4] = r0     // Catch:{ Exception -> 0x0175 }
            r2.setSignaturePaddings(r1)     // Catch:{ Exception -> 0x0175 }
        L_0x012b:
            boolean r0 = X.C15450qv.A05()     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x0145
            if (r21 != 0) goto L_0x0142
            java.security.SecureRandom r1 = X.C003601p.A00()     // Catch:{ Exception -> 0x0175 }
            r0 = 2078(0x81e, float:2.912E-42)
            int r0 = r6.A03(r5, r0)     // Catch:{ Exception -> 0x0175 }
            byte[] r9 = new byte[r0]     // Catch:{ Exception -> 0x0175 }
            r1.nextBytes(r9)     // Catch:{ Exception -> 0x0175 }
        L_0x0142:
            r2.setAttestationChallenge(r9)     // Catch:{ Exception -> 0x0175 }
        L_0x0145:
            boolean r0 = X.C15450qv.A0A()     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x014e
            r2.setDevicePropertiesAttestationIncluded(r8)     // Catch:{ Exception -> 0x0175 }
        L_0x014e:
            android.security.keystore.KeyGenParameterSpec r0 = r2.build()     // Catch:{ ProviderException -> 0x015c }
            r10.initialize(r0)     // Catch:{ ProviderException -> 0x015c }
            r10.generateKeyPair()     // Catch:{ ProviderException -> 0x015c }
            r7.A00()     // Catch:{ ProviderException -> 0x015c }
            goto L_0x01a5
        L_0x015c:
            r1 = move-exception
            boolean r0 = X.C15450qv.A0A()     // Catch:{ Exception -> 0x0175 }
            if (r0 == 0) goto L_0x0174
            r2.setDevicePropertiesAttestationIncluded(r4)     // Catch:{ Exception -> 0x0175 }
            android.security.keystore.KeyGenParameterSpec r0 = r2.build()     // Catch:{ Exception -> 0x0175 }
            r10.initialize(r0)     // Catch:{ Exception -> 0x0175 }
            r10.generateKeyPair()     // Catch:{ Exception -> 0x0175 }
            r7.A00()     // Catch:{ Exception -> 0x0175 }
            goto L_0x01a5
        L_0x0174:
            throw r1     // Catch:{ Exception -> 0x0175 }
        L_0x0175:
            r4 = move-exception
            java.lang.String r1 = "blacknoise/exception on pair creation"
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x01a3
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x01be }
        L_0x0182:
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x01be }
            X.01K r3 = r7.A04     // Catch:{ all -> 0x01be }
            java.lang.String r2 = "attestation-creation"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "unable to create attestation: "
            r1.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x01be }
            r1.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01be }
            r3.AcB(r2, r0, r8)     // Catch:{ all -> 0x01be }
            goto L_0x01a5
        L_0x01a3:
            r0 = r4
            goto L_0x0182
        L_0x01a5:
            X.1mY r2 = new X.1mY
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r18
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A01 = r12
            X.0t9 r0 = r7.A03
            r0.A06(r2)
            return
        L_0x01be:
            r3 = move-exception
            X.1mY r2 = new X.1mY
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r18
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A01 = r12
            X.0t9 r0 = r7.A03
            r0.A06(r2)
            throw r3
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207311j.A02(byte[]):void");
    }

    public boolean A03() {
        return C15450qv.A04() && this.A02.A0E(C16620tM.A02, 1934);
    }
}
