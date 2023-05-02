package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.3aS  reason: invalid class name and case insensitive filesystem */
public abstract class C66763aS extends C63663La implements AnonymousClass5U1 {
    public static AnonymousClass5U1 A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof AnonymousClass5U1 ? (AnonymousClass5U1) queryLocalInterface : new C66593aB(iBinder);
    }
}
