package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0Bk  reason: invalid class name and case insensitive filesystem */
public class C02390Bk extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(14);
    public int A00;

    public C02390Bk(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C02390Bk(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("HorizontalScrollView.SavedState{");
        AnonymousClass000.A1G(this, A0r);
        A0r.append(" scrollPosition=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
    }
}
