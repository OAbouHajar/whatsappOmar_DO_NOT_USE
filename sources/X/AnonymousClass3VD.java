package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3VD  reason: invalid class name */
public final class AnonymousClass3VD extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(15);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public AnonymousClass3VD(Parcel parcel) {
        super("MLLT");
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.createIntArray();
        this.A04 = parcel.createIntArray();
    }

    public AnonymousClass3VD(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        super("MLLT");
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3VD.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3VD r5 = (AnonymousClass3VD) obj;
            if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && Arrays.equals(this.A03, r5.A03) && Arrays.equals(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass3K3.A07(this.A02) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }
}
