package X;

import android.os.Parcel;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
public abstract class C55192j1 extends C55202j2 {
    public C14370p3 A00;

    public void A01(C109835Tv r5) {
        C92124h3 r52;
        Parcel obtain;
        int i2;
        if (this instanceof AnonymousClass2j4) {
            AnonymousClass2j4 r0 = (AnonymousClass2j4) this;
            C66233Yo r1 = r0.A00;
            C55212j3 r2 = r0.A00;
            r52 = (C92124h3) r5;
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r52.A01);
            obtain.writeStrongBinder(r1 == null ? null : r1.asBinder());
            obtain.writeInt(1);
            r2.writeToParcel(obtain, 0);
            i2 = 9;
        } else {
            C55172iz r02 = (C55172iz) this;
            C66233Yo r12 = r02.A00;
            C55162iy r22 = r02.A00;
            r52 = (C92124h3) r5;
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(r52.A01);
            obtain.writeStrongBinder(r12 == null ? null : r12.asBinder());
            obtain.writeInt(1);
            r22.writeToParcel(obtain, 0);
            i2 = 5;
        }
        r52.A01(i2, obtain);
    }
}
