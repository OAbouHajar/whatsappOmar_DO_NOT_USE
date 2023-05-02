package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.25r  reason: invalid class name and case insensitive filesystem */
public final class C448225r {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;

    public C448225r(UserJid userJid, int i2, int i3, int i4) {
        this.A03 = userJid;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C448225r) {
                C448225r r5 = (C448225r) obj;
                if (!(C18450wi.A0R(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A03.hashCode() * 31) + 12) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedAccountMediaRequest(businessJid=");
        sb.append(this.A03);
        sb.append(", limit=");
        sb.append(12);
        sb.append(", imageHeight=");
        sb.append(this.A01);
        sb.append(", imageWidth=");
        sb.append(this.A02);
        sb.append(", accountType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
