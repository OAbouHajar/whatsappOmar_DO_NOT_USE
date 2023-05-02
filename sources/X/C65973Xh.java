package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xh  reason: invalid class name and case insensitive filesystem */
public class C65973Xh extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92854iF();
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final C65923Xc[] A0D;
    public final AnonymousClass3X8[] A0E;

    public C65973Xh(C65923Xc[] r1, AnonymousClass3X8[] r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i2, int i3) {
        this.A0C = i2;
        this.A0B = i3;
        this.A00 = f2;
        this.A01 = f3;
        this.A02 = f4;
        this.A03 = f5;
        this.A04 = f6;
        this.A05 = f7;
        this.A06 = f8;
        this.A0D = r1;
        this.A07 = f9;
        this.A08 = f10;
        this.A09 = f11;
        this.A0E = r2;
        this.A0A = f12;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A0C);
        C32251fv.A06(parcel, 2, this.A0B);
        C32251fv.A04(parcel, this.A00, 3);
        C32251fv.A04(parcel, this.A01, 4);
        C32251fv.A04(parcel, this.A02, 5);
        C32251fv.A04(parcel, this.A03, 6);
        C32251fv.A04(parcel, this.A04, 7);
        C32251fv.A04(parcel, this.A05, 8);
        C32251fv.A0E(parcel, this.A0D, 9, i2);
        C32251fv.A04(parcel, this.A07, 10);
        C32251fv.A04(parcel, this.A08, 11);
        C32251fv.A04(parcel, this.A09, 12);
        C32251fv.A0E(parcel, this.A0E, 13, i2);
        C32251fv.A04(parcel, this.A06, 14);
        C32251fv.A04(parcel, this.A0A, 15);
        C32251fv.A05(parcel, A002);
    }
}
