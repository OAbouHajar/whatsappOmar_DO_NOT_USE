package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.0L5  reason: invalid class name */
public class AnonymousClass0L5 {
    public static void A00(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C06920Yl r0 = C06920Yl.A0A;
        if (r0 != null && r0.A05 == view) {
            C06920Yl.A00((C06920Yl) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C06920Yl r1 = C06920Yl.A09;
            if (r1 != null && r1.A05 == view) {
                r1.A01();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C06920Yl(view, charSequence);
    }
}
