package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3VE  reason: invalid class name */
public final class AnonymousClass3VE extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(10);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final C97154pU[] A05;

    public AnonymousClass3VE(Parcel parcel) {
        super("CHAP");
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new C97154pU[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.A05[i2] = AnonymousClass3K3.A0U(parcel, C97154pU.class);
        }
    }

    public AnonymousClass3VE(String str, C97154pU[] r3, int i2, int i3, long j2, long j3) {
        super("CHAP");
        this.A04 = str;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3VE.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3VE r7 = (AnonymousClass3VE) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A02 == r7.A02 && AnonymousClass3C1.A0F(this.A04, r7.A04) && Arrays.equals(this.A05, r7.A05))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass3K3.A07(this.A01) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + AnonymousClass3K3.A0I(this.A04);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(r3);
        for (C97154pU writeParcelable : this.A05) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
