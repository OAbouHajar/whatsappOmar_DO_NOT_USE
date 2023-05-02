package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape16S0000000_2_I1;
import java.util.ArrayList;

/* renamed from: X.3CN  reason: invalid class name */
public class AnonymousClass3CN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape16S0000000_2_I1(55);
    public final C93454jD A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;
    public final boolean A06;

    public AnonymousClass3CN(C93454jD r1, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = arrayList;
        this.A06 = z2;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = r1;
    }

    public AnonymousClass3CN(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(CREATOR);
        this.A06 = AnonymousClass000.A1O(parcel.readByte());
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (C93454jD) parcel.readParcelable(C93454jD.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass3CN) {
            AnonymousClass3CN r8 = (AnonymousClass3CN) obj;
            if (r8.A02.equals(this.A02) && r8.A03.equals(this.A03) && r8.A06 == this.A06) {
                ArrayList arrayList = this.A05;
                ArrayList arrayList2 = r8.A05;
                if (arrayList == null) {
                    if (arrayList2 == null) {
                        return true;
                    }
                } else if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        if (arrayList.get(i2).equals(arrayList2.get(i2))) {
                            i2++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = Boolean.valueOf(this.A06);
        return AnonymousClass000.A0F(this.A05, objArr, 3);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i2);
    }
}
