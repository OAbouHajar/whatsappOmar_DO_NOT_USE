package X;

import java.io.Serializable;

/* renamed from: X.1WV  reason: invalid class name */
public class AnonymousClass1WV implements Serializable {
    public static final long serialVersionUID = 1;
    public final int disappearingMessagesInitiator;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public AnonymousClass1WV(int i2, long j2, int i3) {
        this.expiration = i2;
        this.ephemeralSettingTimestamp = j2;
        this.disappearingMessagesInitiator = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass1WV r7 = (AnonymousClass1WV) obj;
            return this.expiration == r7.expiration && this.disappearingMessagesInitiator == r7.disappearingMessagesInitiator && this.ephemeralSettingTimestamp == r7.ephemeralSettingTimestamp;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.ephemeralSettingTimestamp;
        return (((this.expiration * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.disappearingMessagesInitiator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EphemeralInfo{expiration=");
        sb.append(this.expiration);
        sb.append(", ephemeralSettingTimestamp=");
        sb.append(this.ephemeralSettingTimestamp);
        sb.append(", disappearingMessagesInitiator=");
        sb.append(this.disappearingMessagesInitiator);
        sb.append('}');
        return sb.toString();
    }
}
