package X;

import android.os.Process;
import java.nio.CharBuffer;

/* renamed from: X.0Ip  reason: invalid class name and case insensitive filesystem */
public class C03460Ip extends C06120Ui {
    public static final long A02 = ((long) Process.myUid());
    public static final CharBuffer A03 = CharBuffer.wrap("dummy0");
    public static final CharBuffer A04 = CharBuffer.wrap("lo");
    public static final CharBuffer A05 = CharBuffer.wrap("wlan0");
    public C005202g A00;
    public final CharBuffer A01 = CharBuffer.allocate(128);

    public boolean A01() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (A04.compareTo(r3) != 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(long[] r11) {
        /*
            r10 = this;
            r9 = 0
            X.02g r1 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "/proc/net/xt_qtaguid/stats"
            X.02g r1 = new X.02g     // Catch:{ 0iD -> 0x00c0 }
            r1.<init>(r0)     // Catch:{ 0iD -> 0x00c0 }
            r10.A00 = r1     // Catch:{ 0iD -> 0x00c0 }
        L_0x000e:
            r1.A02()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r1 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            boolean r0 = r1.A05     // Catch:{ 0iD -> 0x00c0 }
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r1.A08()     // Catch:{ 0iD -> 0x00c0 }
            if (r0 == 0) goto L_0x00bf
            r1 = 0
            java.util.Arrays.fill(r11, r1)     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A03()     // Catch:{ 0iD -> 0x00c0 }
        L_0x0027:
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            boolean r0 = r0.A08()     // Catch:{ 0iD -> 0x00c0 }
            r5 = 1
            if (r0 == 0) goto L_0x00be
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            java.nio.CharBuffer r3 = r10.A01     // Catch:{ 0iD -> 0x00c0 }
            r0.A07(r3)     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            long r7 = r0.A00()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            java.nio.CharBuffer r0 = A05     // Catch:{ 0iD -> 0x00c0 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0iD -> 0x00c0 }
            r6 = 1
            if (r0 == 0) goto L_0x00bc
            r6 = 0
            java.nio.CharBuffer r0 = A03     // Catch:{ 0iD -> 0x00c0 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0iD -> 0x00c0 }
            if (r0 == 0) goto L_0x00bc
            java.nio.CharBuffer r0 = A04     // Catch:{ 0iD -> 0x00c0 }
            int r0 = r0.compareTo(r3)     // Catch:{ 0iD -> 0x00c0 }
            if (r0 == 0) goto L_0x00bc
        L_0x006b:
            long r3 = A02     // Catch:{ 0iD -> 0x00c0 }
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            if (r6 != 0) goto L_0x0076
            if (r5 != 0) goto L_0x0076
            goto L_0x00b5
        L_0x0076:
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            long r4 = r0.A00()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            r7 = 2
            if (r6 == 0) goto L_0x0085
            r7 = 0
        L_0x0085:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = 0
            if (r3 != 0) goto L_0x008b
            r0 = 4
        L_0x008b:
            r7 = r7 | r0
            r5 = r11[r7]     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            long r3 = r0.A00()     // Catch:{ 0iD -> 0x00c0 }
            long r5 = r5 + r3
            r11[r7] = r5     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A04()     // Catch:{ 0iD -> 0x00c0 }
            r7 = r7 | 1
            r5 = r11[r7]     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            long r3 = r0.A00()     // Catch:{ 0iD -> 0x00c0 }
            long r5 = r5 + r3
            r11[r7] = r5     // Catch:{ 0iD -> 0x00c0 }
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A03()     // Catch:{ 0iD -> 0x00c0 }
            goto L_0x0027
        L_0x00b5:
            X.02g r0 = r10.A00     // Catch:{ 0iD -> 0x00c0 }
            r0.A03()     // Catch:{ 0iD -> 0x00c0 }
            goto L_0x0027
        L_0x00bc:
            r5 = 0
            goto L_0x006b
        L_0x00be:
            return r5
        L_0x00bf:
            return r9
        L_0x00c0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03460Ip.A02(long[]):boolean");
    }
}
