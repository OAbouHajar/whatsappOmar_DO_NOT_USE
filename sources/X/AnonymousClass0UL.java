package X;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* renamed from: X.0UL  reason: invalid class name */
public class AnonymousClass0UL {
    public static final String A00 = C06530Wm.A01("WorkerFactory");

    public final AnonymousClass02O A00(Context context, WorkerParameters workerParameters, String str) {
        String str2;
        String str3;
        AnonymousClass02O r6 = null;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(AnonymousClass02O.class);
            if (asSubclass != null) {
                try {
                    AnonymousClass02O r0 = (AnonymousClass02O) asSubclass.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                    r6 = r0;
                    if (r0 != null && r0.A02) {
                        String A0d = AnonymousClass000.A0d(this);
                        StringBuilder A0r = AnonymousClass000.A0r("WorkerFactory (");
                        A0r.append(A0d);
                        A0r.append(") returned an instance of a ListenableWorker (");
                        A0r.append(str);
                        throw AnonymousClass000.A0V(AnonymousClass000.A0h(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", A0r));
                    }
                } catch (Throwable th) {
                    th = th;
                    C06530Wm.A00();
                    str2 = A00;
                    str3 = "Could not instantiate ";
                    Log.e(str2, AnonymousClass000.A0h(str, AnonymousClass000.A0r(str3)), th);
                    return r6;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C06530Wm.A00();
            str2 = A00;
            str3 = "Invalid class: ";
            Log.e(str2, AnonymousClass000.A0h(str, AnonymousClass000.A0r(str3)), th);
            return r6;
        }
        return r6;
    }
}
