package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass3P8;
import X.C004601z;
import X.C47812Kr;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class WaTabLayout extends TabLayout implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;

    public WaTabLayout(Context context) {
        super(context, (AttributeSet) null);
        A0K();
        C004601z.A0f(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
        C004601z.A0f(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0K();
        C004601z.A0f(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A0K();
    }

    public final int A0I(int i2, boolean z2) {
        int size = (z2 ? 1 : 0) + this.A0c.size();
        if (i2 >= 0 && i2 < size) {
            return !(this.A00.A0T() ^ true) ? (size - i2) - 1 : i2;
        }
        StringBuilder sb = new StringBuilder("Tab index ");
        sb.append(i2);
        sb.append(" is out of range [0, ");
        sb.append(size);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public C47812Kr A0J(int i2) {
        if (i2 < 0 || i2 >= this.A0c.size()) {
            return null;
        }
        return super.A04(A0I(i2, false));
    }

    public void A0K() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTabsClickable(boolean z2) {
        for (int i2 = 0; i2 < this.A0c.size(); i2++) {
            C47812Kr A04 = A04(i2);
            if (A04 != null) {
                A04.A02.setClickable(z2);
            }
        }
    }

    public void setupTabsForAccessibility(View view) {
        C004601z.A0j(this, new IDxDCompatShape22S0100000_2_I0(this, 3));
        ArrayList arrayList = this.A0c;
        int size = arrayList.size() + 1;
        View[] viewArr = new View[size];
        viewArr[arrayList.size()] = view;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C47812Kr A0J = A0J(i3);
            if (A0J != null) {
                viewArr[i3] = A0J.A02;
            }
        }
        while (i2 < size) {
            C004601z.A0j(viewArr[i2], new AnonymousClass3P8(i2 == 0 ? null : viewArr[i2 - 1], this, i2));
            i2++;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (viewPager != null && !(viewPager instanceof WaViewPager)) {
            throw new IllegalArgumentException("WaTabLayout should only be setup with WaViewPager");
        } else if (viewPager == null || (viewPager instanceof WaViewPager)) {
            A0C(viewPager, false);
        } else {
            throw new IllegalArgumentException("WaTabLayout should only be setup with WaViewPager");
        }
    }
}
