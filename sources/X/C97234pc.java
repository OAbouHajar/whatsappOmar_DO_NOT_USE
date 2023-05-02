package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4pc  reason: invalid class name and case insensitive filesystem */
public final class C97234pc implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(5);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public C97234pc(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.createByteArray();
    }

    public C97234pc(String str, String str2, byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
        this.A03 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = bArr;
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
            if (obj == null || C97234pc.class != obj.getClass()) {
                return false;
            }
            C97234pc r5 = (C97234pc) obj;
            if (!(this.A03 == r5.A03 && this.A06.equals(r5.A06) && this.A05.equals(r5.A05) && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00 && Arrays.equals(this.A07, r5.A07))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A09 = AnonymousClass3K2.A09(this.A06, AnonymousClass3K3.A07(this.A03));
        return AnonymousClass3K4.A0B(this.A07, (((((((AnonymousClass3K2.A09(this.A05, A09) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Picture: mimeType=");
        A0r.append(this.A06);
        A0r.append(", description=");
        return AnonymousClass000.A0h(this.A05, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
