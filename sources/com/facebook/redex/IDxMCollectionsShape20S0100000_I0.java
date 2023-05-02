package com.facebook.redex;

import X.AnonymousClass00N;
import X.AnonymousClass00O;
import X.AnonymousClass05D;
import X.C003001i;
import java.util.Map;

public class IDxMCollectionsShape20S0100000_I0 extends AnonymousClass05D {
    public Object A00;
    public final int A01;

    public IDxMCollectionsShape20S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public int A01() {
        int i2 = this.A01;
        Object obj = this.A00;
        return i2 != 0 ? ((C003001i) obj).A00 : ((AnonymousClass00O) obj).A00;
    }

    public int A02(Object obj) {
        if (this.A01 == 0) {
            return ((AnonymousClass00O) this.A00).A03(obj);
        }
        C003001i r1 = (C003001i) this.A00;
        return obj == null ? r1.A01() : r1.A02(obj, obj.hashCode());
    }

    public Object A03(int i2, int i3) {
        int i4 = this.A01;
        Object obj = this.A00;
        return i4 != 0 ? ((C003001i) obj).A03[i2] : ((AnonymousClass00O) obj).A02[(i2 << 1) + i3];
    }

    public Object A04(int i2, Object obj) {
        if (this.A01 != 0) {
            throw new UnsupportedOperationException("not a map");
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = ((AnonymousClass00O) this.A00).A02;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public Map A05() {
        if (this.A01 == 0) {
            return (AnonymousClass00N) this.A00;
        }
        throw new UnsupportedOperationException("not a map");
    }

    public void A06() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((C003001i) obj).clear();
        } else {
            ((AnonymousClass00O) obj).clear();
        }
    }

    public void A07(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            ((C003001i) obj).A03(i2);
        } else {
            ((AnonymousClass00O) obj).A06(i2);
        }
    }
}
