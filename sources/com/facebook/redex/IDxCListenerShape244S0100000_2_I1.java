package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2Ut;
import X.AnonymousClass34L;
import X.AnonymousClass3AJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;

public class IDxCListenerShape244S0100000_2_I1 implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape244S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int A002;
        switch (this.A01) {
            case 0:
                AnonymousClass2Ut r0 = (AnonymousClass2Ut) this.A00;
                View view2 = r0.A03;
                ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(view2);
                int width = r0.A06.getWidth();
                A0O.setMargins(0, 0, 0, 0);
                A0O.width = view2.getResources().getDimensionPixelSize(R.dimen.dimen0728) + view2.getResources().getDimensionPixelSize(R.dimen.dimen0721) + width;
                view2.setLayoutParams(A0O);
                view2.removeOnLayoutChangeListener(this);
                return;
            case 1:
                if (i4 - i2 != i8 - i6) {
                    AnonymousClass34L r4 = (AnonymousClass34L) this.A00;
                    if (r4.getWidth() > 0) {
                        ChipGroup chipGroup = r4.A01;
                        if (chipGroup.getChildCount() > 0 && (A002 = r4.getMaxChipWidth()) > 0) {
                            for (int i10 = 0; i10 < chipGroup.getChildCount(); i10++) {
                                ((TextView) chipGroup.getChildAt(i10)).setMaxWidth(A002);
                            }
                            r4.measure(View.MeasureSpec.makeMeasureSpec(r4.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            r4.removeOnLayoutChangeListener(this);
                            r4.layout(i2, i3, i4, r4.getMeasuredHeight() + i3);
                            r4.addOnLayoutChangeListener(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((AnonymousClass3AJ) this.A00).A00.start();
                return;
        }
    }
}
