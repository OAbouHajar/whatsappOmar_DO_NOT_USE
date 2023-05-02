package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.3Xy  reason: invalid class name and case insensitive filesystem */
public class C66143Xy extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92794i9();
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public C66143Xy() {
        this((ParcelFileDescriptor) null, (DataHolder) null, (String) null, (byte[]) null, 0);
    }

    public C66143Xy(ParcelFileDescriptor parcelFileDescriptor, DataHolder dataHolder, String str, byte[] bArr, long j2) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j2;
        this.A04 = bArr;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        boolean A1R = AnonymousClass3K3.A1R(parcel, this.A03);
        C32251fv.A09(parcel, this.A02, 3, i2, A1R);
        C32251fv.A09(parcel, this.A01, 4, i2, A1R);
        C32251fv.A07(parcel, 5, this.A00);
        C32251fv.A0D(parcel, this.A04, 6, A1R);
        C32251fv.A05(parcel, A002);
        this.A01 = null;
    }
}
