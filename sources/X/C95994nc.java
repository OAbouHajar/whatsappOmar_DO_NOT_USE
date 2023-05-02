package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.4nc  reason: invalid class name and case insensitive filesystem */
public class C95994nc implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = ((AnonymousClass3U0) obj2).A00;
        if (i2 >= 17) {
            view.setBackgroundColor(i3);
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i3));
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass3K2.A1X(((AnonymousClass3U0) obj).A00, ((AnonymousClass3U0) obj2).A00);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
    }
}
