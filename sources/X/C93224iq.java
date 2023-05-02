package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.4iq  reason: invalid class name and case insensitive filesystem */
public final class C93224iq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 3:
                    str2 = C32281fy.A08(parcel, readInt);
                    break;
                case 4:
                    i2 = C32281fy.A01(parcel, readInt);
                    break;
                case 5:
                    i3 = C32281fy.A01(parcel, readInt);
                    break;
                case 6:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 7:
                    z3 = C32281fy.A0F(parcel, readInt);
                    break;
                case 8:
                    str3 = C32281fy.A08(parcel, readInt);
                    break;
                case 9:
                    z4 = C32281fy.A0F(parcel, readInt);
                    break;
                case 10:
                    str4 = C32281fy.A08(parcel, readInt);
                    break;
                case 11:
                    str5 = C32281fy.A08(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new ConnectionConfiguration(str, str2, str3, str4, str5, i2, i3, z2, z3, z4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionConfiguration[i2];
    }
}
