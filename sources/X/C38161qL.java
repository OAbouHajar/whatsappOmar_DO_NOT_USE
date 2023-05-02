package X;

import android.net.Uri;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1qL  reason: invalid class name and case insensitive filesystem */
public class C38161qL implements C38131qI {
    public int A00 = 0;
    public C38211qQ A01;
    public C29561ap A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C16600tK A07;
    public final C17680vT A08;
    public final C38211qQ A09;
    public final C38211qQ A0A;
    public final C19040xf A0B;
    public final C40761ue A0C;
    public final AnonymousClass16Y A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    public C38161qL(C16600tK r6, C17680vT r7, C38211qQ r8, C38211qQ r9, C19040xf r10, AnonymousClass16Y r11, String str, String str2, int i2, int i3, long j2, long j3, boolean z2, boolean z3) {
        this.A0B = r10;
        this.A0A = r8;
        this.A09 = r9;
        this.A0E = str;
        this.A05 = j2;
        this.A0F = str2;
        this.A0D = r11;
        this.A07 = r6;
        this.A08 = r7;
        this.A04 = i2;
        this.A03 = i3;
        this.A06 = j3;
        this.A0C = (i3 <= 0 || !z2) ? null : new C40761ue(new Random(), i3, 3000);
        this.A0G = z3;
        A04(false);
    }

