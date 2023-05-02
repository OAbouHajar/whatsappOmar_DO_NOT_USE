package X;

import android.os.Build;

/* renamed from: X.0Tl  reason: invalid class name and case insensitive filesystem */
public final class C05900Tl {
    public final C05360Qq A00;

    public C05900Tl() {
        int i2 = Build.VERSION.SDK_INT;
        this.A00 = i2 >= 30 ? new AnonymousClass0EO() : i2 >= 29 ? new AnonymousClass0EP() : i2 >= 20 ? new AnonymousClass0EQ() : new C05360Qq(new AnonymousClass030());
    }

    public C05900Tl(AnonymousClass030 r3) {
        int i2 = Build.VERSION.SDK_INT;
        this.A00 = i2 >= 30 ? new AnonymousClass0EO(r3) : i2 >= 29 ? new AnonymousClass0EP(r3) : i2 >= 20 ? new AnonymousClass0EQ(r3) : new C05360Qq(r3);
    }
}
