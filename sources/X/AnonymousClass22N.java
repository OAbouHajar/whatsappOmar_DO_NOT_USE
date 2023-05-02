package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: X.22N  reason: invalid class name */
public abstract class AnonymousClass22N {
    @Deprecated
    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Deprecated
    public static Activity A01(Context context, Class cls) {
        Activity A00 = A00(context);
        if (A00 == null || !cls.isAssignableFrom(A00.getClass())) {
            return null;
        }
        return A00;
    }

    public static C14550pN A02(View view) {
        return (C14550pN) A01(view.getContext(), C14550pN.class);
    }
}
