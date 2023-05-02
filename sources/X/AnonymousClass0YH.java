package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YH  reason: invalid class name */
public final class AnonymousClass0YH implements Parcelable {
    public static final AnonymousClass0YH A02 = new AnonymousClass0YH(new AnonymousClass020(-90.0d, -180.0d), new AnonymousClass020(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(33);
    public final AnonymousClass020 A00;
    public final AnonymousClass020 A01;

    public AnonymousClass0YH(AnonymousClass020 r7, AnonymousClass020 r8) {
        double d2 = r7.A00;
        double d3 = r8.A00;
        if (d2 <= d3) {
            this.A01 = r7;
            this.A00 = r8;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Southern latitude (");
        A0r.append(d2);
        A0r.append(") exceeds Northern latitude (");
        A0r.append(d3);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(").", A0r));
    }

    public AnonymousClass0YH(Parcel parcel) {
        Class<AnonymousClass020> cls = AnonymousClass020.class;
        this.A00 = (AnonymousClass020) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (AnonymousClass020) parcel.readParcelable(cls.getClassLoader());
    }

    public AnonymousClass020 A00() {
        double d2;
        AnonymousClass020 r3 = this.A01;
        double d3 = r3.A00;
        AnonymousClass020 r2 = this.A00;
        double d4 = (d3 + r2.A00) / 2.0d;
        double d5 = r3.A01;
        double d6 = r2.A01;
        int i2 = (d5 > d6 ? 1 : (d5 == d6 ? 0 : -1));
        double d7 = d5 + d6;
        if (i2 <= 0) {
            d2 = d7 / 2.0d;
        } else {
            double d8 = 360.0d;
            double d9 = (d7 + 360.0d) / 2.0d;
            if (d9 <= 180.0d) {
                d8 = 0.0d;
            }
            d2 = d9 - d8;
        }
        return new AnonymousClass020(d4, d2);
    }

    public boolean A01(AnonymousClass020 r9) {
        double d2 = r9.A00;
        AnonymousClass020 r7 = this.A00;
        if (d2 > r7.A00) {
            return false;
        }
        AnonymousClass020 r3 = this.A01;
        if (d2 < r3.A00) {
            return false;
        }
        double d3 = r3.A01;
        double d4 = r7.A01;
        int i2 = (d3 > d4 ? 1 : (d3 == d4 ? 0 : -1));
        double d5 = r9.A01;
        int i3 = (d5 > d3 ? 1 : (d5 == d3 ? 0 : -1));
        if (i2 < 0) {
            if (i3 < 0) {
                return false;
            }
        } else if (i3 >= 0) {
            return true;
        }
        return d5 <= d4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0YH)) {
            return false;
        }
        AnonymousClass0YH r4 = (AnonymousClass0YH) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LatLngBounds");
        A0r.append("{northeast=");
        A0r.append(this.A00);
        A0r.append(", southwest=");
        A0r.append(this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
    }
}
