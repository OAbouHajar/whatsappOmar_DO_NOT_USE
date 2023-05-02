package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1th  reason: invalid class name and case insensitive filesystem */
public final class C40181th extends C39471sX {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40181th(C28381Vw r7, long j2) {
        super(r7, (C30641ci) null, 107, j2);
        C18450wi.A0H(r7, 1);
    }

    public C40181th(C28381Vw r7, C30641ci r8, long j2) {
        super(r7, r8, 107, j2);
    }

    public final void A18(GroupJid groupJid, String str) {
        if (groupJid != null) {
            if (A16(1).size() > 0) {
                AnonymousClass00B.A08("FMessageSystemParentGroupNameChanged/setNewParentInfo/parent info should only be set once");
            }
            this.A00.add(new C39481sY(groupJid, str, 1));
        }
    }
}
