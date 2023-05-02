package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.0UM  reason: invalid class name */
public final class AnonymousClass0UM {
    public final PointerIcon A00;

    public AnonymousClass0UM(PointerIcon pointerIcon) {
        this.A00 = pointerIcon;
    }

    public static AnonymousClass0UM A00(Context context) {
        return new AnonymousClass0UM(Build.VERSION.SDK_INT >= 24 ? C04150Lj.A00(context, 1002) : null);
    }

    public Object A01() {
        return this.A00;
    }
}
