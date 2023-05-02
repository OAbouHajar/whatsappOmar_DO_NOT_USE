package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0S0  reason: invalid class name */
public abstract class AnonymousClass0S0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Class A03;

    public AnonymousClass0S0(Class cls, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A03 = cls;
        this.A00 = i3;
        this.A01 = i4;
    }

    public Object A01(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= this.A01) {
            return A03(view);
        }
        if (i2 < 19) {
            return null;
        }
        Object tag = view.getTag(this.A02);
        if (this.A03.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void A02(View view, Object obj) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= this.A01) {
            A04(view, obj);
        } else if (i2 >= 19 && A05(A01(view), obj)) {
            AnonymousClass05M A0F = C004601z.A0F(view);
            if (A0F == null) {
                A0F = new AnonymousClass05M();
            }
            C004601z.A0j(view, A0F);
            view.setTag(this.A02, obj);
            C004601z.A0Z(view, this.A00);
        }
    }

    public abstract Object A03(View view);

    public abstract void A04(View view, Object obj);

    public abstract boolean A05(Object obj, Object obj2);
}
