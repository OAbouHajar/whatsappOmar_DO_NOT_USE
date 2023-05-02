package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass4MO;
import X.C16730tY;
import X.C16750ta;
import X.C27711Sv;
import X.C30921dB;
import X.C47512Jh;

public class IDxMModifierShape235S0100000_2_I1 implements C47512Jh {
    public Object A00;
    public final int A01;

    public IDxMModifierShape235S0100000_2_I1(C27711Sv r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final boolean A56(C16750ta r7, C16730tY r8, Object obj) {
        long j2;
        switch (this.A01) {
            case 0:
                j2 = (long) AnonymousClass000.A0D(obj);
                break;
            case 1:
                r7.A0I = (String) obj;
                return true;
            case 2:
                AnonymousClass4MO r9 = (AnonymousClass4MO) obj;
                r7.A0F = r9.A01;
                r8.A07 = r9.A02;
                r8.A01 = r9.A00;
                if (r8.A0F() == null) {
                    return true;
                }
                r8.A0F().A02(r9.A03);
                return true;
            case 3:
                if (C30921dB.A01(((C27711Sv) this.A00).A00, r8)) {
                    r8.A0W(13);
                    r7.A0P = true;
                } else {
                    r8.A0W(1);
                }
                r7.A0Z = true;
                r7.A0C = 0;
                r7.A0L = true;
                return true;
            case 4:
                if (!C30921dB.A01(((C27711Sv) this.A00).A00, r8)) {
                    r8.A0W(1);
                }
                r7.A0Z = true;
                j2 = 0;
                break;
            default:
                Number number = (Number) obj;
                boolean z2 = false;
                if (r8.A10 != 1) {
                    long j3 = r7.A0C;
                    long intValue = (long) number.intValue();
                    if (j3 != intValue) {
                        z2 = true;
                    }
                    r7.A0C = intValue;
                }
                return z2;
        }
        r7.A0C = j2;
        return true;
    }
}
