package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1W9;
import X.AnonymousClass5xI;
import X.AnonymousClass67N;
import X.C110105dW;
import X.C110725ej;
import X.C117305sm;
import X.C13680ns;
import X.C19550yc;
import X.C28371Vv;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import java.util.concurrent.TimeUnit;

public class IDxRCallbackShape232S0100000_3_I1 implements C19550yc {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape232S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void APb(String str) {
        if (this.A01 != 0) {
            ((C110725ej) this.A00).A01.A09(AnonymousClass5xI.A02(new C117305sm(R.string.str1a29, R.string.str1a28, R.string.str0394, 0), new AnonymousClass67N(0, "No Internet!")));
        }
    }

    public void AQe(C28371Vv r6, String str) {
        if (this.A01 != 0) {
            try {
                C28371Vv A0J = r6.A0J("error");
                AnonymousClass00B.A07(A0J, AnonymousClass000.A0h(" not found!", AnonymousClass000.A0q("error")));
                int A0A = A0J.A0A("code", 500);
                ((C110725ej) this.A00).A06(new AnonymousClass67N(A0A, A0J.A0N("text", "Unknown!")), A0A);
            } catch (AnonymousClass1W9 | NullPointerException e2) {
                ((C110725ej) this.A00).A06(e2, 500);
            }
        }
    }

    public void AYG(C28371Vv r12, String str) {
        if (this.A01 != 0) {
            try {
                C28371Vv A0J = r12.A0J("account");
                AnonymousClass00B.A07(A0J, AnonymousClass000.A0h(" not found!", AnonymousClass000.A0q("account")));
                C28371Vv A0J2 = A0J.A0J(FacebookFacade.RequestParameter.LINK);
                AnonymousClass00B.A07(A0J2, AnonymousClass000.A0h(" not found!", AnonymousClass000.A0q(FacebookFacade.RequestParameter.LINK)));
                int A0A = A0J2.A0A("status", 0);
                int A0A2 = A0J2.A0A("redirection_type", 0);
                C110725ej r8 = (C110725ej) this.A00;
                if (A0A == 1) {
                    if (A0A2 != 0) {
                        if (A0A2 == 1) {
                            r8.A05.A0C(2, r8.A04.A00() + TimeUnit.DAYS.toMillis(1));
                        } else if (A0A2 == 2) {
                            r8.A05.A0C(1, r8.A04.A00() + TimeUnit.DAYS.toMillis(1));
                        }
                        r8.A01.A09(AnonymousClass5xI.A01(new C117305sm(R.string.str1a21, R.string.str1a20, R.string.str072c, A0A2)));
                        return;
                    }
                    r8.A05.A0C(0, r8.A04.A00() + TimeUnit.DAYS.toMillis(1));
                    C110105dW.A1O("ViralityLinkViewModel", "postSuccessResult: unsupported redirection type");
                    r8.A01.A09(AnonymousClass5xI.A01(new C117305sm(R.string.str1a21, R.string.str1a20, R.string.str072c, A0A2)));
                    return;
                }
                r8.A06(AnonymousClass000.A0T(C13680ns.A0c(A0A, "Status is ")), 500);
            } catch (AnonymousClass1W9 | NullPointerException e2) {
                ((C110725ej) this.A00).A06(e2, 500);
            }
        }
    }
}
