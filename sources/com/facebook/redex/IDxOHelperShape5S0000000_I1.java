package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass02W;
import X.AnonymousClass0Bp;
import X.AnonymousClass0VA;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public class IDxOHelperShape5S0000000_I1 extends AnonymousClass0VA {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxOHelperShape5S0000000_I1(AnonymousClass02W r1, int i2) {
        super(r1);
        this.A00 = i2;
    }

    public int A01() {
        int i2 = this.A00;
        AnonymousClass02W r0 = this.A02;
        return i2 != 0 ? r0.A00 : r0.A03;
    }

    public int A02() {
        int i2;
        int A09;
        int i3 = this.A00;
        AnonymousClass02W r0 = this.A02;
        if (i3 != 0) {
            i2 = r0.A00;
            A09 = r0.A07();
        } else {
            i2 = r0.A03;
            A09 = r0.A09();
        }
        return i2 - A09;
    }

    public int A03() {
        int i2 = this.A00;
        AnonymousClass02W r0 = this.A02;
        return i2 != 0 ? r0.A07() : r0.A09();
    }

    public int A04() {
        int i2 = this.A00;
        AnonymousClass02W r0 = this.A02;
        return i2 != 0 ? r0.A01 : r0.A04;
    }

    public int A05() {
        int i2 = this.A00;
        AnonymousClass02W r0 = this.A02;
        return i2 != 0 ? r0.A04 : r0.A01;
    }

    public int A06() {
        int i2 = this.A00;
        AnonymousClass02W r0 = this.A02;
        return i2 != 0 ? r0.A0A() : r0.A08();
    }

    public int A07() {
        int A08;
        int A09;
        int i2 = this.A00;
        AnonymousClass02W r2 = this.A02;
        if (i2 != 0) {
            A08 = r2.A00 - r2.A0A();
            A09 = r2.A07();
        } else {
            A08 = r2.A03 - r2.A08();
            A09 = r2.A09();
        }
        return A08 - A09;
    }

    public int A08(View view) {
        int right;
        int i2;
        int i3 = this.A00;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view);
        if (i3 != 0) {
            right = view.getBottom() + AnonymousClass0Bp.A00(view).bottom;
            i2 = A0O.bottomMargin;
        } else {
            right = view.getRight() + AnonymousClass0Bp.A00(view).right;
            i2 = A0O.rightMargin;
        }
        return right + i2;
    }

    public int A09(View view) {
        int measuredWidth;
        int i2;
        int i3 = this.A00;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view);
        Rect A002 = AnonymousClass0Bp.A00(view);
        if (i3 != 0) {
            measuredWidth = view.getMeasuredHeight() + A002.top + A002.bottom + A0O.topMargin;
            i2 = A0O.bottomMargin;
        } else {
            measuredWidth = view.getMeasuredWidth() + A002.left + A002.right + A0O.leftMargin;
            i2 = A0O.rightMargin;
        }
        return measuredWidth + i2;
    }

    public int A0A(View view) {
        int measuredHeight;
        int i2;
        int i3 = this.A00;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view);
        Rect A002 = AnonymousClass0Bp.A00(view);
        if (i3 != 0) {
            measuredHeight = view.getMeasuredWidth() + A002.left + A002.right + A0O.leftMargin;
            i2 = A0O.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + A002.top + A002.bottom + A0O.topMargin;
            i2 = A0O.bottomMargin;
        }
        return measuredHeight + i2;
    }

    public int A0B(View view) {
        int left;
        int i2;
        int i3 = this.A00;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view);
        if (i3 != 0) {
            left = view.getTop() - AnonymousClass0Bp.A00(view).top;
            i2 = A0O.topMargin;
        } else {
            left = view.getLeft() - AnonymousClass0Bp.A00(view).left;
            i2 = A0O.leftMargin;
        }
        return left - i2;
    }

    public int A0C(View view) {
        int i2 = this.A00;
        AnonymousClass02W r1 = this.A02;
        Rect rect = this.A01;
        if (i2 != 0) {
            r1.A0G(rect, view);
            return rect.bottom;
        }
        r1.A0G(rect, view);
        return rect.right;
    }

    public int A0D(View view) {
        int i2 = this.A00;
        AnonymousClass02W r1 = this.A02;
        Rect rect = this.A01;
        if (i2 != 0) {
            r1.A0G(rect, view);
            return rect.top;
        }
        r1.A0G(rect, view);
        return rect.left;
    }

    public void A0E(int i2) {
        int i3 = this.A00;
        AnonymousClass02W r0 = this.A02;
        if (i3 != 0) {
            r0.A0l(i2);
        } else {
            r0.A0k(i2);
        }
    }
}
