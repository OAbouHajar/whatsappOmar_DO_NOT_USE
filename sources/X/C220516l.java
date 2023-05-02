package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16l  reason: invalid class name and case insensitive filesystem */
public class C220516l {
    public Map A00;
    public final C16040sK A01;
    public final AnonymousClass12D A02;
    public final C16440t3 A03;
    public final C14710pd A04;
    public final C16490t9 A05;
    public final C16320sq A06;

    public C220516l(C16040sK r1, AnonymousClass12D r2, C16440t3 r3, C14710pd r4, C16490t9 r5, C16320sq r6) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = r2;
    }

    public final synchronized Map A00() {
        HashMap hashMap;
        Map map = this.A00;
        hashMap = map;
        if (map == null) {
            String string = this.A02.A01().getString("out_contact_convert_time_in_msec_map", (String) null);
            HashMap hashMap2 = new HashMap();
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap2.put(UserJid.get(next), Long.valueOf(jSONObject.getLong(next)));
                    }
                } catch (AnonymousClass1W4 | JSONException e2) {
                    StringBuilder sb = new StringBuilder("ContactDiscoveryLoggingHelper/loadJsonMap ex=");
                    sb.append(e2);
                    Log.e(sb.toString());
                }
            }
            this.A00 = hashMap2;
            hashMap = hashMap2;
        }
        return hashMap;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    public final synchronized void A01(java.util.List r14, java.util.Set r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.0t3 r0 = r13.A03     // Catch:{ all -> 0x00d0 }
            long r11 = r0.A00()     // Catch:{ all -> 0x00d0 }
            r13.A00()     // Catch:{ all -> 0x00d0 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00d0 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00d0 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x00d0 }
            r4.<init>()     // Catch:{ all -> 0x00d0 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x00d0 }
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x00d0 }
            r9 = 0
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r9 = 1
        L_0x002a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x00d0 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x005a
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00d0 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00d0 }
            long r7 = r0.longValue()     // Catch:{ all -> 0x00d0 }
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r1 = r11 - r5
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            boolean r0 = r15.contains(r3)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x005a
        L_0x0056:
            r10.remove()     // Catch:{ all -> 0x00d0 }
            goto L_0x0029
        L_0x005a:
            java.lang.String r1 = r3.getRawString()     // Catch:{ all -> 0x00d0 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00d0 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x002a
        L_0x006a:
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x006e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00d0 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r1.A08(r0)     // Catch:{ all -> 0x00d0 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x006e
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00d0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x00d0 }
            r0.put(r2, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x006e
        L_0x0095:
            if (r9 == 0) goto L_0x00ce
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00b2
            X.12D r0 = r13.A02     // Catch:{ all -> 0x00d0 }
            r2 = 0
            android.content.SharedPreferences r0 = r0.A01()     // Catch:{ all -> 0x00d0 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "out_contact_convert_time_in_msec_map"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ all -> 0x00d0 }
            r0.apply()     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x00b2:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00d0 }
            r1.<init>(r4)     // Catch:{ all -> 0x00d0 }
            X.12D r0 = r13.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x00d0 }
            android.content.SharedPreferences r0 = r0.A01()     // Catch:{ all -> 0x00d0 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "out_contact_convert_time_in_msec_map"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ all -> 0x00d0 }
            r0.apply()     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r13)
            return
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220516l.A01(java.util.List, java.util.Set):void");
    }
}
