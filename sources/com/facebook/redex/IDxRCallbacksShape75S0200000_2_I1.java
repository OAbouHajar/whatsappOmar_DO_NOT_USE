package com.facebook.redex;

import X.AnonymousClass14O;
import X.AnonymousClass14R;
import X.AnonymousClass1I5;
import X.AnonymousClass22J;
import X.AnonymousClass2JT;
import X.AnonymousClass2JU;
import X.AnonymousClass2JV;
import X.AnonymousClass47J;
import X.AnonymousClass5FQ;
import X.C13680ns;
import X.C18450wi;
import X.C19750yw;
import X.C448025p;
import X.C77833wf;
import X.C77863wi;
import java.io.IOException;
import org.json.JSONObject;

public class IDxRCallbacksShape75S0200000_2_I1 implements C448025p {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbacksShape75S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A5s(AnonymousClass2JT r6) {
        if (this.A02 != 0) {
            C19750yw r3 = (C19750yw) this.A00;
            AnonymousClass2JU r2 = (AnonymousClass2JU) this.A01;
            AnonymousClass1I5 r1 = (AnonymousClass1I5) r6.A02;
            if (r6.A00 == 0) {
                try {
                    AnonymousClass2JV A012 = r1.A01((JSONObject) r1.A00);
                    r3.A02(A012);
                    r2.AYA(A012);
                } catch (Exception unused) {
                    r3.A01(r6, r2);
                }
            } else {
                r3.A01(r6, r2);
            }
        } else {
            C18450wi.A0H(r6, 0);
            AnonymousClass5FQ r4 = new AnonymousClass5FQ((AnonymousClass22J) this.A00);
            AnonymousClass14R r32 = r6.A03;
            C18450wi.A0B(r32);
            AnonymousClass14O r22 = r6.A02;
            C18450wi.A0B(r22);
            if (r6.A00 == 0) {
                Object obj = r22.A00;
                if (obj != null) {
                    ((AnonymousClass22J) this.A01).AIU(obj);
                    return;
                }
                return;
            }
            Object A002 = r32.A00((Object) null);
            if ((A002 instanceof AnonymousClass47J) && A002 != null) {
                r4.AIU(A002);
            }
        }
    }

    public void APZ(IOException iOException) {
        if (this.A02 != 0) {
            ((AnonymousClass2JU) this.A01).AQv(C13680ns.A0Z());
            return;
        }
        C18450wi.A0H(iOException, 0);
        ((AnonymousClass22J) this.A00).AIU(new C77833wf(iOException));
    }

    public void AQa(Exception exc) {
        if (this.A02 != 0) {
            ((AnonymousClass2JU) this.A01).AQv(C13680ns.A0Z());
            return;
        }
        C18450wi.A0H(exc, 0);
        ((AnonymousClass22J) this.A00).AIU(new C77863wi(exc));
    }
}
