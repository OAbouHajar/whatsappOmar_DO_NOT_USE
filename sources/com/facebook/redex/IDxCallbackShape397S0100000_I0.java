package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass02W;
import X.AnonymousClass0Bp;
import X.C13300ln;
import android.view.View;
import android.view.ViewGroup;

public class IDxCallbackShape397S0100000_I0 implements C13300ln {
    public Object A00;
    public final int A01;

    public IDxCallbackShape397S0100000_I0(AnonymousClass02W r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public int AAZ(View view) {
        int right;
        int i2;
        int i3 = this.A01;
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

    public int AAb(View view) {
        int left;
        int i2;
        int i3 = this.A01;
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

    public int AEG() {
        int i2;
        int A09;
        int i3 = this.A01;
        AnonymousClass02W r0 = (AnonymousClass02W) this.A00;
        if (i3 != 0) {
            i2 = r0.A00;
            A09 = r0.A07();
        } else {
            i2 = r0.A03;
            A09 = r0.A09();
        }
        return i2 - A09;
    }

    public int AEI() {
        int i2 = this.A01;
        AnonymousClass02W r0 = (AnonymousClass02W) this.A00;
        return i2 != 0 ? r0.A0A() : r0.A08();
    }
}
