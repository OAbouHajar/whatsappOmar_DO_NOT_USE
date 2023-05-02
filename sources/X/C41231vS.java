package X;

/* renamed from: X.1vS  reason: invalid class name and case insensitive filesystem */
public final class C41231vS {
    public final long A00;
    public final Boolean A01;
    public final boolean A02;

    public C41231vS() {
        this((Boolean) null, 0, false);
    }

    public C41231vS(Boolean bool, long j2, boolean z2) {
        this.A01 = bool;
        this.A00 = j2;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41231vS) {
                C41231vS r8 = (C41231vS) obj;
                if (!(C18450wi.A0R(this.A01, r8.A01) && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.A01;
        int hashCode = bool == null ? 0 : bool.hashCode();
        long j2 = this.A00;
        int i2 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LidChatState(isPhoneNumberShared=");
        sb.append(this.A01);
        sb.append(", phoneRequestedTimeMs=");
        sb.append(this.A00);
        sb.append(", isDuplicateThread=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
