package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass107;
import X.AnonymousClass160;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass17Y;
import X.AnonymousClass1GO;
import X.AnonymousClass1MA;
import X.AnonymousClass1ME;
import X.AnonymousClass5wT;
import X.AnonymousClass61W;
import X.C001200n;
import X.C003401n;
import X.C014206u;
import X.C110745el;
import X.C110755em;
import X.C117745tU;
import X.C117765tW;
import X.C1204661t;
import X.C1222969a;
import X.C14870pt;
import X.C16000sG;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16980tz;
import X.C17150uc;
import X.C17630vO;
import X.C18090w8;
import X.C18290wS;
import X.C18300wT;
import X.C218315p;
import X.C221116r;
import android.os.Bundle;

public class IDxIFactoryShape1S0300000_3_I1 extends C014206u {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxIFactoryShape1S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public C003401n A6s(Class cls) {
        Class cls2 = cls;
        if (this.A03 != 0) {
            if (cls2.isAssignableFrom(C110755em.class)) {
                C117745tU r1 = (C117745tU) this.A00;
                C16440t3 r29 = r1.A07;
                C14870pt r25 = r1.A00;
                C16040sK r21 = r1.A01;
                C16980tz r26 = r1.A08;
                C16320sq r20 = r1.A0R;
                AnonymousClass160 r19 = r1.A0E;
                C218315p r18 = r1.A0Q;
                C16000sG r23 = r1.A05;
                AnonymousClass01V r24 = r1.A06;
                AnonymousClass013 r27 = r1.A09;
                C18290wS r17 = r1.A0L;
                AnonymousClass01Y r22 = r1.A04;
                C16460t6 r28 = r1.A0A;
                AnonymousClass1ME r15 = r1.A03;
                C18300wT r14 = r1.A0I;
                AnonymousClass5wT r13 = r1.A0O;
                AnonymousClass175 r12 = r1.A0H;
                C17630vO r11 = r1.A0B;
                C18090w8 r10 = r1.A0K;
                AnonymousClass173 r9 = r1.A0D;
                C17150uc r8 = r1.A02;
                C1204661t r7 = r1.A0F;
                AnonymousClass1GO r5 = r1.A0N;
                C221116r r4 = r1.A0C;
                AnonymousClass1MA r3 = r1.A0M;
                AnonymousClass17Y r2 = r1.A0J;
                AnonymousClass107 r16 = r1.A0G;
                C218315p r44 = r18;
                C16320sq r45 = r20;
                return new C110755em((Bundle) this.A01, r25, r21, r8, r15, r22, r23, r24, r29, r26, r27, r28, r11, r4, r9, r19, r7, r16, r12, r14, r2, r10, r17, r3, (C1222969a) this.A02, r5, r13, r44, r45);
            }
        } else if (cls2.isAssignableFrom(C110745el.class)) {
            C117765tW r110 = (C117765tW) this.A00;
            C16980tz r42 = r110.A0B;
            C14870pt r32 = r110.A01;
            C16320sq r210 = r110.A0o;
            return new C110745el((C001200n) this.A01, r32, r42, r110.A0H, (AnonymousClass61W) this.A02, r210);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
