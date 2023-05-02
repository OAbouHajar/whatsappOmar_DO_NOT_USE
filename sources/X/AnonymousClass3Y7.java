package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Y7  reason: invalid class name */
public final class AnonymousClass3Y7 extends C15710ri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C92894iJ();
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass3Y7(String str, String str2, String str3) {
        C13710nw.A01(str);
        this.A00 = str;
        C13710nw.A01(str2);
        this.A01 = str2;
        C13710nw.A01(str3);
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass3Y7) {
                AnonymousClass3Y7 r5 = (AnonymousClass3Y7) obj;
                if (!this.A00.equals(r5.A00) || !AnonymousClass45A.A00(r5.A01, this.A01) || !AnonymousClass45A.A00(r5.A02, this.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i2 = 0;
        for (char c2 : str.toCharArray()) {
            i2 += c2;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(substring) + 16 + C13680ns.A06(substring2));
            A0g.append(substring);
            A0g.append("...");
            A0g.append(substring2);
            trim = C13680ns.A0i("::", A0g, i2);
        }
        String str2 = this.A01;
        String str3 = this.A02;
        StringBuilder A0g2 = C13690nt.A0g(C13680ns.A06(trim) + 31 + C13680ns.A06(str2) + C13680ns.A06(str3));
        A0g2.append("Channel{token=");
        A0g2.append(trim);
        A0g2.append(", nodeId=");
        A0g2.append(str2);
        A0g2.append(", path=");
        A0g2.append(str3);
        return AnonymousClass000.A0h("}", A0g2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        boolean A1R = AnonymousClass3K3.A1R(parcel, this.A00);
        C32251fv.A0A(parcel, this.A01, 3, A1R);
        C32251fv.A0A(parcel, this.A02, 4, A1R);
        C32251fv.A05(parcel, A002);
    }
}
