package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape25S0000000_I1;

/* renamed from: X.0Em  reason: invalid class name and case insensitive filesystem */
public class C02700Em extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape25S0000000_I1(0);
    public boolean A00;

    public C02700Em(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass000.A1X(parcel.readValue((ClassLoader) null));
    }

    public C02700Em(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("SearchView.SavedState{");
        AnonymousClass000.A1G(this, A0r);
        A0r.append(" isIconified=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.A00));
    }
}
