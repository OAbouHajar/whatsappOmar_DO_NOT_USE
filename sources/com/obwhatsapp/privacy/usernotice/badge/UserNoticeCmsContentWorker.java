package com.obwhatsapp.privacy.usernotice.badge;

import X.AnonymousClass13G;
import X.AnonymousClass13J;
import X.C13700nu;
import X.C16150sX;
import X.C17130ua;
import X.C17670vS;
import X.C18450wi;
import X.C19950zG;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeCmsContentWorker extends Worker {
    public final C17130ua A00;
    public final C19950zG A01;
    public final AnonymousClass13G A02;
    public final AnonymousClass13J A03;
    public final C17670vS A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeCmsContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0J(context, workerParameters);
        C16150sX r1 = (C16150sX) C13700nu.A0A(context);
        this.A00 = C16150sX.A05(r1);
        this.A02 = (AnonymousClass13G) r1.APh.get();
        this.A04 = (C17670vS) r1.ALM.get();
        this.A01 = (C19950zG) r1.AQV.get();
        this.A03 = (AnonymousClass13J) r1.APd.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0385, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        X.C41191vO.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0389, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ IOException | JSONException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e A[Catch:{ IOException | JSONException -> 0x00ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r30 = this;
            r5 = r30
            androidx.work.WorkerParameters r7 = r5.A01
            X.03h r4 = r7.A01
            java.lang.String r1 = "notices_id"
            java.util.Map r0 = r4.A00
            java.lang.Object r3 = r0.get(r1)
            boolean r0 = r3 instanceof java.lang.Integer[]
            if (r0 == 0) goto L_0x0025
            java.lang.Integer[] r3 = (java.lang.Integer[]) r3
            int r2 = r3.length
            int[] r6 = new int[r2]
            r1 = 0
        L_0x0018:
            if (r1 >= r2) goto L_0x0026
            r0 = r3[r1]
            int r0 = r0.intValue()
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0025:
            r6 = 0
        L_0x0026:
            if (r6 == 0) goto L_0x03a7
            int r0 = r6.length
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x03a7
            java.lang.String r0 = "url"
            java.lang.String r9 = r4.A03(r0)
            if (r9 == 0) goto L_0x03a7
            int r1 = r7.A00
            r0 = 4
            if (r1 > r0) goto L_0x03a7
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.0zG r7 = r5.A01     // Catch:{ IOException -> 0x038a }
            X.0vS r8 = r5.A04     // Catch:{ IOException -> 0x038a }
            r10 = 0
            X.16H r7 = (X.AnonymousClass16H) r7     // Catch:{ IOException -> 0x038a }
            r12 = r10
            r11 = r10
            X.1pl r8 = r7.A7K(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x038a }
            int r1 = r8.A6O()     // Catch:{ all -> 0x0383 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0067
            X.13G r1 = r5.A02     // Catch:{ all -> 0x0383 }
            java.lang.Integer r0 = X.C13680ns.A0Z()     // Catch:{ all -> 0x0383 }
            r1.A02(r0)     // Catch:{ all -> 0x0383 }
        L_0x0060:
            X.02P r0 = new X.02P     // Catch:{ all -> 0x0383 }
            r0.<init>()     // Catch:{ all -> 0x0383 }
            goto L_0x037f
        L_0x0067:
            X.0ua r1 = r5.A00     // Catch:{ all -> 0x0383 }
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0383 }
            java.io.InputStream r0 = r8.A9k(r1, r10, r0)     // Catch:{ all -> 0x0383 }
            byte[] r0 = X.C30311c8.A08(r0)     // Catch:{ all -> 0x0383 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0383 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0383 }
            r1.<init>(r0)     // Catch:{ all -> 0x0383 }
            X.2E7 r13 = X.AnonymousClass2E7.A00     // Catch:{ all -> 0x0383 }
            java.lang.String r2 = "results"
            java.lang.String r12 = "Failed to parse user notice content list"
            r0 = 23
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r11 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1     // Catch:{ all -> 0x0383 }
            r11.<init>(r0)     // Catch:{ all -> 0x0383 }
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0383 }
            r10.<init>()     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r1 = X.C30311c8.A03(r1)     // Catch:{ IOException | JSONException -> 0x00ec }
            X.AnonymousClass00B.A06(r1)     // Catch:{ IOException | JSONException -> 0x00ec }
            boolean r0 = r1.has(r2)     // Catch:{ IOException | JSONException -> 0x00ec }
            if (r0 != 0) goto L_0x00a4
            java.util.Map r1 = X.C25411Jr.A03(r10)     // Catch:{ IOException | JSONException -> 0x00ec }
            goto L_0x00f4
        L_0x00a4:
            org.json.JSONArray r9 = r1.getJSONArray(r2)     // Catch:{ IOException | JSONException -> 0x00ec }
            r0 = 0
            int r7 = r9.length()     // Catch:{ IOException | JSONException -> 0x00ec }
        L_0x00ad:
            if (r0 >= r7) goto L_0x00f0
            int r14 = r0 + 1
            org.json.JSONObject r2 = r9.getJSONObject(r0)     // Catch:{ IOException | JSONException -> 0x00ec }
            java.lang.String r0 = "notice_id"
            int r1 = r2.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00ec }
            java.lang.String r0 = "channel"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ IOException | JSONException -> 0x00ec }
            if (r4 != 0) goto L_0x00c5
            java.lang.String r4 = "default"
        L_0x00c5:
            X.1jo r3 = X.AnonymousClass2E7.A00(r13, r2, r1)     // Catch:{ IOException | JSONException -> 0x00ec }
            if (r3 == 0) goto L_0x00ea
            java.lang.Object r2 = r10.get(r4)     // Catch:{ IOException | JSONException -> 0x00ec }
            r1 = 1
            if (r2 != 0) goto L_0x00d7
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00ec }
            r2.<init>(r1, r11)     // Catch:{ IOException | JSONException -> 0x00ec }
        L_0x00d7:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ IOException | JSONException -> 0x00ec }
            java.lang.Object r0 = r10.get(r4)     // Catch:{ IOException | JSONException -> 0x00ec }
            if (r0 != 0) goto L_0x00e4
            java.util.PriorityQueue r0 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00ec }
            r0.<init>(r1, r11)     // Catch:{ IOException | JSONException -> 0x00ec }
        L_0x00e4:
            r2.offer(r3)     // Catch:{ IOException | JSONException -> 0x00ec }
            r10.put(r4, r2)     // Catch:{ IOException | JSONException -> 0x00ec }
        L_0x00ea:
            r0 = r14
            goto L_0x00ad
        L_0x00ec:
            r0 = move-exception
            com.whatsapp.util.Log.e(r12, r0)     // Catch:{ all -> 0x0383 }
        L_0x00f0:
            java.util.Map r1 = X.C25411Jr.A03(r10)     // Catch:{ all -> 0x0383 }
        L_0x00f4:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "UserNoticeCmsContentWorker/storeUserNoticeContent/cannot parse response for notice: "
            java.lang.String r0 = X.C18450wi.A06(r0, r6)     // Catch:{ all -> 0x0383 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0383 }
            X.13G r1 = r5.A02     // Catch:{ all -> 0x0383 }
            java.lang.Integer r0 = X.C13680ns.A0a()     // Catch:{ all -> 0x0383 }
            r1.A02(r0)     // Catch:{ all -> 0x0383 }
            goto L_0x0060
        L_0x010e:
            X.13J r9 = r5.A03     // Catch:{ all -> 0x0383 }
            r7 = 0
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0383 }
            if (r0 != 0) goto L_0x037b
            X.0qW r0 = r9.A06     // Catch:{ all -> 0x0383 }
            r29 = r0
            java.lang.Object r0 = r29.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            r0.clear()     // Catch:{ all -> 0x0383 }
            X.0qW r15 = r9.A05     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r15.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            r0.clear()     // Catch:{ all -> 0x0383 }
            X.0qW r14 = r9.A07     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r14.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            r0.clear()     // Catch:{ all -> 0x0383 }
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r1)     // Catch:{ all -> 0x0383 }
        L_0x013e:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x01c9
            java.util.Map$Entry r16 = X.AnonymousClass000.A0z(r17)     // Catch:{ all -> 0x0383 }
            java.lang.Object r1 = r16.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0383 }
            r6 = 0
            X.1jo[] r0 = new X.C34171jo[r7]     // Catch:{ all -> 0x0383 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ all -> 0x0383 }
            if (r4 == 0) goto L_0x01c2
            int r3 = r4.length     // Catch:{ all -> 0x0383 }
        L_0x0158:
            if (r6 >= r3) goto L_0x013e
            r2 = r4[r6]     // Catch:{ all -> 0x0383 }
            int r6 = r6 + 1
            X.1jo r2 = (X.C34171jo) r2     // Catch:{ all -> 0x0383 }
            java.lang.Object r1 = r14.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x0383 }
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0383 }
            if (r11 != 0) goto L_0x0176
            r0 = 1
            java.util.PriorityQueue r11 = new java.util.PriorityQueue     // Catch:{ all -> 0x0383 }
            r11.<init>(r0)     // Catch:{ all -> 0x0383 }
        L_0x0176:
            java.util.PriorityQueue r11 = (java.util.PriorityQueue) r11     // Catch:{ all -> 0x0383 }
            int r13 = r2.A00     // Catch:{ all -> 0x0383 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0383 }
            r11.offer(r1)     // Catch:{ all -> 0x0383 }
            java.lang.Object r10 = r14.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x0383 }
            r10.put(r0, r11)     // Catch:{ all -> 0x0383 }
            X.2Do r0 = r2.A05     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x01b8
            java.lang.String r12 = r0.A02     // Catch:{ all -> 0x0383 }
            java.lang.String r11 = r0.A01     // Catch:{ all -> 0x0383 }
            X.2Dn r10 = r0.A00     // Catch:{ all -> 0x0383 }
            r25 = -1
            r23 = 1
            X.2Dz r0 = new X.2Dz     // Catch:{ all -> 0x0383 }
            r24 = 1
            r27 = -1
            r18 = r0
            r19 = r10
            r20 = r12
            r21 = r11
            r22 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x0383 }
            java.lang.Object r10 = r15.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x0383 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0383 }
        L_0x01b8:
            java.lang.Object r0 = r29.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0383 }
            goto L_0x0158
        L_0x01c2:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ all -> 0x0383 }
            throw r0     // Catch:{ all -> 0x0383 }
        L_0x01c9:
            X.13H r6 = r9.A03     // Catch:{ all -> 0x0383 }
            X.0qW r0 = r9.A08     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0383 }
            java.util.HashMap r4 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x0383 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0383 }
        L_0x01df:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0383 }
            X.2Dw r0 = (X.C46352Dw) r0     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r2 = X.C46352Dw.A01(r0)     // Catch:{ all -> 0x0383 }
            if (r2 == 0) goto L_0x01df
            int r0 = r0.A01     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0383 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0383 }
            goto L_0x01df
        L_0x01ff:
            android.content.SharedPreferences$Editor r2 = r6.A00()     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0383 }
            r0.<init>(r4)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "user_notices_metadata"
            X.C13680ns.A0y(r2, r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r15.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            java.util.Iterator r10 = X.C13680ns.A0q(r0)     // Catch:{ all -> 0x0383 }
        L_0x021c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0383 }
            X.2Dz r9 = (X.C46362Dz) r9     // Catch:{ all -> 0x0383 }
            X.2E0 r7 = r9.A04     // Catch:{ all -> 0x0383 }
            int r1 = r7.A00     // Catch:{ all -> 0x0383 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "id"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r1 = "text"
            java.lang.String r0 = r7.A03     // Catch:{ JSONException -> 0x029d }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r1 = "action"
            java.lang.String r0 = r7.A02     // Catch:{ JSONException -> 0x029d }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r4 = "enabled_time"
            long r0 = r9.A02     // Catch:{ JSONException -> 0x029d }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r4 = "selected_time"
            long r0 = r9.A03     // Catch:{ JSONException -> 0x029d }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r1 = "stage"
            int r0 = r9.A01     // Catch:{ JSONException -> 0x029d }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029d }
            java.lang.String r1 = "policy_version"
            int r0 = r9.A00     // Catch:{ JSONException -> 0x029d }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x029d }
            X.2Dn r7 = r7.A01     // Catch:{ JSONException -> 0x029d }
            X.2Dy r0 = r7.A02     // Catch:{ JSONException -> 0x029d }
            if (r0 == 0) goto L_0x0274
            java.lang.String r4 = "start_time"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x029d }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x029d }
        L_0x0274:
            X.2Dx r0 = r7.A00     // Catch:{ JSONException -> 0x029d }
            if (r0 == 0) goto L_0x0280
            java.lang.String r4 = "static_duration"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x029d }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x029d }
        L_0x0280:
            X.2Dy r0 = r7.A01     // Catch:{ JSONException -> 0x029d }
            if (r0 == 0) goto L_0x028b
            java.lang.String r4 = "end_time"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x029d }
            r2.put(r4, r0)     // Catch:{ JSONException -> 0x029d }
        L_0x028b:
            android.content.SharedPreferences$Editor r4 = r6.A00()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "badged_notice_"
            java.lang.String r1 = X.C13680ns.A0h(r0, r3)     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0383 }
            X.C13680ns.A0y(r4, r1, r0)     // Catch:{ all -> 0x0383 }
            goto L_0x021c
        L_0x029d:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeBadgeContent/toJSON exception: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0383 }
            goto L_0x021c
        L_0x02a5:
            java.lang.Object r0 = r29.getValue()     // Catch:{ all -> 0x0383 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0383 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0383 }
            java.util.HashMap r4 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x0383 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0383 }
        L_0x02b7:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x0368
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0383 }
            X.1jo r9 = (X.C34171jo) r9     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r7 = X.C13700nu.A0J()     // Catch:{ all -> 0x0383 }
            int r3 = r9.A00     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "notice_id"
            r7.put(r0, r3)     // Catch:{ all -> 0x0383 }
            int r1 = r9.A01     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "policyVersion"
            r7.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r9.A06     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "channel"
            r7.put(r0, r1)     // Catch:{ all -> 0x0383 }
            X.2Dp r10 = r9.A02     // Catch:{ all -> 0x0383 }
            if (r10 == 0) goto L_0x0319
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "text"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "iconDescription"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "action"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r10.A03     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "light"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "dark"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            X.2Dn r0 = r10.A00     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r1 = r0.A01()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "timing"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "banner"
            r7.put(r0, r2)     // Catch:{ all -> 0x0383 }
        L_0x0319:
            X.2Dr r0 = r9.A04     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x0326
            org.json.JSONObject r1 = r0.A02()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "modal"
            r7.put(r0, r1)     // Catch:{ all -> 0x0383 }
        L_0x0326:
            X.2Dr r0 = r9.A03     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x0333
            org.json.JSONObject r1 = r0.A02()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "blocking-modal"
            r7.put(r0, r1)     // Catch:{ all -> 0x0383 }
        L_0x0333:
            X.2Do r9 = r9.A05     // Catch:{ all -> 0x0383 }
            if (r9 == 0) goto L_0x035b
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "text"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "action"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            X.2Dn r0 = r9.A00     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r1 = r0.A01()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "timing"
            r2.put(r0, r1)     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "badged-notice"
            r7.put(r0, r2)     // Catch:{ all -> 0x0383 }
        L_0x035b:
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0383 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0383 }
            goto L_0x02b7
        L_0x0368:
            android.content.SharedPreferences$Editor r2 = r6.A00()     // Catch:{ all -> 0x0383 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0383 }
            r0.<init>(r4)     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "user_notices_content"
            X.C13680ns.A0y(r2, r0, r1)     // Catch:{ all -> 0x0383 }
        L_0x037b:
            X.02Q r0 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x0383 }
        L_0x037f:
            r8.close()     // Catch:{ IOException -> 0x038a }
            goto L_0x039e
        L_0x0383:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0385 }
        L_0x0385:
            r0 = move-exception
            X.C41191vO.A00(r8, r1)     // Catch:{ IOException -> 0x038a }
            throw r0     // Catch:{ IOException -> 0x038a }
        L_0x038a:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03a2 }
            X.13G r1 = r5.A02     // Catch:{ all -> 0x03a2 }
            java.lang.Integer r0 = X.C13680ns.A0Z()     // Catch:{ all -> 0x03a2 }
            r1.A02(r0)     // Catch:{ all -> 0x03a2 }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x03a2 }
            r0.<init>()     // Catch:{ all -> 0x03a2 }
        L_0x039e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x03a2:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x03a7:
            X.13G r1 = r5.A02
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r1.A02(r0)
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.A04():X.02Q");
    }
}
