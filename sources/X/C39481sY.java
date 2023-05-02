package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1sY  reason: invalid class name and case insensitive filesystem */
public final class C39481sY {
    public final int A00;
    public final GroupJid A01;
    public final String A02;

    public C39481sY(GroupJid groupJid, String str, int i2) {
        this.A01 = groupJid;
        this.A02 = str;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39481sY) {
                C39481sY r5 = (C39481sY) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A02;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupNode(jid=");
        sb.append(this.A01);
        sb.append(", subject=");
        sb.append(this.A02);
        sb.append(", type=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
