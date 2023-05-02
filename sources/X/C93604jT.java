package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4jT  reason: invalid class name and case insensitive filesystem */
public final class C93604jT implements Parcelable {
    public static final C93604jT A03 = new C93604jT(new C93574jQ[0]);
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(28);
    public int A00;
    public final int A01;
    public final C93574jQ[] A02;

    public C93604jT(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C93574jQ[readInt];
        for (int i2 = 0; i2 < this.A01; i2++) {
            this.A02[i2] = AnonymousClass3K3.A0U(parcel, C93574jQ.class);
        }
    }

    public C93604jT(C93574jQ... r2) {
        this.A02 = r2;
        this.A01 = r2.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C93604jT.class != obj.getClass()) {
                return false;
            }
            C93604jT r5 = (C93604jT) obj;
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
        int hashCode = Arrays.hashCode(this.A02);
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
