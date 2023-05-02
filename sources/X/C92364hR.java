package X;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.4hR  reason: invalid class name and case insensitive filesystem */
public final class C92364hR implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                strArr = C32281fy.A0J(parcel, readInt);
            } else if (c2 == 2) {
                cursorWindowArr = (CursorWindow[]) C32281fy.A0I(parcel, CursorWindow.CREATOR, readInt);
            } else if (c2 == 3) {
                i3 = C32281fy.A01(parcel, readInt);
            } else if (c2 != 4) {
                i2 = AnonymousClass3K3.A0G(parcel, c2, 1000, readInt, i2);
            } else {
                bundle = C32281fy.A04(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        DataHolder dataHolder = new DataHolder(bundle, cursorWindowArr, strArr, i2, i3);
        dataHolder.A00();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
