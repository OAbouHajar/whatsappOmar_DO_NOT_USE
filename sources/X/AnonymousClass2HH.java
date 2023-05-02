package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2HH  reason: invalid class name */
public abstract class AnonymousClass2HH extends C16690tT {
    public final AnonymousClass2HF A00;
    public final AnonymousClass160 A01;
    public final AnonymousClass1GR A02;
    public final C16320sq A03;

    public AnonymousClass2HH(AnonymousClass2HF r1, AnonymousClass160 r2, AnonymousClass1GR r3, C16320sq r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83684Hq r3 = (C83684Hq) obj;
        AnonymousClass2HF r1 = this.A00;
        if (r1 != null && r3.A01) {
            r1.AMM(r3.A00);
        }
    }

    public C83684Hq A0B(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C30671cl r3 = (C30671cl) it.next();
            C109285Rl r1 = null;
            C228919r AG0 = this.A02.AG0(r3.A07.A03, (String) null);
            if (!(AG0 == null || (r1 = AG0.AB7()) == null)) {
                r1.A5L(r3);
            }
            arrayList.add(r3);
            if (r1 != null && !hashMap.containsKey(r3.A07.A03)) {
                hashMap.put(r3.A07.A03, r1);
            }
        }
        AnonymousClass160 r4 = this.A01;
        boolean A0K = r4.A0K(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (A0K && arrayList.size() > 0) {
            for (C109285Rl A4n : hashMap.values()) {
                A4n.A4n(arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C30671cl r9 = (C30671cl) it2.next();
                C30671cl A08 = r4.A08(r9.A0A);
                AnonymousClass00B.A06(A08);
                arrayList2.add(A08);
                byte[] bArr = A08.A0D;
                if (bArr == null || bArr.length <= 0) {
                    this.A03.Acl(new RunnableRunnableShape0S0400000_I0(this, hashMap, A08, r9, 23));
                }
            }
        }
        return new C83684Hq(arrayList2, A0K);
    }
}
