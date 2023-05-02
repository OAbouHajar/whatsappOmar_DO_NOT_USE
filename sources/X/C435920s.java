package X;

import android.graphics.drawable.Drawable;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;

/* renamed from: X.20s  reason: invalid class name and case insensitive filesystem */
public abstract class C435920s {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C34151jm A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C435920s(C34151jm r1, String str, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A03 = r1;
        this.A04 = str;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = z2;
        this.A01 = i4;
        this.A06 = z3;
    }

    public void A00(Drawable drawable, C14870pt r6) {
        if (this instanceof C436220v) {
            AnonymousClass00B.A06(r6);
            r6.A0K(new RunnableRunnableShape10S0200000_I0_8(this, 40, drawable));
            return;
        }
        C436320w r3 = (C436320w) this;
        if (drawable != null) {
            drawable.setBounds(0, 0, r3.A02, r3.A00);
            r3.A01.AXl(drawable);
        }
    }
}
