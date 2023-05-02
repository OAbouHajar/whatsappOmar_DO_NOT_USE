package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hZ  reason: invalid class name and case insensitive filesystem */
public final class C92444hZ implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        C65933Xd r3 = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    r3 = (C65933Xd) C32281fy.A06(parcel, C65933Xd.CREATOR, readInt);
                    break;
                case 2:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 3:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 4:
                    iArr = C32281fy.A0H(parcel, readInt);
                    break;
                case 5:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C32281fy.A0H(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65943Xe(r3, iArr, iArr2, i2, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65943Xe[i2];
    }
}
