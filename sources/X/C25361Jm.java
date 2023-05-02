package X;

import android.app.Activity;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.Map;

/* renamed from: X.1Jm  reason: invalid class name and case insensitive filesystem */
public final class C25361Jm implements C25301Jg {
    public void AaS(Activity activity, AnonymousClass1Z6 r13, Map map) {
        Activity activity2 = activity;
        if (activity != null) {
            AnonymousClass01A A0B = ((C001000l) activity2).AGM().A0B("extensions_bottom_sheet_container");
            String str = null;
            AnonymousClass01A A0B2 = A0B == null ? null : A0B.A0F().A0B("BK_FRAGMENT");
            boolean z2 = false;
            if (map != null) {
                if (map.containsKey("show_full_screen_error")) {
                    Object obj = map.get("show_full_screen_error");
                    if (obj != null) {
                        z2 = ((Boolean) obj).booleanValue();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                }
                if (map.containsKey("custom_error_message")) {
                    str = (String) map.get("custom_error_message");
                }
            }
            if (A0B2 != null) {
                WaBkExtensionsLayoutViewModel.A01(activity2, (AnonymousClass1JU) null, (WaBkExtensionsLayoutViewModel) new C006602z(A0B2).A01(WaBkExtensionsLayoutViewModel.class), (String) null, str, "extensions-error-from-layout", 12, z2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }
}
