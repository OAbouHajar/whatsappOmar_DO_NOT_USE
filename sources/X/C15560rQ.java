package X;

import android.content.Context;

/* renamed from: X.0rQ  reason: invalid class name and case insensitive filesystem */
public class C15560rQ {
    public static C15560rQ A01 = new C15560rQ();
    public C15570rR A00 = null;

    public static C15570rR A00(Context context) {
        C15570rR r0;
        C15560rQ r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C15570rR(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
