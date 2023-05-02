package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: X.3Yc  reason: invalid class name */
public final class AnonymousClass3Yc extends AnonymousClass3LX implements IInterface {
    public final Context A00;

    public AnonymousClass3Yc(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.A00 = context;
    }

    public final void A00() {
        Context context = this.A00;
        if (AnonymousClass45E.A00(context, Binder.getCallingUid())) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C89894d7 A002 = C89894d7.A00(context);
                if (packageInfo != null) {
                    if (C89894d7.A01(packageInfo, false)) {
                        return;
                    }
                    if (C89894d7.A01(packageInfo, true)) {
                        if (!C15040qE.A02(A002.A00)) {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        } else {
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder A0g = C13690nt.A0g(52);
        A0g.append("Calling UID ");
        A0g.append(callingUid);
        throw new SecurityException(AnonymousClass000.A0h(" is not Google Play services.", A0g));
    }
}
