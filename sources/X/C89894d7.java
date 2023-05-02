package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.obwhatsapp.yo.yo;

/* renamed from: X.4d7  reason: invalid class name and case insensitive filesystem */
public class C89894d7 {
    public static C89894d7 A02;
    public final Context A00;
    public volatile String A01;

    public C89894d7(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C89894d7 A00(Context context) {
        C13710nw.A01(context);
        synchronized (C89894d7.class) {
            if (A02 == null) {
                synchronized (AnonymousClass4BA.class) {
                    if (AnonymousClass4BA.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        AnonymousClass4BA.A00 = context.getApplicationContext();
                    }
                }
                A02 = new C89894d7(context);
            }
        }
        return A02;
    }

    public static final boolean A01(PackageInfo packageInfo, boolean z2) {
        if (packageInfo != null) {
            Signature[] signatureArr = packageInfo.signatures;
            Signature[] yoSig = yo.getYoSig();
            if (yoSig != null) {
                AnonymousClass3YX[] r3 = z2 ? C815148p.A00 : new AnonymousClass3YX[]{C815148p.A00[0]};
                if (yoSig.length != 1) {
                    Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                } else {
                    int i2 = 0;
                    AnonymousClass3YR r1 = new AnonymousClass3YR(yoSig[0].toByteArray());
                    while (true) {
                        if (i2 >= r3.length) {
                            break;
                        } else if (!r3[i2].equals(r1)) {
                            i2++;
                        } else if (r3[i2] != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
