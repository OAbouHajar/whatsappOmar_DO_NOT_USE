package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.47v  reason: invalid class name and case insensitive filesystem */
public final class C813547v {
    public static final void A00(View view, C89264br r6) {
        C18450wi.A0H(r6, 1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(r6.A01, r6.A03, r6.A02, r6.A00);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
