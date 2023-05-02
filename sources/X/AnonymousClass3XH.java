package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* renamed from: X.3XH  reason: invalid class name */
public final class AnonymousClass3XH extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93044iY();
    public final int A00;
    public final ConnectionConfiguration A01;

    public AnonymousClass3XH(ConnectionConfiguration connectionConfiguration, int i2) {
        this.A00 = i2;
        this.A01 = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 2, this.A00);
        AnonymousClass3K2.A0x(parcel, this.A01, i2, A002);
    }
}
