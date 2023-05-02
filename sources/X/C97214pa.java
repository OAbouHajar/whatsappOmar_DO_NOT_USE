package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4pa  reason: invalid class name and case insensitive filesystem */
public final class C97214pa implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(20);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C97214pa(long j2, long j3, long j4, long j5, long j6) {
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A04 = j5;
        this.A03 = j6;
    }

    public C97214pa(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ byte[] AHA() {
        return null;
    }

    public /* synthetic */ C32491gT AHB() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C97214pa.class != obj.getClass()) {
                return false;
            }
            C97214pa r7 = (C97214pa) obj;
            if (!(this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A03 == r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass3K3.A07(AnonymousClass3K2.A04(this.A02)) + AnonymousClass3K2.A04(this.A01)) * 31) + AnonymousClass3K2.A04(this.A00)) * 31) + AnonymousClass3K2.A04(this.A04)) * 31) + AnonymousClass3K2.A04(this.A03);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Motion photo metadata: photoStartPosition=");
        A0r.append(this.A02);
        A0r.append(", photoSize=");
        A0r.append(this.A01);
        A0r.append(", photoPresentationTimestampUs=");
        A0r.append(this.A00);
        A0r.append(", videoStartPosition=");
        A0r.append(this.A04);
        A0r.append(", videoSize=");
        return C13680ns.A0j(A0r, this.A03);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
