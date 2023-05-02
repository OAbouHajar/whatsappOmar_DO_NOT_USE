package X;

import org.json.JSONObject;

/* renamed from: X.34q  reason: invalid class name and case insensitive filesystem */
public class C606334q extends C79263zb {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C606334q(X.C17130ua r21, X.C15860rz r22, X.C14710pd r23, X.AnonymousClass168 r24, X.C17660vR r25, X.AnonymousClass01D r26, java.lang.String r27, java.lang.String r28, java.util.Map r29, X.AnonymousClass01J r30, X.AnonymousClass01J r31, long r32) {
        /*
            r20 = this;
            r7 = r22
            java.lang.String r0 = r7.A0O()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            android.util.SparseArray r0 = X.C29221aF.A01
            java.lang.Object r6 = r0.get(r1)
            if (r6 == 0) goto L_0x005c
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r4 = "params"
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r2 = "server_params"
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r0 = "country_iso_graphql"
            org.json.JSONObject r0 = r1.put(r0, r6)     // Catch:{ JSONException -> 0x0055 }
            org.json.JSONObject r0 = r3.put(r2, r0)     // Catch:{ JSONException -> 0x0055 }
            org.json.JSONObject r0 = r5.put(r4, r0)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r14 = r0.toString()     // Catch:{ JSONException -> 0x0055 }
            r5 = r20
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0055:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C606334q.<init>(X.0ua, X.0rz, X.0pd, X.168, X.0vR, X.01D, java.lang.String, java.lang.String, java.util.Map, X.01J, X.01J, long):void");
    }

    public void A08(JSONObject jSONObject) {
        super.A08(jSONObject);
        jSONObject.put("country_iso_graphql", C29221aF.A01.get(Integer.valueOf(this.A03.A0O()).intValue()));
    }
}
