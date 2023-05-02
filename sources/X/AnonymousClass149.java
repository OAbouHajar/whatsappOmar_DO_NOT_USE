package X;

/* renamed from: X.149  reason: invalid class name */
public class AnonymousClass149 {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007a A[Catch:{ IllegalArgumentException | JSONException -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C35811mX A00(org.json.JSONArray r12) {
        /*
            int r0 = r12.length()
            r6 = 2
            r5 = 0
            if (r0 < r6) goto L_0x0086
            r0 = 0
            int r11 = r12.getInt(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            r0 = 1
            java.lang.String r4 = r12.getString(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r11 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.lang.String r3 = r12.getString(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            goto L_0x001d
        L_0x001a:
            if (r11 == r6) goto L_0x0015
            r3 = r5
        L_0x001d:
            r2 = 3
            if (r11 != r6) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            r1 = r5
            if (r11 == r6) goto L_0x002a
            r7 = r5
            goto L_0x002f
        L_0x0026:
            java.lang.String r1 = r12.getString(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
        L_0x002a:
            r0 = 4
            java.lang.String r7 = r12.getString(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
        L_0x002f:
            byte[] r8 = android.util.Base64.decode(r4, r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r3 == 0) goto L_0x003a
            byte[] r9 = android.util.Base64.decode(r3, r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            goto L_0x003b
        L_0x003a:
            r9 = r5
        L_0x003b:
            if (r1 == 0) goto L_0x0042
            byte[] r10 = android.util.Base64.decode(r1, r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            goto L_0x0043
        L_0x0042:
            r10 = r5
        L_0x0043:
            if (r8 == 0) goto L_0x007a
            int r0 = r8.length     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 <= 0) goto L_0x007a
            X.1mX r6 = new X.1mX     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            int r1 = r6.A00     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r1 != 0) goto L_0x0059
            byte[] r0 = r6.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 == 0) goto L_0x0073
            int r0 = r0.length     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 <= 0) goto L_0x0073
            return r6
        L_0x0059:
            r0 = 2
            if (r1 != r0) goto L_0x0079
            byte[] r0 = r6.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 == 0) goto L_0x0073
            int r0 = r0.length     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 <= 0) goto L_0x0073
            byte[] r0 = r6.A04     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 == 0) goto L_0x0073
            int r0 = r0.length     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 <= 0) goto L_0x0073
            java.lang.String r0 = r6.A01     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            if (r0 != 0) goto L_0x0073
            return r6
        L_0x0073:
            java.lang.String r0 = "KeyData/failed to parse json/key data not valid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            return r5
        L_0x0079:
            return r6
        L_0x007a:
            java.lang.String r0 = "KeyData/failed to parse json/wrong data"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0080 }
            return r5
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "KeyData/failed to parse json"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass149.A00(org.json.JSONArray):X.1mX");
    }
}
