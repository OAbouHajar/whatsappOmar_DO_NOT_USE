package X;

import org.json.JSONObject;

/* renamed from: X.3tr  reason: invalid class name and case insensitive filesystem */
public final class C76403tr extends AnonymousClass1KC {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76403tr(X.C17130ua r14, X.C15860rz r15, X.C14710pd r16, X.AnonymousClass168 r17, X.AnonymousClass01D r18, java.lang.String r19, X.AnonymousClass01J r20, X.AnonymousClass01J r21) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r9 = r20
            X.C18450wi.A0L(r4, r14, r15, r6, r9)
            r0 = 6
            r10 = r21
            X.C18450wi.A0H(r10, r0)
            r11 = 6289706231055731(0x16587459a4c573, double:3.1075277711982624E-308)
            java.lang.String r7 = "WA|471011608249857|4b543e9203c0b420cb5617b71ff0b80a"
            r8 = 0
            r1 = r13
            r5 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r19
            r13.A00 = r0
            java.lang.String r0 = "extensions"
            r13.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76403tr.<init>(X.0ua, X.0rz, X.0pd, X.168, X.01D, java.lang.String, X.01J, X.01J):void");
    }

    public String A01() {
        return "";
    }

    public void A05(JSONObject jSONObject) {
        C18450wi.A0H(jSONObject, 0);
        JSONObject A0J = C13700nu.A0J();
        JSONObject A0J2 = C13700nu.A0J();
        A0J2.put("biz_jid", this.A00);
        JSONObject A0J3 = C13700nu.A0J();
        A0J3.put("extensions", A0J2);
        A0J.put("request", A0J3);
        String obj = A0J.toString();
        C18450wi.A0B(obj);
        jSONObject.put("variables", obj);
    }
}
