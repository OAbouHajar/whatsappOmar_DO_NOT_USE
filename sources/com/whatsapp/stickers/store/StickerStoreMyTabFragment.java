package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass1CX;
import X.AnonymousClass1ML;
import X.AnonymousClass35I;
import X.C02800Fh;
import X.C109565Sq;
import X.C13680ns;
import X.C16320sq;
import X.C37771pi;
import X.C38401qj;
import X.C55522jm;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StickerStoreMyTabFragment extends Hilt_StickerStoreMyTabFragment implements C109565Sq {
    public View A00;
    public C02800Fh A01;
    public AnonymousClass1ML A02;
    public C38401qj A03;
    public C16320sq A04;
    public boolean A05;

    public void A15() {
        super.A15();
        List list = this.A0I;
        if (list != null && this.A05) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C37771pi) this.A0I.get(i2)).A00 = size - i2;
            }
            AnonymousClass1CX r4 = this.A0F;
            r4.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(r4, 47, this.A0I));
        }
    }

    public final void A1M() {
        C13680ns.A1T(this.A03);
        C38401qj r1 = new C38401qj(this.A0F, this);
        this.A03 = r1;
        C13680ns.A1U(r1, this.A04);
    }

    public void AUI(C37771pi r5) {
        C55522jm r3 = this.A0H;
        if ((r3 instanceof AnonymousClass35I) && r3.A00 != null) {
            String str = r5.A0F;
            for (int i2 = 0; i2 < r3.A00.size(); i2++) {
                if (str.equals(((C37771pi) r3.A00.get(i2)).A0F)) {
                    r3.A00.set(i2, r5);
                    r3.A02(i2);
                    return;
                }
            }
        }
    }

    public void AUJ(List list) {
        if (!A1L()) {
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C37771pi r1 = (C37771pi) it.next();
                if (!r1.A0Q) {
                    A0u.add(r1);
                }
            }
            list = A0u;
        }
        this.A0I = list;
        C55522jm r0 = this.A0H;
        if (r0 == null) {
            A1I(new AnonymousClass35I(this, list));
            return;
        }
        r0.A00 = list;
        r0.A01();
    }

    public void AUK() {
        this.A03 = null;
    }

    public void AUL(String str) {
        if (this.A0I != null) {
            for (int i2 = 0; i2 < this.A0I.size(); i2++) {
                if (C37771pi.A00(str, this.A0I, i2)) {
                    this.A0I.remove(i2);
                    C55522jm r1 = this.A0H;
                    if (r1 instanceof AnonymousClass35I) {
                        r1.A00 = this.A0I;
                        r1.A01();
                        return;
                    }
                    return;
                }
            }
        }
    }
}
