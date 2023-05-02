package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jQ  reason: invalid class name and case insensitive filesystem */
public final class C93574jQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(27);
    public int A00;
    public final int A01;
    public final C32491gT[] A02;

    public C93574jQ(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C32491gT[readInt];
        for (int i2 = 0; i2 < this.A01; i2++) {
            this.A02[i2] = AnonymousClass3K3.A0U(parcel, C32491gT.class);
        }
    }

    public C93574jQ(C32491gT... r3) {
        int length = r3.length;
        C90524eJ.A04(AnonymousClass000.A1Q(length));
        this.A02 = r3;
        this.A01 = length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C93574jQ.class != obj.getClass()) {
                return false;
            }
            C93574jQ r5 = (C93574jQ) obj;
            if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.A01;
        parcel.writeInt(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            parcel.writeParcelable(this.A02[i4], 0);
        }
    }
}
