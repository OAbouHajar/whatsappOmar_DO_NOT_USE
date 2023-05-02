package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Ui  reason: invalid class name and case insensitive filesystem */
public abstract class C06120Ui {
    public static C06120Ui A00(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C03450Io(context);
        }
        C03460Ip r1 = new C03460Ip();
        return r1.A02(new long[8]) ? r1 : new C03470Iq(context);
    }

    public abstract boolean A01();

    public abstract boolean A02(long[] jArr);
}
