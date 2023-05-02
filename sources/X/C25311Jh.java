package X;

import android.app.Activity;
import com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity;
import java.util.Map;

/* renamed from: X.1Jh  reason: invalid class name and case insensitive filesystem */
public final class C25311Jh implements C25301Jg {
    public void AaS(Activity activity, AnonymousClass1Z6 r7, Map map) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (map == null) {
            z3 = false;
        } else {
            if (map.containsKey("is_intermediate_screen")) {
                Object obj = map.get("is_intermediate_screen");
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else {
                z2 = false;
            }
            if (map.containsKey("show_loading")) {
                Object obj2 = map.get("show_loading");
                if (obj2 != null) {
                    z4 = ((Boolean) obj2).booleanValue();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            z3 = z4;
            z4 = z2;
        }
        if (activity != null) {
            WaExtensionsBottomsheetModalActivity waExtensionsBottomsheetModalActivity = (WaExtensionsBottomsheetModalActivity) activity;
            waExtensionsBottomsheetModalActivity.A03.A02.A0B(Boolean.valueOf(z4));
            waExtensionsBottomsheetModalActivity.A03.A03.A0B(Boolean.valueOf(z3));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.wabloks.commerce.ui.view.WaExtensionsBottomsheetModalActivity");
    }
}
