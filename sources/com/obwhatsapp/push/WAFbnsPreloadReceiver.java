package com.obwhatsapp.push;

import X.AnonymousClass01D;
import X.AnonymousClass0AF;
import X.AnonymousClass1A6;
import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import X.C15860rz;
import X.C16150sX;
import X.C229419w;
import X.C53102ez;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class WAFbnsPreloadReceiver extends AnonymousClass0AF {
    public C229419w A00;
    public AnonymousClass1A6 A01;
    public final Object A02;
    public volatile boolean A03;

    public WAFbnsPreloadReceiver() {
        this(0);
    }

    public WAFbnsPreloadReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        com.whatsapp.util.Log.e(X.C13680ns.A0h("WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:", r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.content.Context r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            X.1A6 r4 = r0.A01
            r1 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0075
            org.json.JSONObject r2 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "params"
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "id"
            r5 = 0
            java.lang.String r7 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "ip"
            java.lang.String r8 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "cl_sess"
            java.lang.String r9 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "mmsov"
            java.lang.String r10 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "fbips"
            java.lang.String r11 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "er_ri"
            java.lang.String r12 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r3 = "1"
            java.lang.String r0 = "notify"
            java.lang.String r0 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            boolean r18 = r3.equals(r0)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "push_id"
            java.lang.String r13 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "push_event_id"
            java.lang.String r14 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "push_ts"
            java.lang.String r15 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "pn"
            java.lang.String r16 = r2.optString(r0, r5)     // Catch:{ JSONException -> 0x006b }
            r17 = 1
            monitor-enter(r4)     // Catch:{ JSONException -> 0x006b }
            r6 = r5
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0068 }
            monitor-exit(r4)     // Catch:{ JSONException -> 0x006b }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ JSONException -> 0x006b }
            throw r0     // Catch:{ JSONException -> 0x006b }
        L_0x006b:
            r2 = move-exception
            java.lang.String r0 = "WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:"
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.push.WAFbnsPreloadReceiver.A00(android.content.Context, java.lang.String):void");
    }

    public void A01(Context context, String str) {
        C229419w r3 = this.A00;
        if (!r3.A01()) {
            Log.i("FbnsTokenManager/onTokenRecevied fbns disabled for account");
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FbnsTokenManager/onTokenRecevied tokenFromFb is null");
        } else {
            synchronized (r3) {
                C15860rz r6 = r3.A04;
                AnonymousClass01D r2 = r6.A01;
                String string = C13680ns.A0C(r2).getString("fbns_token", (String) null);
                if (str.equals(C13680ns.A0C(r2).getString("last_server_fbns_token", (String) null))) {
                    Log.w("FbnsTokenManager/onTokenReceived called with token that is already on the server side");
                } else {
                    r3.A05.A00((C53102ez) null, str, "fbns");
                    C13680ns.A0y(r6.A0K(), "last_server_fbns_token", str);
                }
                if (str.equals(string)) {
                    Log.w("FbnsTokenManager/onTokenRecevied token already saved");
                } else {
                    C13680ns.A0w(r6.A0K().putString("fbns_token", str), "fbns_app_vers", 230176001);
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = (AnonymousClass1A6) A002.AC5.get();
                    this.A00 = (C229419w) A002.AA2.get();
                    this.A03 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}
