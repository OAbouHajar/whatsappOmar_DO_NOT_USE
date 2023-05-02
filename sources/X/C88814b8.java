package X;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.4b8  reason: invalid class name and case insensitive filesystem */
public final class C88814b8 {
    public int A00;
    public int A01;
    public int A02 = Integer.MAX_VALUE;
    public int A03 = Integer.MIN_VALUE;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public Class A0D;
    public Object A0E;
    public Object A0F;
    public Object A0G;
    public Field A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final C85834Qd A0R;
    public final int[] A0S;
    public final Object[] A0T;

    public C88814b8(Class cls, String str, Object[] objArr) {
        this.A0D = cls;
        C85834Qd r4 = new C85834Qd(str);
        this.A0R = r4;
        this.A0T = objArr;
        this.A0I = r4.A00();
        int A002 = r4.A00();
        this.A0M = A002;
        int[] iArr = null;
        if (A002 != 0) {
            int A003 = r4.A00();
            this.A0N = A003;
            int A004 = r4.A00();
            this.A0J = r4.A00();
            this.A0K = r4.A00();
            this.A0P = r4.A00();
            this.A0L = r4.A00();
            this.A0O = r4.A00();
            this.A0Q = r4.A00();
            int A005 = r4.A00();
            this.A0S = A005 != 0 ? new int[A005] : iArr;
            this.A00 = (A003 << 1) + A004;
        }
    }

    public static Field A00(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw AnonymousClass000.A0a(AnonymousClass000.A0h(arrays, AnonymousClass3K2.A0p(arrays, str, name)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r1 == (X.AnonymousClass414.A02.id + 51)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if ((r12.A0I & 1) != 1) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r2 = r12.A0T;
        r1 = r12.A00;
        r12.A00 = r1 + 1;
        r12.A0F = r2[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if ((r12.A09 & 2048) != 0) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r19 = this;
            r12 = r19
            X.4Qd r11 = r12.A0R
            int r1 = r11.A00
            java.lang.String r0 = r11.A01
            int r0 = r0.length()
            if (r1 >= r0) goto L_0x0144
            int r0 = r11.A00()
            r12.A08 = r0
            int r10 = r11.A00()
            r12.A09 = r10
            r9 = r10 & 255(0xff, float:3.57E-43)
            r12.A0A = r9
            int r8 = r12.A08
            int r7 = r12.A02
            if (r8 >= r7) goto L_0x0027
            r12.A02 = r8
            r7 = r8
        L_0x0027:
            int r0 = r12.A03
            if (r8 <= r0) goto L_0x002d
            r12.A03 = r8
        L_0x002d:
            X.414 r6 = X.AnonymousClass414.A09
            int r5 = r6.id
            r4 = 1
            if (r9 != r5) goto L_0x011c
            int r0 = r12.A04
            int r0 = r0 + 1
            r12.A04 = r0
        L_0x003a:
            int r0 = r12.A07
            int r13 = r0 + 1
            r12.A07 = r13
            r0 = 40
            if (r8 < r0) goto L_0x0117
            long r2 = (long) r8
            long r0 = (long) r7
            long r2 = r2 - r0
            r0 = 1
            long r2 = r2 + r0
            r17 = 2
            long r0 = (long) r13
            long r17 = r17 * r0
            r15 = 3
            long r17 = r17 + r15
            long r0 = r0 + r15
            r13 = 9
            long r2 = r2 + r13
            long r0 = r0 * r15
            long r17 = r17 + r0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            int r0 = r12.A06
            int r0 = r0 + 1
        L_0x0062:
            r12.A06 = r0
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0072
            int[] r2 = r12.A0S
            int r1 = r12.A01
            int r0 = r1 + 1
            r12.A01 = r0
            r2[r1] = r8
        L_0x0072:
            r0 = 0
            r12.A0E = r0
            r12.A0F = r0
            r12.A0G = r0
            if (r9 <= r5) goto L_0x00ae
            int r0 = r11.A00()
            r12.A0B = r0
            int r1 = r12.A0A
            X.414 r0 = X.AnonymousClass414.A01
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 == r0) goto L_0x0130
            X.414 r0 = X.AnonymousClass414.A03
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 == r0) goto L_0x0130
            X.414 r0 = X.AnonymousClass414.A02
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 != r0) goto L_0x00ad
        L_0x009b:
            int r0 = r12.A0I
            r0 = r0 & 1
            if (r0 != r4) goto L_0x00ad
        L_0x00a1:
            java.lang.Object[] r2 = r12.A0T
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            r12.A0F = r0
        L_0x00ad:
            return r4
        L_0x00ae:
            java.lang.Class r3 = r12.A0D
            java.lang.Object[] r2 = r12.A0T
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = A00(r3, r0)
            r12.A0H = r0
            int r0 = r12.A0I
            r0 = r0 & 1
            if (r0 != r4) goto L_0x00d6
            int r1 = r12.A0A
            X.414 r0 = X.AnonymousClass414.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x00d6
            int r0 = r11.A00()
            r12.A0C = r0
        L_0x00d6:
            int r1 = r12.A0A
            X.414 r0 = X.AnonymousClass414.A01
            int r0 = r0.id
            if (r1 == r0) goto L_0x013b
            X.414 r0 = X.AnonymousClass414.A03
            int r0 = r0.id
            if (r1 == r0) goto L_0x013b
            X.414 r0 = X.AnonymousClass414.A05
            int r0 = r0.id
            if (r1 == r0) goto L_0x0130
            X.414 r0 = X.AnonymousClass414.A08
            int r0 = r0.id
            if (r1 == r0) goto L_0x0130
            X.414 r0 = X.AnonymousClass414.A02
            int r0 = r0.id
            if (r1 == r0) goto L_0x009b
            X.414 r0 = X.AnonymousClass414.A06
            int r0 = r0.id
            if (r1 == r0) goto L_0x009b
            X.414 r0 = X.AnonymousClass414.A07
            int r0 = r0.id
            if (r1 == r0) goto L_0x009b
            int r0 = r6.id
            if (r1 != r0) goto L_0x00ad
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            r12.A0G = r0
            int r0 = r12.A09
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00ad
            goto L_0x00a1
        L_0x0117:
            int r0 = r8 + 1
            int r0 = r0 - r7
            goto L_0x0062
        L_0x011c:
            X.414 r0 = X.AnonymousClass414.A04
            int r0 = r0.id
            if (r9 < r0) goto L_0x003a
            X.414 r0 = X.AnonymousClass414.A08
            int r0 = r0.id
            if (r9 > r0) goto L_0x003a
            int r0 = r12.A05
            int r0 = r0 + 1
            r12.A05 = r0
            goto L_0x003a
        L_0x0130:
            java.lang.Object[] r2 = r12.A0T
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            goto L_0x0141
        L_0x013b:
            java.lang.reflect.Field r0 = r12.A0H
            java.lang.Class r0 = r0.getType()
        L_0x0141:
            r12.A0E = r0
            return r4
        L_0x0144:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88814b8.A01():boolean");
    }
}
