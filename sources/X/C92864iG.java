package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iG  reason: invalid class name and case insensitive filesystem */
public final class C92864iG implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = -1.0f;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 3:
                    i3 = C32281fy.A01(parcel, readInt);
                    break;
                case 4:
                    i4 = C32281fy.A01(parcel, readInt);
                    break;
                case 5:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 6:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 7:
                    f2 = AnonymousClass3K2.A01(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66153Xz(f2, i2, i3, i4, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66153Xz[i2];
    }
}
