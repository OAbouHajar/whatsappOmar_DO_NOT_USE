package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public final class C66003Xk extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92414hW();
    public final int A00;
    public final IBinder A01;
    public final C15700rh A02;
    public final boolean A03;
    public final boolean A04;

    public C66003Xk(IBinder iBinder, C15700rh r2, int i2, boolean z2, boolean z3) {
        this.A00 = i2;
        this.A01 = iBinder;
        this.A02 = r2;
        this.A03 = z2;
        this.A04 = z3;
    }

    public final IAccountAccessor A00() {
        IBinder iBinder = this.A01;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new C66423Zh(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof C66003Xk) {
                    C66003Xk r5 = (C66003Xk) obj;
                    if (!this.A02.equals(r5.A02) || !AnonymousClass45A.A00(A00(), r5.A00())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A03(this.A01, parcel, 2);
        C32251fv.A09(parcel, this.A02, 3, i2, false);
        C32251fv.A08(parcel, 4, this.A03);
        C32251fv.A08(parcel, 5, this.A04);
        C32251fv.A05(parcel, A002);
    }
}
