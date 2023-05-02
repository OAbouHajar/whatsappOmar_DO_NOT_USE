package X;

import android.util.Log;

/* renamed from: X.45N  reason: invalid class name */
public class AnonymousClass45N {
    public static void A00(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            boolean isLoggable = Log.isLoggable("Vision", 3);
            String format = String.format(str, objArr);
            if (isLoggable) {
                Log.e("Vision", format, th);
                return;
            }
            String valueOf = String.valueOf(th);
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(format) + 2 + valueOf.length());
            AnonymousClass3K4.A13(A0g, format);
            Log.e("Vision", AnonymousClass000.A0h(valueOf, A0g));
        }
    }
}
