package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0YB  reason: invalid class name */
public final class AnonymousClass0YB implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(17);
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04;
    public ArrayList A05 = AnonymousClass000.A0u();
    public ArrayList A06 = AnonymousClass000.A0u();
    public AnonymousClass0YC[] A07;

    public AnonymousClass0YB() {
    }

    public AnonymousClass0YB(Parcel parcel) {
        this.A02 = parcel.createTypedArrayList(AnonymousClass0YF.CREATOR);
        this.A03 = parcel.createStringArrayList();
        this.A07 = (AnonymousClass0YC[]) parcel.createTypedArray(AnonymousClass0YC.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A05 = parcel.createStringArrayList();
        this.A06 = parcel.createTypedArrayList(Bundle.CREATOR);
        this.A04 = parcel.createTypedArrayList(AnonymousClass0Y9.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i2);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A05);
        parcel.writeTypedList(this.A06);
        parcel.writeTypedList(this.A04);
    }
}
