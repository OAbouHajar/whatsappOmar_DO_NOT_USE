package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.1UR  reason: invalid class name */
public final class AnonymousClass1UR {
    public static Application A00(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not find an Application in the given context: ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }
}
