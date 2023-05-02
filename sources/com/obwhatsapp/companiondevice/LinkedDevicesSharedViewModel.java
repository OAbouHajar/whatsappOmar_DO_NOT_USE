package com.obwhatsapp.companiondevice;

import X.AnonymousClass027;
import X.AnonymousClass02H;
import X.AnonymousClass113;
import X.AnonymousClass16S;
import X.AnonymousClass19E;
import X.AnonymousClass1RS;
import X.AnonymousClass1WC;
import X.AnonymousClass1WE;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15910s6;
import X.C16320sq;
import X.C16620tM;
import X.C18000vz;
import X.C18260wP;
import X.C18930xU;
import X.C19020xd;
import X.C19410yO;
import X.C30801cy;
import X.C809946k;
import android.app.Application;
import com.facebook.redex.IDxCObserverShape305S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0;

public class LinkedDevicesSharedViewModel extends AnonymousClass02H {
    public int A00;
    public Boolean A01;
    public Runnable A02;
    public boolean A03;
    public final Application A04;
    public final AnonymousClass027 A05 = new AnonymousClass027();
    public final C14870pt A06;
    public final C15900s5 A07;
    public final C18930xU A08;
    public final AnonymousClass19E A09;
    public final C18000vz A0A = new IDxCObserverShape305S0100000_2_I0(this, 0);
    public final C18260wP A0B;
    public final C15860rz A0C;
    public final AnonymousClass1WC A0D = new IDxDObserverShape76S0100000_1_I0(this, 0);
    public final C19410yO A0E;
    public final C19020xd A0F;
    public final C809946k A0G;
    public final AnonymousClass1RS A0H;
    public final C14710pd A0I;
    public final AnonymousClass113 A0J;
    public final AnonymousClass16S A0K;
    public final C30801cy A0L = new C30801cy();
    public final C30801cy A0M = new C30801cy();
    public final C30801cy A0N = new C30801cy();
    public final C30801cy A0O = new C30801cy();
    public final C30801cy A0P = new C30801cy();
    public final C30801cy A0Q = new C30801cy();
    public final C30801cy A0R = new C30801cy();
    public final C30801cy A0S = new C30801cy();
    public final C30801cy A0T = new C30801cy();
    public final C30801cy A0U = new C30801cy();
    public final C16320sq A0V;
    public final AnonymousClass1WE A0W = new IDxNConsumerShape153S0100000_2_I0(this, 0);

    public LinkedDevicesSharedViewModel(Application application, C14870pt r4, C15900s5 r5, C18930xU r6, AnonymousClass19E r7, C18260wP r8, C15860rz r9, C19410yO r10, C19020xd r11, C809946k r12, AnonymousClass1RS r13, C14710pd r14, AnonymousClass113 r15, AnonymousClass16S r16, C16320sq r17) {
        super(application);
        this.A0I = r14;
        this.A06 = r4;
        this.A0V = r17;
        this.A04 = application;
        this.A07 = r5;
        this.A09 = r7;
        this.A0C = r9;
        this.A0K = r16;
        this.A0B = r8;
        this.A0E = r10;
        this.A0J = r15;
        this.A0H = r13;
        this.A08 = r6;
        this.A0F = r11;
        this.A0G = r12;
    }

    public void A05(boolean z2) {
        C30801cy r1;
        Integer num;
        if (!this.A0B.A0A()) {
            boolean A022 = C18260wP.A02(this.A04);
            r1 = this.A0M;
            int i2 = R.string.str0dc2;
            if (A022) {
                i2 = R.string.str0dc3;
            }
            num = Integer.valueOf(i2);
        } else {
            r1 = (!this.A07.A05(C15910s6.A0V) || !z2) ? (this.A00 != 1 || !this.A0I.A0E(C16620tM.A02, 2734)) ? this.A0S : this.A0R : this.A0Q;
            num = null;
        }
        r1.A0B(num);
    }
}