    public static C38211qQ A00(String str, String str2, String str3, Collection collection, boolean z2) {
        Set set;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C38211qQ r2 = (C38211qQ) it.next();
            if (r2.A04.endsWith(".whatsapp.net") && str.equals(r2.A08)) {
                Set set2 = z2 ? r2.A0B : r2.A09;
                if ((set2 == null || set2.contains(str2)) && (str3 == null || ((set = r2.A0A) != null && set.contains(str3)))) {
                    return r2;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r45 != 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r34 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (r34 != null) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C38161qL A01(X.C16300so r33, X.C15900s5 r34, X.C16600tK r35, X.C16440t3 r36, X.C14710pd r37, X.C17680vT r38, X.C19040xf r39, X.C38091qE r40, X.AnonymousClass16Y r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, int r46, long r47, boolean r49, boolean r50) {
        /*
            r0 = 256(0x100, float:3.59E-43)
            X.0tM r5 = X.C16620tM.A02
            r6 = r37
            boolean r0 = r6.A0E(r5, r0)
            r2 = r45
            if (r0 == 0) goto L_0x003e
            if (r45 != 0) goto L_0x003e
            r0 = 258(0x102, float:3.62E-43)
            int r24 = r6.A03(r5, r0)
        L_0x0016:
            r30 = r49
            r27 = r47
            r15 = r35
            r16 = r38
            r19 = r39
            r9 = r40
            r20 = r41
            if (r40 != 0) goto L_0x0041
            r17 = 0
            r25 = 0
            int r23 = 4 - r46
            r0 = 257(0x101, float:3.6E-43)
            boolean r29 = r6.A0E(r5, r0)
            r21 = r17
            r22 = r17
            X.1qL r14 = new X.1qL
            r18 = r17
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            return r14
        L_0x003e:
            r24 = 0
            goto L_0x0016
        L_0x0041:
            long r12 = r9.A04
            java.lang.String r14 = r9.A08
            int r40 = 4 - r46
            r0 = 1
            if (r0 != r2) goto L_0x00b1
            int r0 = r9.A00
        L_0x004c:
            int r40 = r0 + 1
            r4 = 1
            if (r45 == 0) goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            java.util.List r3 = r9.A0A
            java.lang.String r0 = "fallback"
            r2 = 0
            r8 = r42
            X.1qQ r35 = A00(r0, r8, r2, r3, r4)
            java.lang.String r1 = "primary"
            r0 = r2
            if (r4 != 0) goto L_0x0089
            r7 = r44
            r0 = r50
            r10 = r36
            r11 = r34
            java.lang.String r0 = A03(r11, r10, r8, r7, r0)
            if (r0 != 0) goto L_0x0078
            r0 = r43
            r7 = r33
            java.lang.String r0 = A02(r7, r11, r9, r0)
        L_0x0078:
            r7 = 0
            if (r0 == 0) goto L_0x0081
            X.1qQ r34 = A00(r1, r8, r0, r3, r7)
            if (r34 != 0) goto L_0x0091
        L_0x0081:
            java.lang.String r9 = "0"
            X.1qQ r34 = A00(r1, r8, r9, r3, r7)
            if (r34 != 0) goto L_0x0091
        L_0x0089:
            X.1qQ r34 = A00(r1, r8, r2, r3, r4)
            if (r34 != 0) goto L_0x0091
            r34 = r35
        L_0x0091:
            r1 = 257(0x101, float:3.6E-43)
            boolean r46 = r6.A0E(r5, r1)
            X.1qL r31 = new X.1qL
            r42 = r12
            r32 = r15
            r33 = r16
            r36 = r19
            r37 = r20
            r38 = r14
            r39 = r0
            r41 = r24
            r44 = r27
            r47 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r47)
            return r31
        L_0x00b1:
            if (r45 == 0) goto L_0x00c8
            r0 = 2
            if (r0 == r2) goto L_0x00c8
            java.lang.String r1 = "Mms4RouteSupplier/invalid mode = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0051
        L_0x00c8:
            int r0 = r9.A01
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38161qL.A01(X.0so, X.0s5, X.0tK, X.0t3, X.0pd, X.0vT, X.0xf, X.1qE, X.16Y, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean):X.1qL");
    }

    public static String A02(C16300so r6, C15900s5 r7, C38091qE r8, String str) {
        long j2;
        if (!r7.A05(C15910s6.A0d)) {
            return null;
        }
        long j3 = r8.A06;
        if (j3 <= 0 || str == null) {
            return null;
        }
        try {
            j2 = new BigInteger(1, Base64.decode(str, 2)).mod(BigInteger.valueOf(Math.abs(j3))).longValue();
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder("routesupplier/bigMod/could not parse hash: ");
            sb.append(str);
            Log.e(sb.toString(), e2);
            StringBuilder sb2 = new StringBuilder("hash=");
            sb2.append(str);
            sb2.append(" error=");
            sb2.append(e2);
            r6.AcB("routesupplier/hash not parsed", sb2.toString(), true);
            j2 = 0;
        }
        return Long.toString(j2 + 100);
    }

    public static String A03(C15900s5 r9, C16440t3 r10, String str, String str2, boolean z2) {
        Long l2;
        if (!z2) {
            long A022 = ((long) r9.A02(C15910s6.A1g)) * 1000;
            if (A022 > 0) {
                String queryParameter = Uri.parse(new Uri.Builder().encodedPath(str2).build().toString()).getQueryParameter("_nc_hot");
                if (queryParameter == null) {
                    l2 = null;
                } else {
                    try {
                        l2 = Long.valueOf(Long.parseLong(queryParameter) * 1000);
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("catv1/cannot parse hot timestamp: ");
                        sb.append(queryParameter);
                        Log.e(sb.toString());
                        l2 = null;
                    }
                }
                long A002 = r10.A00();
                if (str.equals("sticker") || (l2 != null && A002 - l2.longValue() < A022)) {
                    return "1";
                }
            }
            return null;
        }
        return "1";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r3.A07.A04 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r3.A0G == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(boolean r22) {
        /*
            r21 = this;
            r3 = r21
            int r1 = r3.A00
            int r11 = r3.A04
            if (r1 < r11) goto L_0x0015
            if (r22 == 0) goto L_0x000f
            int r0 = r3.A03
            int r11 = r11 + r0
            if (r1 < r11) goto L_0x0014
        L_0x000f:
            r12 = 0
            r3.A01 = r12
        L_0x0012:
            r3.A02 = r12
        L_0x0014:
            return
        L_0x0015:
            if (r22 != 0) goto L_0x0014
            X.0vT r10 = r3.A08
            X.0pd r9 = r10.A03
            r0 = 59
            X.0tM r8 = X.C16620tM.A02
            boolean r0 = r9.A0E(r8, r0)
            r12 = 0
            r1 = 1
            if (r0 == 0) goto L_0x002e
            X.0tK r0 = r3.A07
            boolean r0 = r0.A04
            r6 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            int r4 = r3.A00
            r5 = 3
            if (r4 > r1) goto L_0x0058
            X.1qQ r7 = r3.A0A
            r3.A01 = r7
        L_0x0038:
            r20 = 0
        L_0x003a:
            if (r4 < r5) goto L_0x0042
            if (r7 == 0) goto L_0x0047
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0047
        L_0x0042:
            boolean r0 = r3.A0G
            r11 = 1
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            if (r6 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x004f
            r0 = 2
            if (r4 < r0) goto L_0x0054
        L_0x004f:
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0054
            r12 = 1
        L_0x0054:
            if (r7 != 0) goto L_0x0080
            r12 = 0
            goto L_0x0012
        L_0x0058:
            X.1qQ r2 = r3.A09
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x006a
            X.1qQ r7 = r3.A01
            if (r7 != r2) goto L_0x006a
            r0 = 4
            if (r4 != r0) goto L_0x006a
        L_0x0067:
            r20 = 1
            goto L_0x003a
        L_0x006a:
            int r11 = r11 - r1
            if (r4 == r11) goto L_0x007c
            if (r4 == r5) goto L_0x007c
            X.1qQ r1 = r3.A0A
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x007c
            X.1qQ r7 = r3.A01
            if (r7 != r1) goto L_0x007c
            goto L_0x0067
        L_0x007c:
            r3.A01 = r2
            r7 = r2
            goto L_0x0038
        L_0x0080:
            if (r20 == 0) goto L_0x00a1
            java.lang.String r13 = r7.A00
            X.AnonymousClass00B.A06(r13)
            java.lang.String r14 = r7.A01
            java.lang.String r2 = r7.A02
        L_0x008b:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r13.toLowerCase(r0)
            java.lang.String r4 = "fna"
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x009b
            java.lang.String r4 = "pop"
        L_0x009b:
            r6 = 2
            if (r12 == 0) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            goto L_0x00a8
        L_0x00a1:
            java.lang.String r13 = r7.A04
            java.lang.String r14 = r7.A05
            java.lang.String r2 = r7.A06
            goto L_0x008b
        L_0x00a8:
            java.net.InetAddress r0 = java.net.Inet6Address.getByName(r2)     // Catch:{ UnknownHostException -> 0x00c8 }
            java.lang.String r5 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x00c9 }
            r1.<init>()     // Catch:{ UnknownHostException -> 0x00c9 }
            java.lang.String r0 = "["
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00c9 }
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x00c9 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00c9 }
            java.lang.String r14 = r1.toString()     // Catch:{ UnknownHostException -> 0x00c9 }
            r2 = 2
            goto L_0x00ca
        L_0x00c8:
            r5 = r14
        L_0x00c9:
            r2 = 0
        L_0x00ca:
            if (r11 == 0) goto L_0x00ee
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x00ee
            r0 = 58
            boolean r0 = r9.A0E(r8, r0)
            if (r0 == 0) goto L_0x00ee
            if (r14 == 0) goto L_0x00ee
            X.16Y r1 = r3.A0D
            monitor-enter(r1)
            java.lang.ThreadLocal r0 = r1.A00     // Catch:{ all -> 0x010d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x010d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x010d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x010d }
            r0.put(r5, r13)     // Catch:{ all -> 0x010d }
            goto L_0x00f1
        L_0x00ee:
            r14 = r13
            r2 = 0
            goto L_0x00f5
        L_0x00f1:
            monitor-exit(r1)
            if (r2 == r6) goto L_0x00f5
            r2 = 1
        L_0x00f5:
            java.lang.String r1 = r7.A08
            java.lang.String r15 = r3.A0E
            X.AnonymousClass00B.A06(r15)
            java.lang.String r0 = r3.A0F
            X.1ap r12 = new X.1ap
            r16 = r4
            r17 = r0
            r18 = r1
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0012
        L_0x010d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38161qL.A04(boolean):void");
    }

    public long AA2() {
        C40761ue r2 = this.A0C;
        if (r2 != null && this.A00 >= this.A04) {
            Long A002 = r2.A00();
            if (A002 != null) {
                return A002.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A06;
    }

    public C29561ap ABS() {
        return this.A02;
    }

    public void AQd(boolean z2, int i2) {
        if (i2 != -1) {
            C19040xf r2 = this.A0B;
            StringBuilder sb = new StringBuilder("routeselector/onmediatransfererrororresponsecode/code ");
            sb.append(i2);
            Log.i(sb.toString());
            if (i2 == 401 || i2 == 403) {
                r2.A09();
            }
        }
        this.A00++;
        A04(z2);
    }
}
