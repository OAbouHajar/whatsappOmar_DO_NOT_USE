package X;

import com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wf  reason: invalid class name and case insensitive filesystem */
public class C41791wf {
    public AnonymousClass3H7 A00;
    public C26161Mo A01;
    public C38401qj A02;
    public C41801wg A03;
    public List A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C15860rz A07;
    public final C212613k A08;
    public final C41781we A09 = new IDxSObserverShape99S0100000_1_I0(this, 1);
    public final AnonymousClass14W A0A;
    public final AnonymousClass1CX A0B;
    public final C16320sq A0C;
    public final HashMap A0D;
    public final HashMap A0E;
    public final HashSet A0F;

    public C41791wf(C15860rz r3, C212613k r4, AnonymousClass14W r5, AnonymousClass1CX r6, C16320sq r7) {
        this.A0B = r6;
        this.A0C = r7;
        this.A08 = r4;
        this.A0A = r5;
        this.A07 = r3;
        this.A0F = new HashSet();
        this.A0E = new HashMap();
        this.A0D = new HashMap();
    }

    public List A00(List list, List list2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C34151jm r2 = (C34151jm) it.next();
                String str = r2.A0A;
                if (!hashSet2.contains(str)) {
                    if (!AnonymousClass1ZW.A0E(str)) {
                        hashSet2.add(str);
                    }
                    arrayList.add(r2);
                    hashSet.add(r2.A0D);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C34151jm r22 = (C34151jm) it2.next();
                String str2 = r22.A0A;
                if (!hashSet2.contains(str2)) {
                    if (!AnonymousClass1ZW.A0E(str2)) {
                        hashSet2.add(str2);
                    }
                    if (hashSet.add(r22.A0D)) {
                        arrayList.add(r22);
                    }
                }
            }
        }
        List<C37771pi> list3 = this.A04;
        if (list3 != null) {
            for (C37771pi r0 : list3) {
                for (C34151jm r23 : r0.A04) {
                    String str3 = r23.A0A;
                    if (!hashSet2.contains(str3)) {
                        if (!AnonymousClass1ZW.A0E(str3)) {
                            hashSet2.add(str3);
                        }
                        if (hashSet.add(r23.A0D)) {
                            arrayList.add(r23);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void A01() {
        C38401qj r0 = this.A02;
        if (r0 != null) {
            r0.A06(true);
        }
        AnonymousClass354 r2 = new AnonymousClass354(this.A07, this.A0B, this, true);
        this.A02 = r2;
        this.A0C.Ack(r2, new Void[0]);
    }

    public void A02() {
        C38401qj r1 = this.A02;
        if (r1 != null) {
            r1.A06(true);
        }
        AnonymousClass354 r2 = new AnonymousClass354(this.A07, this.A0B, this, false);
        this.A02 = r2;
        this.A0C.Ack(r2, new Void[0]);
    }

    public void A03() {
        this.A0A.A03(this.A09);
    }

    public final void A04(List list) {
        List list2 = list;
        this.A04 = list;
        C41801wg r0 = this.A03;
        if (r0 != null) {
            r0.Aei((String) null, this.A0E, this.A0D, this.A0F, list2);
        }
    }
}
