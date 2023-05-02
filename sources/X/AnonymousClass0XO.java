package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.obwhatsapp.R;

/* renamed from: X.0XO  reason: invalid class name */
public class AnonymousClass0XO {
    public static float A00(View view) {
        return view.getElevation();
    }

    public static float A01(View view) {
        return view.getTranslationZ();
    }

    public static float A02(View view) {
        return view.getZ();
    }

    public static ColorStateList A03(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode A04(View view) {
        return view.getBackgroundTintMode();
    }

    public static AnonymousClass030 A05(View view) {
        return C05870Ti.A00(view);
    }

    public static String A06(View view) {
        return view.getTransitionName();
    }

    public static void A07(ColorStateList colorStateList, View view) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void A08(PorterDuff.Mode mode, View view) {
        view.setBackgroundTintMode(mode);
    }

    public static void A09(Rect rect, View view, AnonymousClass030 r3) {
        WindowInsets A07 = r3.A07();
        if (A07 != null) {
            AnonymousClass030.A01(view, view.computeSystemWindowInsets(A07, rect));
        } else {
            rect.setEmpty();
        }
    }

    public static void A0A(View view) {
        view.stopNestedScroll();
    }

    public static void A0B(View view, float f2) {
        view.setElevation(f2);
    }

    public static void A0C(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void A0D(View view, WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void A0E(View view, C016507v r3) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, r3);
        }
        view.setOnApplyWindowInsetsListener(r3 == null ? (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback) : new C06820Ya(view, r3));
    }

    public static void A0F(View view, String str) {
        view.setTransitionName(str);
    }

    public static void A0G(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    public static boolean A0H(View view) {
        return view.isNestedScrollingEnabled();
    }
}
