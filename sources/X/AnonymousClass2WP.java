package X;

/* renamed from: X.2WP  reason: invalid class name */
public final class AnonymousClass2WP extends AnonymousClass2WH {
    public final AnonymousClass2WQ A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass2WP() {
        this(AnonymousClass2WT.A00, false, false, false);
    }

    public AnonymousClass2WP(AnonymousClass2WQ r1, boolean z2, boolean z3, boolean z4) {
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2WP) {
                AnonymousClass2WP r5 = (AnonymousClass2WP) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && C18450wi.A0R(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z2 = this.A03;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (z2 ? 1 : 0) * true;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i2 = 0;
        }
        return ((i4 + i2) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvatarDetails(isDeleting=");
        sb.append(this.A03);
        sb.append(", deleteError=");
        sb.append(this.A01);
        sb.append(", isBottomSheetDraggable=");
        sb.append(this.A02);
        sb.append(", avatarPreviewBitmapState=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
