package com.facebook.redex;

import X.AnonymousClass67K;
import X.C117315sn;
import X.C117735tT;
import X.C1221568m;
import X.C15830rv;
import X.C16840tj;
import android.view.KeyEvent;
import android.view.View;
import org.npci.commonlibrary.GetCredential;
import org.npci.commonlibrary.NPCIFragment;
import org.npci.commonlibrary.widget.Keypad;

public class IDxCListenerShape19S0101000_3_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape19S0101000_3_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void onClick(View view) {
        NPCIFragment nPCIFragment;
        if (this.A02 != 0) {
            C1221568m r1 = ((Keypad) this.A01).A04;
            if (r1 != null) {
                int i2 = this.A00 + 7;
                GetCredential getCredential = ((AnonymousClass67K) r1).A00;
                getCredential.dispatchKeyEvent(new KeyEvent(0, i2));
                if (i2 == 66 && (nPCIFragment = getCredential.A0D) != null) {
                    nPCIFragment.A1A();
                    return;
                }
                return;
            }
            return;
        }
        C117735tT r2 = (C117735tT) this.A01;
        int i3 = this.A00;
        C16840tj r7 = r2.A07;
        C15830rv r5 = r2.A05;
        r2.A06.AOP(r2.A04, r5, (C117315sn) r2.A0H.get(Integer.valueOf(i3)), r7, r2.A0G);
    }
}
