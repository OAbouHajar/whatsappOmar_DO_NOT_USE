package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.16y  reason: invalid class name and case insensitive filesystem */
public class C221816y {
    public final C16300so A00;
    public final C16040sK A01;
    public final C208211s A02;
    public final C15810rt A03;
    public final C16070sO A04;
    public final AnonymousClass16V A05;
    public final C19810z2 A06;

    public C221816y(C16300so r1, C16040sK r2, C208211s r3, C15810rt r4, C16070sO r5, AnonymousClass16V r6, C19810z2 r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static final List A00(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C28851Ya.A02((DeviceJid) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 100;
        int size2 = arrayList.size() % 100;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 * 100;
            i2++;
            arrayList2.add(arrayList.subList(i3, i2 * 100));
        }
        if (size2 > 0) {
            arrayList2.add(arrayList.subList(arrayList.size() - size2, arrayList.size()));
        }
        return arrayList2;
    }

    public final Set A01(C15830rv r4, C16740tZ r5) {
        HashSet hashSet = new HashSet();
        if (r4 instanceof UserJid) {
            boolean z2 = r4 instanceof AnonymousClass1ZX;
            C19810z2 r1 = this.A06;
            hashSet.addAll(z2 ? r1.A0B() : r1.A0C());
            if (!this.A01.A0I(r4)) {
                UserJid of = UserJid.of(r4);
                AnonymousClass00B.A06(of);
                hashSet.addAll(r1.A0D(of));
            }
            return hashSet;
        } else if (C38621r6.A0Y(this.A03, r5)) {
            HashSet hashSet2 = new HashSet();
            C28031Ub it = C17380uz.copyOf(this.A04.A07.A04((C16060sN) r4).A03.values()).iterator();
            while (it.hasNext()) {
                hashSet2.addAll(C17380uz.copyOf((Collection) ((C30661ck) it.next()).A04.keySet()));
            }
            C16040sK r12 = this.A01;
            r12.A0B();
            hashSet2.remove(r12.A04);
            hashSet2.remove(r12.A02());
            return hashSet2;
        } else {
            C16070sO r13 = this.A04;
            C16060sN r42 = r4 instanceof C16060sN ? (C16060sN) r4 : null;
            AnonymousClass00B.A06(r42);
            C28031Ub it2 = r13.A07.A04(r42).A04().iterator();
            while (it2.hasNext()) {
                hashSet.addAll(C17380uz.copyOf((Collection) ((C30661ck) it2.next()).A04.keySet()));
            }
            C16040sK r0 = this.A01;
            r0.A0B();
            hashSet.remove(r0.A04);
            return hashSet;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A02(X.C15830rv r5, X.C16740tZ r6, int r7) {
        /*
            r4 = this;
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0 = 58
            if (r7 != r0) goto L_0x0027
            X.0sO r1 = r4.A04
            boolean r0 = r5 instanceof X.C16060sN
            if (r0 == 0) goto L_0x0025
            X.0sN r5 = (X.C16060sN) r5
        L_0x0011:
            X.AnonymousClass00B.A06(r5)
            X.0us r0 = r1.A07
            X.1cE r2 = r0.A04(r5)
            X.0sK r1 = r4.A01
            r0 = 0
            java.util.Set r0 = r2.A0F(r1, r0)
            r3.addAll(r0)
        L_0x0024:
            return r3
        L_0x0025:
            r5 = 0
            goto L_0x0011
        L_0x0027:
            r0 = 69
            if (r7 != r0) goto L_0x0037
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0024
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r5)
        L_0x0033:
            r3.add(r0)
            return r3
        L_0x0037:
            r0 = 77
            if (r7 != r0) goto L_0x0024
            boolean r0 = r6 instanceof X.C39231s8
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0024
            X.1s8 r6 = (X.C39231s8) r6
            com.whatsapp.jid.DeviceJid r0 = r6.A02
            if (r0 == 0) goto L_0x0024
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221816y.A02(X.0rv, X.0tZ, int):java.util.Set");
    }

    public Set A03(C16740tZ r7) {
        C28381Vw r1 = r7.A11;
        C15830rv r5 = r1.A00;
        if ((r7 instanceof AnonymousClass1WU) || !r1.A02) {
            return null;
        }
        if (((r5 instanceof UserJid) || (r5 instanceof C16060sN)) && r7.A0G == 0 && r7.A19 == null) {
            return r7 instanceof C39131ry ? A02(r5, r7, r7.A10) : A01(r5, r7);
        }
        return null;
    }

    public Set A04(C16740tZ r8) {
        C28381Vw r0 = r8.A11;
        C15830rv r6 = r0.A00;
        if (!r0.A02 && !C38621r6.A0T(this.A01, r8)) {
            return null;
        }
        Set A052 = A05(r8);
        if (A052 != null && (r6 instanceof C16060sN) && (r8.A0G != 0 || C38621r6.A0T(this.A01, r8))) {
            A052.addAll(A01(r6, r8));
        }
        return A052;
    }

    public final Set A05(C16740tZ r5) {
        C28381Vw r2 = r5.A11;
        C15830rv r1 = r2.A00;
        if (r1 instanceof C16060sN) {
            Set A002 = this.A05.A00(r2);
            HashSet hashSet = new HashSet(A002);
            for (UserJid A0D : C16030sJ.A0A(this.A00, A002)) {
                hashSet.addAll(this.A06.A0D(A0D));
            }
            boolean A0Y = C38621r6.A0Y(this.A03, r5);
            C19810z2 r0 = this.A06;
            hashSet.addAll(A0Y ? r0.A0B() : r0.A0C());
            C16040sK r12 = this.A01;
            r12.A0B();
            hashSet.remove(r12.A04);
            hashSet.remove(r12.A02());
            return hashSet;
        } else if (r1 instanceof UserJid) {
            return A01(r1, r5);
        } else {
            return null;
        }
    }
}
