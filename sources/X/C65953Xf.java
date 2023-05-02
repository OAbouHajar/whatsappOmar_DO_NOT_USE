package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xf  reason: invalid class name and case insensitive filesystem */
public final class C65953Xf extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92614hr();
    public final int A00;
    public final PendingIntent A01;
    public final C109865Ty A02;
    public final C57992sJ A03;
    public final AnonymousClass5U2 A04;
    public final AnonymousClass5U3 A05;

    public C65953Xf(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, C57992sJ r8, int i2) {
        AnonymousClass5U3 r1;
        AnonymousClass5U2 r12;
        this.A00 = i2;
        this.A03 = r8;
        C109865Ty r2 = null;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            r1 = queryLocalInterface instanceof AnonymousClass5U3 ? (AnonymousClass5U3) queryLocalInterface : new C66553a6(iBinder);
        }
        this.A05 = r1;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            r12 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            r12 = queryLocalInterface2 instanceof AnonymousClass5U2 ? (AnonymousClass5U2) queryLocalInterface2 : new C66543a5(iBinder2);
        }
        this.A04 = r12;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            r2 = queryLocalInterface3 instanceof C109865Ty ? (C109865Ty) queryLocalInterface3 : new C66523a3(iBinder3);
        }
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A09(parcel, this.A03, 2, i2, false);
        AnonymousClass5U3 r0 = this.A05;
        IBinder iBinder = null;
        C32251fv.A03(r0 == null ? null : r0.asBinder(), parcel, 3);
        C32251fv.A09(parcel, this.A01, 4, i2, false);
        AnonymousClass5U2 r02 = this.A04;
        C32251fv.A03(r02 == null ? null : r02.asBinder(), parcel, 5);
        C109865Ty r03 = this.A02;
        if (r03 != null) {
            iBinder = r03.asBinder();
        }
        C32251fv.A03(iBinder, parcel, 6);
        C32251fv.A05(parcel, A002);
    }
}
