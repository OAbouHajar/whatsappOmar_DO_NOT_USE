package com.obwhatsapp.privacy.protocol.http;

import X.AnonymousClass13D;
import X.AnonymousClass13G;
import X.C13700nu;
import X.C16150sX;
import X.C17130ua;
import X.C17670vS;
import X.C18450wi;
import X.C19950zG;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class DisclosureContentWorker extends Worker {
    public final C17130ua A00;
    public final C19950zG A01;
    public final AnonymousClass13D A02;
    public final AnonymousClass13G A03;
    public final C17670vS A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0J(context, workerParameters);
        C16150sX r1 = (C16150sX) C13700nu.A0A(context);
        this.A00 = C16150sX.A05(r1);
        this.A03 = (AnonymousClass13G) r1.APh.get();
        this.A04 = (C17670vS) r1.ALM.get();
        this.A01 = (C19950zG) r1.AQV.get();
        this.A02 = (AnonymousClass13D) r1.A7D.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r14 = this;
            androidx.work.WorkerParameters r6 = r14.A01
            X.03h r5 = r6.A01
            java.lang.String r1 = "disclosure_ids"
            java.util.Map r0 = r5.A00
            java.lang.Object r3 = r0.get(r1)
            boolean r0 = r3 instanceof java.lang.Integer[]
            if (r0 == 0) goto L_0x0023
            java.lang.Integer[] r3 = (java.lang.Integer[]) r3
            int r2 = r3.length
            int[] r4 = new int[r2]
            r1 = 0
        L_0x0016:
            if (r1 >= r2) goto L_0x0024
            r0 = r3[r1]
            int r0 = r0.intValue()
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x0159
            int r3 = r4.length
            boolean r0 = X.AnonymousClass000.A1P(r3)
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = "url"
            java.lang.String r8 = r5.A03(r0)
            if (r8 == 0) goto L_0x0150
            int r1 = r6.A00
            r0 = 4
            if (r1 > r0) goto L_0x0150
            r1 = -1
            java.lang.String r0 = "handler"
            int r5 = r5.A02(r0, r1)
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.0zG r6 = r14.A01     // Catch:{ IOException -> 0x013c }
            X.0vS r7 = r14.A04     // Catch:{ IOException -> 0x013c }
            r9 = 0
            X.16H r6 = (X.AnonymousClass16H) r6     // Catch:{ IOException -> 0x013c }
            r11 = r9
            r10 = r9
            X.1pl r2 = r6.A7K(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x013c }
            int r1 = r2.A6O()     // Catch:{ all -> 0x0135 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0063
            X.02P r0 = new X.02P     // Catch:{ all -> 0x0135 }
            r0.<init>()     // Catch:{ all -> 0x0135 }
            goto L_0x012a
        L_0x0063:
            X.13D r0 = r14.A02     // Catch:{ all -> 0x0135 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00     // Catch:{ all -> 0x0135 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0135 }
            java.lang.Object r7 = r1.get(r0)     // Catch:{ all -> 0x0135 }
            X.1DL r7 = (X.AnonymousClass1DL) r7     // Catch:{ all -> 0x0135 }
            if (r7 == 0) goto L_0x012e
            X.0ua r1 = r14.A00     // Catch:{ all -> 0x0135 }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0135 }
            java.io.InputStream r0 = r2.A9k(r1, r9, r0)     // Catch:{ all -> 0x0135 }
            byte[] r0 = X.C30311c8.A08(r0)     // Catch:{ all -> 0x0135 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0135 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0135 }
            r8.<init>(r0)     // Catch:{ all -> 0x0135 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x011f }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x011f }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x011f }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x011f }
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ JSONException -> 0x011f }
            r6.<init>()     // Catch:{ JSONException -> 0x011f }
            r0 = 8192(0x2000, float:1.14794E-41)
            r5 = 0
            char[] r1 = new char[r0]     // Catch:{ JSONException -> 0x011f }
        L_0x009f:
            int r0 = r9.read(r1)     // Catch:{ JSONException -> 0x011f }
            if (r0 < 0) goto L_0x00a9
            r6.write(r1, r5, r0)     // Catch:{ JSONException -> 0x011f }
            goto L_0x009f
        L_0x00a9:
            java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x011f }
            X.C18450wi.A0B(r0)     // Catch:{ JSONException -> 0x011f }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x011f }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x011f }
        L_0x00b5:
            if (r5 >= r3) goto L_0x0117
            org.json.JSONObject r9 = r6.getJSONObject(r5)     // Catch:{ JSONException -> 0x010a }
            java.lang.String r0 = "notice_id"
            int r13 = r9.getInt(r0)     // Catch:{ JSONException -> 0x010a }
            r12 = 1
            int[][] r1 = new int[r12][]     // Catch:{ JSONException -> 0x010a }
            r0 = 0
            r1[r0] = r4     // Catch:{ JSONException -> 0x010a }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ JSONException -> 0x010a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x010a }
            boolean r0 = r1.contains(r0)     // Catch:{ JSONException -> 0x010a }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "privacy-disclosure"
            org.json.JSONObject r1 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x010a }
            java.lang.String r0 = "deeplink"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ JSONException -> 0x010a }
            if (r11 == 0) goto L_0x0114
            X.1DK r10 = r7.A00     // Catch:{ JSONException -> 0x010a }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x010a }
            java.util.concurrent.ConcurrentHashMap r1 = r10.A03     // Catch:{ JSONException -> 0x010a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x010a }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x010a }
            X.4Nr r0 = (X.C85244Nr) r0     // Catch:{ JSONException -> 0x010a }
            if (r0 == 0) goto L_0x0103
            r0.A00 = r12     // Catch:{ JSONException -> 0x010a }
            r0.A05 = r11     // Catch:{ JSONException -> 0x010a }
            if (r9 == 0) goto L_0x00ff
            r0.A04 = r9     // Catch:{ JSONException -> 0x010a }
        L_0x00ff:
            r10.A01(r0, r13)     // Catch:{ JSONException -> 0x010a }
            goto L_0x0114
        L_0x0103:
            java.lang.String r0 = "Invalid disclosureId"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ JSONException -> 0x010a }
            throw r0     // Catch:{ JSONException -> 0x010a }
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "pdfndisclosurehandler/handledisclosurecontent wrong json object for disclosure "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ JSONException -> 0x011f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x011f }
        L_0x0114:
            int r5 = r5 + 1
            goto L_0x00b5
        L_0x0117:
            r8.close()     // Catch:{ all -> 0x0135 }
            X.02Q r0 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x0135 }
            goto L_0x012a
        L_0x011f:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/handleResponse malformed downloaded content"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0135 }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x0135 }
            r0.<init>()     // Catch:{ all -> 0x0135 }
        L_0x012a:
            r2.close()     // Catch:{ IOException -> 0x013c }
            goto L_0x0147
        L_0x012e:
            java.lang.String r0 = "null cannot be cast to non-null type com.obwhatsapp.privacy.protocol.xmpp.DisclosureHandler"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ IOException -> 0x013c }
            throw r0     // Catch:{ IOException -> 0x013c }
        L_0x013c:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014b }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
        L_0x0147:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x014b:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0150:
            X.13G r1 = r14.A03
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r1.A02(r0)
        L_0x0159:
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.privacy.protocol.http.DisclosureContentWorker.A04():X.02Q");
    }
}
