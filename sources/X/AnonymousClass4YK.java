package X;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.4YK  reason: invalid class name */
public final class AnonymousClass4YK {
    public static final AnonymousClass4RN A00 = new AnonymousClass4RN("GoogleSignInCommon", new String[0]);

    public static void A00(Context context) {
        C88704ax.A00(context).A01();
        Set<C437121f> set = C437121f.A00;
        synchronized (set) {
        }
        for (C437121f A05 : set) {
            A05.A05();
        }
        synchronized (AnonymousClass3CL.A0I) {
            AnonymousClass3CL r1 = AnonymousClass3CL.A0F;
            if (r1 != null) {
                r1.A0D.incrementAndGet();
                Handler handler = r1.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
