package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import com.obwhatsapp.R;

/* renamed from: X.0Vn  reason: invalid class name */
public final class AnonymousClass0Vn {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int i2;
        int i3 = -7829368;
        if (num != null) {
            i2 = num.intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.attr00ea});
            i2 = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
        } else {
            i2 = -7829368;
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.attr00f4});
        ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
        obtainStyledAttributes2.recycle();
        int intValue = num2 != null ? num2.intValue() : colorStateList == null ? -7829368 : colorStateList.getDefaultColor();
        int intValue2 = num3 != null ? num3.intValue() : colorStateList == null ? -7829368 : colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        if (num4 != null) {
            i3 = num4.intValue();
        } else if (colorStateList != null) {
            i3 = colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor());
        }
        return new ColorStateList(A00, new int[]{i2, intValue, intValue2, i3});
    }

    public static ColorStateList A01(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        int i2;
        int color;
        int A06;
        int A062;
        if (num != null) {
            i2 = num.intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            i2 = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
        } else {
            i2 = -7829368;
        }
        if (num2 != null) {
            color = num2.intValue();
        } else {
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            color = obtainStyledAttributes2.getColor(0, -7829368);
            obtainStyledAttributes2.recycle();
        }
        if (num3 != null) {
            A06 = num3.intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            A06 = AnonymousClass090.A06(obtainStyledAttributes3.getColor(0, -7829368), Math.round(((float) Color.alpha(i2)) * 0.25f));
            obtainStyledAttributes3.recycle();
        } else {
            A06 = AnonymousClass090.A06(-7829368, Math.round(((float) Color.alpha(i2)) * 0.25f));
        }
        if (num4 != null) {
            A062 = num4.intValue();
        } else {
            TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
            A062 = AnonymousClass090.A06(obtainStyledAttributes4.getColor(0, -7829368), Math.round(((float) Color.alpha(color)) * 0.25f));
            obtainStyledAttributes4.recycle();
        }
        return new ColorStateList(A00, new int[]{i2, color, A06, A062});
    }
}
