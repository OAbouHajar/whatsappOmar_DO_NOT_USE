package X;

import android.support.v4.view.GravityCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1oP  reason: invalid class name and case insensitive filesystem */
public final class C36971oP extends AnonymousClass1WJ {
    public final UserJid A00;
    public final boolean A01;

    public C36971oP(AnonymousClass1WK r10, UserJid userJid, String str, long j2, boolean z2, boolean z3) {
        super(C28481Wg.A03, r10, str, "regular_high", 7, j2, z3);
        this.A00 = userJid;
        this.A01 = z2;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C36961oO.A02.A0U();
        boolean z2 = this.A01;
        A0U.A03();
        C36961oO r1 = (C36961oO) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = z2;
        C48232Mj A012 = super.A01();
        C18450wi.A0F(A012);
        A012.A03();
        C28531Wl r2 = (C28531Wl) A012.A00;
        r2.A0W = (C36961oO) A0U.A02();
        r2.A00 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserStatusMuteMutation{userJid=");
        sb.append(this.A00);
        sb.append(", rowId=");
        sb.append(this.A07);
        sb.append(", isMuted=");
        sb.append(this.A01);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
