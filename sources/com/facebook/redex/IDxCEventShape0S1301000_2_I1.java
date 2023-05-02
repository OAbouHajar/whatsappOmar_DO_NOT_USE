package com.facebook.redex;

import X.AnonymousClass39U;
import X.C52412dl;
import java.util.Map;

public class IDxCEventShape0S1301000_2_I1 implements C52412dl {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public IDxCEventShape0S1301000_2_I1(AnonymousClass39U r1, String str, Map map, Map map2, int i2, int i3) {
        this.A05 = i3;
        this.A01 = r1;
        this.A04 = str;
        this.A00 = i2;
        this.A02 = map;
        this.A03 = map2;
    }

    public final void AQk(Object obj) {
        AnonymousClass39U r1 = (AnonymousClass39U) this.A01;
        String str = this.A04;
        int i2 = this.A00;
        r1.A00(r1.A00.ADp(str, r1.A02, (Map) this.A02, (Map) this.A03, i2), str);
    }
}
