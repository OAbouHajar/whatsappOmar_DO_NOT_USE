package X;

import android.os.Parcel;

/* renamed from: X.3Wd  reason: invalid class name and case insensitive filesystem */
public final class C65673Wd extends C55202j2 {
    public C14370p3 A00;

    public /* synthetic */ void A00(C15760ro r6, C14370p3 r7) {
        this.A00 = r7;
        AnonymousClass3YZ r1 = new AnonymousClass3YZ(this);
        C92174h8 r4 = (C92174h8) ((C109805Ts) ((C15770rp) r6).A01());
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(r1.asBinder());
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(r4.A00, obtain, obtain2, 1);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
