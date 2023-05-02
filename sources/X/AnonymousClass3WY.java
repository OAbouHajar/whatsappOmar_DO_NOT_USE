package X;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3WY  reason: invalid class name */
public final class AnonymousClass3WY extends C438121p {
    public AnonymousClass3WY(C437121f r2) {
        super(AnonymousClass4B6.A02, r2);
    }

    public final /* bridge */ /* synthetic */ void A00(C15760ro r6) {
        C92054gw r4 = (C92054gw) ((C15770rp) r6).A01();
        C67433bY r1 = new C67433bY(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A01);
        obtain.writeStrongBinder(r1);
        Parcel obtain2 = Parcel.obtain();
        try {
            AnonymousClass3K2.A0w(r4.A00, obtain, obtain2, 15);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public final /* bridge */ /* synthetic */ C108395Nu createFailedResult(Status status) {
        return new C98904tA(status, AnonymousClass000.A0u());
    }
}
