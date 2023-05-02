package X;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xw  reason: invalid class name and case insensitive filesystem */
public final class C66123Xw extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93054iZ();
    public final AnonymousClass5UC A00;
    public final String A01;
    public final String A02;
    public final IntentFilter[] A03;

    public C66123Xw() {
        this.A00 = null;
        throw AnonymousClass000.A0W("zzr");
    }

    public C66123Xw(IBinder iBinder, String str, String str2, IntentFilter[] intentFilterArr) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.A00 = queryLocalInterface instanceof AnonymousClass5UC ? (AnonymousClass5UC) queryLocalInterface : new C67393bT(iBinder);
        } else {
            this.A00 = null;
        }
        this.A03 = intentFilterArr;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        AnonymousClass5UC r0 = this.A00;
        C32251fv.A03(r0 == null ? null : r0.asBinder(), parcel, 2);
        C32251fv.A0E(parcel, this.A03, 3, i2);
        C32251fv.A0A(parcel, this.A01, 4, false);
        C32251fv.A0A(parcel, this.A02, 5, false);
        C32251fv.A05(parcel, A002);
    }
}
