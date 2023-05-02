package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1ck  reason: invalid class name and case insensitive filesystem */
public final class C30661ck {
    public int A00;
    public int A01;
    public boolean A02;
    public final UserJid A03;
    public final ConcurrentHashMap A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30661ck(com.whatsapp.jid.UserJid r3, int r4, boolean r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r3)
            X.AnonymousClass00B.A06(r1)
            X.1sh r0 = new X.1sh
            r0.<init>(r1, r6, r7)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.<init>(r3, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30661ck.<init>(com.whatsapp.jid.UserJid, int, boolean, boolean, boolean):void");
    }

    public C30661ck(UserJid userJid, Set set, int i2, boolean z2) {
        this.A04 = new ConcurrentHashMap();
        this.A03 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C39571sh r2 = (C39571sh) it.next();
            this.A04.put(r2.A02, r2);
        }
        this.A01 = i2;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C30661ck.class == obj.getClass()) {
            C30661ck r4 = (C30661ck) obj;
            if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A03.equals(r4.A03)) {
                return this.A04.equals(r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A01) * 31) + (this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupParticipant{jid='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", rank=");
        sb.append(this.A01);
        sb.append(", pending=");
        sb.append(this.A02);
        sb.append(", participantDevices=");
        StringBuilder sb2 = new StringBuilder("[");
        for (Object append : this.A04.values()) {
            sb2.append(append);
            sb2.append(", ");
        }
        sb2.append("]");
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
