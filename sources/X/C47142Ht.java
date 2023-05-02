package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.2Ht  reason: invalid class name and case insensitive filesystem */
public final class C47142Ht {
    public static final Context A00(Context context) {
        C18450wi.A0H(context, 0);
        if (!C15450qv.A00()) {
            return context;
        }
        Object systemService = context.getSystemService("display");
        if (systemService != null) {
            Display display = ((DisplayManager) systemService).getDisplay(0);
            if (display == null) {
                return context;
            }
            Context createDisplayContext = context.createDisplayContext(display);
            C18450wi.A0B(createDisplayContext);
            return createDisplayContext;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.hardware.display.DisplayManager");
    }
}
