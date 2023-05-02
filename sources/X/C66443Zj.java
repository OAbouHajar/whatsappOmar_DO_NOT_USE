package X;

import android.os.Parcel;

/* renamed from: X.3Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C66443Zj extends C31381e3 implements C109775Tp {
    public C66443Zj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean A00(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            C58032sR r0 = new C58032sR(((AnonymousClass3YX) this).A01());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(r0.asBinder());
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            int i4 = ((AnonymousClass3YX) this).A00;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
    }
}
