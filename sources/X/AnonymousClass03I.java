package X;

import com.whatsapp.util.Log;

/* renamed from: X.03I  reason: invalid class name */
public abstract class AnonymousClass03I extends AnonymousClass03J {
    public C12990lI A01() {
        try {
            return super.A01();
        } catch (SecurityException e2) {
            if (e2.getMessage().contains("Caller no longer running")) {
                StringBuilder sb = new StringBuilder("WaJobIntentService/'Caller no longer running' failure for ");
                sb.append(getClass().getSimpleName());
                Log.e(sb.toString(), e2);
                return null;
            }
            throw e2;
        }
    }
}
