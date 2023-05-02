package X;

import android.os.Build;

/* renamed from: X.02a  reason: invalid class name */
public interface AnonymousClass02a {
    public static final boolean A00;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 27) {
            z2 = true;
        }
        A00 = z2;
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5);

    void setAutoSizeTextTypeWithDefaults(int i2);
}
