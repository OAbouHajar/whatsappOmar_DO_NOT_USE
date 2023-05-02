package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3VB  reason: invalid class name */
public final class AnonymousClass3VB extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(8);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public AnonymousClass3VB(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public AnonymousClass3VB(String str, String str2, byte[] bArr, int i2) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i2;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3VB.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3VB r5 = (AnonymousClass3VB) obj;
            if (this.A00 != r5.A00 || !AnonymousClass3C1.A0F(this.A02, r5.A02) || !AnonymousClass3C1.A0F(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A07 = (AnonymousClass3K3.A07(this.A00) + AnonymousClass3K3.A0I(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return AnonymousClass3K4.A0B(this.A03, (A07 + i2) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(": mimeType=");
        A0o.append(this.A02);
        A0o.append(", description=");
        return AnonymousClass000.A0h(this.A01, A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
