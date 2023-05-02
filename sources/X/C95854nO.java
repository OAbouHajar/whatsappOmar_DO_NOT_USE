package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.4nO  reason: invalid class name and case insensitive filesystem */
public class C95854nO implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setBackground(((C65273Tz) obj2).A04);
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((C65273Tz) obj).A04;
        Drawable drawable2 = ((C65273Tz) obj2).A04;
        return drawable == null ? drawable2 != null : !drawable.equals(drawable2);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setBackground((Drawable) null);
    }
}
