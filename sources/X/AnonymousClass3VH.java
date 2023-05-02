package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3VH  reason: invalid class name */
public final class AnonymousClass3VH extends C97144pT {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(26);
    public final long A00;
    public final long A01;

    public AnonymousClass3VH(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public static long A00(C90504eH r8, long j2) {
        long A0C = (long) r8.A0C();
        if ((128 & A0C) != 0) {
            return 8589934591L & ((((A0C & 1) << 32) | r8.A0I()) + j2);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
