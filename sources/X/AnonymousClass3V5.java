package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3V5  reason: invalid class name */
public final class AnonymousClass3V5 extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(11);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final C97154pU[] A03;
    public final String[] A04;

    public AnonymousClass3V5(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        boolean z2 = true;
        this.A02 = AnonymousClass000.A1O(parcel.readByte());
        this.A01 = parcel.readByte() == 0 ? false : z2;
        this.A04 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A03 = new C97154pU[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.A03[i2] = AnonymousClass3K3.A0U(parcel, C97154pU.class);
        }
    }

    public AnonymousClass3V5(String str, C97154pU[] r3, String[] strArr, boolean z2, boolean z3) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z2;
        this.A01 = z3;
        this.A04 = strArr;
        this.A03 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3V5.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3V5 r5 = (AnonymousClass3V5) obj;
            if (this.A02 != r5.A02 || this.A01 != r5.A01 || !AnonymousClass3C1.A0F(this.A00, r5.A00) || !Arrays.equals(this.A04, r5.A04) || !Arrays.equals(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3K3.A07(this.A02 ? 1 : 0) + (this.A01 ? 1 : 0)) * 31) + AnonymousClass3K3.A0I(this.A00);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringArray(this.A04);
        parcel.writeInt(r3);
        for (C97154pU writeParcelable : this.A03) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
