package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: X.20b  reason: invalid class name and case insensitive filesystem */
public abstract class C434520b {
    public static final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 19) goto L_0x0011;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0011
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C434520b.<clinit>():void");
    }

    public int A00() {
        if (this instanceof C435020g) {
            C435020g r3 = (C435020g) this;
            int i2 = r3.A00;
            if (i2 >= r3.A01) {
                return 0;
            }
            int codePointAt = Character.codePointAt(r3.A02, i2);
            r3.A00 += Character.charCount(codePointAt);
            int i3 = codePointAt | AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
            return (!A00 || i3 < 126980 || i3 > 129784) ? codePointAt : i3;
        }
        C434420a r32 = (C434420a) this;
        int i4 = r32.A00;
        int[] iArr = r32.A01;
        if (i4 >= iArr.length) {
            return 0;
        }
        int i5 = iArr[i4];
        r32.A00 = i4 + 1;
        return i5;
    }
}
