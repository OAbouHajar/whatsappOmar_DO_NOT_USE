package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
public class C64083Mr extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(57);
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C64083Mr(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = C13690nt.A1R(parcel.readInt());
        this.A00 = parcel.readFloat();
    }

    public C64083Mr(Parcelable parcelable, String str, String str2, float f2, boolean z2) {
        super(parcelable);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z2;
        this.A00 = f2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }
}
