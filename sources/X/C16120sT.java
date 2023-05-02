package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0sT  reason: invalid class name and case insensitive filesystem */
public final class C16120sT {
    public final C18910xS A00;
    public final C15810rt A01;
    public final C16130sU A02;

    public C16120sT(C18910xS r2, C15810rt r3, C16130sU r4) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final Map A00(List list) {
        List A0C = C003101j.A0C(C003101j.A0D(list, new IDxComparatorShape19S0000000_2_I0(26)), 50);
        C18450wi.A0H(A0C, 0);
        AnonymousClass558 r2 = new AnonymousClass558(new C106585Ek(A0C));
        int A07 = C25421Js.A07(AnonymousClass1J9.A0M(r2, 10));
        if (A07 < 16) {
            A07 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A07);
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            C87194Vu r22 = (C87194Vu) it.next();
            linkedHashMap.put(((C15840rx) r22.A01).A05(), Integer.valueOf(r22.A00));
        }
        return linkedHashMap;
    }
}
