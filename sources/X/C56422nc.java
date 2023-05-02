package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* renamed from: X.2nc  reason: invalid class name and case insensitive filesystem */
public final class C56422nc extends Handler {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56422nc(Looper looper) {
        super(looper);
        AnonymousClass00B.A06(looper);
    }

    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            Pair pair = (Pair) obj;
            Number number = (Number) pair.first;
            long longValue = number.longValue();
            Object obj2 = pair.second;
            if (obj2 instanceof Drawable) {
                AnonymousClass3BH.A0Y.put(number, new SoftReference(obj2));
                return;
            }
            C56562nu r4 = (C56562nu) obj2;
            Drawable drawable = (Drawable) r4.getTag();
            AnonymousClass3BH.A0Y.put(Long.valueOf(longValue), new SoftReference(drawable));
            if (r4.A01 == longValue) {
                r4.A03 = drawable;
                r4.invalidate();
            }
        }
    }
}
