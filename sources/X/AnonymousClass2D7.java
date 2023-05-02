package X;

/* renamed from: X.2D7  reason: invalid class name */
public final class AnonymousClass2D7 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass2D7(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = z2;
        this.A00 = z3;
        this.A03 = z4;
        this.A01 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2D7) {
                AnonymousClass2D7 r5 = (AnonymousClass2D7) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A02;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (z2 ? 1 : 0) * true;
        boolean z3 = this.A00;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A03;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        if (!this.A01) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageCountsFMessageMetadata(isSent=");
        sb.append(this.A02);
        sb.append(", isEphemeral=");
        sb.append(this.A00);
        sb.append(", isViewOnce=");
        sb.append(this.A03);
        sb.append(", isReply=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
