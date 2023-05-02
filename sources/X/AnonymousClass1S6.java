package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1S6  reason: invalid class name */
public class AnonymousClass1S6 {
    public List A00 = null;
    public final C16300so A01;
    public final C16980tz A02;
    public final C15860rz A03;
    public final C14710pd A04;

    public AnonymousClass1S6(C16300so r2, C16980tz r3, C15860rz r4, C14710pd r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public synchronized List A00() {
        List list;
        AnonymousClass00B.A00();
        try {
            list = this.A00;
            if (list == null) {
                File file = new File(this.A02.A00.getFilesDir(), "userproxies");
                if (!file.canRead()) {
                    list = new ArrayList();
                } else {
                    String A06 = AnonymousClass1XI.A06(file);
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = new JSONObject(A06).getJSONArray("userproxies");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Long valueOf = Long.valueOf(jSONObject.getLong("exp"));
                        InetAddress byName = InetAddress.getByName(jSONObject.getString("ip"));
                        arrayList.add(new C35761mS(valueOf, Short.valueOf((short) jSONObject.getInt("port")), byName, jSONObject.getInt("resolver"), jSONObject.getBoolean("secure"), jSONObject.getBoolean("override")));
                    }
                    this.A00 = arrayList;
                    list = new ArrayList(arrayList);
                }
            }
        } catch (IOException | JSONException e2) {
            Log.e("UserProxyManager/getUserProxyIp", e2);
            this.A01.AcB("user-proxy-manager/load-error", e2.toString(), false);
            list = new ArrayList();
        }
        return list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(java.util.List r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x00d5 }
            int r1 = r7.size()     // Catch:{ all -> 0x00d5 }
            r0 = 1
            if (r1 >= r0) goto L_0x001e
            X.0tz r0 = r6.A02     // Catch:{ all -> 0x00d5 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "userproxies"
            r1.deleteFile(r0)     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d5 }
            r0.<init>()     // Catch:{ all -> 0x00d5 }
            r6.A00 = r0     // Catch:{ all -> 0x00d5 }
            goto L_0x00d3
        L_0x001e:
            X.0tz r0 = r6.A02     // Catch:{ IOException -> 0x00c0 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x00c0 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = "userproxies"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00c0 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x00c0 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x00c0 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00c0 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00c0 }
            android.util.JsonWriter r3 = new android.util.JsonWriter     // Catch:{ IOException -> 0x00c0 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r0 = ""
            r3.setIndent(r0)     // Catch:{ all -> 0x00bb }
            r3.beginObject()     // Catch:{ all -> 0x00bb }
            r3.name(r2)     // Catch:{ all -> 0x00bb }
            r3.beginArray()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x00bb }
        L_0x004f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x00bb }
            X.1mS r4 = (X.C35761mS) r4     // Catch:{ all -> 0x00bb }
            r3.beginObject()     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "ip"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            java.net.InetAddress r0 = r4.A03     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x00bb }
            r1.value(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "port"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Short r0 = r4.A02     // Catch:{ all -> 0x00bb }
            r1.value(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "exp"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Long r0 = r4.A01     // Catch:{ all -> 0x00bb }
            r1.value(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "secure"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            boolean r0 = r4.A05     // Catch:{ all -> 0x00bb }
            r1.value(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "override"
            android.util.JsonWriter r1 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            boolean r0 = r4.A04     // Catch:{ all -> 0x00bb }
            r1.value(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "resolver"
            android.util.JsonWriter r2 = r3.name(r0)     // Catch:{ all -> 0x00bb }
            int r0 = r4.A00     // Catch:{ all -> 0x00bb }
            long r0 = (long) r0     // Catch:{ all -> 0x00bb }
            r2.value(r0)     // Catch:{ all -> 0x00bb }
            r3.endObject()     // Catch:{ all -> 0x00bb }
            goto L_0x004f
        L_0x00aa:
            r3.endArray()     // Catch:{ all -> 0x00bb }
            r3.endObject()     // Catch:{ all -> 0x00bb }
            r3.close()     // Catch:{ IOException -> 0x00c0 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x00c0 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x00c0 }
            r6.A00 = r0     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00d3
        L_0x00bb:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r0     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "UserProxyManager/setUserProxies"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d5 }
            X.0so r3 = r6.A01     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "user-proxy-manager/set-error"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d5 }
            r0 = 0
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d3:
            monitor-exit(r6)
            return
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S6.A01(java.util.List):void");
    }

    public boolean A02() {
        return ((SharedPreferences) this.A03.A01.get()).getBoolean("proxy_enabled", false) && this.A04.A0E(C16620tM.A02, 2784);
    }
}
