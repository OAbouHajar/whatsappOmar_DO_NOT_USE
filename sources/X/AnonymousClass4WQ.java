package X;

/* renamed from: X.4WQ  reason: invalid class name */
public final class AnonymousClass4WQ {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C34151jm A03;

    public /* synthetic */ AnonymousClass4WQ(C34151jm r3, int i2, boolean z2) {
        z2 = (i2 & 8) != 0 ? false : z2;
        C18450wi.A0H(r3, 1);
        this.A03 = r3;
        this.A00 = false;
        this.A01 = false;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WQ) {
                AnonymousClass4WQ r5 = (AnonymousClass4WQ) obj;
                if (!(C18450wi.A0R(this.A03, r5.A03) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0H = AnonymousClass3K3.A0H(this.A03);
        boolean z2 = this.A00;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (A0H + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i2 = 0;
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("StickerPreviewItem(sticker=");
        A0r.append(this.A03);
        A0r.append(", isLoading=");
        A0r.append(this.A00);
        A0r.append(", isPreviewImageLoaded=");
        A0r.append(this.A01);
        A0r.append(", isStarred=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
