package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xm  reason: invalid class name and case insensitive filesystem */
public class C66023Xm extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92704i0();
    public final int A00;
    public final Float A01;

    public C66023Xm(Float f2, int i2) {
        boolean z2 = false;
        if (i2 == 1 || (f2 != null && f2.floatValue() >= 0.0f)) {
            z2 = true;
        }
        String valueOf = String.valueOf(f2);
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 45);
        A0g.append("Invalid PatternItem: type=");
        A0g.append(i2);
        A0g.append(" length=");
        C13710nw.A03(AnonymousClass000.A0h(valueOf, A0g), z2);
        this.A00 = i2;
        this.A01 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66023Xm) {
                C66023Xm r5 = (C66023Xm) obj;
                if (this.A00 != r5.A00 || !AnonymousClass45A.A00(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, this.A00);
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }

    public String toString() {
        int i2 = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 39);
        A0g.append("[PatternItem: type=");
        A0g.append(i2);
        A0g.append(" length=");
        A0g.append(valueOf);
        return AnonymousClass000.A0h("]", A0g);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        Float f2 = this.A01;
        if (f2 != null) {
            parcel.writeInt(262147);
            parcel.writeFloat(f2.floatValue());
        }
        C32251fv.A05(parcel, A002);
    }
}
