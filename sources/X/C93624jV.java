package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.4jV  reason: invalid class name and case insensitive filesystem */
public final class C93624jV implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(1);
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final byte[] A04;

    public C93624jV(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.createByteArray();
    }

    public C93624jV(String str, UUID uuid, byte[] bArr) {
        this.A03 = uuid;
        this.A01 = null;
        this.A02 = str;
        this.A04 = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C93624jV)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C93624jV r4 = (C93624jV) obj;
        return AnonymousClass3C1.A0F(this.A01, r4.A01) && AnonymousClass3C1.A0F(this.A02, r4.A02) && AnonymousClass3C1.A0F(this.A03, r4.A03) && Arrays.equals(this.A04, r4.A04);
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int A0B = AnonymousClass3K4.A0B(this.A04, AnonymousClass3K2.A09(this.A02, (AnonymousClass3K3.A0H(this.A03) + AnonymousClass000.A0G(this.A01)) * 31));
        this.A00 = A0B;
        return A0B;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A04);
    }
}
