package X;

import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0Ur  reason: invalid class name and case insensitive filesystem */
public class C06200Ur {
    public final Object A00;

    public C06200Ur() {
        int i2 = Build.VERSION.SDK_INT;
        this.A00 = i2 >= 26 ? new AnonymousClass0EW(this) : i2 >= 19 ? new AnonymousClass0EX(this) : new C02440Bx(this);
    }

    public C06200Ur(Object obj) {
        this.A00 = obj;
    }

    public AnonymousClass031 A00(int i2) {
        return null;
    }

    public AnonymousClass031 A01(int i2) {
        return null;
    }

    public boolean A02(int i2, int i3, Bundle bundle) {
        return false;
    }
}
