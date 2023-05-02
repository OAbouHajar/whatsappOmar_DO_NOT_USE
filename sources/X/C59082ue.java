package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;

/* renamed from: X.2ue  reason: invalid class name and case insensitive filesystem */
public class C59082ue extends C65253Tx {
    public C59082ue(C14990q7 r1, C31201dg r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r5, C31201dg r6, Object obj) {
        C02420Bv r4 = (C02420Bv) view;
        AnonymousClass3AI r7 = (AnonymousClass3AI) obj;
        C99124tW r1 = (C99124tW) C62183Bz.A05(r5, r6);
        if (r1 != null) {
            r1.A00 = r4;
            r4.A0N = new C95424mc(r5, r6, this, r1);
            r4.setRefreshing(r1.A01);
            for (int i2 = 0; i2 < r4.getChildCount(); i2++) {
                View childAt = r4.getChildAt(i2);
                if (childAt instanceof C57842s0) {
                    ((C57842s0) childAt).setRenderTree(r7);
                    return;
                }
            }
            throw AnonymousClass000.A0V("SwipeRefreshLayout does not contain RenderTreeHostView child");
        }
        throw AnonymousClass000.A0a("PTR container defines a controller but none was found");
    }

    public /* bridge */ /* synthetic */ void A08(View view, C14990q7 r5, C31201dg r6, Object obj) {
        C02420Bv r4 = (C02420Bv) view;
        for (int i2 = 0; i2 < r4.getChildCount(); i2++) {
            View childAt = r4.getChildAt(i2);
            if (childAt instanceof C57842s0) {
                ((C57842s0) childAt).setRenderTree((AnonymousClass3AI) null);
                r4.setRefreshing(false);
                return;
            }
        }
        throw AnonymousClass000.A0V("SwipeRefreshLayout does not contain RenderTreeHostView child");
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r3, C31201dg r4, Object obj) {
        ((C02420Bv) view).A0N = null;
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        C02420Bv r4 = new C02420Bv(context);
        r4.addView(new C57842s0(context), C13690nt.A0M());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(AnonymousClass498.A00);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            r4.setColorSchemeColors(colorStateList.getDefaultColor());
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList2 != null) {
            r4.setProgressBackgroundColorSchemeColor(colorStateList2.getDefaultColor());
        }
        return r4;
    }
}
