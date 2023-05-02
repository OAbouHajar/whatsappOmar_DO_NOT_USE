package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.0tS  reason: invalid class name and case insensitive filesystem */
public final class C16680tS {
    public static C16680tS A04;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public String A02 = null;
    public final Queue A03 = new ArrayDeque();

    public static synchronized C16680tS A00() {
        C16680tS r0;
        synchronized (C16680tS.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new C16680tS();
                A04 = r0;
            }
        }
        return r0;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z2 = false;
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            this.A00 = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.A00.booleanValue();
    }
}
