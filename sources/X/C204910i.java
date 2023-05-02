package X;

import org.json.JSONArray;

/* renamed from: X.10i  reason: invalid class name and case insensitive filesystem */
public class C204910i {
    public final C16460t6 A00;
    public final AnonymousClass10U A01;

    public C204910i(C16460t6 r1, AnonymousClass10U r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String A00(C28381Vw r4, C15880s3 r5) {
        JSONArray jSONArray = new JSONArray();
        JSONArray put = jSONArray.put(1).put(r4.A01).put(r4.A02);
        C15830rv r0 = r4.A00;
        AnonymousClass00B.A06(r0);
        put.put(r0.getRawString());
        return this.A01.A03(r5, jSONArray.toString());
    }
}
