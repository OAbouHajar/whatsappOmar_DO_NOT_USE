package X;

import android.os.Handler;

/* renamed from: X.4qO  reason: invalid class name and case insensitive filesystem */
public final class C97684qO implements C107695La {
    public final Handler A00;

    public C97684qO(Handler handler) {
        this.A00 = handler;
    }

    public static void A00(Object obj, int i2, Object obj2) {
        ((C97684qO) obj).A00.obtainMessage(i2, obj2).sendToTarget();
    }
}
