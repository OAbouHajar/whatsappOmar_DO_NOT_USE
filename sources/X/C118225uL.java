package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5uL  reason: invalid class name and case insensitive filesystem */
public class C118225uL {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public C118225uL(String str, String str2, long j2, long j3) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j2;
        this.A00 = j3;
    }

    public String toString() {
        JSONObject A0J = C13700nu.A0J();
        try {
            A0J.put("shard-key", this.A03);
            A0J.put("entry-key", this.A02);
            A0J.put("expiration-time", this.A01);
            A0J.put("create-time", this.A00);
        } catch (JSONException unused) {
            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/toJson threw exception");
        }
        return A0J.toString();
    }
}
