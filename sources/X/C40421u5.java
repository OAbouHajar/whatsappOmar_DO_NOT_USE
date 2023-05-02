package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1u5  reason: invalid class name and case insensitive filesystem */
public abstract class C40421u5 extends C39471sX {
    public C40421u5(C28381Vw r1, int i2, long j2) {
        super(r1, i2, j2);
    }

    public C40421u5(C28381Vw r1, C30641ci r2, int i2, long j2) {
        super(r1, r2, i2, j2);
    }

    public final void A18(GroupJid groupJid, String str) {
        if (groupJid != null) {
            List singletonList = Collections.singletonList(new C39481sY(groupJid, str, 1));
            C18450wi.A0B(singletonList);
            A17(singletonList);
        }
    }
}
