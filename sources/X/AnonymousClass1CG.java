package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1CG  reason: invalid class name */
public class AnonymousClass1CG {
    public C31971fK A00;
    public C35841ma A01;
    public C35891mf A02;
    public boolean A03;
    public final C16300so A04;
    public final C15900s5 A05;
    public final C16440t3 A06;
    public final C15860rz A07;
    public final C207311j A08;
    public final AnonymousClass149 A09;
    public final C35841ma A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final C17020u3 A0D;

    public AnonymousClass1CG(C16300so r2, C15900s5 r3, C16440t3 r4, C15860rz r5, C207311j r6, AnonymousClass149 r7, AnonymousClass14A r8, C14710pd r9, C16490t9 r10, C17020u3 r11) {
        this.A06 = r4;
        this.A0B = r9;
        this.A04 = r2;
        this.A0C = r10;
        this.A05 = r3;
        this.A09 = r7;
        this.A07 = r5;
        this.A0D = r11;
        this.A08 = r6;
        this.A0A = new C35831mZ(r2, r3, r8, r11);
    }

    public static final void A00(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.edit().remove("client_static_keypair_enc").commit()) {
            Log.w("AuthKeyStore/failed to clear key pair");
        }
    }

    public final int A01(SharedPreferences sharedPreferences, C31981fL r5, C31981fL r6, int i2) {
        if (r6 != null && r5 == null && this.A0B.A0E(C16620tM.A02, 377)) {
            i2 = 5;
            Log.w("AuthKeyStore/recovering PWD key");
            A0A(sharedPreferences, r6.A01());
            C31981fL A032 = A03(sharedPreferences);
            sharedPreferences.edit().remove("client_static_keypair_enc_success").remove("client_static_keypair_enc_failed").apply();
            if (A032 == null) {
                throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (A0F(r13.A01()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C31971fK A02() {
        /*
            r25 = this;
            r24 = r25
            monitor-enter(r24)
            r24.A07()     // Catch:{ all -> 0x026e }
            r0 = r24
            X.1fK r1 = r0.A00     // Catch:{ all -> 0x026e }
            if (r1 == 0) goto L_0x0010
            X.1fL r0 = r1.A01     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x026c
        L_0x0010:
            r0 = r24
            X.0u3 r1 = r0.A0D     // Catch:{ all -> 0x026e }
            java.lang.String r0 = "keystore"
            android.content.SharedPreferences r11 = r1.A00(r0)     // Catch:{ all -> 0x026e }
            r0 = r24
            X.1fL r13 = r0.A03(r11)     // Catch:{ all -> 0x026e }
            java.lang.String r12 = "can_user_android_key_store"
            boolean r0 = r11.contains(r12)     // Catch:{ all -> 0x026e }
            r10 = 1
            if (r0 != 0) goto L_0x0034
            android.content.SharedPreferences$Editor r0 = r11.edit()     // Catch:{ all -> 0x026e }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r12, r10)     // Catch:{ all -> 0x026e }
            r0.commit()     // Catch:{ all -> 0x026e }
        L_0x0034:
            r0 = r24
            X.1ma r0 = r0.A01     // Catch:{ all -> 0x026e }
            r16 = 0
            if (r0 == 0) goto L_0x023d
            r0 = r16
            boolean r0 = r11.getBoolean(r12, r0)     // Catch:{ all -> 0x026e }
            if (r0 == 0) goto L_0x023d
            r0 = r24
            X.0pd r9 = r0.A0B     // Catch:{ all -> 0x026e }
            r0 = 375(0x177, float:5.25E-43)
            X.0tM r8 = X.C16620tM.A02     // Catch:{ all -> 0x026e }
            int r15 = r9.A03(r8, r0)     // Catch:{ all -> 0x026e }
            r0 = 384(0x180, float:5.38E-43)
            int r23 = r9.A03(r8, r0)     // Catch:{ all -> 0x026e }
            r0 = 378(0x17a, float:5.3E-43)
            boolean r22 = r9.A0E(r8, r0)     // Catch:{ all -> 0x026e }
            java.lang.String r7 = "client_static_keypair_enc"
            boolean r0 = r11.contains(r7)     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x0078
            if (r13 == 0) goto L_0x0078
            java.lang.String r0 = "AuthKeyStore/storing AndroidKeyStore key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            byte[] r1 = r13.A01()     // Catch:{ all -> 0x026e }
            r0 = r24
            boolean r0 = r0.A0F(r1)     // Catch:{ all -> 0x026e }
            r14 = 1
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            r14 = 0
        L_0x0079:
            X.1mc r1 = X.C35861mc.READ_ACTIVE     // Catch:{ all -> 0x026e }
            r0 = r24
            X.1fL r6 = r0.A05(r1)     // Catch:{ all -> 0x026e }
            java.lang.String r21 = "client_static_keypair_enc_success"
            r0 = 0
            r2 = r21
            long r4 = r11.getLong(r2, r0)     // Catch:{ all -> 0x026e }
            java.lang.String r20 = "client_static_keypair_enc_failed"
            r2 = r20
            long r2 = r11.getLong(r2, r0)     // Catch:{ all -> 0x026e }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = r9.A0E(r8, r0)     // Catch:{ all -> 0x026e }
            if (r0 == 0) goto L_0x00bc
            r0 = r24
            int r1 = r0.A01(r11, r13, r6, r14)     // Catch:{ all -> 0x026e }
            if (r13 != 0) goto L_0x00ad
            r0 = 5
            if (r1 == r0) goto L_0x00ad
            java.lang.String r0 = "AuthKeyStore/stopUsingAndroidKeyStore/cant stop using AndroidKeyStore"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            goto L_0x023a
        L_0x00ad:
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x026e }
            r0 = r16
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r12, r0)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
            goto L_0x0239
        L_0x00bc:
            r18 = 1
            r17 = 2
            if (r13 == 0) goto L_0x0174
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r1.<init>()     // Catch:{ all -> 0x026e }
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/accessed = "
            r1.append(r0)     // Catch:{ all -> 0x026e }
            r1.append(r4)     // Catch:{ all -> 0x026e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x026e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            if (r6 != 0) goto L_0x00de
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            goto L_0x013b
        L_0x00de:
            byte[] r1 = r13.A01()     // Catch:{ all -> 0x026e }
            byte[] r0 = r6.A01()     // Catch:{ all -> 0x026e }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x026e }
            if (r0 == 0) goto L_0x0136
            long r4 = r4 + r18
            long r0 = (long) r15     // Catch:{ all -> 0x026e }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0110
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x026e }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            if (r22 == 0) goto L_0x0110
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x026e }
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
            r14 = 4
            goto L_0x0111
        L_0x0110:
            r14 = 3
        L_0x0111:
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x026e }
            r0 = r21
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
            X.1me r7 = new X.1me     // Catch:{ all -> 0x026e }
            r7.<init>()     // Catch:{ all -> 0x026e }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x026e }
            r7.A01 = r0     // Catch:{ all -> 0x026e }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x026e }
            r7.A02 = r0     // Catch:{ all -> 0x026e }
            r1 = 3
            r0 = 5
            if (r14 != r1) goto L_0x0212
            r0 = 4
            goto L_0x0212
        L_0x0136:
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore in verifying stage/read wrong key"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x026e }
        L_0x013b:
            r0 = r14
            r14 = 1
            if (r0 == r10) goto L_0x0140
            r14 = 2
        L_0x0140:
            long r2 = r2 + r18
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x026e }
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
            X.1md r1 = new X.1md     // Catch:{ all -> 0x026e }
            r1.<init>()     // Catch:{ all -> 0x026e }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x026e }
            r1.A01 = r0     // Catch:{ all -> 0x026e }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x026e }
            r1.A02 = r0     // Catch:{ all -> 0x026e }
            r0 = 3
            if (r14 != r10) goto L_0x0164
            r0 = 2
        L_0x0164:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x026e }
            r1.A00 = r0     // Catch:{ all -> 0x026e }
            r0 = r24
            X.0t9 r0 = r0.A0C     // Catch:{ all -> 0x026e }
            r0.A04(r1)     // Catch:{ all -> 0x026e }
            r6 = 0
            goto L_0x021f
        L_0x0174:
            r0 = 0
            if (r6 == 0) goto L_0x017b
            r14 = 4
            goto L_0x021f
        L_0x017b:
            boolean r16 = r11.contains(r7)     // Catch:{ all -> 0x026e }
            if (r16 != 0) goto L_0x01a8
            java.lang.String r0 = "AuthKeyStore/AndroidKeyStore enabled, but have no keys, need to generate one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            long r0 = (long) r15     // Catch:{ all -> 0x026e }
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0195
            r0 = r23
            long r0 = (long) r0     // Catch:{ all -> 0x026e }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0195
            if (r22 == 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r10 = 0
        L_0x0196:
            r0 = r24
            X.1fL r13 = r0.A06(r10)     // Catch:{ all -> 0x026e }
            boolean r0 = r11.contains(r7)     // Catch:{ all -> 0x026e }
            if (r0 == 0) goto L_0x01a4
            r17 = 4
        L_0x01a4:
            r14 = r17
            goto L_0x0232
        L_0x01a8:
            boolean r2 = r11.contains(r7)     // Catch:{ all -> 0x026e }
            if (r2 == 0) goto L_0x021f
            java.lang.String r4 = "android_key_store_verified_failures"
            long r0 = r11.getLong(r4, r0)     // Catch:{ all -> 0x026e }
            long r0 = r0 + r18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r3.<init>()     // Catch:{ all -> 0x026e }
            java.lang.String r2 = "AuthKeyStore/failed to load auth key in \"verified\" AndroidKeyStore state/ failedCount = "
            r3.append(r2)     // Catch:{ all -> 0x026e }
            r3.append(r0)     // Catch:{ all -> 0x026e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x026e }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x026e }
            r2 = 376(0x178, float:5.27E-43)
            int r3 = r9.A03(r8, r2)     // Catch:{ all -> 0x026e }
            r2 = -1
            if (r3 == r2) goto L_0x0210
            long r2 = (long) r3     // Catch:{ all -> 0x026e }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0205
            if (r22 == 0) goto L_0x0205
            java.lang.String r0 = "AuthKeyStore/failed too much must recover"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            r24.A08()     // Catch:{ all -> 0x026e }
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ all -> 0x026e }
            r0 = r21
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ all -> 0x026e }
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x026e }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x026e }
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r12, r1)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
            r0 = r24
            X.1fL r13 = r0.A06(r1)     // Catch:{ all -> 0x026e }
            goto L_0x0210
        L_0x0205:
            android.content.SharedPreferences$Editor r2 = r11.edit()     // Catch:{ all -> 0x026e }
            android.content.SharedPreferences$Editor r0 = r2.putLong(r4, r0)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
        L_0x0210:
            r14 = 2
            goto L_0x0232
        L_0x0212:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x026e }
            r7.A00 = r0     // Catch:{ all -> 0x026e }
            r0 = r24
            X.0t9 r0 = r0.A0C     // Catch:{ all -> 0x026e }
            r0.A06(r7)     // Catch:{ all -> 0x026e }
        L_0x021f:
            java.lang.String r1 = "android_key_store_verified_failures"
            boolean r0 = r11.contains(r1)     // Catch:{ all -> 0x026e }
            if (r0 == 0) goto L_0x0232
            android.content.SharedPreferences$Editor r0 = r11.edit()     // Catch:{ all -> 0x026e }
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ all -> 0x026e }
            r0.apply()     // Catch:{ all -> 0x026e }
        L_0x0232:
            r0 = r24
            int r1 = r0.A01(r11, r13, r6, r14)     // Catch:{ all -> 0x026e }
            goto L_0x023a
        L_0x0239:
            r1 = 6
        L_0x023a:
            r16 = r1
            goto L_0x0248
        L_0x023d:
            if (r13 != 0) goto L_0x0247
            r1 = r24
            r0 = r16
            X.1fL r13 = r1.A06(r0)     // Catch:{ all -> 0x026e }
        L_0x0247:
            r6 = 0
        L_0x0248:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r1.<init>()     // Catch:{ all -> 0x026e }
            java.lang.String r0 = "AuthKeyStore/current AES state = "
            r1.append(r0)     // Catch:{ all -> 0x026e }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x026e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x026e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x026e }
            if (r13 != 0) goto L_0x0261
            r13 = r6
        L_0x0261:
            X.1fK r1 = new X.1fK     // Catch:{ all -> 0x026e }
            r0 = r16
            r1.<init>(r13, r0)     // Catch:{ all -> 0x026e }
            r0 = r24
            r0.A00 = r1     // Catch:{ all -> 0x026e }
        L_0x026c:
            monitor-exit(r24)
            return r1
        L_0x026e:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CG.A02():X.1fK");
    }

    public final C31981fL A03(SharedPreferences sharedPreferences) {
        String str;
        String string = sharedPreferences.getString("client_static_keypair_pwd_enc", (String) null);
        if (string != null) {
            try {
                C35811mX A002 = AnonymousClass149.A00(new JSONArray(string));
                if (A002 != null) {
                    if (A002.A00 != 2) {
                        str = "AuthKeyStore/readClientStaticKeypairEnc 3 not expected type";
                    } else {
                        byte[] A032 = this.A0A.A03(C35861mc.READ_ACTIVE, A002);
                        Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
                        if (A032 == null) {
                            str = "AuthKeyStore/readClientStaticKeypairEnc/failed to read data";
                        } else if (A032.length == 64) {
                            byte[][] A052 = C28641Wx.A05(A032, 32, 32);
                            return new C31981fL(new C31991fM(A052[0]), new C35891mf(A052[1]));
                        }
                    }
                    Log.e(str);
                    return null;
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final C31981fL A04(C35861mc r6) {
        C35811mX A002;
        C35841ma r0;
        SharedPreferences A003 = this.A0D.A00("keystore");
        String string = A003.getString("client_static_keypair_enc", (String) null);
        if (string == null || (A002 = AnonymousClass149.A00(new JSONArray(string))) == null) {
            return null;
        }
        if (A002.A00 != 0) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc not supported type");
            A00(A003);
        } else if (Build.VERSION.SDK_INT < 23 || (r0 = this.A01) == null) {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/not supported sdk for type");
            A00(A003);
            return null;
        } else {
            byte[] A032 = r0.A03(r6, A002);
            Log.i("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc");
            if (A032 != null) {
                if (A032.length != 64) {
                    return null;
                }
                byte[][] A052 = C28641Wx.A05(A032, 32, 32);
                return new C31981fL(new C31991fM(A052[0]), new C35891mf(A052[1]));
            }
        }
        Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/failed to read data");
        return null;
    }

    public final C31981fL A05(C35861mc r6) {
        C31981fL r4;
        try {
            r4 = A04(r6);
            if (r4 == null) {
                try {
                    return A04(r6);
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
                    sb.append("read invalid json");
                    Log.e(sb.toString(), e2);
                }
            }
            return r4;
        } catch (JSONException unused) {
            r4 = null;
        }
    }

    public final C31981fL A06(boolean z2) {
        SharedPreferences A002 = this.A0D.A00("keystore");
        StringBuilder sb = new StringBuilder("AuthKeyStore/generating new client static keypair/store 1 = ");
        sb.append(z2);
        Log.i(sb.toString());
        C31981fL A003 = C31981fL.A00();
        byte[] A012 = A003.A01();
        if (!z2 || !A0F(A012)) {
            A0A(A002, A012);
        }
        this.A07.A0K().putInt("connection_lc", 0).apply();
        return A003;
    }

    public final void A07() {
        C35851mb r0;
        if (this.A01 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                C17020u3 r4 = this.A0D;
                SharedPreferences A002 = r4.A00("keystore");
                C14710pd r3 = this.A0B;
                String A062 = r3.A06(C16620tM.A02, 388);
                StringBuilder sb = new StringBuilder();
                sb.append(Build.MANUFACTURER);
                sb.append(";");
                String obj = sb.toString();
                if (A062 == null || !A062.contains(obj) || !A002.contains("client_static_keypair_pwd_enc")) {
                    r0 = new C35851mb(this.A04, this.A05, r3, r4);
                    this.A01 = r0;
                }
            }
            r0 = null;
            this.A01 = r0;
        }
    }

    public synchronized void A08() {
        A07();
        Log.i("clearing client static key pair");
        boolean commit = this.A0D.A00("keystore").edit().remove("client_static_keypair_enc").remove("client_static_keypair_pwd_enc").commit();
        C35841ma r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        this.A08.A01();
        this.A0A.A01();
        this.A00 = null;
        if (!commit) {
            throw new RuntimeException("unable to clear client static keypair");
        }
    }

    public void A09(int i2) {
        if (this.A0B.A0E(C16620tM.A02, 1689)) {
            SharedPreferences A002 = this.A0D.A00("keystore");
            if (i2 > 5) {
                i2 = 5;
            } else if (i2 < 0) {
                i2 = 0;
            }
            A002.edit().putInt("remaining_auth_key_rotation_attempts", i2).apply();
        }
    }

    public final void A0A(SharedPreferences sharedPreferences, byte[] bArr) {
        if (!A0C(sharedPreferences, bArr) && !A0C(sharedPreferences, bArr)) {
            throw new RuntimeException("unable to write client static keypair");
        }
    }

    public final boolean A0B(SharedPreferences sharedPreferences, C35841ma r6, byte[] bArr) {
        C31981fL A052;
        if (!A0D(r6.A00(bArr), "client_static_keypair_enc") || (A052 = A05(C35861mc.READ_SELFTEST)) == null || !Arrays.equals(bArr, A052.A01())) {
            RuntimeException runtimeException = new RuntimeException();
            StringBuilder sb = new StringBuilder("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
            sb.append("failed to store and read correct key");
            Log.e(sb.toString(), runtimeException);
            A00(sharedPreferences);
            return false;
        }
        Log.i("AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1");
        return true;
    }

    public final boolean A0C(SharedPreferences sharedPreferences, byte[] bArr) {
        C31981fL A032;
        if (!A0D(this.A0A.A00(bArr), "client_static_keypair_pwd_enc") || (A032 = A03(sharedPreferences)) == null || !Arrays.equals(bArr, A032.A01())) {
            RuntimeException runtimeException = new RuntimeException();
            StringBuilder sb = new StringBuilder("EncryptedKeyHelper/reportEncryptedKeyHelperProblem/");
            sb.append("failed to store and read correct key");
            Log.e(sb.toString(), runtimeException);
            return false;
        }
        Log.i("AuthKeyStore/storedAndCanRead/3");
        return true;
    }

    public final boolean A0D(C35811mX r3, String str) {
        String A002;
        SharedPreferences A003 = this.A0D.A00("keystore");
        if (r3 == null || (A002 = r3.A00()) == null) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair/cant generate json");
            return false;
        }
        boolean commit = A003.edit().putString(str, A002).commit();
        if (!commit) {
            Log.e("AuthKeyStore/failed to store clientStaticKeypair");
        }
        return commit;
    }

    public final boolean A0E(C31981fL r4) {
        try {
            A0A(this.A0D.A00("keystore"), r4.A01());
            return true;
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("authkeystore/overwriteExistingKeypairPwd: ");
            sb.append(e2.toString());
            Log.e(sb.toString());
            return false;
        }
    }

    public final boolean A0F(byte[] bArr) {
        SharedPreferences A002 = this.A0D.A00("keystore");
        if (!TextUtils.isEmpty(A002.getString("client_static_keypair_enc", (String) null))) {
            return false;
        }
        C35841ma r0 = this.A01;
        if (r0 != null && (A0B(A002, r0, bArr) || A0B(A002, this.A01, bArr))) {
            return true;
        }
        Log.w("AuthKeyStore/ensureEncKeyStored/failed to use enc csk");
        return false;
    }
}
