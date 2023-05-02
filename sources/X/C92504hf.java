package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4hf  reason: invalid class name and case insensitive filesystem */
public final class C92504hf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 2) {
                str = AnonymousClass3K3.A0l(parcel, str, c2, 3, readInt);
            } else {
                arrayList = C32281fy.A0A(parcel, C66093Xt.CREATOR, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C65983Xi(str, arrayList, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65983Xi[i2];
    }
}
