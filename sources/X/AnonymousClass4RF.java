package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.4RF  reason: invalid class name */
public class AnonymousClass4RF {
    public final Resources A00;
    public final View A01;
    public final AnonymousClass4EQ A02;

    public AnonymousClass4RF(Resources resources, View view, AnonymousClass4EQ r3) {
        this.A00 = resources;
        this.A01 = view;
        this.A02 = r3;
    }

    public void A00(float f2) {
        AnonymousClass29S r3 = this.A02.A00;
        int i2 = (int) f2;
        r3.A00 = i2;
        int max = Math.max(i2, r3.A02);
        r3.A0K.setPadding(0, 0, 0, max);
        r3.A0K.requestLayout();
        r3.A0I(max);
    }
}
