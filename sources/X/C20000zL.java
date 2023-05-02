package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.0zL  reason: invalid class name and case insensitive filesystem */
public final class C20000zL extends C20010zM {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final AnonymousClass01V A04;
    public final AnonymousClass013 A05;
    public final C19990zK A06;
    public final C19830z4 A07;
    public final C17020u3 A08;

    public C20000zL(C14870pt r2, C16040sK r3, C16000sG r4, C16080sP r5, AnonymousClass01V r6, AnonymousClass013 r7, C19990zK r8, C19830z4 r9, C17020u3 r10) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r7, 5);
        C18450wi.A0H(r6, 6);
        C18450wi.A0H(r5, 7);
        C18450wi.A0H(r10, 8);
        this.A00 = r2;
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A08 = r10;
        this.A07 = r9;
    }

    public boolean A01(Map map) {
        String A13;
        C18450wi.A0H(map, 0);
        Collection<C16740tZ> values = map.values();
        if (values == null || !values.isEmpty()) {
            for (C16740tZ r2 : values) {
                byte b2 = r2.A10;
                if (b2 == 0) {
                    r2.A0I();
                    if (!TextUtils.isEmpty(r2.A0I())) {
                        continue;
                    }
                }
                if (r2 instanceof C16730tY) {
                    if (r2 instanceof C38631rA) {
                        A13 = ((C38631rA) r2).A01;
                    } else if ((r2 instanceof C38681rF) || (r2 instanceof C38711rI) || (r2 instanceof C38801rR)) {
                        A13 = ((C16730tY) r2).A13();
                    }
                    if (!TextUtils.isEmpty(A13)) {
                        continue;
                    }
                }
                if (!(b2 == 27 || b2 == 32 || b2 == 45 || b2 == 46 || b2 == 52 || b2 == 23 || b2 == 54 || b2 == 55 || C38621r6.A0n(r2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
