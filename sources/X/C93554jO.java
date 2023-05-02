package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.4jO  reason: invalid class name and case insensitive filesystem */
public class C93554jO implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(65);
    public final int A00;
    public final C35211lY A01;
    public final C35211lY A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C93554jO(C35211lY r1, C35211lY r2, String str, String str2, String str3, int i2) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
    }

    public C93554jO(Parcel parcel) {
        this.A05 = AnonymousClass3K4.A0X(parcel);
        this.A04 = parcel.readString();
        this.A03 = AnonymousClass3K4.A0X(parcel);
        Class<C35211lY> cls = C35211lY.class;
        Parcelable A0U = AnonymousClass3K3.A0U(parcel, cls);
        AnonymousClass00B.A06(A0U);
        this.A01 = (C35211lY) A0U;
        this.A02 = (C35211lY) AnonymousClass3K3.A0U(parcel, cls);
        this.A00 = parcel.readInt();
    }

    public String A00() {
        String str = this.A04;
        return TextUtils.isEmpty(str) ? this.A05 : str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeInt(this.A00);
    }
}
