package X;

/* renamed from: X.2f0  reason: invalid class name */
public class AnonymousClass2f0 {
    public Long A00;
    public final C15830rv A01;
    public final Long A02;

    public AnonymousClass2f0(C15830rv r1, Long l2) {
        this.A01 = r1;
        this.A02 = l2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass2f0 r4 = (AnonymousClass2f0) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MutedChat{chatJid=");
        sb.append(this.A01);
        sb.append(", muteEndTimestampMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
