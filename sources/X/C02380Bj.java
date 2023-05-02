package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0Bj  reason: invalid class name and case insensitive filesystem */
public class C02380Bj extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(30);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C02380Bj(Parcel parcel) {
        super(parcel);
        this.A04 = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A06 = parcel.readInt() != 1 ? false : true;
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public C02380Bj(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }
}
