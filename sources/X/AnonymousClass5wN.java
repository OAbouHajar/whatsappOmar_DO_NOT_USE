package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.5wN  reason: invalid class name */
public class AnonymousClass5wN {
    public static final Map A01 = new WeakHashMap();
    public final AnonymousClass01J A00;

    public AnonymousClass5wN(AnonymousClass01J r1) {
        this.A00 = r1;
    }

    public synchronized AnonymousClass5w6 A00(Context context) {
        AnonymousClass5w6 r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        r0 = (AnonymousClass5w6) map.get(context);
        if (r0 == null) {
            r0 = (AnonymousClass5w6) this.A00.get();
            map.put(context, r0);
        }
        return r0;
    }
}
