package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4iB  reason: invalid class name and case insensitive filesystem */
public final class C92814iB implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 1) {
                str = AnonymousClass3K3.A0l(parcel, str, c2, 2, readInt);
            } else {
                arrayList = C32281fy.A09(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3YA(str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3YA[i2];
    }
}
