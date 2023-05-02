package X;

import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.040  reason: invalid class name */
public final class AnonymousClass040 {
    public AnonymousClass041 A00 = AnonymousClass041.NOT_REQUIRED;
    public Set A01 = new LinkedHashSet();
    public boolean A02;

    public final AnonymousClass042 A00() {
        return new AnonymousClass042(this.A00, Build.VERSION.SDK_INT >= 24 ? C003101j.A0F(this.A01) : AnonymousClass1F9.A00(), -1, -1, false, false, this.A02, false);
    }

    public final void A01(AnonymousClass041 r2) {
        C18450wi.A0H(r2, 0);
        this.A00 = r2;
    }
}
