package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0zd  reason: invalid class name and case insensitive filesystem */
public class C20180zd {
    public static final Map A01 = new WeakHashMap();
    public static final Map A02 = new WeakHashMap();
    public C52372dh A00;

    public synchronized C52372dh A00() {
        C52372dh r0;
        r0 = this.A00;
        if (r0 == null) {
            r0 = new C52372dh();
            this.A00 = r0;
        }
        return r0;
    }

    public synchronized C52372dh A01(Context context) {
        C52372dh r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A01;
        r0 = (C52372dh) map.get(context);
        if (r0 == null) {
            r0 = new C52372dh();
            map.put(context, r0);
        }
        return r0;
    }

    public synchronized C52372dh A02(String str) {
        C52372dh r0;
        Map map = A02;
        r0 = (C52372dh) map.get(str);
        if (r0 == null) {
            r0 = new C52372dh();
            map.put(str, r0);
        }
        return r0;
    }
}
