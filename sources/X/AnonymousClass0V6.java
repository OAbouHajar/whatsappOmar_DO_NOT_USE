package X;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.0V6  reason: invalid class name */
public final class AnonymousClass0V6 {
    public final DisplayCutout A00;

    public AnonymousClass0V6(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }

    public static AnonymousClass0V6 A00(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new AnonymousClass0V6(displayCutout);
    }

    public int A01() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WX.A00(this.A00);
        }
        return 0;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WX.A01(this.A00);
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WX.A02(this.A00);
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0WX.A03(this.A00);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0V6.class != obj.getClass()) {
            return false;
        }
        return AnonymousClass08I.A01(this.A00, ((AnonymousClass0V6) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DisplayCutoutCompat{");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }
}
