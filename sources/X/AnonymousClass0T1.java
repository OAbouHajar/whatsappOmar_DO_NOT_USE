package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* renamed from: X.0T1  reason: invalid class name */
public final class AnonymousClass0T1 {
    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static List A01(Activity activity) {
        if (activity instanceof C001000l) {
            return ((C001000l) activity).A03.A00.A03.A0U.A02();
        }
        return null;
    }
}
