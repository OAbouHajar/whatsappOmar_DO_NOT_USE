package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4pY  reason: invalid class name and case insensitive filesystem */
public final class C97194pY implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(7);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public C97194pY(Parcel parcel) {
        this.A02 = parcel.createByteArray();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C97194pY(String str, String str2, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || C97194pY.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C97194pY) obj).A02);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        AnonymousClass3K2.A1W(objArr, this.A02.length);
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", objArr);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
