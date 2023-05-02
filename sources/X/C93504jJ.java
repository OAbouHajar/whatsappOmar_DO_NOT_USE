package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jJ  reason: invalid class name and case insensitive filesystem */
public class C93504jJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(44);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C93504jJ(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A05 = AnonymousClass3K4.A0X(parcel);
        this.A06 = C13690nt.A1R(parcel.readInt());
        this.A04 = AnonymousClass3K4.A0X(parcel);
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C93504jJ(String str, String str2, int i2, int i3, int i4, int i5, boolean z2) {
        this.A03 = i2;
        this.A05 = str;
        this.A06 = z2;
        this.A04 = str2;
        this.A02 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
