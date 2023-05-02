package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.5xH  reason: invalid class name */
public class AnonymousClass5xH {
    public static final C118855vM A00 = new C118855vM();

    public static void A00() {
        SystemClock.elapsedRealtime();
        List list = A00.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("getLoggerHandler");
        }
    }

    public static void A01(String str, String str2) {
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(": ");
        A0q.append(str2);
        A0q.toString();
        A00();
    }

    public static void A02(String str, String str2) {
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(": ");
        A0q.append(str2);
        A0q.toString();
        A00();
    }
}
