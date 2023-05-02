package X;

import com.whatsapp.util.Log;
import java.io.PrintStream;

/* renamed from: X.4Yd  reason: invalid class name */
public class AnonymousClass4Yd {
    public static AnonymousClass4ST A00 = new C77053v9();

    public static void A00(AnonymousClass41Y r4, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AnonymousClass4ST r1 = A00;
        String obj = stackTrace[2].toString();
        if (r1 instanceof C77063vA) {
            switch (r4.ordinal()) {
                case 1:
                    return;
                case 2:
                    StringBuilder A0q = AnonymousClass000.A0q(obj);
                    A0q.append(" :");
                    Log.i(AnonymousClass000.A0h(str, A0q));
                    return;
                case 3:
                    StringBuilder A0q2 = AnonymousClass000.A0q(obj);
                    A0q2.append(" :");
                    Log.w(AnonymousClass000.A0h(str, A0q2));
                    return;
                default:
                    StringBuilder A0q3 = AnonymousClass000.A0q(obj);
                    A0q3.append(" :");
                    Log.e(AnonymousClass000.A0h(str, A0q3));
                    return;
            }
        } else {
            PrintStream printStream = System.err;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(r4);
            A0o.append(": ");
            A0o.append(obj);
            A0o.append(" : ");
            printStream.println(AnonymousClass000.A0h(str, A0o));
        }
    }
}
