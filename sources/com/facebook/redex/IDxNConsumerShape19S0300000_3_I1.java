package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1WE;
import X.AnonymousClass5xV;
import X.AnonymousClass62J;
import X.C112765jH;
import X.C1223869j;
import X.C13690nt;
import X.C15830rv;
import X.C18260wP;
import X.C28401Vy;
import X.C32241fu;
import X.C47222Ic;
import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class IDxNConsumerShape19S0300000_3_I1 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNConsumerShape19S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void accept(Object obj) {
        Object obj2 = obj;
        if (this.A03 != 0) {
            AnonymousClass5xV r5 = (AnonymousClass5xV) this.A00;
            C1223869j r3 = (C1223869j) this.A01;
            Context context = (Context) this.A02;
            C47222Ic r7 = (C47222Ic) obj2;
            r3.Ac1();
            if (r7.A01 == 5 || (r5.A03.A0C(1084) && r7.A00 == 5)) {
                r3.A83();
                C32241fu A002 = C32241fu.A00(context);
                boolean A022 = C18260wP.A02(context);
                int i2 = R.string.str0dc2;
                if (A022) {
                    i2 = R.string.str0dc3;
                }
                A002.A01(i2);
                C13690nt.A1F(A002);
                C13690nt.A1G(A002);
                return;
            }
            int i3 = r7.A01;
            if (i3 == 1 || i3 == 6 || !r5.A05(r7)) {
                int i4 = r7.A01;
                if (i4 != 1 && i4 != 6) {
                    AnonymousClass5xV.A02(context, new IDxCListenerShape130S0100000_3_I1(r3, 76), new IDxCListenerShape130S0100000_3_I1(r3, 78));
                } else if (r5.A05(r7)) {
                    AnonymousClass5xV.A00(context, new IDxCListenerShape130S0100000_3_I1(r3, 77), new IDxCListenerShape130S0100000_3_I1(r3, 79));
                } else {
                    r3.ATa(r7.A02);
                }
            } else {
                AnonymousClass5xV.A01(context, new IDxCListenerShape130S0100000_3_I1(r3, 81), new IDxCListenerShape130S0100000_3_I1(r3, 80));
            }
        } else {
            C112765jH r2 = (C112765jH) this.A00;
            PaymentView paymentView = (PaymentView) this.A02;
            AnonymousClass5xV r1 = r2.A0V;
            C15830rv r52 = r2.A0E;
            AnonymousClass00B.A06(r52);
            UserJid userJid = r2.A0G;
            long j2 = r2.A02;
            String paymentNote = paymentView.getPaymentNote();
            List mentionedJids = paymentView.getMentionedJids();
            r1.A04(r2, (C28401Vy) this.A01, paymentView.getPaymentBackground(), r52, userJid, (C47222Ic) obj2, new AnonymousClass62J(r2, paymentView), paymentNote, mentionedJids, j2);
        }
    }
}
