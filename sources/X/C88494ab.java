package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4ab  reason: invalid class name and case insensitive filesystem */
public abstract class C88494ab {
    public final int A00;

    public C88494ab(int i2) {
        this.A00 = i2;
    }

    public static String A00(int i2) {
        StringBuilder A0r = AnonymousClass000.A0r("");
        A0r.append((char) ((i2 >> 24) & MotionEventCompat.ACTION_MASK));
        A0r.append((char) ((i2 >> 16) & MotionEventCompat.ACTION_MASK));
        A0r.append((char) ((i2 >> 8) & MotionEventCompat.ACTION_MASK));
        return AnonymousClass3K3.A0p(A0r, (char) (i2 & MotionEventCompat.ACTION_MASK));
    }

    public String toString() {
        return A00(this.A00);
    }
}
