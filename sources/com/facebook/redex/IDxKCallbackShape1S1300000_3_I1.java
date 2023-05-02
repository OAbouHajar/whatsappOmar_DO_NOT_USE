package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass50C;
import X.AnonymousClass5u7;
import X.AnonymousClass5wX;
import X.AnonymousClass692;
import X.AnonymousClass69R;
import X.C114195nH;
import X.C117535t9;
import X.C117915tl;
import X.C118345uX;
import X.C1223569g;
import X.C28371Vv;

public class IDxKCallbackShape1S1300000_3_I1 implements AnonymousClass692 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxKCallbackShape1S1300000_3_I1(int i2, String str, Object obj, Object obj2, Object obj3) {
        this.A04 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj3;
    }

    public void AVP(AnonymousClass2HJ r3) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass5u7) this.A02).A00(r3);
                return;
            case 1:
                C1223569g r1 = (C1223569g) this.A01;
                Integer num = (Integer) this.A02;
                r1.AKW(r3, num);
                r1.AQX(r3, num);
                return;
            default:
                ((C118345uX) this.A02).A00(r3);
                return;
        }
    }

    public void AVQ(AnonymousClass50C r9) {
        switch (this.A04) {
            case 0:
                C117535t9 r4 = (C117535t9) this.A00;
                Object obj = this.A01;
                C117915tl r5 = new C117915tl(r9);
                r4.A03.A00(new IDxTCallbackShape11S0400000_3_I1(obj, r4, r5, this.A02, 0), r5, this.A03);
                return;
            case 1:
                AnonymousClass69R r3 = (AnonymousClass69R) this.A01;
                Integer num = (Integer) this.A02;
                r3.AKX(num);
                AnonymousClass5wX r42 = (AnonymousClass5wX) this.A00;
                C117915tl r52 = new C117915tl(r9);
                r42.A0F.A00(new IDxTCallbackShape11S0400000_3_I1(r3, r42, r52, num, 1), r52, this.A03);
                return;
            default:
                String str = this.A03;
                ((C114195nH) this.A00).A09(r9, (C118345uX) this.A02, (C28371Vv) this.A01, str);
                return;
        }
    }
}
