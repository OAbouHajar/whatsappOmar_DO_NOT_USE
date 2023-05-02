package com.obwhatsapp;

import X.AnonymousClass012;
import X.AnonymousClass013;
import X.AnonymousClass3TG;
import X.C14830pp;
import X.C49962Wx;
import X.C70633hQ;
import android.content.Context;
import android.util.AttributeSet;

public class WaViewPager extends C49962Wx {
    public AnonymousClass013 A00;

    public WaViewPager(Context context) {
        super(context);
    }

    public WaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(AnonymousClass013 r1, int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
            return !(r1.A0T() ^ true) ? (i3 - i2) - 1 : i2;
        }
        StringBuilder sb = new StringBuilder("Item index ");
        sb.append(i2);
        sb.append(" is out of range [0, ");
        sb.append(i3);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private int getItemCount() {
        AnonymousClass012 r0 = this.A0V;
        if (r0 == null) {
            return 0;
        }
        return r0.A01();
    }

    public int A0P(int i2) {
        return A00(this.A00, i2, getItemCount());
    }

    public void A0Q(int i2) {
        super.A0F(A0P(i2), true);
    }

    public AnonymousClass012 getAdapter() {
        return this.A0V;
    }

    @Deprecated
    public int getCurrentItem() {
        return this.A0A;
    }

    public int getCurrentLogicalItem() {
        if (getItemCount() == 0) {
            return -1;
        }
        return A0P(this.A0A);
    }

    public AnonymousClass012 getRealAdapter() {
        AnonymousClass012 r1 = this.A0V;
        if (r1 instanceof AnonymousClass3TG) {
            return ((AnonymousClass3TG) r1).A00;
        }
        return null;
    }

    public void setAdapter(AnonymousClass012 r4) {
        AnonymousClass012 r2;
        if (r4 == null) {
            r2 = null;
        } else {
            boolean z2 = r4 instanceof C14830pp;
            AnonymousClass013 r1 = this.A00;
            r2 = z2 ? new C70633hQ(r4, (C14830pp) r4, r1) : new AnonymousClass3TG(r4, r1);
        }
        super.setAdapter(r2);
        if (r4 != null && r4.A01() > 0) {
            setCurrentLogicalItem(0);
        }
    }

    @Deprecated
    public void setCurrentItem(int i2) {
        super.setCurrentItem(i2);
    }

    public void setCurrentLogicalItem(int i2) {
        super.setCurrentItem(A0P(i2));
    }
}
