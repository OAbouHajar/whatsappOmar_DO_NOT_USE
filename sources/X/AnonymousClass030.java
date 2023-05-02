package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.030  reason: invalid class name */
public class AnonymousClass030 {
    public static final AnonymousClass030 A01 = (Build.VERSION.SDK_INT >= 30 ? AnonymousClass0ER.A00 : AnonymousClass0VF.A01);
    public final AnonymousClass0VF A00;

    public AnonymousClass030() {
        this.A00 = new AnonymousClass0VF(this);
    }

    public AnonymousClass030(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.A00 = i2 >= 30 ? new AnonymousClass0ER(this, windowInsets) : i2 >= 29 ? new AnonymousClass0ES(this, windowInsets) : i2 >= 28 ? new AnonymousClass0ET(this, windowInsets) : i2 >= 21 ? new AnonymousClass0EU(this, windowInsets) : i2 >= 20 ? new AnonymousClass0EV(this, windowInsets) : new AnonymousClass0VF(this);
    }

    public static C06510Wk A00(C06510Wk r5, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, r5.A01 - i2);
        int max2 = Math.max(0, r5.A03 - i3);
        int max3 = Math.max(0, r5.A02 - i4);
        int max4 = Math.max(0, r5.A00 - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? r5 : C06510Wk.A00(max, max2, max3, max4);
    }

    public static AnonymousClass030 A01(View view, WindowInsets windowInsets) {
        AnonymousClass030 r2 = new AnonymousClass030(windowInsets);
        if (view != null && C004601z.A0t(view)) {
            AnonymousClass030 A0I = C004601z.A0I(view);
            AnonymousClass0VF r1 = r2.A00;
            r1.A0F(A0I);
            r1.A0E(view.getRootView());
        }
        return r2;
    }

    public static AnonymousClass030 A02(WindowInsets windowInsets) {
        return new AnonymousClass030(windowInsets);
    }

    @Deprecated
    public int A03() {
        return this.A00.A0A().A00;
    }

    @Deprecated
    public int A04() {
        return this.A00.A0A().A01;
    }

    @Deprecated
    public int A05() {
        return this.A00.A0A().A02;
    }

    @Deprecated
    public int A06() {
        return this.A00.A0A().A03;
    }

    public WindowInsets A07() {
        AnonymousClass0VF r1 = this.A00;
        if (r1 instanceof AnonymousClass0EV) {
            return ((AnonymousClass0EV) r1).A03;
        }
        return null;
    }

    @Deprecated
    public AnonymousClass030 A08(int i2, int i3, int i4, int i5) {
        C05900Tl r0 = new C05900Tl(this);
        C06510Wk A002 = C06510Wk.A00(i2, i3, i4, i5);
        C05360Qq r02 = r0.A00;
        r02.A02(A002);
        return r02.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass030)) {
            return false;
        }
        return AnonymousClass08I.A01(this.A00, ((AnonymousClass030) obj).A00);
    }

    public int hashCode() {
        AnonymousClass0VF r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }
}
