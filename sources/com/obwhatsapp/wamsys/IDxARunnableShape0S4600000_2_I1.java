package com.obwhatsapp.wamsys;

import X.AnonymousClass1S0;
import X.AnonymousClass1SU;
import X.C31591ei;
import com.facebook.msys.wci.IDxRListenerShape40S0100000_1_I0;
import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

public class IDxARunnableShape0S4600000_2_I1 extends C31591ei {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final int A0A;

    public IDxARunnableShape0S4600000_2_I1(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, String str4, List list, Map map, byte[] bArr, byte[] bArr2, int i2) {
        this.A0A = i2;
        this.A00 = r2;
        this.A05 = r1;
        switch (i2) {
            case 0:
            case 1:
                this.A07 = str;
                this.A08 = str2;
                this.A04 = bArr;
                this.A02 = bArr2;
                this.A09 = str3;
                break;
            default:
                this.A09 = str;
                this.A07 = str2;
                this.A08 = str3;
                this.A04 = bArr;
                this.A02 = bArr2;
                break;
        }
        this.A06 = str4;
        this.A01 = map;
        this.A03 = list;
    }

    public void A01() {
        switch (this.A0A) {
            case 0:
                IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I1 = new IDxRListenerShape42S0100000_2_I1(this, 0);
                String str = this.A07;
                String str2 = this.A08;
                Object obj = this.A04;
                Object obj2 = this.A02;
                JniBridge.jvidispatchIOOOOOOOOO(2, str, str2, this.A09, this.A06, this.A03, iDxRListenerShape42S0100000_2_I1, obj, obj2, this.A01);
                return;
            case 1:
                IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I12 = new IDxRListenerShape42S0100000_2_I1(this, 1);
                String str3 = this.A07;
                String str4 = this.A08;
                Object obj3 = this.A04;
                Object obj4 = this.A02;
                JniBridge.jvidispatchIOOOOOOOOO(3, str3, str4, this.A09, this.A06, this.A03, iDxRListenerShape42S0100000_2_I12, obj3, obj4, this.A01);
                return;
            default:
                IDxRListenerShape40S0100000_1_I0 iDxRListenerShape40S0100000_1_I0 = new IDxRListenerShape40S0100000_1_I0(this, 1);
                String str5 = this.A09;
                String str6 = this.A07;
                String str7 = this.A08;
                Object obj5 = this.A04;
                Object obj6 = this.A02;
                JniBridge.jvidispatchIOOOOOOOOO(1, str5, str6, str7, this.A06, this.A03, iDxRListenerShape40S0100000_1_I0, obj5, obj6, this.A01);
                return;
        }
    }
}
