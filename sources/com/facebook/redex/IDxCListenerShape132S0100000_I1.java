package com.facebook.redex;

import X.AnonymousClass0A2;
import X.AnonymousClass0Q0;
import X.AnonymousClass0QZ;
import X.C04560Na;
import X.C06490Wi;
import X.C08930ed;
import X.C14930q1;
import X.C14940q2;
import X.C14990q7;
import X.C29701b3;
import X.C31201dg;
import android.os.Message;
import android.view.View;

public class IDxCListenerShape132S0100000_I1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape132S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A00(IDxCListenerShape132S0100000_I1 iDxCListenerShape132S0100000_I1) {
        C08930ed r1 = (C08930ed) iDxCListenerShape132S0100000_I1.A00;
        C31201dg r4 = r1.A01;
        C14930q1 r3 = r1.A02;
        C14940q2 r2 = new C14940q2();
        r2.A03(r4, 0);
        C14990q7 r12 = r1.A00;
        r2.A03(r12, 1);
        C29701b3.A01(r12, r4, r2.A01(), r3);
    }

    public void onClick(View view) {
        Message message;
        Message obtain;
        C04560Na r0;
        switch (this.A01) {
            case 0:
                C06490Wi r3 = (C06490Wi) this.A00;
                if (((view == r3.A0G && (message = r3.A0B) != null) || ((view == r3.A0E && (message = r3.A09) != null) || (view == r3.A0F && (message = r3.A0A) != null))) && (obtain = Message.obtain(message)) != null) {
                    obtain.sendToTarget();
                }
                r3.A08.obtainMessage(1, r3.A0W).sendToTarget();
                return;
            case 1:
                r0 = ((AnonymousClass0Q0) this.A00).A04;
                break;
            case 2:
                r0 = ((AnonymousClass0QZ) this.A00).A03;
                break;
            default:
                A00(this);
                return;
        }
        AnonymousClass0A2 r02 = r0.A00.A05;
        if (r02 != null) {
            r02.dismiss();
        }
    }
}
