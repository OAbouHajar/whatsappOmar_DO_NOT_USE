package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3VI  reason: invalid class name */
public final class AnonymousClass3VI extends C97144pT {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(22);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public AnonymousClass3VI(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = parcel.createByteArray();
    }

    public AnonymousClass3VI(byte[] bArr, long j2, long j3) {
        this.A01 = j3;
        this.A00 = j2;
        this.A02 = bArr;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
