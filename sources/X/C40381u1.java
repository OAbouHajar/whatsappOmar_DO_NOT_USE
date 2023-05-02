package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1u1  reason: invalid class name and case insensitive filesystem */
public abstract class C40381u1 extends C39471sX {
    public C40381u1(C28381Vw r1, C30641ci r2, int i2, long j2) {
        super(r1, r2, i2, j2);
    }

    public final HashSet A18() {
        List<C39481sY> A16 = A16(2);
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(A16, 10));
        for (C39481sY r0 : A16) {
            GroupJid groupJid = r0.A01;
            String str = r0.A02;
            if (str == null) {
                str = "";
            }
            arrayList.add(new C39461sW(groupJid, str, 2, 0));
        }
        HashSet hashSet = new HashSet(C25421Js.A07(AnonymousClass1J9.A0M(arrayList, 12)));
        C003101j.A0H(arrayList, hashSet);
        return hashSet;
    }

    public final void A19(Set set) {
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C39461sW r0 = (C39461sW) it.next();
            GroupJid groupJid = r0.A02;
            C18450wi.A0B(groupJid);
            arrayList.add(new C39481sY(groupJid, r0.A03, r0.A00));
        }
        A17(arrayList);
    }
}
