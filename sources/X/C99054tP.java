package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.4tP  reason: invalid class name and case insensitive filesystem */
public final class C99054tP implements AnonymousClass5OI, Serializable {
    public final int expectedValuesPerKey = 2;

    public C99054tP(int i2) {
        C29011Zs.checkNonnegative(2, "expectedValuesPerKey");
    }

    public List get() {
        return C13690nt.A0i(this.expectedValuesPerKey);
    }
}
