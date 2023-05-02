package X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3AL  reason: invalid class name */
public final class AnonymousClass3AL {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final Map A06;
    public final byte[] A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3AL(android.net.Uri r14, long r15, long r17) {
        /*
            r13 = this;
            r2 = 0
            r6 = 0
            r5 = 1
            java.util.Map r3 = java.util.Collections.emptyMap()
            r9 = r15
            long r7 = r15 - r15
            r0 = r13
            r1 = r14
            r11 = r17
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AL.<init>(android.net.Uri, long, long):void");
    }

    public AnonymousClass3AL(Uri uri, String str, Map map, byte[] bArr, int i2, int i3, long j2, long j3, long j4) {
        boolean z2 = true;
        C90524eJ.A03(C13700nu.A0f(((j2 + j3) > 0 ? 1 : ((j2 + j3) == 0 ? 0 : -1))));
        C90524eJ.A03(C13700nu.A0f((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
        if (j4 <= 0 && j4 != -1) {
            z2 = false;
        }
        C90524eJ.A03(z2);
        this.A04 = uri;
        this.A01 = i2;
        this.A07 = (bArr == null || bArr.length == 0) ? null : bArr;
        this.A06 = Collections.unmodifiableMap(new HashMap(map));
        this.A03 = j3;
        this.A02 = j4;
        this.A05 = str;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DataSpec[");
        C13700nu.A0a(A0r, this.A01 != 1 ? "POST" : "GET");
        A0r.append(this.A04);
        A0r.append(", ");
        A0r.append(this.A03);
        A0r.append(", ");
        A0r.append(this.A02);
        A0r.append(", ");
        A0r.append(this.A05);
        A0r.append(", ");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("]", A0r);
    }
}
