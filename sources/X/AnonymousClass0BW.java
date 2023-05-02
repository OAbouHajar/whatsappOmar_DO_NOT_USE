package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.0BW  reason: invalid class name */
public class AnonymousClass0BW extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C02770Ew A01;

    public AnonymousClass0BW(Rect rect, C02770Ew r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.A00;
    }
}
