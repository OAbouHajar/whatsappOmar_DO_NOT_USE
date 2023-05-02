package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.4nT  reason: invalid class name and case insensitive filesystem */
public class C95904nT implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((AnonymousClass3U0) obj2).A05;
        if (rect != null) {
            view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass09S.A00(((AnonymousClass3U0) obj).A05, ((AnonymousClass3U0) obj2).A05);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }
}
