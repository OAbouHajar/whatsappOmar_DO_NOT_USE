package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1mK  reason: invalid class name and case insensitive filesystem */
public class C35681mK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(7);
    public int A00;
    public String A01;
    public String A02;
    public final List A03;
    public final boolean A04;

    public C35681mK(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArrayList();
    }

    public C35681mK(String str, String str2, List list, int i2, boolean z2) {
        this.A00 = i2;
        this.A04 = z2;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public static int A00(String str) {
        if (AnonymousClass1ZW.A0E(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        return "deleted".equalsIgnoreCase(str) ? 3 : 1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        List list;
        if (this != obj) {
            if (obj instanceof C35681mK) {
                C35681mK r8 = (C35681mK) obj;
                if (this.A00 == r8.A00 && this.A04 == r8.A04 && C34901l3.A00(this.A02, r8.A02) && C34901l3.A00(this.A01, r8.A01)) {
                    List list2 = this.A03;
                    if (list2 != null && (list = r8.A03) != null && list2.size() == list.size()) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            if (((String) list2.get(i2)).equals(list.get(i2))) {
                                i2++;
                            }
                        }
                    } else if (list2 != r8.A03) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A04), this.A02, this.A01, this.A03});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeStringList(this.A03);
    }
}
