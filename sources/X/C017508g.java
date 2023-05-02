package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.08g  reason: invalid class name and case insensitive filesystem */
public abstract class C017508g {
    public final void A00(int i2) {
        new Handler(Looper.getMainLooper()).post(new C09780g4(this, i2));
    }

    public abstract void A01(int i2);

    public abstract void A02(Typeface typeface);
}
