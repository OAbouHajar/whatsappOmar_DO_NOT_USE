package X;

import android.graphics.Bitmap;
import android.text.Layout;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.Comparator;

/* renamed from: X.1jz  reason: invalid class name and case insensitive filesystem */
public final class C34271jz {
    public static final Comparator A02 = new IDxComparatorShape19S0000000_2_I0(1);
    public final int A00;
    public final C88444aV A01;

    public C34271jz(Layout.Alignment alignment, CharSequence charSequence, float f2, float f3, int i2, int i3, int i4, int i5, boolean z2) {
        boolean z3 = false;
        int i6 = -16777216;
        if (z2) {
            i6 = i4;
            z3 = true;
        }
        this.A01 = new C88444aV((Bitmap) null, alignment, charSequence, f2, f3, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, i2, i3, Integer.MIN_VALUE, i6, Integer.MIN_VALUE, z3);
        this.A00 = i5;
    }
}
