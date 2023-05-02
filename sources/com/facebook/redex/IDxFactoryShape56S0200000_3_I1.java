package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass1MA;
import X.C003401n;
import X.C013806q;
import X.C013906r;
import X.C110725ej;
import X.C114095n7;
import X.C114105n8;
import X.C114205nI;
import X.C116715rp;
import X.C117755tV;
import X.C117765tW;
import X.C117795tZ;
import X.C1222969a;
import X.C14710pd;
import X.C14860ps;
import X.C16320sq;
import X.C16440t3;
import X.C16600tK;
import X.C18030w2;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C221116r;
import X.C227719f;
import android.net.Uri;
import com.obwhatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.obwhatsapp.payments.ui.ViralityLinkVerifierActivity;

public class IDxFactoryShape56S0200000_3_I1 implements AnonymousClass04o {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFactoryShape56S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public C003401n A6s(Class cls) {
        switch (this.A02) {
            case 0:
                Class cls2 = cls;
                if (cls2.equals(C110725ej.class)) {
                    Uri uri = (Uri) this.A01;
                    ViralityLinkVerifierActivity viralityLinkVerifierActivity = (ViralityLinkVerifierActivity) this.A00;
                    C16440t3 r7 = viralityLinkVerifierActivity.A05;
                    C117795tZ r25 = viralityLinkVerifierActivity instanceof BrazilViralityLinkVerifierActivity ? new C114205nI() : new C117795tZ();
                    C18280wR r6 = viralityLinkVerifierActivity.A0E;
                    C18290wS r5 = viralityLinkVerifierActivity.A0C;
                    C16600tK r4 = viralityLinkVerifierActivity.A08;
                    C18300wT r3 = viralityLinkVerifierActivity.A09;
                    C18290wS r24 = r5;
                    return new C110725ej(uri, r4, viralityLinkVerifierActivity.A07, r7, r3, viralityLinkVerifierActivity.A0A, viralityLinkVerifierActivity.A0B, r24, r25, r6);
                }
                throw AnonymousClass000.A0T(AnonymousClass000.A0g("Not aware about view model :", cls2));
            case 1:
                C117755tV r0 = (C117755tV) this.A00;
                C16440t3 r8 = r0.A0A;
                C14710pd r72 = r0.A0J;
                AnonymousClass013 r62 = r0.A0C;
                return new C114095n7(r0.A03, r8, r62, r0.A0I, r72, r0.A0R, r0.A0W, (C1222969a) this.A01, r0.A0b);
            default:
                C117765tW r02 = (C117765tW) this.A00;
                C16440t3 r15 = r02.A0A;
                C14710pd r14 = r02.A0L;
                C16320sq r13 = r02.A0o;
                AnonymousClass013 r12 = r02.A0E;
                C18030w2 r11 = r02.A0K;
                C18290wS r10 = r02.A0Z;
                C18300wT r9 = r02.A0U;
                AnonymousClass175 r82 = r02.A0S;
                C14860ps r73 = r02.A0n;
                AnonymousClass173 r52 = r02.A0I;
                C116715rp r42 = r02.A0e;
                C221116r r32 = r02.A0H;
                AnonymousClass1MA r2 = r02.A0a;
                C227719f r1 = r02.A0g;
                return new C114105n8(r15, r12, r32, r52, r11, r14, r02.A0Q, r82, r9, r10, r2, (C1222969a) this.A01, r42, r1, r73, r13);
        }
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
