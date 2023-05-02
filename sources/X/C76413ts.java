package X;

import org.json.JSONObject;

/* renamed from: X.3ts  reason: invalid class name and case insensitive filesystem */
public final class C76413ts extends AnonymousClass1KC {
    public final C35301lh A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76413ts(X.C17130ua r14, X.C15860rz r15, X.C14710pd r16, X.C35301lh r17, X.AnonymousClass168 r18, X.AnonymousClass01D r19, X.AnonymousClass01J r20, X.AnonymousClass01J r21) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r19
            r9 = r20
            X.C18450wi.A0L(r4, r14, r15, r6, r9)
            r0 = 6
            r10 = r21
            X.C18450wi.A0H(r10, r0)
            r0 = r17
            java.lang.Object r7 = r0.A00
            java.lang.String r7 = (java.lang.String) r7
            r11 = 5636227673078975(0x14061e8453bcbf, double:2.78466646540807E-308)
            r8 = 0
            r1 = r13
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76413ts.<init>(X.0ua, X.0rz, X.0pd, X.1lh, X.168, X.01D, X.01J, X.01J):void");
    }

    public String A00() {
        return "facebook.com";
    }

    public void A05(JSONObject jSONObject) {
        C18450wi.A0H(jSONObject, 0);
        JSONObject A0J = C13700nu.A0J();
        A0J.put("app_id", "3402315746664947");
        JSONObject A0J2 = C13700nu.A0J();
        A0J2.put("input_params", A0J);
        jSONObject.put("variables", A0J2);
    }
}
