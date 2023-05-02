package X;

import android.text.TextUtils;
import android.text.format.Time;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3BK  reason: invalid class name */
public final class AnonymousClass3BK {
    public String A00;
    public String A01;
    public JSONObject A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final C16300so A06;
    public final C16200sd A07;
    public final AnonymousClass2GM A08;
    public final C14710pd A09;
    public final String A0A;
    public final JSONObject A0B;

    public AnonymousClass3BK(C16300so r1, C16200sd r2, AnonymousClass2GM r3, C14710pd r4, String str, String str2, String str3, JSONObject jSONObject, long j2, long j3) {
        this.A09 = r4;
        this.A06 = r1;
        this.A07 = r2;
        this.A08 = r3;
        this.A0A = str;
        this.A01 = str2;
        this.A05 = j2;
        this.A04 = j3;
        this.A00 = str3;
        this.A0B = jSONObject;
    }

    public static AnonymousClass3BK A00(C16300so r19, C16200sd r20, AnonymousClass2GM r21, C14710pd r22, InputStream inputStream, String str) {
        try {
            String A002 = C30311c8.A00(inputStream);
            if (TextUtils.isEmpty(A002)) {
                Log.e("gdrive-api-v2/backup/empty input");
                return null;
            }
            JSONObject A0K = C13700nu.A0K(A002);
            String A012 = A01(FacebookFacade.RequestParameter.NAME, A0K);
            String A013 = A01("updateTime", A0K);
            if (TextUtils.isEmpty(A013)) {
                Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
                return null;
            }
            Time time = new Time();
            time.parse3339(A013);
            long millis = time.toMillis(true);
            long optLong = A0K.optLong("sizeBytes", -1);
            String A014 = A01("activeTransactionId", A0K);
            String A015 = A01("metadata", A0K);
            JSONObject A0K2 = !TextUtils.isEmpty(A015) ? C13700nu.A0K(A015) : null;
            if (A012 != null && millis > 0) {
                return new AnonymousClass3BK(r19, r20, r21, r22, str, A012, A014, A0K2, millis, optLong);
            }
            return null;
        } catch (IOException | JSONException e2) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e2);
        }
    }

    public static String A01(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e2) {
            Log.e("gdrive-api-v2/backup/get-string unexpected exception", e2);
            return null;
        }
    }

    public synchronized String A02() {
        return this.A00;
    }

    public JSONObject A03() {
        JSONObject jSONObject = this.A0B;
        if (jSONObject != null) {
            String optString = jSONObject.optString("backupExpiry");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    return C13700nu.A0K(optString);
                } catch (JSONException e2) {
                    Log.w("gdrive-api-v2/get-backup-supported/failed to parse", e2);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONObject A04() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0008
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003b }
            goto L_0x0037
        L_0x0008:
            org.json.JSONObject r1 = r3.A0B     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "encryptedData"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ all -> 0x003b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            X.0sd r0 = r3.A07     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r0.A00(r1)     // Catch:{ all -> 0x003b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            org.json.JSONObject r0 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x002f }
            r3.A02 = r0     // Catch:{ JSONException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api-v2/backup/failed to parse decrypted metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x003b }
        L_0x0035:
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r3)
            return r0
        L_0x0039:
            monitor-exit(r3)
            return r2
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BK.A04():org.json.JSONObject");
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Backup{jidUser='");
        A0r.append(this.A0A);
        A0r.append('\'');
        A0r.append(", name='");
        A0r.append(this.A01);
        A0r.append('\'');
        A0r.append(", updateTime=");
        A0r.append(this.A05);
        A0r.append(", sizeBytes=");
        A0r.append(this.A04);
        A0r.append(", activeTransactionId='");
        A0r.append(A02());
        A0r.append('\'');
        A0r.append(", clientMetadata=");
        A0r.append(this.A0B);
        return AnonymousClass000.A0k(A0r);
    }
}
