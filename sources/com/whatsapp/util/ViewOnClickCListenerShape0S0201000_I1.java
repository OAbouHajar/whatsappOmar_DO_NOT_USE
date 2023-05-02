package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass01Q;
import X.AnonymousClass09N;
import X.AnonymousClass2Uj;
import X.AnonymousClass39F;
import X.AnonymousClass4HL;
import X.AnonymousClass4HM;
import X.C000900k;
import X.C16730tY;
import X.C19980zJ;
import X.C31241dn;
import X.C34151jm;
import X.C34331k5;
import X.C455529g;
import X.C57062q2;
import X.C64933Sf;
import X.C84784Lw;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class ViewOnClickCListenerShape0S0201000_I1 extends C34331k5 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape0S0201000_I1(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i2;
    }

    public void A06(View view) {
        Bundle A032;
        switch (this.A03) {
            case 0:
                AnonymousClass4HM r4 = (AnonymousClass4HM) this.A01;
                C84784Lw r3 = r4.A01;
                r3.A01 = 2;
                r3.A02 = new AnonymousClass4HL((C31241dn) this.A02, this.A00);
                r4.A00.A09(r3);
                return;
            case 1:
                AnonymousClass39F r9 = (AnonymousClass39F) this.A01;
                AnonymousClass2Uj r8 = r9.A06;
                Intent A1O = r8.A1O();
                C000900k r32 = (C000900k) C19980zJ.A01(r8.getContext(), C000900k.class);
                if (!C455529g.A00) {
                    A032 = null;
                } else {
                    ArrayList A0u = AnonymousClass000.A0u();
                    int i2 = this.A00;
                    if (i2 < 3 || r8.A05.size() == 4) {
                        A1O.putExtra("start_index", i2);
                        r9.A01((C16730tY) r8.A05.get(i2), A0u);
                    } else {
                        int i3 = 0;
                        do {
                            ((AnonymousClass39F) r8.A0F.get(i3)).A01((C16730tY) r8.A05.get(i3), A0u);
                            i3++;
                        } while (i3 < 3);
                    }
                    A032 = AnonymousClass09N.A02(r32, (AnonymousClass01Q[]) A0u.toArray(new AnonymousClass01Q[0])).A03();
                    r32.A0j(new C57062q2(r32, this));
                }
                r32.startActivity(A1O, A032);
                return;
            default:
                C64933Sf r0 = (C64933Sf) this.A01;
                r0.A06.AXt((C34151jm) this.A02, r0.A08, this.A00);
                return;
        }
    }
}
