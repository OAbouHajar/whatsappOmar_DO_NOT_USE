package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.45j  reason: invalid class name and case insensitive filesystem */
public class C807545j {
    public static Intent A00(Intent intent) {
        return new Intent(intent).setComponent((ComponentName) null).setFlags(intent.getFlags() & -4);
    }
}
