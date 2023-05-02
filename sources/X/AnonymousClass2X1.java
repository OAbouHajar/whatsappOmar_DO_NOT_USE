package X;

import android.net.Uri;

/* renamed from: X.2X1  reason: invalid class name */
public final class AnonymousClass2X1 {
    public final Uri A00;
    public final AnonymousClass1ZX A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass2X1(Uri uri, AnonymousClass1ZX r2, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2X1) {
                AnonymousClass2X1 r5 = (AnonymousClass2X1) obj;
                if (!(C18450wi.A0R(this.A01, r5.A01) && C18450wi.A0R(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        boolean z2 = this.A03;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A02;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A04) {
            i2 = 0;
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberRequestData(jid=");
        sb.append(this.A01);
        sb.append(", learnMoreUri=");
        sb.append(this.A00);
        sb.append(", isPhoneNumberKnown=");
        sb.append(this.A03);
        sb.append(", isMyPhoneNumberShared=");
        sb.append(this.A02);
        sb.append(", wasPhoneNumberRequested=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }
}
