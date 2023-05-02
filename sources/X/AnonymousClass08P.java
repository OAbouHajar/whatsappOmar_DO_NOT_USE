package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.08P  reason: invalid class name */
public class AnonymousClass08P {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = {-16842910};
    public static final int[] A03 = new int[0];
    public static final int[] A04 = {16842908};
    public static final int[] A05 = {16842919};
    public static final int[] A06 = new int[1];

    public static int A00(Context context, int i2) {
        ColorStateList A022 = A02(context, i2);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A02, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A00;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int A012 = A01(context, i2);
        return AnonymousClass090.A06(A012, Math.round(((float) Color.alpha(A012)) * f2));
    }

    public static int A01(Context context, int i2) {
        int[] iArr = A06;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i2) {
        int[] iArr = A06;
        iArr[0] = i2;
        AnonymousClass07T r1 = new AnonymousClass07T(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r1.A01(0);
        } finally {
            r1.A04();
        }
    }

    public static void A03(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass05L.A09);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}