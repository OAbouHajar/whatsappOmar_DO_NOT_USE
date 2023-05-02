package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1lZ  reason: invalid class name and case insensitive filesystem */
public class C35221lZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(78);
    public String A00;
    public String A01;
    public final C35241lb A02;
    public final C35211lY A03;
    public final C35211lY A04;
    public final C35211lY A05;
    public final C35211lY A06;
    public final String A07;
    public final List A08;

    public C35221lZ(C35241lb r1, C35211lY r2, C35211lY r3, C35211lY r4, C35211lY r5, String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A08 = list;
        this.A05 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = str2;
        this.A02 = r1;
        this.A07 = str3;
    }

    public C35221lZ(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A01 = readString;
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        parcel.readList(arrayList, C93554jO.class.getClassLoader());
        Class<C35211lY> cls = C35211lY.class;
        Parcelable readParcelable = parcel.readParcelable(cls.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A05 = (C35211lY) readParcelable;
        this.A06 = (C35211lY) parcel.readParcelable(cls.getClassLoader());
        this.A03 = (C35211lY) parcel.readParcelable(cls.getClassLoader());
        this.A04 = (C35211lY) parcel.readParcelable(cls.getClassLoader());
        this.A00 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = (C35241lb) parcel.readParcelable(C35241lb.class.getClassLoader());
    }

    public String A00() {
        List list = this.A08;
        if (list.isEmpty()) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((C93554jO) list.get(i2)).A03;
        }
        return AnonymousClass1ZW.A0B(", ", strArr);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeList(this.A08);
        parcel.writeParcelable(this.A05, i2);
        parcel.writeParcelable(this.A06, i2);
        parcel.writeParcelable(this.A03, i2);
        parcel.writeParcelable(this.A04, i2);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, i2);
    }
}
