package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass1VE;
import X.AnonymousClass3K2;
import X.C14730pf;
import X.C16190sc;
import X.C16260sj;
import X.C40751ud;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.obwhatsapp.R;

public class IDxProviderShape36S0300000_2_I0 implements AnonymousClass01J {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxProviderShape36S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final Object get() {
        int i2;
        int right;
        int right2;
        switch (this.A03) {
            case 0:
                AnonymousClass1VE r3 = (AnonymousClass1VE) this.A00;
                View view = (View) this.A02;
                Resources resources = r3.A04;
                float dimensionPixelSize = ((float) resources.getDimensionPixelSize(R.dimen.dimen0762)) + AnonymousClass3K2.A02(r3.A0H);
                boolean A0T = ((AnonymousClass013) this.A01).A0T();
                int left = view.getLeft();
                if (A0T) {
                    i2 = (int) (dimensionPixelSize + 0.5f);
                    right = (int) (((((float) view.getRight()) - AnonymousClass3K2.A02(r3.A0D)) - ((float) resources.getDimensionPixelSize(R.dimen.dimen0765))) + 0.5f);
                } else {
                    left = (int) (((float) left) + AnonymousClass3K2.A02(r3.A0D) + ((float) resources.getDimensionPixelSize(R.dimen.dimen0765)) + 0.5f);
                    i2 = (int) (dimensionPixelSize + 0.5f);
                    right = view.getRight();
                }
                return new Rect(left, i2, right, (int) (dimensionPixelSize + AnonymousClass3K2.A02(r3.A0F) + 0.5f));
            case 1:
                AnonymousClass1VE r4 = (AnonymousClass1VE) this.A00;
                View view2 = (View) this.A02;
                Resources resources2 = r4.A04;
                int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.dimen0762);
                boolean A0T2 = ((AnonymousClass013) this.A01).A0T();
                int left2 = view2.getLeft();
                if (A0T2) {
                    right2 = (int) (((((float) view2.getRight()) - AnonymousClass3K2.A02(r4.A0D)) - ((float) resources2.getDimensionPixelSize(R.dimen.dimen0765))) + 0.5f);
                } else {
                    left2 = (int) (((float) left2) + AnonymousClass3K2.A02(r4.A0D) + ((float) resources2.getDimensionPixelSize(R.dimen.dimen0765)) + 0.5f);
                    right2 = view2.getRight();
                }
                return new Rect(left2, dimensionPixelSize2, right2, (int) (((float) dimensionPixelSize2) + AnonymousClass3K2.A02(r4.A0H) + 0.5f));
            default:
                return new C40751ud((C16190sc) this.A00, (C16260sj) this.A02, (C14730pf) this.A01);
        }
    }
}
