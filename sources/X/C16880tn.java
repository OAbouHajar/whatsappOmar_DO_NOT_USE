package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0tn  reason: invalid class name and case insensitive filesystem */
public class C16880tn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(80);
    public int A00;
    public C35251lc A01;
    public C35201lX A02;
    public C35191lW A03;
    public C35171lU A04;
    public C35131lQ A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;

    public C16880tn(C35201lX r4, C35131lQ r5, String str) {
        this.A09 = new ArrayList();
        this.A02 = r4;
        this.A08 = null;
        this.A07 = str;
        this.A05 = r5;
        this.A00 = 4;
    }

    public C16880tn(C35201lX r2, C35191lW r3, String str, String str2, String str3) {
        this.A09 = new ArrayList();
        this.A02 = r2;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A03 = r3;
        this.A00 = 5;
    }

    @Deprecated
    public C16880tn(C35251lc r2, C35201lX r3, C35171lU r4, String str, String str2, String str3, List list, int i2) {
        this.A09 = new ArrayList();
        this.A02 = r3;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A09 = list;
        this.A04 = r4;
        this.A01 = r2;
        this.A00 = i2;
    }

    public C16880tn(C35251lc r2, C35201lX r3, C35191lW r4, String str, String str2) {
        this.A09 = new ArrayList();
        this.A00 = 3;
        this.A02 = r3;
        this.A08 = str2;
        this.A07 = str;
        this.A01 = r2;
        this.A03 = r4;
    }

    public C16880tn(Parcel parcel) {
        this.A09 = new ArrayList();
        this.A02 = (C35201lX) parcel.readParcelable(C35201lX.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A09 = arrayList;
        parcel.readList(arrayList, C35121lP.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = (C35251lc) parcel.readParcelable(C35251lc.class.getClassLoader());
        this.A05 = (C35131lQ) parcel.readParcelable(C35131lQ.class.getClassLoader());
        this.A03 = (C35191lW) parcel.readParcelable(C35191lW.class.getClassLoader());
    }

    public String A00() {
        C35191lW r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        List list = r0.A00;
        if (list.size() == 1) {
            return ((C35181lV) list.get(0)).A01.A00;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A02, i2);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeList(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeParcelable(this.A05, i2);
        parcel.writeParcelable(this.A03, i2);
    }
}
