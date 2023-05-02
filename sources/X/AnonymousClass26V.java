package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.26V  reason: invalid class name */
public class AnonymousClass26V extends AnonymousClass1KC {
    public C16980tz A00;
    public C17660vR A01;
    public AnonymousClass01J A02;
    public AnonymousClass01J A03;
    public final C448225r A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass26V(X.C17130ua r14, X.C448225r r15, X.C16980tz r16, X.C15860rz r17, X.C14710pd r18, X.AnonymousClass168 r19, X.C17660vR r20, X.AnonymousClass01D r21, X.AnonymousClass01J r22, X.AnonymousClass01J r23) {
        /*
            r13 = this;
            r11 = 5425548167574595(0x134681df3d7443, double:2.680576959455534E-308)
            java.lang.String r7 = "WA|1204736340391413|27a2ec0243956dfa5ad1fa8caad0b2d4"
            r8 = 0
            r1 = r13
            r2 = r14
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r21
            r9 = r22
            r10 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "biz_linked_account_posts"
            r13.A04(r0)
            r13.A04 = r15
            r0 = r16
            r13.A00 = r0
            r0 = r20
            r13.A01 = r0
            r13.A02 = r9
            r13.A03 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26V.<init>(X.0ua, X.25r, X.0tz, X.0rz, X.0pd, X.168, X.0vR, X.01D, X.01J, X.01J):void");
    }

    public String A02() {
        String obj = Locale.getDefault().toString();
        Map A032 = A03();
        if (!A032.containsKey(obj)) {
            return obj;
        }
        String str = (String) A032.get(obj);
        return str == null ? "en_US" : str;
    }
}
