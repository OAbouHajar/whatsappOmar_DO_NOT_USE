package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.0J1  reason: invalid class name */
public class AnonymousClass0J1 extends C65253Tx {
    public AnonymousClass0J1(C14990q7 r1, C31201dg r2) {
        super(r1, r2);
    }

    public static void A00(AnonymousClass0CK r1, C14990q7 r2, C31201dg r3) {
        C31201dg A0G = r3.A0G(35);
        if (A0G != null) {
            r1.setColorFilter(C87564Xk.A00(r2, A0G));
        }
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r2, C31201dg r3, Object obj) {
        A00((AnonymousClass0CK) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r2, C31201dg r3, Object obj) {
        ((ImageView) view).clearColorFilter();
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new AnonymousClass0CK(context);
    }
}
