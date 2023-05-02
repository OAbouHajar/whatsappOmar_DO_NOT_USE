package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xl  reason: invalid class name and case insensitive filesystem */
public class C66013Xl extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92374hS();
    public final int A00;
    public final String A01;

    public C66013Xl(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C66013Xl) {
                C66013Xl r5 = (C66013Xl) obj;
                if (r5.A00 != this.A00 || !AnonymousClass45A.A00(r5.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i2 = this.A00;
        String str = this.A01;
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 12);
        A0g.append(i2);
        A0g.append(":");
        return AnonymousClass000.A0h(str, A0g);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        AnonymousClass3K3.A12(parcel, this.A01, 2, A002);
    }
}
