package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.obwhatsapp.R;

/* renamed from: X.2fc  reason: invalid class name and case insensitive filesystem */
public final class C53382fc {
    public static final int[] A00 = {R.attr.attr00ee};
    public static final int[] A01 = {R.attr.attr00f3};

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int[] iArr2, int i2, int i3) {
        A01(context, attributeSet, i2, i3);
        A02(context, attributeSet, iArr, iArr2, i2, i3);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static void A01(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A0H, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            A03(context, "Theme.MaterialComponents", A01);
        }
        A03(context, "Theme.AppCompat", A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r5.getResourceId(0, -1) != -1) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r6, android.util.AttributeSet r7, int[] r8, int[] r9, int r10, int r11) {
        /*
            int[] r0 = X.C53362fa.A0H
            android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r7, r0, r10, r11)
            r0 = 2
            r4 = 0
            boolean r0 = r5.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0012
            r5.recycle()
        L_0x0011:
            return
        L_0x0012:
            int r3 = r9.length
            if (r3 != 0) goto L_0x002a
            r1 = -1
            int r0 = r5.getResourceId(r4, r1)
            if (r0 == r1) goto L_0x001d
        L_0x001c:
            r4 = 1
        L_0x001d:
            r5.recycle()
            if (r4 != 0) goto L_0x0011
            java.lang.String r1 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002a:
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r8, r10, r11)
        L_0x002e:
            r0 = r9[r4]
            r1 = -1
            int r0 = r2.getResourceId(r0, r1)
            if (r0 != r1) goto L_0x003c
            r2.recycle()
            r4 = 0
            goto L_0x001d
        L_0x003c:
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x002e
            r2.recycle()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53382fc.A02(android.content.Context, android.util.AttributeSet, int[], int[], int, int):void");
    }

    public static void A03(Context context, String str, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
