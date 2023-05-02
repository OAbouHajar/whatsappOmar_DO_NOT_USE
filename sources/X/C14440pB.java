package X;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.0pB  reason: invalid class name and case insensitive filesystem */
public final class C14440pB extends ClassLoader {
    public final Class loadClass(String str, boolean z2) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z2);
        }
        if (!FirebaseInstanceId.A03()) {
            return C14450pC.class;
        }
        Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
        return C14450pC.class;
    }
}
