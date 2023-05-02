package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.3Kd  reason: invalid class name and case insensitive filesystem */
public class C63563Kd extends BroadcastReceiver {
    public static C63563Kd A02;
    public final Handler A00 = AnonymousClass000.A0L();
    public final ArrayList A01 = AnonymousClass000.A0u();

    public synchronized void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            ArrayList arrayList = this.A01;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((Reference) arrayList.get(size)).get() == null) {
                    arrayList.remove(size);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                AnonymousClass3E2 r0 = (AnonymousClass3E2) ((WeakReference) arrayList.get(i2)).get();
                if (r0 != null) {
                    AnonymousClass3E2.A01(r0);
                }
            }
        }
    }
}
