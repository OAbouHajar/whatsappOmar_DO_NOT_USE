package X;

import android.content.SharedPreferences;

/* renamed from: X.0wv  reason: invalid class name and case insensitive filesystem */
public class C18580wv {
    public final AnonymousClass1CT A00;
    public final C27941Ts A01;
    public final C15960sC A02;

    public C18580wv(AnonymousClass1CT r1, C27941Ts r2, C15960sC r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r5 = this;
            X.1Ts r4 = r5.A01
            X.01D r0 = r4.A07
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "ab_props:hash"
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)
            if (r1 == 0) goto L_0x005b
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0055 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0055 }
            X.1mX r2 = X.AnonymousClass149.A00(r0)     // Catch:{ JSONException -> 0x0055 }
            if (r2 == 0) goto L_0x005b
            X.14A r1 = r4.A02     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r0 = X.AnonymousClass021.A00     // Catch:{ JSONException -> 0x0055 }
            byte[] r1 = r1.A01(r2, r0)     // Catch:{ JSONException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.nio.charset.Charset r0 = X.C27941Ts.A09     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x0055 }
            r3.<init>(r1, r0)     // Catch:{ JSONException -> 0x0055 }
            X.01D r0 = r4.A06
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r2 = r0.getAll()
            java.util.Set r1 = r2.keySet()
            X.01D r0 = r4.A05
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.retainAll(r0)
            java.lang.String r0 = X.AnonymousClass1CU.A00(r2)
            boolean r0 = r3.equals(r0)
            r1 = r0 ^ 1
            goto L_0x005c
        L_0x0055:
            r1 = move-exception
            java.lang.String r0 = "AB Props Hash couldn't be decrypted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005b:
            r1 = 0
        L_0x005c:
            X.0sC r0 = r5.A02
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "unregistered"
            return r0
        L_0x0068:
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "true"
            return r0
        L_0x006e:
            java.lang.String r0 = "false"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18580wv.A00():java.lang.String");
    }

    public String A01() {
        AnonymousClass1CT r3 = this.A00;
        String string = ((SharedPreferences) r3.A01.get()).getString("server_props:hash", (String) null);
        return !this.A02.A01() ? "unregistered" : string != null ? string.equals(AnonymousClass1CU.A00(((SharedPreferences) r3.A02.get()).getAll())) ^ true : false ? "true" : "false";
    }
}
