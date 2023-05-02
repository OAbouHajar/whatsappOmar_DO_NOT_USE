package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape25S0000000_I1;

/* renamed from: X.0En  reason: invalid class name and case insensitive filesystem */
public class C02710En extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape25S0000000_I1(5);
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public C02710En(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public C02710En(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FragmentPager.SavedState{");
        AnonymousClass000.A1G(this, A0r);
        A0r.append(" position=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i2);
    }
}
