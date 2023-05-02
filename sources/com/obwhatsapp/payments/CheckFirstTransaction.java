package com.obwhatsapp.payments;

import X.AnonymousClass05T;
import X.AnonymousClass175;
import X.AnonymousClass1WD;
import X.C001300o;
import X.C011405n;
import X.C110115dX;
import X.C115365pd;
import X.C1208163c;
import X.C16320sq;
import X.C18290wS;
import X.C18300wT;
import com.facebook.redex.IDxNConsumerShape155S0100000_3_I1;

public class CheckFirstTransaction implements AnonymousClass05T {
    public final AnonymousClass1WD A00 = new AnonymousClass1WD();
    public final AnonymousClass175 A01;
    public final C18300wT A02;
    public final C18290wS A03;
    public final C16320sq A04;

    public CheckFirstTransaction(AnonymousClass175 r2, C18300wT r3, C18290wS r4, C16320sq r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AXa(C011405n r5, C001300o r6) {
        AnonymousClass1WD r1;
        Boolean bool;
        int A012 = C110115dX.A01(r5, C115365pd.A00);
        if (A012 == 1) {
            if (!this.A01.A0C()) {
                r1 = this.A00;
                bool = Boolean.TRUE;
            } else {
                C18300wT r2 = this.A02;
                if (!r2.A01().contains("payment_is_first_send") || C110115dX.A17(r2.A01(), "payment_is_first_send")) {
                    this.A04.Acl(new C1208163c(this));
                    this.A00.A00(new IDxNConsumerShape155S0100000_3_I1(this.A02, 0));
                }
                r1 = this.A00;
                bool = Boolean.FALSE;
            }
            r1.A02(bool);
            this.A00.A00(new IDxNConsumerShape155S0100000_3_I1(this.A02, 0));
        } else if (A012 == 2) {
            this.A00.A04();
        }
    }
}
