package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass1VE;
import X.AnonymousClass2HU;
import X.AnonymousClass3K2;
import X.C13690nt;
import X.C20380zx;
import android.view.View;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class IDxProviderShape64S0200000_2_I0 implements AnonymousClass01J {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxProviderShape64S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object get() {
        float f2;
        switch (this.A02) {
            case 0:
                f2 = ((float) ((View) this.A01).getWidth()) * (1.0f - AnonymousClass3K2.A02(((AnonymousClass1VE) this.A00).A0I));
                break;
            case 1:
                float A022 = AnonymousClass3K2.A02(((AnonymousClass1VE) this.A00).A0C) / ((float) ((View) this.A01).getHeight());
                if (A022 < 0.0f || A022 > 1.0f) {
                    int i2 = (A022 > 0.0f ? 1 : (A022 == 0.0f ? 0 : -1));
                    A022 = 1.0f;
                    if (i2 < 0) {
                        A022 = 0.0f;
                    }
                }
                f2 = 1.0f - A022;
                break;
            case 2:
                return Float.valueOf(((float) ((AnonymousClass1VE) this.A00).A04.getDimensionPixelSize(R.dimen.dimen0762)) - ((float) ((View) this.A01).getTop()));
            case 3:
                f2 = ((float) ((View) this.A01).getHeight()) - (((float) ((AnonymousClass1VE) this.A00).A04.getDimensionPixelSize(R.dimen.dimen0762)) * 2.0f);
                break;
            case 4:
                HashMap A0x = AnonymousClass000.A0x();
                for (C20380zx r1 : (Set) ((AnonymousClass01D) this.A01).get()) {
                    A0x.put(r1.A01(), r1);
                }
                return A0x;
            default:
                List list = (List) ((AnonymousClass2HU) this.A00).A03.get();
                Set set = (Set) ((AnonymousClass01J) this.A01).get();
                ArrayList A0i = C13690nt.A0i(list.size());
                for (Object next : list) {
                    if (!set.contains(next)) {
                        A0i.add(next);
                    }
                }
                return A0i;
        }
        return Float.valueOf(f2);
    }
}
