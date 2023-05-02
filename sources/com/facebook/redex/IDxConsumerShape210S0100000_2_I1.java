package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass028;
import X.AnonymousClass04N;
import X.AnonymousClass3K4;
import X.C14550pN;
import X.C31201dg;
import X.C41521w4;
import android.util.SparseArray;
import com.obwhatsapp.R;
import java.util.List;

public class IDxConsumerShape210S0100000_2_I1 implements AnonymousClass04N {
    public Object A00;
    public final int A01;

    public IDxConsumerShape210S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                SparseArray sparseArray = ((C31201dg) this.A00).A02;
                sparseArray.put(40, "");
                sparseArray.put(35, obj);
                return;
            case 1:
                C14550pN r1 = (C14550pN) this.A00;
                r1.A2b(new IDxCListenerShape72S0200000_2_I1(obj, 0, r1), R.string.str032d, R.string.str032e, R.string.str0a48, R.string.str0394);
                return;
            case 2:
                ((AnonymousClass028) this.A00).A09(obj);
                return;
            default:
                C41521w4 r4 = (C41521w4) this.A00;
                List list = (List) obj;
                r4.A0C = new byte[list.size()];
                for (int i2 = 0; i2 < list.size(); i2 = AnonymousClass3K4.A0C(r4.A0C, (int) (AnonymousClass000.A04(list.get(i2)) * 100.0f), i2)) {
                }
                return;
        }
    }
}
