package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xg  reason: invalid class name and case insensitive filesystem */
public class C65963Xg extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92394hU();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public C65963Xg(String str, String str2, int i2, int i3, int i4, int i5, int i6, long j2, long j3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = j2;
        this.A06 = j3;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i5;
        this.A04 = i6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A06(parcel, 2, this.A01);
        C32251fv.A06(parcel, 3, this.A02);
        C32251fv.A07(parcel, 4, this.A05);
        C32251fv.A07(parcel, 5, this.A06);
        C32251fv.A0A(parcel, this.A07, 6, false);
        C32251fv.A0A(parcel, this.A08, 7, false);
        C32251fv.A06(parcel, 8, this.A03);
        C32251fv.A06(parcel, 9, this.A04);
        C32251fv.A05(parcel, A002);
    }
}
