package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;

/* renamed from: X.2JP  reason: invalid class name */
public class AnonymousClass2JP {
    public static void A00(Context context, AnonymousClass01V r4, CharSequence charSequence) {
        AccessibilityManager A0P = r4.A0P();
        if (A0P != null && A0P.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName("android.widget.Button");
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            A0P.sendAccessibilityEvent(obtain);
        }
    }

    public static void A01(View view) {
        C004601z.A0j(view, new AnonymousClass05M());
    }

    public static void A02(View view) {
        C004601z.A0j(view, new C55882kb(view));
    }

    public static void A03(View view, int i2) {
        C004601z.A0j(view, new IDxDCompatShape22S0100000_2_I0(new C54322hF[]{new C54322hF(16, i2)}, 4));
    }

    public static void A04(View view, int i2) {
        C004601z.A0j(view, new IDxDCompatShape22S0100000_2_I0(new C54322hF[]{new C54322hF(32, i2)}, 4));
    }

    public static void A05(View view, boolean z2) {
        C004601z.A0j(view, new C55872ka(z2));
    }

    public static boolean A06(AccessibilityManager accessibilityManager) {
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }
}
