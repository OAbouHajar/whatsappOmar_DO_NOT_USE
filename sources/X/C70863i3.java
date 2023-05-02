package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3i3  reason: invalid class name and case insensitive filesystem */
public class C70863i3 extends C55062ik {
    public Map A00;
    public final AnonymousClass3BK A01;
    public final AnonymousClass38P A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70863i3(X.AnonymousClass3BK r11, X.AnonymousClass38P r12) {
        /*
            r10 = this;
            X.2GM r0 = r11.A08
            java.lang.String r2 = r0.A0F
            long r3 = r11.A05
            org.json.JSONObject r1 = r11.A0B
            r7 = 0
            if (r1 != 0) goto L_0x0018
            r9 = 0
        L_0x000c:
            r5 = -1
            r1 = r10
            r8 = 0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            r10.A02 = r12
            r10.A01 = r11
            return
        L_0x0018:
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r9 = r1.optBoolean(r0, r7)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70863i3.<init>(X.3BK, X.38P):void");
    }

    public synchronized Set A02() {
        Map map;
        map = this.A00;
        return map != null ? map.keySet() : Collections.emptySet();
    }
}
