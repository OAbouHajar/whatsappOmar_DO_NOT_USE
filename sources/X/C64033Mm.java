package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.3Mm  reason: invalid class name and case insensitive filesystem */
public class C64033Mm extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(47);
    public final String A00;
    public final String A01;

    public C64033Mm(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C64033Mm(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
