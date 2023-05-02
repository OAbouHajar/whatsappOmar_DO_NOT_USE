package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.24y  reason: invalid class name and case insensitive filesystem */
public class C446524y {
    public static boolean A00(Context context, Intent intent) {
        try {
            AnonymousClass00T.A0G(context, intent);
            return true;
        } catch (IllegalStateException e2) {
            StringBuilder sb = new StringBuilder("Failed to start foreground service ");
            sb.append(intent.getComponent());
            Log.w(sb.toString(), e2);
            return false;
        }
    }
}
