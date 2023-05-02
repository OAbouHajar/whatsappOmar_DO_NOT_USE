package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2TX  reason: invalid class name */
public final class AnonymousClass2TX {
    public final long A00;
    public final DeviceJid A01;
    public final DeviceJid A02;

    public AnonymousClass2TX(DeviceJid deviceJid, DeviceJid deviceJid2, long j2) {
        C18450wi.A0H(deviceJid, 1);
        this.A01 = deviceJid;
        this.A00 = j2;
        this.A02 = deviceJid2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2TX) {
                AnonymousClass2TX r8 = (AnonymousClass2TX) obj;
                if (!C18450wi.A0R(this.A01, r8.A01) || this.A00 != r8.A00 || !C18450wi.A0R(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.A00;
        int hashCode = ((this.A01.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        DeviceJid deviceJid = this.A02;
        return hashCode + (deviceJid == null ? 0 : deviceJid.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceProtocolModel(deviceJid=");
        sb.append(this.A01);
        sb.append(", keyIndex=");
        sb.append(this.A00);
        sb.append(", deviceLid=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
