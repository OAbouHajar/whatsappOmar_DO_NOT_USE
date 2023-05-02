package com.facebook.redex;

import X.AnonymousClass2BF;
import X.AnonymousClass2OV;
import X.AnonymousClass3SU;
import X.C18450wi;
import X.C54482hb;
import X.C57752rh;
import X.C61883Au;
import X.C816349d;
import android.graphics.Bitmap;
import com.obwhatsapp.R;

public class IDxBLoaderShape91S0200000_2_I0 implements AnonymousClass2OV {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxBLoaderShape91S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String AGT() {
        if (this.A02 == 0) {
            return C61883Au.A02((AnonymousClass2BF) this.A01);
        }
        String A022 = C61883Au.A02((AnonymousClass2BF) this.A00);
        C18450wi.A0B(A022);
        return A022;
    }

    public Bitmap AKB() {
        Bitmap Agi;
        if (this.A02 != 0) {
            AnonymousClass3SU r2 = (AnonymousClass3SU) this.A01;
            if (!C18450wi.A0R(r2.A03.getTag(), this)) {
                return null;
            }
            Agi = ((AnonymousClass2BF) this.A00).Agi(r2.A00);
        } else {
            C54482hb r1 = ((C57752rh) this.A00).A04;
            if (r1.getTag() != this) {
                return null;
            }
            Agi = ((AnonymousClass2BF) this.A01).Agi(r1.getResources().getDimensionPixelSize(R.dimen.dimen0142));
        }
        return Agi == null ? C816349d.A00 : Agi;
    }
}
