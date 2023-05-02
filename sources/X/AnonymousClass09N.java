package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: X.09N  reason: invalid class name */
public class AnonymousClass09N {
    public static AnonymousClass09N A00() {
        return Build.VERSION.SDK_INT >= 23 ? new AnonymousClass0Dy(AnonymousClass0LI.A00()) : new AnonymousClass09N();
    }

    public static AnonymousClass09N A01(Activity activity, View view, String str) {
        return Build.VERSION.SDK_INT >= 21 ? new AnonymousClass0Dy(AnonymousClass0SU.A00(activity, view, str)) : new AnonymousClass09N();
    }

    public static AnonymousClass09N A02(Activity activity, AnonymousClass01Q... r6) {
        if (Build.VERSION.SDK_INT < 21) {
            return new AnonymousClass09N();
        }
        Pair[] pairArr = null;
        if (r6 != null) {
            int length = r6.length;
            pairArr = new Pair[length];
            for (int i2 = 0; i2 < length; i2++) {
                AnonymousClass01Q r0 = r6[i2];
                pairArr[i2] = Pair.create(r0.A00, r0.A01);
            }
        }
        return new AnonymousClass0Dy(AnonymousClass0SU.A01(activity, pairArr));
    }

    public Bundle A03() {
        return null;
    }
}
