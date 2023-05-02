package com.facebook.redex;

import X.AnonymousClass3K2;
import X.AnonymousClass3T3;
import X.C000900k;
import X.C95464mg;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.obwhatsapp.IDxLAdapterShape52S0100000_2_I1;
import com.obwhatsapp.R;

public class IDxDListenerShape58S0200000_2_I1 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape58S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        switch (this.A02) {
            case 0:
                EditText editText = (EditText) this.A01;
                AnonymousClass3K2.A10(editText, this);
                editText.setSelection(editText.length());
                return true;
            case 1:
                View view = (View) this.A01;
                AnonymousClass3K2.A10(view, this);
                C95464mg r0 = (C95464mg) this.A00;
                view.post(new RunnableRunnableShape3S0300000_I1(this, r0.A00, r0.A03, 5));
                return true;
            case 2:
                AnonymousClass3T3 r4 = (AnonymousClass3T3) this.A00;
                AnonymousClass3K2.A10(r4, this);
                r4.A0E = true;
                int height = r4.getHeight();
                r4.getLayoutParams().height = 0;
                r4.requestLayout();
                IDxAnimationShape3S0101000_2_I1 iDxAnimationShape3S0101000_2_I1 = new IDxAnimationShape3S0101000_2_I1(this, height, 1);
                iDxAnimationShape3S0101000_2_I1.setAnimationListener(new IDxLAdapterShape52S0100000_2_I1(this, 3));
                iDxAnimationShape3S0101000_2_I1.setDuration(250);
                r4.startAnimation(iDxAnimationShape3S0101000_2_I1);
                return false;
            default:
                View view2 = (View) this.A01;
                int height2 = view2.getHeight();
                View findViewById = ((C000900k) this.A00).findViewById(R.id.faq_screen_content);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + height2);
                AnonymousClass3K2.A10(view2, this);
                return false;
        }
    }
}
