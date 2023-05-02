package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.37p  reason: invalid class name and case insensitive filesystem */
public final class C611137p extends C111975hj {
    public final AnonymousClass013 A00;
    public final C14710pd A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C611137p(X.C17130ua r18, X.C15860rz r19, X.AnonymousClass013 r20, X.C14710pd r21, X.AnonymousClass168 r22, X.C17660vR r23, X.AnonymousClass01D r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, X.AnonymousClass01J r29, X.AnonymousClass01J r30, long r31) {
        /*
            r17 = this;
            r3 = r18
            r4 = r19
            r6 = r22
            r7 = r23
            r8 = r24
            X.C18450wi.A0L(r7, r3, r6, r4, r8)
            r13 = r29
            r14 = r30
            X.C18450wi.A0K(r13, r14)
            r0 = 9
            r10 = r25
            X.C18450wi.A0H(r10, r0)
            r0 = 13
            r5 = r21
            X.C18450wi.A0H(r5, r0)
            r0 = 14
            r1 = r20
            X.C18450wi.A0H(r1, r0)
            r12 = r28
            r15 = r31
            r2 = r17
            r11 = r26
            r9 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A01 = r5
            r2.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611137p.<init>(X.0ua, X.0rz, X.013, X.0pd, X.168, X.0vR, X.01D, java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.01J, X.01J, long):void");
    }

    public String A02() {
        boolean A0E = this.A01.A0E(C16620tM.A02, 2827);
        if (A0E) {
            String A05 = AnonymousClass1WH.A05(C13690nt.A0m(this.A00));
            C18450wi.A0B(A05);
            Map A03 = A03();
            if (!A03.containsKey(A05)) {
                return A05;
            }
            String A0e = C13690nt.A0e(A05, A03);
            return A0e == null ? "en_US" : A0e;
        } else if (!A0E) {
            String A02 = super.A02();
            C18450wi.A0B(A02);
            return A02;
        } else {
            throw new AnonymousClass2Xe();
        }
    }

    public String A07() {
        return "version";
    }

    public void A08(JSONObject jSONObject) {
        super.A08(jSONObject);
        jSONObject.put("tos_version", "1");
    }
}
