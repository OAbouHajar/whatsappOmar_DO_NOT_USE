package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lr  reason: invalid class name and case insensitive filesystem */
public final class C35391lr extends C30671cl {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(31);
    public int A00;
    public int A01;

    public C35391lr(C30681cm r4, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        this.A00 = i2;
        this.A01 = i7;
        this.A0B = str2;
        AnonymousClass00B.A06(r4);
        this.A07 = r4;
        A07(i3);
        A06(i4);
        if (i5 != 1 || this.A07.A00 == (i9 = this.A00)) {
            this.A03 = i5;
            if (i6 != 1 || this.A07.A01 == (i8 = this.A00)) {
                this.A02 = i6;
                this.A0A = str;
                if (str3 != null) {
                    A09(str3);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("PAY: ");
            sb.append(i8);
            sb.append(" in country cannot be primary account type");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("PAY: ");
        sb2.append(i9);
        sb2.append(" in country cannot be primary account type");
        throw new IllegalArgumentException(sb2.toString());
    }

    public C35391lr(Parcel parcel) {
        A08(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public static int A04(String str) {
        if ("debit".equals(str)) {
            return 1;
        }
        if ("credit".equals(str)) {
            return 4;
        }
        if ("combo".equals(str)) {
            return 6;
        }
        if ("prepaid".equals(str)) {
            return 8;
        }
        return "UNKNOWN".equals(str) ? 7 : 0;
    }

    public static int A05(String str) {
        if ("visa".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("mastercard".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("amex".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("discover".equalsIgnoreCase(str)) {
            return 4;
        }
        return "elo".equalsIgnoreCase(str) ? 5 : 0;
    }

    public static String A06(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "unknown" : "elo" : "discover" : "amex" : "mastercard" : "visa";
    }

    public static String A07(int i2) {
        if (i2 == 1) {
            return "Visa";
        }
        if (i2 == 2) {
            return "MasterCard";
        }
        if (i2 == 3) {
            return "American Express";
        }
        if (i2 == 4) {
            return "Discover";
        }
        if (i2 != 5) {
            return null;
        }
        return "Elo";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ CARD: ");
        sb.append(super.toString());
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
