package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.19F  reason: invalid class name */
public class AnonymousClass19F extends C20380zx {
    public final AnonymousClass19D A00;
    public final AnonymousClass19E A01;
    public final AnonymousClass17Z A02;
    public final C16440t3 A03;
    public final C16920ts A04;
    public final C15810rt A05;
    public final C20360zv A06;
    public final C16220sf A07;

    public AnonymousClass19F(AnonymousClass19D r1, AnonymousClass19E r2, AnonymousClass17Z r3, C16440t3 r4, C16920ts r5, C15810rt r6, C20360zv r7, C16220sf r8) {
        super(r7);
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
    }

    public final void A0A(List list) {
        C15840rx A062;
        List<AnonymousClass1WJ> A09 = this.A06.A09("pin_v1", false);
        HashMap hashMap = new HashMap();
        for (AnonymousClass1WJ r1 : A09) {
            hashMap.put(r1.A03(), r1);
        }
        List<AnonymousClass1WJ> list2 = list;
        for (AnonymousClass1WJ r12 : list2) {
            hashMap.put(r12.A03(), r12);
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C37211on) it.next()).A01) {
                it.remove();
            }
        }
        Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(14));
        List<C37211on> subList = arrayList.subList(0, Math.min(arrayList.size(), 3));
        C16220sf r3 = this.A07;
        Set<C15830rv> A0A = r3.A0A();
        for (C15830rv r8 : A0A) {
            Iterator it2 = subList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C37211on) it2.next()).A00 == r8) {
                        break;
                    }
                } else {
                    this.A01.A06(2);
                    r3.A08(r8, 0, false);
                    break;
                }
            }
        }
        for (C37211on r13 : subList) {
            C15830rv r132 = r13.A00;
            if (!A0A.contains(r132)) {
                long j2 = r13.A04;
                boolean z2 = false;
                if (j2 > 0) {
                    z2 = true;
                }
                AnonymousClass00B.A0B("Pinned time should be strictly positive", z2);
                r3.A08(r132, j2, true);
                C15810rt r14 = this.A05;
                if (r14.A0F(r132) && (A062 = r14.A06(r132)) != null && A062.A0e) {
                    Log.i("PinChatHandler/setArchive - false");
                    A062.A0e = false;
                    this.A04.A0A(A062);
                    this.A02.A00();
                    this.A00.A0F(Collections.singleton(new C37191ol(this.A00.A04(r132, false), r132, j2, false)));
                }
            }
        }
        list2.retainAll(subList);
    }
}
