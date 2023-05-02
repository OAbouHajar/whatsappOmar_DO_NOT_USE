package X;

import java.util.Map;

/* renamed from: X.0M1  reason: invalid class name */
public final class AnonymousClass0M1 {
    public static final AnonymousClass1UB A00(C003401n r3) {
        Object obj;
        Map map = r3.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        }
        AnonymousClass1UB r0 = (AnonymousClass1UB) obj;
        return r0 == null ? (AnonymousClass1UB) r3.A01(new C09120ew(AnonymousClass0T4.A00().plus(C90394e4.A01().A06())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY") : r0;
    }
}
