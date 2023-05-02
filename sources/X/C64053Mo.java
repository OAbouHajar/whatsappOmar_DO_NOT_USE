package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.3Mo  reason: invalid class name and case insensitive filesystem */
public class C64053Mo extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(58);
    public final String A00;
    public final String A01;

    public C64053Mo(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public C64053Mo(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        if (!TextUtils.isEmpty(str2)) {
            this.A01 = str;
            this.A00 = str2;
            return;
        }
        this.A01 = null;
        this.A00 = null;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
