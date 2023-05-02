package X;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: X.0Sb  reason: invalid class name and case insensitive filesystem */
public final class C05560Sb {
    public static final void A00(Bundle bundle, Size size, String str) {
        C18450wi.A0H(bundle, 0);
        C18450wi.A0H(str, 1);
        bundle.putSize(str, size);
    }

    public static final void A01(Bundle bundle, SizeF sizeF, String str) {
        C18450wi.A0H(bundle, 0);
        C18450wi.A0H(str, 1);
        bundle.putSizeF(str, sizeF);
    }
}
