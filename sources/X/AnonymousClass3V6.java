package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3V6  reason: invalid class name */
public final class AnonymousClass3V6 extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(16);
    public final String A00;
    public final byte[] A01;

    public AnonymousClass3V6(Parcel parcel) {
        super("PRIV");
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }

    public AnonymousClass3V6(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3V6.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3V6 r5 = (AnonymousClass3V6) obj;
            if (!AnonymousClass3C1.A0F(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A0B(this.A01, AnonymousClass3K3.A07(AnonymousClass3K3.A0I(this.A00)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(": owner=");
        return AnonymousClass000.A0h(this.A00, A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
