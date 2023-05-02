package X;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.3WX  reason: invalid class name */
public abstract class AnonymousClass3WX extends C438121p {
    public AnonymousClass3WX(C437121f r2) {
        super(AnonymousClass4BN.A06, r2);
    }

    public static Parcel A00(C65793Wp r3, C92084gz r4, AnonymousClass3LX r5) {
        GoogleSignInOptions googleSignInOptions = r3.A00;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A01);
        obtain.writeStrongBinder(r5.asBinder());
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
            return obtain;
        }
        obtain.writeInt(1);
        googleSignInOptions.writeToParcel(obtain, 0);
        return obtain;
    }
}
