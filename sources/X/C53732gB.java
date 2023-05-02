package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.util.StateSet;

/* renamed from: X.2gB  reason: invalid class name and case insensitive filesystem */
public class C53732gB {
    public static final boolean A00;
    public static final int[] A01 = {16842908};
    public static final int[] A02 = {16843623, 16842908};
    public static final int[] A03 = {16843623};
    public static final int[] A04 = {16842919};
    public static final int[] A05 = {16842913, 16842908};
    public static final int[] A06 = {16842913, 16843623, 16842908};
    public static final int[] A07 = {16842913, 16843623};
    public static final int[] A08 = {16842913, 16842919};
    public static final int[] A09 = {16842913};

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A00 = z2;
    }

    public static int A00(int i2) {
        return AnonymousClass090.A06(i2, Math.min(Color.alpha(i2) << 1, MotionEventCompat.ACTION_MASK));
    }

    public static int A01(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return A00 ? A00(colorForState) : colorForState;
    }

    public static ColorStateList A02(ColorStateList colorStateList) {
        if (A00) {
            return new ColorStateList(new int[][]{A09, StateSet.NOTHING}, new int[]{A01(colorStateList, A08), A01(colorStateList, A04)});
        }
        int[] iArr = A08;
        int[] iArr2 = A06;
        int[] iArr3 = A05;
        int[] iArr4 = A07;
        int[] iArr5 = A04;
        int[] iArr6 = A02;
        int[] iArr7 = A01;
        int[] iArr8 = A03;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, A09, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{A01(colorStateList, iArr), A01(colorStateList, iArr2), A01(colorStateList, iArr3), A01(colorStateList, iArr4), 0, A01(colorStateList, iArr5), A01(colorStateList, iArr6), A01(colorStateList, iArr7), A01(colorStateList, iArr8), 0});
    }
}
