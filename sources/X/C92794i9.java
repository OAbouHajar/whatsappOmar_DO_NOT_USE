package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.4i9  reason: invalid class name and case insensitive filesystem */
public final class C92794i9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j2 = 0;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = C32281fy.A08(parcel, readInt);
            } else if (c2 == 3) {
                dataHolder = (DataHolder) C32281fy.A06(parcel, DataHolder.CREATOR, readInt);
            } else if (c2 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C32281fy.A06(parcel, ParcelFileDescriptor.CREATOR, readInt);
            } else if (c2 == 5) {
                j2 = C32281fy.A03(parcel, readInt);
            } else if (c2 != 6) {
                C32281fy.A0C(parcel, readInt);
            } else {
                bArr = C32281fy.A0G(parcel, readInt);
            }
        }
        C32281fy.A0B(parcel, A00);
        return new C66143Xy(parcelFileDescriptor, dataHolder, str, bArr, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new C66143Xy[i2];
    }
}
