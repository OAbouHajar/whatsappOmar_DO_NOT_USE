package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1sh  reason: invalid class name and case insensitive filesystem */
public class C39571sh {
    public boolean A00;
    public boolean A01;
    public final DeviceJid A02;

    public C39571sh(DeviceJid deviceJid, boolean z2, boolean z3) {
        this.A02 = deviceJid;
        this.A01 = z2;
        this.A00 = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C39571sh r4 = (C39571sh) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParticipantDevice{deviceJid=");
        sb.append(this.A02);
        sb.append(", sentSenderKey=");
        sb.append(this.A01);
        sb.append(", sentAddOnSenderKey=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
