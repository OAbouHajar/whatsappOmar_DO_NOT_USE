package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.2IF  reason: invalid class name */
public final class AnonymousClass2IF {
    public static C16150sX A00(Context context) {
        return (C16150sX) ((AnonymousClass01F) A01(context));
    }

    public static Object A01(Context context) {
        Application A00 = AnonymousClass1UR.A00(context.getApplicationContext());
        boolean z2 = A00 instanceof AnonymousClass007;
        Object[] objArr = {A00.getClass()};
        if (z2) {
            return ((AnonymousClass007) A00).generatedComponent();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", objArr));
    }
}
