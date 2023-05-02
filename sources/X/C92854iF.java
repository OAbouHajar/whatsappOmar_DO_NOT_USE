package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4iF  reason: invalid class name and case insensitive filesystem */
public final class C92854iF implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        C65923Xc[] r4 = null;
        AnonymousClass3X8[] r5 = null;
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = Float.MAX_VALUE;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = -1.0f;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel2, readInt);
                    break;
                case 2:
                    i3 = C32281fy.A01(parcel2, readInt);
                    break;
                case 3:
                    f2 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 4:
                    f3 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 5:
                    f4 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 6:
                    f5 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 7:
                    f6 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 8:
                    f7 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 9:
                    r4 = (C65923Xc[]) C32281fy.A0I(parcel2, C65923Xc.CREATOR, readInt);
                    break;
                case 10:
                    f9 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 11:
                    f10 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 12:
                    f11 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 13:
                    r5 = (AnonymousClass3X8[]) C32281fy.A0I(parcel2, AnonymousClass3X8.CREATOR, readInt);
                    break;
                case 14:
                    f8 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                case 15:
                    f12 = AnonymousClass3K2.A01(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new C65973Xh(r4, r5, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new C65973Xh[i2];
    }
}
