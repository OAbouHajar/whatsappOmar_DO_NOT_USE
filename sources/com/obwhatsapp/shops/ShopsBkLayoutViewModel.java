package com.obwhatsapp.shops;

import X.AnonymousClass00B;
import X.AnonymousClass01D;
import X.AnonymousClass2WZ;
import X.C13680ns;
import X.C18260wP;
import X.C30801cy;
import X.C56072ku;
import android.content.Intent;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class ShopsBkLayoutViewModel extends C56072ku {
    public final C18260wP A00;
    public final C30801cy A01 = C30801cy.A01();
    public final C30801cy A02 = C30801cy.A01();

    public ShopsBkLayoutViewModel(C18260wP r2, AnonymousClass01D r3) {
        super(r3);
        this.A00 = r2;
    }

    public boolean A05(AnonymousClass2WZ r5) {
        int i2 = r5.A00;
        if (i2 == 2) {
            Intent A09 = C13680ns.A09();
            A09.putExtra("error_code", 475);
            this.A01.A0B(A09);
            return false;
        } else if (i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            Log.e("BkLayoutViewModel: layout fetch error");
            boolean A0A = this.A00.A0A();
            int i3 = R.string.str0df7;
            if (A0A) {
                i3 = R.string.str0844;
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            C13680ns.A1O(this.A02, i3);
            return false;
        } else {
            AnonymousClass00B.A08("BkLayoutViewModel: invalid error status");
            return false;
        }
    }
}
