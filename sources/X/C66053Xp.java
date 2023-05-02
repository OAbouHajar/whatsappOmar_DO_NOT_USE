package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xp  reason: invalid class name and case insensitive filesystem */
public final class C66053Xp extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93124ig();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C66053Xp(String str, String str2, int i2, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i2;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C66053Xp)) {
            return false;
        }
        return ((C66053Xp) obj).A01.equals(this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        int i2 = this.A00;
        boolean z2 = this.A03;
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 45 + C13680ns.A06(str2));
        A0g.append("Node{");
        A0g.append(str);
        A0g.append(", id=");
        A0g.append(str2);
        A0g.append(", hops=");
        A0g.append(i2);
        A0g.append(", isNearby=");
        A0g.append(z2);
        return AnonymousClass000.A0h("}", A0g);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0A(parcel, this.A02, 3, AnonymousClass3K3.A1R(parcel, this.A01));
        C32251fv.A06(parcel, 4, this.A00);
        C32251fv.A08(parcel, 5, this.A03);
        C32251fv.A05(parcel, A002);
    }
}
