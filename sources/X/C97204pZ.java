package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4pZ  reason: invalid class name and case insensitive filesystem */
public final class C97204pZ implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(19);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public C97204pZ(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createByteArray();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C97204pZ(byte[] bArr, int i2, int i3, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i2;
        this.A01 = i3;
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
            if (obj == null || C97204pZ.class != obj.getClass()) {
                return false;
            }
            C97204pZ r5 = (C97204pZ) obj;
            if (!this.A02.equals(r5.A02) || !Arrays.equals(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass3K4.A0B(this.A03, AnonymousClass3K3.A07(this.A02.hashCode())) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        return AnonymousClass000.A0h(this.A02, AnonymousClass000.A0r("mdta: key="));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
