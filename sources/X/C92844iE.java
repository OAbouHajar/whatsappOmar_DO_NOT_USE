package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iE  reason: invalid class name and case insensitive filesystem */
public final class C92844iE implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        PointF[] pointFArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 2) {
                i2 = AnonymousClass3K3.A0G(parcel, c2, 3, readInt, i2);
            } else {
                pointFArr = (PointF[]) C32281fy.A0I(parcel, PointF.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3X8(pointFArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3X8[i2];
    }
}
