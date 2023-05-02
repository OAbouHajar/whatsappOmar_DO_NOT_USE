package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4je  reason: invalid class name and case insensitive filesystem */
public final class C93714je implements Parcelable {
    public static final C93264iu CREATOR = new C93264iu();
    public int A00;
    public boolean A01;
    public final C93404j8 A02;
    public final AnonymousClass1US A03;

    public C93714je() {
        this.A01 = false;
        this.A00 = 0;
        this.A02 = null;
        this.A03 = null;
    }

    public /* synthetic */ C93714je(C93404j8 r3, AnonymousClass1US r4, int i2, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        r3 = (i3 & 4) != 0 ? null : r3;
        r4 = (i3 & 8) != 0 ? null : r4;
        this.A01 = false;
        this.A00 = i2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public C93714je(Parcel parcel) {
        boolean A1O = AnonymousClass000.A1O(parcel.readByte());
        int readInt = parcel.readInt();
        this.A01 = A1O;
        this.A00 = readInt;
        this.A02 = (C93404j8) AnonymousClass3K3.A0U(parcel, C93404j8.class);
        this.A03 = (AnonymousClass1US) AnonymousClass3K3.A0U(parcel, AnonymousClass1US.class);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeParcelable(this.A03, i2);
    }
}
