package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.4hB  reason: invalid class name and case insensitive filesystem */
public final class C92204hB implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        HashSet A0o = C13680ns.A0o();
        ArrayList arrayList = null;
        int i2 = 0;
        C66183Yi r4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            int i4 = 1;
            if (c2 != 1) {
                i4 = 2;
                if (c2 != 2) {
                    i4 = 3;
                    if (c2 != 3) {
                        i4 = 4;
                        if (c2 != 4) {
                            C32281fy.A0C(parcel, readInt);
                        } else {
                            r4 = (C66183Yi) C32281fy.A06(parcel, C66183Yi.CREATOR, readInt);
                        }
                    } else {
                        i3 = C32281fy.A01(parcel, readInt);
                    }
                } else {
                    arrayList = C32281fy.A0A(parcel, AnonymousClass3Yj.CREATOR, readInt);
                }
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
            C13690nt.A1O(A0o, i4);
        }
        if (parcel.dataPosition() == A00) {
            return new AnonymousClass3Yh(r4, arrayList, A0o, i2, i3);
        }
        throw new C105545Aa(parcel, C13680ns.A0i("Overread allowed size end=", C13690nt.A0g(37), A00));
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Yh[i2];
    }
}
