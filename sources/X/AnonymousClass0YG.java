package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YG  reason: invalid class name */
public final class AnonymousClass0YG implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(32);
    public final float A00;
    public final float A01;
    public final float A02;
    public final AnonymousClass020 A03;

    public AnonymousClass0YG(AnonymousClass020 r1, float f2, float f3, float f4) {
        this.A03 = r1;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
    }

    public AnonymousClass0YG(Parcel parcel) {
        this.A03 = (AnonymousClass020) parcel.readParcelable(AnonymousClass020.class.getClassLoader());
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0YG)) {
            return false;
        }
        AnonymousClass0YG r4 = (AnonymousClass0YG) obj;
        if (this.A00 == r4.A00) {
            AnonymousClass020 r1 = this.A03;
            AnonymousClass020 r0 = r4.A03;
            if (r1 != null) {
                return r1.equals(r0) && this.A01 == r4.A01 && this.A02 == r4.A02;
            }
            if (r0 == null) {
                return true;
            }
        }
    }

    public int hashCode() {
        AnonymousClass020 r0 = this.A03;
        float f2 = 17.0f;
        if (r0 != null) {
            f2 = 527.0f + ((float) r0.hashCode());
        }
        return (int) ((((((f2 * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CameraPosition");
        A0r.append("{target=");
        A0r.append(this.A03);
        A0r.append(", zoom=");
        A0r.append(this.A02);
        A0r.append(", tilt=");
        A0r.append(this.A01);
        A0r.append(", bearing=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A03, i2);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
