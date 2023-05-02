package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.3XI  reason: invalid class name */
public final class AnonymousClass3XI extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93064ia();
    public final int A00;
    public final ConnectionConfiguration[] A01;

    public AnonymousClass3XI(ConnectionConfiguration[] connectionConfigurationArr, int i2) {
        this.A00 = i2;
        this.A01 = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        C32251fv.A0E(parcel, this.A01, 3, i2);
        C32251fv.A05(parcel, A002);
    }
}
