package com.whatsapp.util;

import X.AnonymousClass4XO;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C118535uq;
import X.C118985vj;
import X.C14870pt;
import X.C16040sK;
import X.C16300so;
import X.C16320sq;
import X.C16690tT;
import X.C16980tz;
import X.C17190ug;
import X.C18280wR;
import X.C18300wT;
import X.C18310wU;
import X.C18340wX;
import X.C18490wm;
import X.C224918d;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

public class IDxATaskShape1S1100000_3_I1 extends C16690tT {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxATaskShape1S1100000_3_I1(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str, int i2) {
        this.A02 = i2;
        this.A00 = indiaUpiDeviceBindStepActivity;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this.A00;
        if (indiaUpiDeviceBindStepActivity.A0D.A07.contains("upi-get-challenge") || indiaUpiDeviceBindStepActivity.A0C.A06().A00 != null) {
            return null;
        }
        indiaUpiDeviceBindStepActivity.A0D.A03("upi-get-challenge");
        C16980tz r15 = indiaUpiDeviceBindStepActivity.A07;
        C14870pt r14 = indiaUpiDeviceBindStepActivity.A05;
        C16300so r13 = indiaUpiDeviceBindStepActivity.A03;
        C16040sK r12 = indiaUpiDeviceBindStepActivity.A01;
        C16320sq r11 = indiaUpiDeviceBindStepActivity.A05;
        AnonymousClass4XO r10 = indiaUpiDeviceBindStepActivity.A0D;
        C17190ug r9 = indiaUpiDeviceBindStepActivity.A0H;
        C18280wR r8 = indiaUpiDeviceBindStepActivity.A0P;
        C18300wT r7 = indiaUpiDeviceBindStepActivity.A0D;
        C118985vj r6 = indiaUpiDeviceBindStepActivity.A0Y;
        C18310wU r5 = indiaUpiDeviceBindStepActivity.A0M;
        C224918d r4 = indiaUpiDeviceBindStepActivity.A0E;
        C18490wm r3 = indiaUpiDeviceBindStepActivity.A0L;
        AnonymousClass61W r2 = indiaUpiDeviceBindStepActivity.A0E;
        C18340wX r1 = indiaUpiDeviceBindStepActivity.A0K;
        C18310wU r28 = r5;
        C224918d r29 = r4;
        C18490wm r26 = r3;
        C18300wT r27 = r7;
        C18340wX r24 = r1;
        AnonymousClass4XO r25 = r10;
        AnonymousClass60V r22 = indiaUpiDeviceBindStepActivity.A0C;
        C17190ug r21 = r9;
        C16980tz r20 = r15;
        C16040sK r19 = r12;
        C14870pt r18 = r14;
        C16300so r17 = r13;
        new C118535uq(r17, r18, r19, r20, r21, r22, IndiaUpiDeviceBindStepActivity.A0f, r24, r25, r26, r27, r28, r29, r2, r8, r11, r6).A00();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        ((IndiaUpiDeviceBindStepActivity) this.A00).A3d(this.A01);
    }
}
