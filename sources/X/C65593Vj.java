package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Vj  reason: invalid class name and case insensitive filesystem */
public class C65593Vj extends AnonymousClass4GL {
    public static final AnonymousClass57I A03 = AnonymousClass57I.from(new IDxComparatorShape20S0000000_2_I1(5));
    public static final AnonymousClass57I A04 = AnonymousClass57I.from(new IDxComparatorShape20S0000000_2_I1(4));
    public static final int[] A05 = new int[0];
    public AnonymousClass4S2 A00;
    public final AnonymousClass5LR A01;
    public final AtomicReference A02;

    @Deprecated
    public C65593Vj() {
        C65583Vi r1 = C65583Vi.A0T;
        this.A01 = new C97544qA();
        this.A02 = new AtomicReference(r1);
    }

    public C65593Vj(Context context) {
        C97544qA r2 = new C97544qA();
        C65583Vi A012 = new C65573Vh(context).A01();
        this.A01 = r2;
        this.A02 = new AtomicReference(A012);
    }

    public static int A00(C32491gT r4, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(r4.A0S)) {
            return 4;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            str = null;
        }
        String str2 = r4.A0S;
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "und")) {
            str2 = null;
        }
        if (str2 == null || str == null) {
            return (!z2 || str2 != null) ? 0 : 1;
        }
        if (str2.startsWith(str) || str.startsWith(str2)) {
            return 3;
        }
        return str2.split("-", 2)[0].equals(str.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 != r11) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(X.C93574jQ r12, int r13, int r14, boolean r15) {
        /*
            int r7 = r12.A01
            java.util.ArrayList r5 = X.C13690nt.A0i(r7)
            r6 = 0
            r0 = 0
        L_0x0008:
            if (r0 >= r7) goto L_0x0010
            X.C13690nt.A1O(r5, r0)
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0010:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x0097
            if (r14 == r3) goto L_0x0097
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x001a:
            if (r6 >= r7) goto L_0x006f
            X.1gT[] r0 = r12.A02
            r2 = r0[r6]
            int r10 = r2.A0I
            if (r10 <= 0) goto L_0x005f
            int r9 = r2.A09
            if (r9 <= 0) goto L_0x005f
            r8 = r13
            r1 = r14
            if (r15 == 0) goto L_0x006c
            r11 = 1
            boolean r0 = X.C13700nu.A0g(r10, r9)
            if (r13 > r14) goto L_0x0034
            r11 = 0
        L_0x0034:
            if (r0 == r11) goto L_0x006c
        L_0x0036:
            int r11 = r10 * r8
            int r0 = r9 * r1
            if (r11 < r0) goto L_0x0062
            int r0 = r0 + r10
            int r0 = r0 + -1
            int r0 = r0 / r10
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>(r1, r0)
        L_0x0045:
            int r10 = r2.A0I
            int r8 = r2.A09
            int r2 = r10 * r8
            int r0 = r9.x
            float r0 = (float) r0
            r1 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r10 < r0) goto L_0x005f
            int r0 = r9.y
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r8 < r0) goto L_0x005f
            if (r2 >= r4) goto L_0x005f
            r4 = r2
        L_0x005f:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0062:
            int r11 = r11 + r9
            int r0 = r11 + -1
            int r0 = r0 / r9
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>(r0, r8)
            goto L_0x0045
        L_0x006c:
            r1 = r13
            r8 = r14
            goto L_0x0036
        L_0x006f:
            if (r4 == r3) goto L_0x0097
            int r3 = r5.size()
        L_0x0075:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0097
            java.lang.Object r0 = r5.get(r3)
            int r1 = X.AnonymousClass000.A0D(r0)
            X.1gT[] r0 = r12.A02
            r0 = r0[r1]
            int r2 = r0.A0I
            r1 = -1
            if (r2 == r1) goto L_0x0093
            int r0 = r0.A09
            if (r0 == r1) goto L_0x0093
            int r2 = r2 * r0
            if (r2 == r1) goto L_0x0093
            if (r2 <= r4) goto L_0x0075
        L_0x0093:
            r5.remove(r3)
            goto L_0x0075
        L_0x0097:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65593Vj.A01(X.4jQ, int, int, boolean):java.util.List");
    }

    public static boolean A02(C32491gT r4, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if ((r4.A0D & 16384) != 0 || (i2 & 7) != 4 || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !AnonymousClass3C1.A0F(r4.A0T, str)) {
            return false;
        }
        int i12 = r4.A0I;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        int i13 = r4.A09;
        if (i13 != -1 && (i9 > i13 || i13 > i5)) {
            return false;
        }
        float f2 = r4.A01;
        if (f2 != -1.0f && (((float) i10) > f2 || f2 > ((float) i6))) {
            return false;
        }
        int i14 = r4.A05;
        return i14 == -1 || (i11 <= i14 && i14 <= i7);
    }
}
