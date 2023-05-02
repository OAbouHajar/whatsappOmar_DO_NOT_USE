package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.redex.IDxOHelperShape5S0000000_I1;

/* renamed from: X.0VA  reason: invalid class name */
public abstract class AnonymousClass0VA {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = AnonymousClass000.A0J();
    public final AnonymousClass02W A02;

    public AnonymousClass0VA(AnonymousClass02W r2) {
        this.A02 = r2;
    }

    public static AnonymousClass0VA A00(AnonymousClass02W r2, int i2) {
        int i3 = 0;
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                throw AnonymousClass000.A0T("invalid orientation");
            }
        }
        return new IDxOHelperShape5S0000000_I1(r2, i3);
    }

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    public abstract int A07();

    public abstract int A08(View view);

    public abstract int A09(View view);

    public abstract int A0A(View view);

    public abstract int A0B(View view);

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract void A0E(int i2);
}
