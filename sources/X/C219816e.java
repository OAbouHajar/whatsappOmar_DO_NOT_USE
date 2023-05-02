package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.16e  reason: invalid class name and case insensitive filesystem */
public class C219816e {
    public File A00;
    public final C16980tz A01;

    public C219816e(C16980tz r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.obwhatsapp.watls13.WtPersistentSession A00(java.io.File r21) {
        /*
            r20 = this;
            r13 = 0
            if (r21 == 0) goto L_0x00f2
            boolean r0 = r21.exists()
            if (r0 == 0) goto L_0x00f2
            byte[] r1 = X.C29301aP.A00(r21)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00ec }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ec }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ec }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "sni"
            java.lang.String r15 = r6.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "port"
            int r19 = r6.getInt(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "cipher"
            java.lang.String r16 = r6.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "psks"
            org.json.JSONArray r5 = r6.optJSONArray(r0)     // Catch:{ Exception -> 0x00ec }
            if (r5 == 0) goto L_0x006d
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet     // Catch:{ Exception -> 0x00ec }
            r10.<init>()     // Catch:{ Exception -> 0x00ec }
            r4 = 0
            r3 = 0
        L_0x0039:
            int r0 = r5.length()     // Catch:{ Exception -> 0x00ec }
            if (r3 >= r0) goto L_0x006e
            java.lang.String r0 = r5.getString(r3)     // Catch:{ Exception -> 0x00ec }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x00ec }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00ec }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00ec }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0063 }
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = (com.obwhatsapp.net.tls13.WtCachedPsk) r0     // Catch:{ all -> 0x0063 }
            r1.close()     // Catch:{ all -> 0x0068 }
            r2.close()     // Catch:{ Exception -> 0x00ec }
            r10.add(r0)     // Catch:{ Exception -> 0x00ec }
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0063:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e1
        L_0x006d:
            r10 = 0
        L_0x006e:
            java.lang.String r0 = "certs"
            org.json.JSONObject r11 = r6.getJSONObject(r0)     // Catch:{ Exception -> 0x00ec }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x00ec }
            r9.<init>()     // Catch:{ Exception -> 0x00ec }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x00ec }
            r8.<init>()     // Catch:{ Exception -> 0x00ec }
            java.util.Iterator r12 = r11.keys()     // Catch:{ Exception -> 0x00ec }
        L_0x0082:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x00ec }
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00ec }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x00ec }
            org.json.JSONArray r6 = r11.getJSONArray(r0)     // Catch:{ Exception -> 0x00ec }
            int r0 = r6.length()     // Catch:{ Exception -> 0x00ec }
            java.security.cert.Certificate[] r5 = new java.security.cert.Certificate[r0]     // Catch:{ Exception -> 0x00ec }
            r4 = 0
            r3 = 0
        L_0x009e:
            int r0 = r6.length()     // Catch:{ Exception -> 0x00ec }
            if (r3 >= r0) goto L_0x00d9
            org.json.JSONObject r2 = r6.getJSONObject(r3)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "type"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = "data"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00ec }
            byte[] r2 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x00ec }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ Exception -> 0x00ec }
            java.security.cert.CertificateFactory r0 = (java.security.cert.CertificateFactory) r0     // Catch:{ Exception -> 0x00ec }
            if (r0 != 0) goto L_0x00c8
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ Exception -> 0x00ec }
            r9.put(r1, r0)     // Catch:{ Exception -> 0x00ec }
        L_0x00c8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00ec }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ec }
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch:{ all -> 0x00dd }
            r5[r3] = r0     // Catch:{ all -> 0x00dd }
            r1.close()     // Catch:{ Exception -> 0x00ec }
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00d9:
            r8.put(r7, r5)     // Catch:{ Exception -> 0x00ec }
            goto L_0x0082
        L_0x00dd:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ Exception -> 0x00ec }
        L_0x00e2:
            com.obwhatsapp.watls13.WtPersistentSession r14 = new com.obwhatsapp.watls13.WtPersistentSession     // Catch:{ Exception -> 0x00ec }
            r18 = r8
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00ec }
            return r14
        L_0x00ec:
            r1 = move-exception
            java.lang.String r0 = "WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00f2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219816e.A00(java.io.File):com.obwhatsapp.watls13.WtPersistentSession");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0046
            X.0tz r0 = r4.A01     // Catch:{ all -> 0x0048 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0048 }
            r3 = 0
            java.io.File r2 = r0.getCacheDir()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "watls-sessions"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0048 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0048 }
            r4.A00 = r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x002a
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.mkdir()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x002a
            r4.A00 = r3     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "WtPersistentSessionCacheImpl/getCacheDir: using external persistent cache directory "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0048 }
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0048 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0048 }
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219816e.A01():java.io.File");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(java.lang.Object r16, byte[] r17) {
        /*
            r15 = this;
            r8 = r16
            monitor-enter(r15)
            java.io.File r0 = r15.A01()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0122
            java.io.File r1 = r15.A01()     // Catch:{ all -> 0x0124 }
            r0 = 10
            r2 = r17
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)     // Catch:{ all -> 0x0124 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0124 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0124 }
            com.obwhatsapp.watls13.WtPersistentSession r8 = (com.obwhatsapp.watls13.WtPersistentSession) r8     // Catch:{ Exception -> 0x0101 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0101 }
            r10.<init>()     // Catch:{ Exception -> 0x0101 }
            java.lang.String r1 = "sni"
            java.lang.String r0 = r8.A02     // Catch:{ JSONException -> 0x00fa }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r1 = "port"
            int r0 = r8.A00     // Catch:{ JSONException -> 0x00fa }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r1 = "cipher"
            java.lang.String r0 = r8.A01     // Catch:{ JSONException -> 0x00fa }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r7 = "psks"
            java.util.LinkedHashSet r0 = r8.A03     // Catch:{ JSONException -> 0x00fa }
            if (r0 == 0) goto L_0x007c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00fa }
            r6.<init>()     // Catch:{ JSONException -> 0x00fa }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ JSONException -> 0x00fa }
        L_0x0046:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x00fa }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x00fa }
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = (com.obwhatsapp.net.tls13.WtCachedPsk) r0     // Catch:{ JSONException -> 0x00fa }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00e4 }
            r4.<init>()     // Catch:{ IOException -> 0x00e4 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0077 }
            r2.<init>(r4)     // Catch:{ all -> 0x0077 }
            r2.writeObject(r0)     // Catch:{ all -> 0x0072 }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ all -> 0x0077 }
            r4.close()     // Catch:{ IOException -> 0x00e4 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ JSONException -> 0x00fa }
            r6.put(r0)     // Catch:{ JSONException -> 0x00fa }
            goto L_0x0046
        L_0x0072:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ IOException -> 0x00e4 }
        L_0x007c:
            r6 = 0
        L_0x007d:
            r10.put(r7, r6)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r9 = "certs"
            java.util.Map r0 = r8.A04     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fa }
            r8.<init>()     // Catch:{ JSONException -> 0x00fa }
            java.util.Set r0 = r0.entrySet()     // Catch:{ JSONException -> 0x00fa }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ JSONException -> 0x00fa }
        L_0x0091:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x00fa }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r12 = r14.next()     // Catch:{ JSONException -> 0x00fa }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00fa }
            r7.<init>()     // Catch:{ JSONException -> 0x00fa }
            java.lang.Object r11 = r12.getValue()     // Catch:{ JSONException -> 0x00fa }
            java.security.cert.Certificate[] r11 = (java.security.cert.Certificate[]) r11     // Catch:{ JSONException -> 0x00fa }
            int r6 = r11.length     // Catch:{ JSONException -> 0x00fa }
            r5 = 0
        L_0x00aa:
            if (r5 >= r6) goto L_0x00d1
            r13 = r11[r5]     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fa }
            r4.<init>()     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r1 = r13.getType()     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r0 = "type"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r2 = "data"
            byte[] r1 = r13.getEncoded()     // Catch:{ CertificateEncodingException -> 0x00dd }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ CertificateEncodingException -> 0x00dd }
            r4.put(r2, r0)     // Catch:{ CertificateEncodingException -> 0x00dd }
            r7.put(r4)     // Catch:{ JSONException -> 0x00fa }
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00d1:
            java.lang.Object r0 = r12.getKey()     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x00fa }
            r8.put(r0, r7)     // Catch:{ JSONException -> 0x00fa }
            goto L_0x0091
        L_0x00dd:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x00fa }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00fa }
            goto L_0x00ea
        L_0x00e4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x00fa }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00fa }
        L_0x00ea:
            throw r1     // Catch:{ JSONException -> 0x00fa }
        L_0x00eb:
            r10.put(r9, r8)     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x0101 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0101 }
            X.AnonymousClass1XI.A0G(r3, r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0122
        L_0x00fa:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0101 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0101 }
            throw r0     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            r1.<init>()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "WtPersistentSessionCacheImpl/putSession: Error during put session "
            r1.append(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x0124 }
            r1.append(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = " : "
            r1.append(r0)     // Catch:{ all -> 0x0124 }
            r1.append(r2)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0124 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0124 }
        L_0x0122:
            monitor-exit(r15)
            return
        L_0x0124:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219816e.A02(java.lang.Object, byte[]):void");
    }

    public synchronized void A03(byte[] bArr) {
        if (A01() != null) {
            File file = new File(A01(), Base64.encodeToString(bArr, 10));
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("WtPersistentSessionCacheImpl/removeSession: Error during remove session ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
            }
        }
    }
}
