package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.4hD  reason: invalid class name and case insensitive filesystem */
public final class C92224hD implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        HashSet A0o = C13680ns.A0o();
        C66193Yk r4 = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            int i3 = 1;
            if (c2 != 1) {
                i3 = 2;
                if (c2 != 2) {
                    i3 = 3;
                    if (c2 != 3) {
                        i3 = 4;
                        if (c2 != 4) {
                            i3 = 5;
                            if (c2 != 5) {
                                C32281fy.A0C(parcel, readInt);
                            } else {
                                str3 = C32281fy.A08(parcel, readInt);
                            }
                        } else {
                            str2 = C32281fy.A08(parcel, readInt);
                        }
                    } else {
                        str = C32281fy.A08(parcel, readInt);
                    }
                } else {
                    r4 = (C66193Yk) C32281fy.A06(parcel, C66193Yk.CREATOR, readInt);
                }
            } else {
                i2 = C32281fy.A01(parcel, readInt);
            }
            C13690nt.A1O(A0o, i3);
        }
        if (parcel.dataPosition() == A00) {
            return new AnonymousClass3Yj(r4, str, str2, str3, A0o, i2);
        }
        throw new C105545Aa(parcel, C13680ns.A0i("Overread allowed size end=", C13690nt.A0g(37), A00));
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Yj[i2];
    }
}
