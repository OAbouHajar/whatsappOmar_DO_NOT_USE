package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1mE  reason: invalid class name and case insensitive filesystem */
public class C35621mE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(15);
    public final String A00;
    public final String A01;
    public final List A02;

    public C35621mE(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C34221ju.CREATOR);
        AnonymousClass00B.A06(createTypedArrayList);
        this.A02 = createTypedArrayList;
    }

    public C35621mE(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35621mE)) {
            return false;
        }
        C35621mE r4 = (C35621mE) obj;
        return TextUtils.equals(this.A01, r4.A01) && TextUtils.equals(this.A00, r4.A00) && this.A02.equals(r4.A02);
    }

    public int hashCode() {
        String str = this.A01;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("timezone: ");
        sb.append(this.A01);
        sb.append(", note: ");
        sb.append(this.A00);
        for (Object obj : this.A02) {
            sb.append(obj.toString());
            sb.append(";");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A02);
    }
}
