package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import java.util.List;

/* renamed from: X.3Mk  reason: invalid class name and case insensitive filesystem */
public class C64013Mk extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00 = AnonymousClass000.A0u();

    public C64013Mk(C49842Wd r5, List list) {
        super(A01, r5);
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A00.add(new C613338m(r5, (AnonymousClass4O4) list.get(i2)));
        }
    }

    public static boolean A00(Context context) {
        return C13690nt.A1R(C13700nu.A03(context).getLayoutDirection());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        List list = this.A00;
        for (int size = list.size() - 1; size >= 0; size--) {
            C613338m r0 = (C613338m) list.get(size);
            if (r0 != null && r0.A00(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
