package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Zn  reason: invalid class name */
public class AnonymousClass1Zn extends Handler {
    public File A00;
    public final C16980tz A01;
    public final AnonymousClass12X A02;

    public AnonymousClass1Zn(Looper looper, C16980tz r2, AnonymousClass12X r3) {
        super(looper);
        this.A01 = r2;
        this.A02 = r3;
    }

    public final synchronized void A00() {
        if (this.A00 == null) {
            File file = new File(this.A01.A00.getFilesDir(), "network_statistics.json");
            this.A00 = file;
            if (file.exists()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(C29301aP.A00(file)));
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tx_data");
                        JSONObject jSONObject3 = jSONObject.getJSONObject("rx_data");
                        HashMap hashMap = C46702Fq.A00;
                        hashMap.clear();
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(Integer.valueOf(Integer.parseInt(next)), Long.valueOf(jSONObject3.getLong(next)));
                        }
                        HashMap hashMap2 = C46702Fq.A01;
                        hashMap2.clear();
                        Iterator<String> keys2 = jSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            hashMap2.put(Integer.valueOf(Integer.parseInt(next2)), Long.valueOf(jSONObject2.getLong(next2)));
                        }
                    } catch (JSONException e2) {
                        Log.e("networkStatsHandler/load: error parsing JSON", e2);
                    }
                } catch (IOException e3) {
                    Log.e("networkStatsHandler/load: I/O error", e3);
                } catch (JSONException e4) {
                    Log.e("networkStatsHandler/load: JSON error", e4);
                    file.delete();
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.A00()     // Catch:{ all -> 0x00cd }
            int r1 = r7.what     // Catch:{ all -> 0x00cd }
            r0 = 1
            if (r1 == r0) goto L_0x007d
            r0 = 2
            if (r1 == r0) goto L_0x004a
            r0 = 3
            if (r1 == r0) goto L_0x0016
            r0 = 4
            if (r1 == r0) goto L_0x0050
            r0 = 5
            if (r1 != r0) goto L_0x00cb
            goto L_0x001c
        L_0x0016:
            int r2 = r7.arg1     // Catch:{ all -> 0x00cd }
            int r0 = r7.arg2     // Catch:{ all -> 0x00cd }
            long r3 = (long) r0     // Catch:{ all -> 0x00cd }
            goto L_0x0028
        L_0x001c:
            int r2 = r7.arg1     // Catch:{ all -> 0x00cd }
            android.os.Bundle r1 = r7.getData()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "long_value"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x00cd }
        L_0x0028:
            java.util.HashMap r5 = X.C46702Fq.A00     // Catch:{ all -> 0x00cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x003c
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cd }
        L_0x003c:
            long r0 = r0.longValue()     // Catch:{ all -> 0x00cd }
            long r0 = r0 + r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cd }
            r5.put(r2, r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00cb
        L_0x004a:
            int r2 = r7.arg1     // Catch:{ all -> 0x00cd }
            int r0 = r7.arg2     // Catch:{ all -> 0x00cd }
            long r3 = (long) r0     // Catch:{ all -> 0x00cd }
            goto L_0x005c
        L_0x0050:
            int r2 = r7.arg1     // Catch:{ all -> 0x00cd }
            android.os.Bundle r1 = r7.getData()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "long_value"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x00cd }
        L_0x005c:
            java.util.HashMap r5 = X.C46702Fq.A01     // Catch:{ all -> 0x00cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x0070
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cd }
        L_0x0070:
            long r0 = r0.longValue()     // Catch:{ all -> 0x00cd }
            long r0 = r0 + r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cd }
            r5.put(r2, r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00cb
        L_0x007d:
            java.io.File r0 = r6.A00     // Catch:{ all -> 0x00cd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00cd }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c5 }
            r2.<init>()     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r1 = "rx_data"
            java.util.HashMap r0 = X.C46702Fq.A00     // Catch:{ JSONException -> 0x00c5 }
            org.json.JSONObject r0 = X.C46702Fq.A00(r0)     // Catch:{ JSONException -> 0x00c5 }
            r2.putOpt(r1, r0)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r1 = "tx_data"
            java.util.HashMap r0 = X.C46702Fq.A01     // Catch:{ JSONException -> 0x00c5 }
            org.json.JSONObject r0 = X.C46702Fq.A00(r0)     // Catch:{ JSONException -> 0x00c5 }
            r2.putOpt(r1, r0)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r3 = r2.toString()     // Catch:{ JSONException -> 0x00c5 }
            java.io.File r2 = r6.A00     // Catch:{ JSONException -> 0x00c5 }
            X.12X r0 = r6.A02     // Catch:{ IOException -> 0x00be }
            X.1XH r0 = r0.A00     // Catch:{ IOException -> 0x00be }
            X.1uh r1 = new X.1uh     // Catch:{ IOException -> 0x00be }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00be }
            byte[] r0 = r3.getBytes()     // Catch:{ all -> 0x00b9 }
            r1.write(r0)     // Catch:{ all -> 0x00b9 }
            r1.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00cb
        L_0x00b9:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            throw r0     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r1 = move-exception
            java.lang.String r0 = "networkStatsHandler/save: error saving"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x00c5 }
            goto L_0x00cb
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "networkStatistics/save: error converting to JSON"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r6)
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Zn.handleMessage(android.os.Message):void");
    }
}
