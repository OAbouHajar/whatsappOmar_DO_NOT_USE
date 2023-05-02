package X;

import android.os.Parcel;

/* renamed from: X.3W4  reason: invalid class name */
public final class AnonymousClass3W4 extends C55192j1 {
    public final /* synthetic */ C65863Ww A00;

    public AnonymousClass3W4(C65863Ww r1) {
        this.A00 = r1;
    }

    public final void A01(C109835Tv r5) {
        C66213Ym r1 = new C66213Ym(this, this);
        C65863Ww r3 = this.A00;
        C92124h3 r52 = (C92124h3) r5;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r52.A01);
        obtain.writeStrongBinder(r1.asBinder());
        obtain.writeInt(1);
        r3.writeToParcel(obtain, 0);
        r52.A01(6, obtain);
    }
}
