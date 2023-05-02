package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.4nP  reason: invalid class name and case insensitive filesystem */
public class C95864nP implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        ((C49832Wc) obj).setForegroundCompat(((C65273Tz) obj2).A05);
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((C65273Tz) obj).A05;
        Drawable drawable2 = ((C65273Tz) obj2).A05;
        return drawable == null ? drawable2 != null : drawable2 != null && !drawable.equals(drawable2);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        ((C49832Wc) obj).setForegroundCompat((Drawable) null);
    }
}
