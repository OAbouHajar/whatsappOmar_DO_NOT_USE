package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4hC  reason: invalid class name and case insensitive filesystem */
public final class C92214hC implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 2:
                    arrayList = C32281fy.A09(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = C32281fy.A09(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = C32281fy.A09(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = C32281fy.A09(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = C32281fy.A09(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66183Yi(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C66183Yi[i2];
    }
}
