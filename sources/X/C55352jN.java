package X;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2jN  reason: invalid class name and case insensitive filesystem */
public class C55352jN {
    public static void A00(View view) {
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static void A01(View view, float f2) {
        if (C15450qv.A03()) {
            if (!view.getClipToOutline()) {
                view.setClipToOutline(true);
            }
            view.setOutlineProvider(new AnonymousClass3N9(f2));
        }
    }

    public static void A02(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
        }
    }
}
