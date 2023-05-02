package com.obwhatsapp.payments.ui.viewmodel;

import X.AnonymousClass17O;
import X.AnonymousClass1DV;
import X.AnonymousClass1GP;
import X.AnonymousClass1TR;
import X.AnonymousClass2St;
import X.AnonymousClass4PY;
import X.AnonymousClass504;
import X.AnonymousClass5Q4;
import X.C003401n;
import X.C1222969a;
import X.C15220qW;
import X.C16320sq;
import X.C18290wS;
import X.C18450wi;
import X.C27981Tw;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.obwhatsapp.payments.IDxAObserverShape91S0100000_2_I0;
import kotlin.jvm.internal.IDxLambdaShape55S0000000_2_I0;

public final class BusinessHubViewModel extends C003401n {
    public final AnonymousClass4PY A00;
    public final AnonymousClass1GP A01;
    public final AnonymousClass17O A02;
    public final AnonymousClass5Q4 A03;
    public final C27981Tw A04;
    public final C18290wS A05;
    public final C1222969a A06;
    public final AnonymousClass1TR A07;
    public final C16320sq A08;
    public final C15220qW A09 = new AnonymousClass1DV(new IDxLambdaShape55S0000000_2_I0(2));
    public final C15220qW A0A = new AnonymousClass1DV(new IDxLambdaShape55S0000000_2_I0(3));

    public BusinessHubViewModel(AnonymousClass1GP r3, AnonymousClass17O r4, C27981Tw r5, C18290wS r6, C1222969a r7, AnonymousClass1TR r8, C16320sq r9) {
        C18450wi.A0H(r9, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r7, 3);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r8, 5);
        C18450wi.A0H(r4, 6);
        C18450wi.A0H(r5, 7);
        this.A08 = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r3;
        this.A07 = r8;
        this.A02 = r4;
        this.A04 = r5;
        IDxAObserverShape91S0100000_2_I0 iDxAObserverShape91S0100000_2_I0 = new IDxAObserverShape91S0100000_2_I0(this, 1);
        this.A00 = iDxAObserverShape91S0100000_2_I0;
        AnonymousClass504 r0 = new AnonymousClass504(this);
        this.A03 = r0;
        r5.A02(r0);
        r3.A02(iDxAObserverShape91S0100000_2_I0);
    }

    public void A04() {
        this.A04.A03(this.A03);
        this.A01.A03(this.A00);
    }

    public final void A05(int i2) {
        this.A06.AKU((AnonymousClass2St) null, 1, Integer.valueOf(i2), "business_hub", (String) null);
    }

    public final void A06(boolean z2) {
        this.A08.Aco(new RunnableRunnableShape0S0110000_I0(this, 23, z2));
    }
}
