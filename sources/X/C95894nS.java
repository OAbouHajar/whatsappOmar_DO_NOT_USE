package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.4nS  reason: invalid class name and case insensitive filesystem */
public class C95894nS implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AnonymousClass3U0 r5 = (AnonymousClass3U0) obj2;
        if (r5.A01 > 0) {
            if (r5.A02 == 1) {
                view.setVerticalFadingEdgeEnabled(true);
            } else {
                view.setHorizontalFadingEdgeEnabled(true);
            }
            view.setFadingEdgeLength(r5.A01);
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass3K2.A1X(((AnonymousClass3U0) obj).A01, ((AnonymousClass3U0) obj2).A01);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }
}
