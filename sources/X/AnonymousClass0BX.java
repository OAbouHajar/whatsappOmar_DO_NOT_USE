package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.0BX  reason: invalid class name */
public class AnonymousClass0BX extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C02770Ew A01;

    public AnonymousClass0BX(Rect rect, C02770Ew r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.A00;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
