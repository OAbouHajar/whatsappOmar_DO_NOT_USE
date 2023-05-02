package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2BN  reason: invalid class name */
public final class AnonymousClass2BN {
    public C801042o A00 = C801042o.NONE;
    public AnonymousClass42N A01 = AnonymousClass42N.A02;
    public AnonymousClass2X8 A02;
    public C16010sH A03;
    public final long A04;
    public final C16050sL A05;
    public final UserJid A06;
    public final String A07;

    public AnonymousClass2BN(C16050sL r2, UserJid userJid, String str, long j2) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(userJid, 2);
        this.A05 = r2;
        this.A06 = userJid;
        this.A04 = j2;
        this.A07 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2BN) {
                AnonymousClass2BN r8 = (AnonymousClass2BN) obj;
                if (!C18450wi.A0R(this.A05, r8.A05) || !C18450wi.A0R(this.A06, r8.A06) || this.A04 != r8.A04 || !C18450wi.A0R(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.A04;
        return (((((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A07.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupMembershipApprovalRequest(groupJid=");
        sb.append(this.A05);
        sb.append(", requesterJid=");
        sb.append(this.A06);
        sb.append(", creationTimeMillis=");
        sb.append(this.A04);
        sb.append(", requestMethod=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }
}
