package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3V4  reason: invalid class name */
public final class AnonymousClass3V4 extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(9);
    public final byte[] A00;

    public AnonymousClass3V4(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }

    public AnonymousClass3V4(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3V4.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3V4 r5 = (AnonymousClass3V4) obj;
            if (!this.A00.equals(r5.A00) || !Arrays.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A0B(this.A00, AnonymousClass3K3.A07(this.A00.hashCode()));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A00);
    }
}
