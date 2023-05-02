package X;

import com.whatsapp.jid.GroupJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ty  reason: invalid class name and case insensitive filesystem */
public class C40351ty extends C39471sX {
    public /* synthetic */ C40351ty(C28381Vw r7, long j2) {
        super(r7, (C30641ci) null, (int) AnonymousClass2EA.A03, j2);
    }

    public C40351ty(C28381Vw r2, C30641ci r3, int i2, long j2) {
        super(r2, r3, 109, j2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40351ty(C28381Vw r7, C30641ci r8, long j2) {
        super(r7, r8, (int) AnonymousClass2EA.A03, j2);
        C18450wi.A0H(r7, 1);
    }

    public final HashSet A18(int i2) {
        HashSet hashSet = new HashSet();
        loop0:
        while (i2 >= 0) {
            for (C39481sY r1 : this.A00) {
                if (r1.A00 == 2) {
                    GroupJid groupJid = r1.A01;
                    String str = r1.A02;
                    if (str == null) {
                        str = "";
                    }
                    hashSet.add(new C39461sW(groupJid, str, 2, 0));
                    i2--;
                }
            }
            break loop0;
        }
        return hashSet;
    }

    public final void A19(GroupJid groupJid) {
        if (groupJid != null) {
            this.A00.add(new C39481sY(groupJid, (String) null, 1));
        }
    }

    public final void A1A(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C39461sW r0 = (C39461sW) it.next();
            List list = this.A00;
            GroupJid groupJid = r0.A02;
            C18450wi.A0B(groupJid);
            list.add(new C39481sY(groupJid, r0.A03, 2));
        }
    }
}
